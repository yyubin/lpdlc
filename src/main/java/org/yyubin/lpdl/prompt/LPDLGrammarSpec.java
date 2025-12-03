package org.yyubin.lpdl.prompt;

public class LPDLGrammarSpec {

    public static String getFullSpec() {
        return """
            ## LPDL 개요

            LPDL은 림버스 컴퍼니 게임의 인격(Persona), 스킬, 패시브, 효과를 선언적으로 기술하기 위한 DSL입니다.

            ### 명명 규칙
            - 키워드: 소문자 (persona, skill, apply, self)
            - Enum 값: 대문자 + 언더스코어 (SYNC_4, ON_HIT, WRATH)
            - 문자열: 쌍따옴표 (예: "홍루", "출혈 강화")

            ---

            ## Persona 선언

            ```lpdl
            persona "인격 이름" {
              // === 필수 필드 ===
              sinner "시너 이름"    // 또는 sinner HONGLU
              grade 1|2|3           // 또는 grade 1★, grade TWO

              // === 선택 필드 ===
              sin WRATH|LUST|SLOTH|GREED|GLOOM|PRIDE|ENVY
              release "YYYY-MM-DD"
              maxLevel 숫자

              // 저항
              resistance {
                slash WEAK|NORMAL|RESIST,
                pierce WEAK|NORMAL|RESIST,
                blunt WEAK|NORMAL|RESIST
              }

              // 속도
              speed {
                min 숫자,
                max 숫자
              }

              // 체력
              health {
                base 숫자,
                growth 숫자.숫자,
                disturbed [숫자, 숫자, 숫자]
              }

              // 시즌
              season {
                type BATTLE_PASS|WALPURGIS|EXTRACTION|...,
                number 숫자
              }

              // 이미지 (여러 개 가능)
              image {
                type ICON|PORTRAIT|SPLASH|...,
                url "https://...",
                priority 숫자,
                primary true|false
              }

              // 스킬 (여러 개 가능)
              skill 번호 "스킬 이름" { ... }

              // 패시브 (여러 개 가능)
              passive NORMAL|SUPPORT "패시브 이름" { ... }
            }
            ```

            ---

            ## Skill 선언

            ```lpdl
            skill 번호 "스킬 이름" {
              // === 필수/선택 필드 ===
              category ATTACK|DEFENSE
              sin WRATH|LUST|SLOTH|GREED|GLOOM|PRIDE|ENVY
              attack SLASH|PIERCE|BLUNT    // ATTACK 스킬만
              defense EVADE|COUNTER|GUARD  // DEFENSE 스킬만
              quantity 1|2|3               // 타겟 수
              keyword BLEED|CHARGE|TREMOR|...
              image "URL" 또는 none

              // === Sync 레벨별 스탯 ===
              sync SYNC_1|SYNC_2|SYNC_3|SYNC_4|SYNC_5 {
                basePower 숫자
                coinPower 숫자
                coinCount 숫자
                weight 숫자
                level 숫자

                // 스킬 전체 효과 (여러 개 가능)
                effect "효과 이름" {
                  trigger ON_USE|ON_HIT|ON_ATTACK_END|...

                  // 액션들
                  <target> <action> <params>
                }

                // 코인별 효과 (여러 개 가능)
                coin 번호 NORMAL|POSITIVE|NEGATIVE|INVINCIBLE {
                  effect "효과 이름" {
                    trigger ON_HIT|...
                    <actions>
                  }
                }
              }
            }
            ```

            ---

            ## Effect 시스템

            ### Trigger (트리거)
            - `ON_USE` - 스킬 사용 시
            - `ON_HIT` - 공격 적중 시
            - `ON_ATTACK_END` - 공격 종료 시
            - `ON_KILL` - 적 처치 시
            - `ON_TURN_START` - 턴 시작 시
            - `ON_TURN_END` - 턴 종료 시
            - `BATTLE_START` - 전투 시작 시
            - `ON_DAMAGE_TAKEN` - 피해 받을 시

            ### Action 문법

            ```lpdl
            // 기본 형태
            <target> <action> <buff/debuff> <modifier> <value> [options]

            // Target
            - self         // 자신
            - target       // 대상
            - ally         // 아군
            - enemy        // 적
            - all          // 모두
            - random       // 랜덤

            // Action
            - apply        // 버프/디버프 적용
            - remove       // 버프/디버프 제거
            - deal         // 데미지
            - heal         // 회복
            - modify       // 수정 (power, coinPower 등)

            // 예시
            self apply HP_HEAL +5
            target apply BLEED +3
            self remove CHARGE 10
            target apply BLEED ADD 2 nextTurn false
            modify power +30
            ```

            ### 조건 분기 (Branch)

            ```lpdl
            branch {
              order 숫자
              stopOnMatch true|false
              when <condition>
              <actions>
            }
            ```

            ### 조건 표현식

            ```lpdl
            // 비교 연산자
            self.HP > 50
            target.BLEED >= 5
            self.CHARGE < 10

            // 논리 연산자
            self.HP > 50 AND target.BLEED >= 3
            (self.CHARGE >= 10) OR (self.HP < 30)
            NOT target.IS_STAGGERED

            // 속성 참조
            self.HP           // 자신의 HP
            target.BLEED      // 대상의 출혈 스택
            self.CHARGE       // 자신의 차지
            all_allies.BLEED_COUNT  // 모든 아군의 출혈 보유 수
            ```

            ---

            ## Passive 선언

            ```lpdl
            passive NORMAL|SUPPORT "패시브 이름" {
              trigger BATTLE_START|ON_TURN_START|...

              // 선택: 조건
              when <condition>

              // 액션 또는 분기
              <actions>

              // 또는
              branch {
                order 숫자
                when <condition>
                <actions>
              }
            }
            ```

            ---

            ## 버프/디버프 종류

            ### 일반 버프
            - `HP_HEAL` - 체력 회복
            - `ATTACK_POWER` - 공격력
            - `DEFENSE` - 방어력
            - `SPEED` - 속도
            - `DAMAGE_UP` - 데미지 증가

            ### 디버프/상태이상
            - `BLEED` - 출혈
            - `BURN` - 화상
            - `TREMOR` - 진동
            - `RUPTURE` - 파열
            - `SINKING` - 침수
            - `CHARGE` - 차지
            - `POISE` - 균형

            ### 특수 상태
            - `BLEED_AMPLIFY` - 출혈 증폭
            - `BLEED_COUNT` - 출혈 카운트
            - `BLEED_RESISTANCE` - 출혈 저항
            - `IS_STAGGERED` - 경직 상태

            ---

            ## 중요 규칙

            1. **필수 필드**: persona의 `sinner`와 `grade`는 반드시 포함
            2. **쉼표**: 블록 내 각 필드는 쉼표로 구분
            3. **세미콜론 없음**: 각 문장 끝에 세미콜론 불필요
            4. **중괄호**: 모든 블록은 중괄호로 감싸기
            5. **문자열**: 이름과 URL은 큰따옴표로 감싸기
            6. **숫자**: grade는 1, 2, 3 중 하나 (숫자 또는 ★ 표기)
            7. **Enum**: 대문자와 언더스코어 조합
            8. **주석**: // 또는 /* */ 사용 가능
            """;
    }
}
