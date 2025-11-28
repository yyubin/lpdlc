package org.yyubin.lpdl.exporter;

import org.antlr.v4.runtime.tree.ParseTree;
import org.yyubin.lpdl.exporter.sql.SQLGenerator;
import org.yyubin.lpdl.exporter.sql.SQLVariable;
import org.yyubin.lpdl.exporter.util.ExporterContext;
import org.yyubin.lpdl.exporter.util.IDManager;
import org.yyubin.lpdl.parser.LPDLBaseVisitor;
import org.yyubin.lpdl.parser.LPDLParser;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

/**
 * LPDL AST를 RDB SQL로 변환하는 Exporter
 *
 * ANTLR Visitor 패턴을 사용하여 AST를 순회하면서
 * 즉시 SQL INSERT/UPDATE 문을 생성합니다.
 */
public class RDBExporter extends LPDLBaseVisitor<Void> {

    private final SQLGenerator sqlGenerator;
    private final IDManager idManager;
    private final ExporterContext context;

    public RDBExporter() {
        this.sqlGenerator = new SQLGenerator();
        this.idManager = new IDManager();
        this.context = new ExporterContext();
    }

    /**
     * LPDL 프로그램을 SQL로 변환
     *
     * @param programCtx ANTLR ParseTree 루트
     * @return 생성된 SQL 문자열
     */
    public String export(LPDLParser.ProgramContext programCtx) {
        // 리셋
        sqlGenerator.clear();
        idManager.resetAll();
        context.reset();

        // AST 순회
        visit(programCtx);

        return sqlGenerator.generateAll();
    }

    /**
     * SQL을 파일로 저장
     */
    public void exportToFile(LPDLParser.ProgramContext programCtx, Path outputPath) throws IOException {
        export(programCtx);
        sqlGenerator.writeToFile(outputPath);
    }

    /**
     * 생성된 SQL 문 개수
     */
    public int getGeneratedStatementCount() {
        return sqlGenerator.getStatementCount();
    }

    // ═══════════════════════════════════════════════════════════════
    // PERSONA
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitPersonaDecl(LPDLParser.PersonaDeclContext ctx) {
        long personaId = idManager.nextId("persona");
        String personaVar = "persona_" + personaId;
        context.enterPersona(personaId);

        // Persona 이름
        String name = extractString(ctx.stringLiteral());

        // INSERT persona (id는 AUTO_INCREMENT)
        sqlGenerator.insert("persona")
            .value("name", name)
            .generateWithAutoId(personaVar);

        // persona body 순회
        if (ctx.personaBody() != null) {
            for (var stmt : ctx.personaBody().personaStmt()) {
                visit(stmt);
            }
        }

        context.exitPersona();
        return null;
    }

    @Override
    public Void visitSinnerStmt(LPDLParser.SinnerStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);

        String sinnerName = ctx.stringLiteral() != null
            ? extractString(ctx.stringLiteral())
            : ctx.IDENT().getText();

        // UPDATE persona SET sinner_name
        sqlGenerator.update("persona")
            .set("sinner_name", sinnerName)
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitGradeStmt(LPDLParser.GradeStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        String grade = parseGrade(ctx.gradeValue());

        sqlGenerator.update("persona")
            .set("grade", grade)
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitSinStmt(LPDLParser.SinStmtContext ctx) {
        // Persona 레벨의 sin은 JPA에 없으므로 무시
        // (대표 스킬의 sin 속성으로 대체)
        return null;
    }

    @Override
    public Void visitReleaseStmt(LPDLParser.ReleaseStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        String releaseDate = extractString(ctx.stringLiteral());

        sqlGenerator.update("persona")
            .set("release_date", releaseDate)
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitMaxLevelStmt(LPDLParser.MaxLevelStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        int maxLevel = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("persona")
            .set("max_level", maxLevel)
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitResistanceStmt(LPDLParser.ResistanceStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);

        Map<String, String> resistances = new HashMap<>();
        for (var pair : ctx.resistancePair()) {
            String type = pair.IDENT(0).getText(); // slash, pierce, blunt
            String value = pair.IDENT(1).getText(); // WEAK, NORMAL, RESIST
            resistances.put(type, value);
        }

        // Embedded 필드 업데이트
        sqlGenerator.update("persona")
            .set("slash_resistance", resistances.getOrDefault("slash", "NORMAL"))
            .set("penetration_resistance", resistances.getOrDefault("pierce", "NORMAL"))
            .set("blunt_resistance", resistances.getOrDefault("blunt", "NORMAL"))
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitSpeedStmt(LPDLParser.SpeedStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);

        Map<String, Integer> speeds = new HashMap<>();
        for (var pair : ctx.speedPair()) {
            String key = pair.IDENT().getText(); // min, max
            int value = Integer.parseInt(pair.INT().getText());
            speeds.put(key, value);
        }

        sqlGenerator.update("persona")
            .set("min_speed", speeds.getOrDefault("min", 1))
            .set("max_speed", speeds.getOrDefault("max", 5))
            .where("id", personaVar)
            .generate();

        return null;
    }

    @Override
    public Void visitHealthStmt(LPDLParser.HealthStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);

        Map<String, Object> health = new HashMap<>();

        for (var field : ctx.healthField()) {
            if (field.BASE() != null) {
                health.put("base_health", Integer.parseInt(field.INT(0).getText()));
            } else if (field.GROWTH() != null) {
                health.put("growth_rate", parseNumber(field.numberLiteral()));
            } else if (field.DISTURBED() != null) {
                // disturbed [30, 50, 70]
                var ints = field.INT();
                if (ints.size() >= 1) health.put("disturbed1", Integer.parseInt(ints.get(0).getText()));
                if (ints.size() >= 2) health.put("disturbed2", Integer.parseInt(ints.get(1).getText()));
                if (ints.size() >= 3) health.put("disturbed3", Integer.parseInt(ints.get(2).getText()));
            }
        }

        var updateBuilder = sqlGenerator.update("persona");
        health.forEach(updateBuilder::set);
        updateBuilder.where("id", personaVar).generate();

        return null;
    }

    @Override
    public Void visitSeasonStmt(LPDLParser.SeasonStmtContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);

        Map<String, Object> season = new HashMap<>();
        for (var field : ctx.seasonField()) {
            if (field.TYPE() != null) {
                season.put("season_type", field.IDENT().getText());
            } else if (field.NUMBER() != null) {
                season.put("season_number", Integer.parseInt(field.INT().getText()));
            }
        }

        var updateBuilder = sqlGenerator.update("persona");
        season.forEach(updateBuilder::set);
        updateBuilder.where("id", personaVar).generate();

        return null;
    }

    @Override
    public Void visitImageDecl(LPDLParser.ImageDeclContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        long imageId = idManager.nextId("persona_image");
        String imageVar = "persona_image_" + imageId;

        // INSERT with minimal fields (id는 AUTO_INCREMENT)
        sqlGenerator.insert("persona_image")
            .value("persona_id", personaVar)
            .generateWithAutoId(imageVar);

        // UPDATE for each field
        SQLVariable imageVarObj = new SQLVariable(imageVar);
        for (var field : ctx.imageField()) {
            if (field.TYPE() != null) {
                sqlGenerator.update("persona_image")
                    .set("type", field.IDENT().getText())
                    .where("id", imageVarObj)
                    .generate();
            } else if (field.URL() != null) {
                sqlGenerator.update("persona_image")
                    .set("url", extractString(field.stringLiteral()))
                    .where("id", imageVarObj)
                    .generate();
            } else if (field.PRIORITY() != null) {
                sqlGenerator.update("persona_image")
                    .set("priority", Integer.parseInt(field.INT().getText()))
                    .where("id", imageVarObj)
                    .generate();
            } else if (field.PRIMARY() != null) {
                sqlGenerator.update("persona_image")
                    .set("is_primary", parseBool(field.booleanLiteral()))
                    .where("id", imageVarObj)
                    .generate();
            }
        }

        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // SKILL
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitSkillDecl(LPDLParser.SkillDeclContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        long skillId = idManager.nextId("skill");
        String skillVar = "skill_" + skillId;
        context.enterSkill(skillId);

        int skillNumber = Integer.parseInt(ctx.INT().getText());
        String skillName = ctx.stringLiteral() != null
            ? extractString(ctx.stringLiteral())
            : "";

        // INSERT skill (id는 AUTO_INCREMENT)
        sqlGenerator.insert("skill")
            .value("persona_id", personaVar)
            .value("skill_number", skillNumber)
            .value("name", skillName)
            .generateWithAutoId(skillVar);

        // skill body 순회
        if (ctx.skillBody() != null) {
            for (var stmt : ctx.skillBody().skillStmt()) {
                visit(stmt);
            }
        }

        context.exitSkill();
        return null;
    }

    @Override
    public Void visitCategoryStmt(LPDLParser.CategoryStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        String category = ctx.IDENT().getText();

        sqlGenerator.update("skill")
            .set("skill_category", category)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitSkillSinStmt(LPDLParser.SkillSinStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        String sin = ctx.IDENT().getText();

        sqlGenerator.update("skill")
            .set("sin_affinity", sin)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitAttackStmt(LPDLParser.AttackStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        String attackType = ctx.IDENT().getText();

        sqlGenerator.update("skill")
            .set("attack_type", attackType)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitDefenseStmt(LPDLParser.DefenseStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        String defenseType = ctx.IDENT().getText();

        sqlGenerator.update("skill")
            .set("defense_type", defenseType)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitQuantityStmt(LPDLParser.QuantityStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        int quantity = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill")
            .set("skill_quantity", quantity)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitKeywordStmt(LPDLParser.KeywordStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        String keyword = ctx.IDENT().getText();

        sqlGenerator.update("skill")
            .set("keyword_type", keyword)
            .where("id", skillVar)
            .generate();

        return null;
    }

    @Override
    public Void visitImageStmt(LPDLParser.ImageStmtContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);

        String image = null;
        if (ctx.stringLiteral() != null) {
            image = extractString(ctx.stringLiteral());
        } else if (ctx.IDENT() != null) {
            image = ctx.IDENT().getText();
        } else if (ctx.NONE() != null) {
            image = null;
        }

        sqlGenerator.update("skill")
            .set("skill_image", image)
            .where("id", skillVar)
            .generate();

        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // SYNC
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitSyncDecl(LPDLParser.SyncDeclContext ctx) {
        long skillId = context.getCurrentSkillId();
        SQLVariable skillVar = new SQLVariable("skill_" + skillId);
        long syncId = idManager.nextId("skill_stats_by_sync");
        String syncVar = "skill_stats_by_sync_" + syncId;
        context.enterSync(syncId);

        String syncLevel = parseSyncLevel(ctx.syncLevel());

        // INSERT with minimal fields (id는 AUTO_INCREMENT)
        sqlGenerator.insert("skill_stats_by_sync")
            .value("skill_id", skillVar)
            .generateWithAutoId(syncVar);

        // UPDATE to set sync_level
        SQLVariable syncVarObj = new SQLVariable(syncVar);
        sqlGenerator.update("skill_stats_by_sync")
            .set("sync_level", syncLevel)
            .where("id", syncVarObj)
            .generate();

        // sync body 순회
        if (ctx.syncBody() != null) {
            for (var stmt : ctx.syncBody().syncStmt()) {
                visit(stmt);
            }
        }

        context.exitSync();
        return null;
    }

    @Override
    public Void visitBasePowerStmt(LPDLParser.BasePowerStmtContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        int basePower = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill_stats_by_sync")
            .set("base_power", basePower)
            .where("id", syncVar)
            .generate();

        return null;
    }

    @Override
    public Void visitCoinPowerStmt(LPDLParser.CoinPowerStmtContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        int coinPower = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill_stats_by_sync")
            .set("coin_power", coinPower)
            .where("id", syncVar)
            .generate();

        return null;
    }

    @Override
    public Void visitCoinCountStmt(LPDLParser.CoinCountStmtContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        int coinCount = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill_stats_by_sync")
            .set("coin_count", coinCount)
            .where("id", syncVar)
            .generate();

        return null;
    }

    @Override
    public Void visitWeightStmt(LPDLParser.WeightStmtContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        int weight = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill_stats_by_sync")
            .set("weight", weight)
            .where("id", syncVar)
            .generate();

        return null;
    }

    @Override
    public Void visitLevelStmt(LPDLParser.LevelStmtContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        int level = Integer.parseInt(ctx.INT().getText());

        sqlGenerator.update("skill_stats_by_sync")
            .set("level", level)
            .where("id", syncVar)
            .generate();

        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // EFFECT
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitEffectDecl(LPDLParser.EffectDeclContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        long effectId = idManager.nextId("skill_effect");
        String effectVar = "skill_effect_" + effectId;
        context.enterEffect(effectId);

        // Effect name (header가 있으면 사용)
        String effectName = "";
        if (ctx.effectHeader() != null && ctx.effectHeader().stringLiteral() != null) {
            effectName = extractString(ctx.effectHeader().stringLiteral());
        }

        // INSERT skill_effect (id는 AUTO_INCREMENT)
        sqlGenerator.insert("skill_effect")
            .value("stats_by_sync_id", syncVar)
            .value("name", effectName)
            .generateWithAutoId(effectVar);

        // effect body 순회 (trigger, when, action 등)
        if (ctx.effectBody() != null) {
            for (var stmt : ctx.effectBody().effectStmt()) {
                visit(stmt);
            }
        }

        context.exitEffect();
        return null;
    }

    @Override
    public Void visitTriggerStmt(LPDLParser.TriggerStmtContext ctx) {
        long effectId = context.getCurrentEffectId();
        SQLVariable effectVar = new SQLVariable("skill_effect_" + effectId);
        String trigger = ctx.IDENT().getText();

        // trigger를 JSON으로 저장 (간단한 버전)
        String triggerJson = String.format("{\"trigger\":\"%s\"}", trigger);

        sqlGenerator.update("skill_effect")
            .set("trigger_json", triggerJson)
            .where("id", effectVar)
            .generate();

        return null;
    }

    @Override
    public Void visitActionSimple(LPDLParser.ActionSimpleContext ctx) {
        long effectId = context.getCurrentEffectId();
        SQLVariable effectVar = new SQLVariable("skill_effect_" + effectId);
        long actionId = idManager.nextId("effect_action");
        String actionVar = "effect_action_" + actionId;

        // INSERT effect_action (id는 AUTO_INCREMENT)
        sqlGenerator.insert("effect_action")
            .value("effect_id", effectVar)
            .generateWithAutoId(actionVar);

        // action을 JSON으로 저장 (간단한 버전 - 전체 텍스트를 저장)
        String actionText = ctx.getText();
        String actionJson = String.format("{\"action\":\"%s\"}", actionText.replace("\"", "\\\""));

        SQLVariable actionVarObj = new SQLVariable(actionVar);
        sqlGenerator.update("effect_action")
            .set("action_json", actionJson)
            .where("id", actionVarObj)
            .generate();

        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // COIN
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitCoinDecl(LPDLParser.CoinDeclContext ctx) {
        long syncId = context.getCurrentSyncId();
        SQLVariable syncVar = new SQLVariable("skill_stats_by_sync_" + syncId);
        long coinId = idManager.nextId("skill_coin");
        String coinVar = "skill_coin_" + coinId;
        context.enterCoin(coinId);

        int coinNumber = Integer.parseInt(ctx.INT().getText());
        String damageType = ctx.IDENT().getText(); // NORMAL, INVINCIBLE, etc.

        // INSERT skill_coin (id는 AUTO_INCREMENT)
        sqlGenerator.insert("skill_coin")
            .value("stats_by_sync_id", syncVar)
            .value("coin_number", coinNumber)
            .value("damage_type", damageType)
            .generateWithAutoId(coinVar);

        // coin body 순회
        if (ctx.coinBody() != null) {
            for (var stmt : ctx.coinBody().coinStmt()) {
                visit(stmt);
            }
        }

        context.exitCoin();
        return null;
    }

    @Override
    public Void visitEffectInlineDecl(LPDLParser.EffectInlineDeclContext ctx) {
        // Coin 내부의 effect인 경우
        if (context.hasCoin()) {
            long coinId = context.getCurrentCoinId();
            SQLVariable coinVar = new SQLVariable("skill_coin_" + coinId);
            long effectId = idManager.nextId("coin_effect");
            String effectVar = "coin_effect_" + effectId;

            // Effect name
            String effectName = "";
            if (ctx.effectInlineHeader() != null && ctx.effectInlineHeader().stringLiteral() != null) {
                effectName = extractString(ctx.effectInlineHeader().stringLiteral());
            }

            // INSERT coin_effect (id는 AUTO_INCREMENT)
            sqlGenerator.insert("coin_effect")
                .value("coin_id", coinVar)
                .value("name", effectName)
                .generateWithAutoId(effectVar);

            // effect body는 간단히 JSON으로 저장 (상세 구현은 추후)
            if (ctx.effectBody() != null) {
                String bodyJson = String.format("{\"body\":\"%s\"}", ctx.effectBody().getText().replace("\"", "\\\""));
                SQLVariable effectVarObj = new SQLVariable(effectVar);
                sqlGenerator.update("coin_effect")
                    .set("effect_json", bodyJson)
                    .where("id", effectVarObj)
                    .generate();
            }
        }
        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // PASSIVE
    // ═══════════════════════════════════════════════════════════════

    @Override
    public Void visitPassiveDecl(LPDLParser.PassiveDeclContext ctx) {
        long personaId = context.getCurrentPersonaId();
        SQLVariable personaVar = new SQLVariable("persona_" + personaId);
        long passiveId = idManager.nextId("persona_passive");
        String passiveVar = "persona_passive_" + passiveId;

        String passiveType = ctx.IDENT().getText(); // NORMAL, SUPPORT, etc.

        // Passive name
        String passiveName = "";
        if (ctx.stringLiteral() != null) {
            passiveName = extractString(ctx.stringLiteral());
        }

        // INSERT persona_passive (id는 AUTO_INCREMENT)
        sqlGenerator.insert("persona_passive")
            .value("persona_id", personaVar)
            .value("passive_type", passiveType)
            .value("name", passiveName)
            .generateWithAutoId(passiveVar);

        // passive body 순회
        if (ctx.passiveBody() != null) {
            context.enterEffect(passiveId); // passive의 effect 처리를 위해
            for (var stmt : ctx.passiveBody().passiveStmt()) {
                visit(stmt);
            }
            context.exitEffect();
        }

        return null;
    }

    // ═══════════════════════════════════════════════════════════════
    // 유틸리티 메서드
    // ═══════════════════════════════════════════════════════════════

    /**
     * 문자열 리터럴 추출 (따옴표 제거 및 이스케이프 처리)
     */
    private String extractString(LPDLParser.StringLiteralContext ctx) {
        if (ctx == null || ctx.STRING() == null) {
            return "";
        }

        String raw = ctx.STRING().getText();
        // 앞뒤 따옴표 제거
        String unquoted = raw.substring(1, raw.length() - 1);

        // 이스케이프 처리
        return unquoted
            .replace("\\\"", "\"")
            .replace("\\\\", "\\")
            .replace("\\n", "\n")
            .replace("\\t", "\t");
    }

    /**
     * Grade 파싱
     */
    private String parseGrade(LPDLParser.GradeValueContext ctx) {
        if (ctx.INT() != null) {
            int grade = Integer.parseInt(ctx.INT().getText());
            return switch (grade) {
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                default -> throw new IllegalArgumentException("Invalid grade: " + grade);
            };
        } else if (ctx.IDENT() != null) {
            return ctx.IDENT().getText().toUpperCase();
        }
        throw new IllegalArgumentException("Invalid grade value");
    }

    /**
     * Sync Level 파싱
     */
    private String parseSyncLevel(LPDLParser.SyncLevelContext ctx) {
        if (ctx.IDENT() != null) {
            return ctx.IDENT().getText();
        } else if (ctx.STRING() != null) {
            String raw = ctx.STRING().getText();
            return raw.substring(1, raw.length() - 1);
        }
        throw new IllegalArgumentException("Invalid sync level");
    }

    /**
     * Number 리터럴 파싱
     */
    private double parseNumber(LPDLParser.NumberLiteralContext ctx) {
        if (ctx.FLOAT() != null) {
            return Double.parseDouble(ctx.FLOAT().getText());
        } else if (ctx.INT() != null) {
            return Integer.parseInt(ctx.INT().getText());
        }
        return 0.0;
    }

    /**
     * Boolean 리터럴 파싱
     */
    private boolean parseBool(LPDLParser.BooleanLiteralContext ctx) {
        return ctx.TRUE() != null;
    }
}
