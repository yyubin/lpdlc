// Generated from LPDL.g4 by ANTLR 4.13.1
package org.yyubin.lpdl.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LPDLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PERSONA=1, DECK=2, PERSONAS=3, ADD=4, GRADE=5, SINNER=6, SIN=7, RELEASE=8, 
		MAXLEVEL=9, RESISTANCE=10, SPEED=11, HEALTH=12, BASE=13, GROWTH=14, DISTURBED=15, 
		SEASON=16, NUMBER=17, URL=18, PRIMARY=19, META=20, SYNERGY=21, WITH=22, 
		BOOST=23, SUPPORT=24, TYPE=25, TEXT=26, VALUE=27, SKILL=28, CATEGORY=29, 
		ATTACK=30, DEFENSE=31, QUANTITY=32, KEYWORD=33, IMAGE=34, NONE=35, SYNC=36, 
		BASEPOWER=37, COINPOWER=38, COINCOUNT=39, WEIGHT=40, LEVEL=41, EFFECT=42, 
		TRIGGER=43, WHEN=44, BRANCH=45, ORDER=46, STOPONMATCH=47, COIN=48, PASSIVE=49, 
		ACTION=50, APPLY=51, REMOVE=52, MODIFY=53, POWER=54, DAMAGE=55, POLICY=56, 
		CAPPED=57, CAP=58, PERTURN=59, NEXTTURN=60, DURATION=61, SCOPE=62, PRIORITY=63, 
		UNIT=64, TIMING=65, SELECT=66, FROM=67, COINS=68, SELF=69, TARGET=70, 
		ALLY=71, ENEMY=72, ALL_ALLIES=73, ALL_ENEMIES=74, SELF_ALLY=75, ANY=76, 
		RIGHT_ALLY=77, LEFT_ALLY=78, LOWEST_HP_ALLY=79, HIGHEST_RESONANCE=80, 
		EQ=81, NEQ=82, GTE=83, LTE=84, GT=85, LT=86, AND=87, OR=88, NOT=89, IN=90, 
		DIVISIBLE_BY=91, HAS_TAG=92, HAS_STATUS=93, PLUS=94, MINUS=95, MUL=96, 
		DIV=97, LBRACE=98, RBRACE=99, LPAREN=100, RPAREN=101, LBRACK=102, RBRACK=103, 
		STAR=104, COMMA=105, COLON=106, DOT=107, DOTDOT=108, INT=109, FLOAT=110, 
		TRUE=111, FALSE=112, STRING=113, TRIPLE_STRING=114, IDENT=115, WS=116, 
		LINE_COMMENT=117, BLOCK_COMMENT=118;
	public static final int
		RULE_program = 0, RULE_personaDecl = 1, RULE_personaBody = 2, RULE_personaStmt = 3, 
		RULE_gradeStmt = 4, RULE_gradeValue = 5, RULE_sinStmt = 6, RULE_releaseStmt = 7, 
		RULE_maxLevelStmt = 8, RULE_sinnerStmt = 9, RULE_resistanceStmt = 10, 
		RULE_resistancePair = 11, RULE_speedStmt = 12, RULE_speedPair = 13, RULE_healthStmt = 14, 
		RULE_healthField = 15, RULE_seasonStmt = 16, RULE_seasonField = 17, RULE_imageDecl = 18, 
		RULE_imageField = 19, RULE_metaStmt = 20, RULE_synergyBlock = 21, RULE_synergyStmt = 22, 
		RULE_synergyDetail = 23, RULE_skillDecl = 24, RULE_skillBody = 25, RULE_skillStmt = 26, 
		RULE_categoryStmt = 27, RULE_skillSinStmt = 28, RULE_attackStmt = 29, 
		RULE_defenseStmt = 30, RULE_quantityStmt = 31, RULE_keywordStmt = 32, 
		RULE_imageStmt = 33, RULE_syncDecl = 34, RULE_syncLevel = 35, RULE_syncBody = 36, 
		RULE_syncStmt = 37, RULE_basePowerStmt = 38, RULE_coinPowerStmt = 39, 
		RULE_coinCountStmt = 40, RULE_weightStmt = 41, RULE_levelStmt = 42, RULE_effectDecl = 43, 
		RULE_effectHeader = 44, RULE_effectBody = 45, RULE_effectStmt = 46, RULE_triggerStmt = 47, 
		RULE_whenStmt = 48, RULE_branchBlock = 49, RULE_branchStmt = 50, RULE_orderStmt = 51, 
		RULE_stopOnMatchStmt = 52, RULE_coinDecl = 53, RULE_coinBody = 54, RULE_coinStmt = 55, 
		RULE_effectInlineDecl = 56, RULE_effectInlineHeader = 57, RULE_passiveDecl = 58, 
		RULE_passiveBody = 59, RULE_passiveStmt = 60, RULE_actionStmt = 61, RULE_actionClause = 62, 
		RULE_actionSimple = 63, RULE_targetSpec = 64, RULE_verbSpec = 65, RULE_policySpec = 66, 
		RULE_statSpec = 67, RULE_valueSpec = 68, RULE_actionDetail = 69, RULE_actionOptions = 70, 
		RULE_unitType = 71, RULE_timingType = 72, RULE_selectorType = 73, RULE_coinSelectorType = 74, 
		RULE_conditionExpr = 75, RULE_conditionOr = 76, RULE_conditionAnd = 77, 
		RULE_conditionNot = 78, RULE_conditionAtom = 79, RULE_comparison = 80, 
		RULE_rangeCheck = 81, RULE_divisibilityCheck = 82, RULE_tagCheck = 83, 
		RULE_statusCheck = 84, RULE_presenceCheck = 85, RULE_side = 86, RULE_sidePrefix = 87, 
		RULE_sideCore = 88, RULE_comparator = 89, RULE_expr = 90, RULE_additiveExpr = 91, 
		RULE_multiplicativeExpr = 92, RULE_unaryExpr = 93, RULE_primaryExpr = 94, 
		RULE_deckDecl = 95, RULE_deckBody = 96, RULE_deckStmt = 97, RULE_personasBlock = 98, 
		RULE_personasStmt = 99, RULE_objectLiteral = 100, RULE_objectPair = 101, 
		RULE_booleanLiteral = 102, RULE_numberLiteral = 103, RULE_stringLiteral = 104, 
		RULE_tripleStringLiteral = 105, RULE_textDecl = 106;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "personaDecl", "personaBody", "personaStmt", "gradeStmt", 
			"gradeValue", "sinStmt", "releaseStmt", "maxLevelStmt", "sinnerStmt", 
			"resistanceStmt", "resistancePair", "speedStmt", "speedPair", "healthStmt", 
			"healthField", "seasonStmt", "seasonField", "imageDecl", "imageField", 
			"metaStmt", "synergyBlock", "synergyStmt", "synergyDetail", "skillDecl", 
			"skillBody", "skillStmt", "categoryStmt", "skillSinStmt", "attackStmt", 
			"defenseStmt", "quantityStmt", "keywordStmt", "imageStmt", "syncDecl", 
			"syncLevel", "syncBody", "syncStmt", "basePowerStmt", "coinPowerStmt", 
			"coinCountStmt", "weightStmt", "levelStmt", "effectDecl", "effectHeader", 
			"effectBody", "effectStmt", "triggerStmt", "whenStmt", "branchBlock", 
			"branchStmt", "orderStmt", "stopOnMatchStmt", "coinDecl", "coinBody", 
			"coinStmt", "effectInlineDecl", "effectInlineHeader", "passiveDecl", 
			"passiveBody", "passiveStmt", "actionStmt", "actionClause", "actionSimple", 
			"targetSpec", "verbSpec", "policySpec", "statSpec", "valueSpec", "actionDetail", 
			"actionOptions", "unitType", "timingType", "selectorType", "coinSelectorType", 
			"conditionExpr", "conditionOr", "conditionAnd", "conditionNot", "conditionAtom", 
			"comparison", "rangeCheck", "divisibilityCheck", "tagCheck", "statusCheck", 
			"presenceCheck", "side", "sidePrefix", "sideCore", "comparator", "expr", 
			"additiveExpr", "multiplicativeExpr", "unaryExpr", "primaryExpr", "deckDecl", 
			"deckBody", "deckStmt", "personasBlock", "personasStmt", "objectLiteral", 
			"objectPair", "booleanLiteral", "numberLiteral", "stringLiteral", "tripleStringLiteral", 
			"textDecl"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'persona'", "'deck'", "'personas'", "'add'", "'grade'", "'sinner'", 
			"'sin'", "'release'", "'maxLevel'", "'resistance'", "'speed'", "'health'", 
			"'base'", "'growth'", "'disturbed'", "'season'", "'number'", "'url'", 
			"'primary'", "'meta'", "'synergy'", "'with'", "'boost'", "'support'", 
			"'type'", "'text'", "'value'", "'skill'", "'category'", "'attack'", "'defense'", 
			"'quantity'", "'keyword'", "'image'", "'none'", "'sync'", "'basePower'", 
			"'coinPower'", "'coinCount'", "'weight'", "'level'", "'effect'", "'trigger'", 
			"'when'", "'branch'", "'order'", "'stopOnMatch'", "'coin'", "'passive'", 
			"'action'", "'apply'", "'remove'", "'modify'", "'power'", "'damage'", 
			"'policy'", "'capped'", "'cap'", "'perTurn'", "'nextTurn'", "'duration'", 
			"'scope'", "'priority'", "'unit'", "'timing'", "'select'", "'from'", 
			"'coins'", "'self'", "'target'", "'ally'", "'enemy'", "'all_allies'", 
			"'all_enemies'", "'self_ally'", "'any'", "'right_ally'", "'left_ally'", 
			"'lowest_hp_ally'", "'highest_resonance'", "'=='", "'!='", "'>='", "'<='", 
			"'>'", "'<'", "'AND'", "'OR'", "'NOT'", "'in'", "'divisible_by'", "'has_tag'", 
			"'has_status'", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'\\u2605'", "','", "':'", "'.'", "'..'", null, null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PERSONA", "DECK", "PERSONAS", "ADD", "GRADE", "SINNER", "SIN", 
			"RELEASE", "MAXLEVEL", "RESISTANCE", "SPEED", "HEALTH", "BASE", "GROWTH", 
			"DISTURBED", "SEASON", "NUMBER", "URL", "PRIMARY", "META", "SYNERGY", 
			"WITH", "BOOST", "SUPPORT", "TYPE", "TEXT", "VALUE", "SKILL", "CATEGORY", 
			"ATTACK", "DEFENSE", "QUANTITY", "KEYWORD", "IMAGE", "NONE", "SYNC", 
			"BASEPOWER", "COINPOWER", "COINCOUNT", "WEIGHT", "LEVEL", "EFFECT", "TRIGGER", 
			"WHEN", "BRANCH", "ORDER", "STOPONMATCH", "COIN", "PASSIVE", "ACTION", 
			"APPLY", "REMOVE", "MODIFY", "POWER", "DAMAGE", "POLICY", "CAPPED", "CAP", 
			"PERTURN", "NEXTTURN", "DURATION", "SCOPE", "PRIORITY", "UNIT", "TIMING", 
			"SELECT", "FROM", "COINS", "SELF", "TARGET", "ALLY", "ENEMY", "ALL_ALLIES", 
			"ALL_ENEMIES", "SELF_ALLY", "ANY", "RIGHT_ALLY", "LEFT_ALLY", "LOWEST_HP_ALLY", 
			"HIGHEST_RESONANCE", "EQ", "NEQ", "GTE", "LTE", "GT", "LT", "AND", "OR", 
			"NOT", "IN", "DIVISIBLE_BY", "HAS_TAG", "HAS_STATUS", "PLUS", "MINUS", 
			"MUL", "DIV", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
			"STAR", "COMMA", "COLON", "DOT", "DOTDOT", "INT", "FLOAT", "TRUE", "FALSE", 
			"STRING", "TRIPLE_STRING", "IDENT", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LPDL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LPDLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(LPDLParser.EOF, 0); }
		public List<PersonaDeclContext> personaDecl() {
			return getRuleContexts(PersonaDeclContext.class);
		}
		public PersonaDeclContext personaDecl(int i) {
			return getRuleContext(PersonaDeclContext.class,i);
		}
		public List<DeckDeclContext> deckDecl() {
			return getRuleContexts(DeckDeclContext.class);
		}
		public DeckDeclContext deckDecl(int i) {
			return getRuleContext(DeckDeclContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERSONA || _la==DECK) {
				{
				setState(216);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERSONA:
					{
					setState(214);
					personaDecl();
					}
					break;
				case DECK:
					{
					setState(215);
					deckDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonaDeclContext extends ParserRuleContext {
		public TerminalNode PERSONA() { return getToken(LPDLParser.PERSONA, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PersonaBodyContext personaBody() {
			return getRuleContext(PersonaBodyContext.class,0);
		}
		public PersonaDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personaDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPersonaDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPersonaDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPersonaDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonaDeclContext personaDecl() throws RecognitionException {
		PersonaDeclContext _localctx = new PersonaDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_personaDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(PERSONA);
			setState(224);
			stringLiteral();
			setState(225);
			personaBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonaBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<PersonaStmtContext> personaStmt() {
			return getRuleContexts(PersonaStmtContext.class);
		}
		public PersonaStmtContext personaStmt(int i) {
			return getRuleContext(PersonaStmtContext.class,i);
		}
		public PersonaBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personaBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPersonaBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPersonaBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPersonaBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonaBodyContext personaBody() throws RecognitionException {
		PersonaBodyContext _localctx = new PersonaBodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_personaBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(LBRACE);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 562967404945376L) != 0)) {
				{
				{
				setState(228);
				personaStmt();
				}
				}
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(234);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonaStmtContext extends ParserRuleContext {
		public GradeStmtContext gradeStmt() {
			return getRuleContext(GradeStmtContext.class,0);
		}
		public SinnerStmtContext sinnerStmt() {
			return getRuleContext(SinnerStmtContext.class,0);
		}
		public SinStmtContext sinStmt() {
			return getRuleContext(SinStmtContext.class,0);
		}
		public ReleaseStmtContext releaseStmt() {
			return getRuleContext(ReleaseStmtContext.class,0);
		}
		public MaxLevelStmtContext maxLevelStmt() {
			return getRuleContext(MaxLevelStmtContext.class,0);
		}
		public ResistanceStmtContext resistanceStmt() {
			return getRuleContext(ResistanceStmtContext.class,0);
		}
		public SpeedStmtContext speedStmt() {
			return getRuleContext(SpeedStmtContext.class,0);
		}
		public HealthStmtContext healthStmt() {
			return getRuleContext(HealthStmtContext.class,0);
		}
		public SeasonStmtContext seasonStmt() {
			return getRuleContext(SeasonStmtContext.class,0);
		}
		public SynergyBlockContext synergyBlock() {
			return getRuleContext(SynergyBlockContext.class,0);
		}
		public SkillDeclContext skillDecl() {
			return getRuleContext(SkillDeclContext.class,0);
		}
		public PassiveDeclContext passiveDecl() {
			return getRuleContext(PassiveDeclContext.class,0);
		}
		public ImageDeclContext imageDecl() {
			return getRuleContext(ImageDeclContext.class,0);
		}
		public MetaStmtContext metaStmt() {
			return getRuleContext(MetaStmtContext.class,0);
		}
		public PersonaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPersonaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPersonaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPersonaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonaStmtContext personaStmt() throws RecognitionException {
		PersonaStmtContext _localctx = new PersonaStmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_personaStmt);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				gradeStmt();
				}
				break;
			case SINNER:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				sinnerStmt();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				sinStmt();
				}
				break;
			case RELEASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(239);
				releaseStmt();
				}
				break;
			case MAXLEVEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(240);
				maxLevelStmt();
				}
				break;
			case RESISTANCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				resistanceStmt();
				}
				break;
			case SPEED:
				enterOuterAlt(_localctx, 7);
				{
				setState(242);
				speedStmt();
				}
				break;
			case HEALTH:
				enterOuterAlt(_localctx, 8);
				{
				setState(243);
				healthStmt();
				}
				break;
			case SEASON:
				enterOuterAlt(_localctx, 9);
				{
				setState(244);
				seasonStmt();
				}
				break;
			case SYNERGY:
				enterOuterAlt(_localctx, 10);
				{
				setState(245);
				synergyBlock();
				}
				break;
			case SKILL:
				enterOuterAlt(_localctx, 11);
				{
				setState(246);
				skillDecl();
				}
				break;
			case PASSIVE:
				enterOuterAlt(_localctx, 12);
				{
				setState(247);
				passiveDecl();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(248);
				imageDecl();
				}
				break;
			case META:
				enterOuterAlt(_localctx, 14);
				{
				setState(249);
				metaStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GradeStmtContext extends ParserRuleContext {
		public TerminalNode GRADE() { return getToken(LPDLParser.GRADE, 0); }
		public GradeValueContext gradeValue() {
			return getRuleContext(GradeValueContext.class,0);
		}
		public GradeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterGradeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitGradeStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitGradeStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradeStmtContext gradeStmt() throws RecognitionException {
		GradeStmtContext _localctx = new GradeStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_gradeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(GRADE);
			setState(253);
			gradeValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GradeValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public TerminalNode STAR() { return getToken(LPDLParser.STAR, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public GradeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gradeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterGradeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitGradeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitGradeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GradeValueContext gradeValue() throws RecognitionException {
		GradeValueContext _localctx = new GradeValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gradeValue);
		int _la;
		try {
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(INT);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(256);
					match(STAR);
					}
				}

				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinStmtContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(LPDLParser.SIN, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public SinStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSinStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSinStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSinStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinStmtContext sinStmt() throws RecognitionException {
		SinStmtContext _localctx = new SinStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sinStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(SIN);
			setState(263);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReleaseStmtContext extends ParserRuleContext {
		public TerminalNode RELEASE() { return getToken(LPDLParser.RELEASE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ReleaseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_releaseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterReleaseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitReleaseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitReleaseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReleaseStmtContext releaseStmt() throws RecognitionException {
		ReleaseStmtContext _localctx = new ReleaseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_releaseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(RELEASE);
			setState(266);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MaxLevelStmtContext extends ParserRuleContext {
		public TerminalNode MAXLEVEL() { return getToken(LPDLParser.MAXLEVEL, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public MaxLevelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLevelStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterMaxLevelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitMaxLevelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitMaxLevelStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaxLevelStmtContext maxLevelStmt() throws RecognitionException {
		MaxLevelStmtContext _localctx = new MaxLevelStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_maxLevelStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(MAXLEVEL);
			setState(269);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SinnerStmtContext extends ParserRuleContext {
		public TerminalNode SINNER() { return getToken(LPDLParser.SINNER, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public SinnerStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sinnerStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSinnerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSinnerStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSinnerStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SinnerStmtContext sinnerStmt() throws RecognitionException {
		SinnerStmtContext _localctx = new SinnerStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sinnerStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(271);
			match(SINNER);
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(272);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(273);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResistanceStmtContext extends ParserRuleContext {
		public TerminalNode RESISTANCE() { return getToken(LPDLParser.RESISTANCE, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<ResistancePairContext> resistancePair() {
			return getRuleContexts(ResistancePairContext.class);
		}
		public ResistancePairContext resistancePair(int i) {
			return getRuleContext(ResistancePairContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public ResistanceStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resistanceStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterResistanceStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitResistanceStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitResistanceStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResistanceStmtContext resistanceStmt() throws RecognitionException {
		ResistanceStmtContext _localctx = new ResistanceStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_resistanceStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(RESISTANCE);
			setState(277);
			match(LBRACE);
			setState(278);
			resistancePair();
			setState(283);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(279);
				match(COMMA);
				setState(280);
				resistancePair();
				}
				}
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(286);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ResistancePairContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(LPDLParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LPDLParser.IDENT, i);
		}
		public ResistancePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resistancePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterResistancePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitResistancePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitResistancePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResistancePairContext resistancePair() throws RecognitionException {
		ResistancePairContext _localctx = new ResistancePairContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_resistancePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(IDENT);
			setState(289);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpeedStmtContext extends ParserRuleContext {
		public TerminalNode SPEED() { return getToken(LPDLParser.SPEED, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<SpeedPairContext> speedPair() {
			return getRuleContexts(SpeedPairContext.class);
		}
		public SpeedPairContext speedPair(int i) {
			return getRuleContext(SpeedPairContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public SpeedStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speedStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSpeedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSpeedStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSpeedStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedStmtContext speedStmt() throws RecognitionException {
		SpeedStmtContext _localctx = new SpeedStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_speedStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(SPEED);
			setState(292);
			match(LBRACE);
			setState(293);
			speedPair();
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(294);
				match(COMMA);
				setState(295);
				speedPair();
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpeedPairContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public SpeedPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_speedPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSpeedPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSpeedPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSpeedPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpeedPairContext speedPair() throws RecognitionException {
		SpeedPairContext _localctx = new SpeedPairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_speedPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IDENT);
			setState(304);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HealthStmtContext extends ParserRuleContext {
		public TerminalNode HEALTH() { return getToken(LPDLParser.HEALTH, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<HealthFieldContext> healthField() {
			return getRuleContexts(HealthFieldContext.class);
		}
		public HealthFieldContext healthField(int i) {
			return getRuleContext(HealthFieldContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public HealthStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_healthStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterHealthStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitHealthStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitHealthStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HealthStmtContext healthStmt() throws RecognitionException {
		HealthStmtContext _localctx = new HealthStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_healthStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(HEALTH);
			setState(307);
			match(LBRACE);
			setState(308);
			healthField();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(310);
				healthField();
				}
				}
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(316);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HealthFieldContext extends ParserRuleContext {
		public TerminalNode BASE() { return getToken(LPDLParser.BASE, 0); }
		public List<TerminalNode> INT() { return getTokens(LPDLParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LPDLParser.INT, i);
		}
		public TerminalNode GROWTH() { return getToken(LPDLParser.GROWTH, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public TerminalNode DISTURBED() { return getToken(LPDLParser.DISTURBED, 0); }
		public TerminalNode LBRACK() { return getToken(LPDLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(LPDLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public HealthFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_healthField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterHealthField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitHealthField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitHealthField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HealthFieldContext healthField() throws RecognitionException {
		HealthFieldContext _localctx = new HealthFieldContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_healthField);
		int _la;
		try {
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(BASE);
				setState(319);
				match(INT);
				}
				break;
			case GROWTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(320);
				match(GROWTH);
				setState(321);
				numberLiteral();
				}
				break;
			case DISTURBED:
				enterOuterAlt(_localctx, 3);
				{
				setState(322);
				match(DISTURBED);
				setState(323);
				match(LBRACK);
				setState(324);
				match(INT);
				setState(329);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(325);
					match(COMMA);
					setState(326);
					match(INT);
					}
					}
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(332);
				match(RBRACK);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasonStmtContext extends ParserRuleContext {
		public TerminalNode SEASON() { return getToken(LPDLParser.SEASON, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<SeasonFieldContext> seasonField() {
			return getRuleContexts(SeasonFieldContext.class);
		}
		public SeasonFieldContext seasonField(int i) {
			return getRuleContext(SeasonFieldContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public SeasonStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seasonStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSeasonStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSeasonStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSeasonStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasonStmtContext seasonStmt() throws RecognitionException {
		SeasonStmtContext _localctx = new SeasonStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seasonStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(SEASON);
			setState(336);
			match(LBRACE);
			setState(337);
			seasonField();
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(338);
				match(COMMA);
				setState(339);
				seasonField();
				}
				}
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(345);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SeasonFieldContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LPDLParser.TYPE, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode NUMBER() { return getToken(LPDLParser.NUMBER, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public SeasonFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seasonField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSeasonField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSeasonField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSeasonField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeasonFieldContext seasonField() throws RecognitionException {
		SeasonFieldContext _localctx = new SeasonFieldContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_seasonField);
		try {
			setState(351);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				match(TYPE);
				setState(348);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(NUMBER);
				setState(350);
				match(INT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageDeclContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(LPDLParser.IMAGE, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<ImageFieldContext> imageField() {
			return getRuleContexts(ImageFieldContext.class);
		}
		public ImageFieldContext imageField(int i) {
			return getRuleContext(ImageFieldContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public ImageDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterImageDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitImageDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitImageDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageDeclContext imageDecl() throws RecognitionException {
		ImageDeclContext _localctx = new ImageDeclContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_imageDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(IMAGE);
			setState(354);
			match(LBRACE);
			setState(355);
			imageField();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				imageField();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageFieldContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(LPDLParser.TYPE, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode URL() { return getToken(LPDLParser.URL, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode PRIORITY() { return getToken(LPDLParser.PRIORITY, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public TerminalNode PRIMARY() { return getToken(LPDLParser.PRIMARY, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public ImageFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterImageField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitImageField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitImageField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageFieldContext imageField() throws RecognitionException {
		ImageFieldContext _localctx = new ImageFieldContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_imageField);
		try {
			setState(373);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(TYPE);
				setState(366);
				match(IDENT);
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(URL);
				setState(368);
				stringLiteral();
				}
				break;
			case PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(PRIORITY);
				setState(370);
				match(INT);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(PRIMARY);
				setState(372);
				booleanLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetaStmtContext extends ParserRuleContext {
		public TerminalNode META() { return getToken(LPDLParser.META, 0); }
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public MetaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterMetaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitMetaStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitMetaStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetaStmtContext metaStmt() throws RecognitionException {
		MetaStmtContext _localctx = new MetaStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_metaStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(META);
			setState(376);
			objectLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynergyBlockContext extends ParserRuleContext {
		public TerminalNode SYNERGY() { return getToken(LPDLParser.SYNERGY, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<SynergyStmtContext> synergyStmt() {
			return getRuleContexts(SynergyStmtContext.class);
		}
		public SynergyStmtContext synergyStmt(int i) {
			return getRuleContext(SynergyStmtContext.class,i);
		}
		public SynergyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synergyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSynergyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSynergyBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSynergyBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynergyBlockContext synergyBlock() throws RecognitionException {
		SynergyBlockContext _localctx = new SynergyBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_synergyBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(SYNERGY);
			setState(379);
			match(LBRACE);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH) {
				{
				{
				setState(380);
				synergyStmt();
				}
				}
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(386);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynergyStmtContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(LPDLParser.WITH, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public List<SynergyDetailContext> synergyDetail() {
			return getRuleContexts(SynergyDetailContext.class);
		}
		public SynergyDetailContext synergyDetail(int i) {
			return getRuleContext(SynergyDetailContext.class,i);
		}
		public SynergyStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synergyStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSynergyStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSynergyStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSynergyStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynergyStmtContext synergyStmt() throws RecognitionException {
		SynergyStmtContext _localctx = new SynergyStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_synergyStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(WITH);
			setState(391);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(389);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(390);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(394); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(393);
				synergyDetail();
				}
				}
				setState(396); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 192937984L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SynergyDetailContext extends ParserRuleContext {
		public TerminalNode BOOST() { return getToken(LPDLParser.BOOST, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode SUPPORT() { return getToken(LPDLParser.SUPPORT, 0); }
		public TerminalNode TYPE() { return getToken(LPDLParser.TYPE, 0); }
		public TerminalNode VALUE() { return getToken(LPDLParser.VALUE, 0); }
		public SynergyDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_synergyDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSynergyDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSynergyDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSynergyDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SynergyDetailContext synergyDetail() throws RecognitionException {
		SynergyDetailContext _localctx = new SynergyDetailContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_synergyDetail);
		int _la;
		try {
			setState(412);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOST:
				enterOuterAlt(_localctx, 1);
				{
				setState(398);
				match(BOOST);
				setState(399);
				match(IDENT);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 73669527212031L) != 0)) {
					{
					setState(400);
					additiveExpr();
					}
				}

				}
				break;
			case SUPPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				match(SUPPORT);
				setState(404);
				match(IDENT);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 73669527212031L) != 0)) {
					{
					setState(405);
					additiveExpr();
					}
				}

				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(TYPE);
				setState(409);
				match(IDENT);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(410);
				match(VALUE);
				setState(411);
				additiveExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkillDeclContext extends ParserRuleContext {
		public TerminalNode SKILL() { return getToken(LPDLParser.SKILL, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public SkillBodyContext skillBody() {
			return getRuleContext(SkillBodyContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public SkillDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skillDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSkillDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSkillDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSkillDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillDeclContext skillDecl() throws RecognitionException {
		SkillDeclContext _localctx = new SkillDeclContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_skillDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(SKILL);
			setState(415);
			match(INT);
			setState(417);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(416);
				stringLiteral();
				}
			}

			setState(419);
			skillBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkillBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<SkillStmtContext> skillStmt() {
			return getRuleContexts(SkillStmtContext.class);
		}
		public SkillStmtContext skillStmt(int i) {
			return getRuleContext(SkillStmtContext.class,i);
		}
		public SkillBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skillBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSkillBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSkillBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSkillBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillBodyContext skillBody() throws RecognitionException {
		SkillBodyContext _localctx = new SkillBodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_skillBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(LBRACE);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 102609453184L) != 0)) {
				{
				{
				setState(422);
				skillStmt();
				}
				}
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(428);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkillStmtContext extends ParserRuleContext {
		public CategoryStmtContext categoryStmt() {
			return getRuleContext(CategoryStmtContext.class,0);
		}
		public SkillSinStmtContext skillSinStmt() {
			return getRuleContext(SkillSinStmtContext.class,0);
		}
		public AttackStmtContext attackStmt() {
			return getRuleContext(AttackStmtContext.class,0);
		}
		public DefenseStmtContext defenseStmt() {
			return getRuleContext(DefenseStmtContext.class,0);
		}
		public QuantityStmtContext quantityStmt() {
			return getRuleContext(QuantityStmtContext.class,0);
		}
		public KeywordStmtContext keywordStmt() {
			return getRuleContext(KeywordStmtContext.class,0);
		}
		public ImageStmtContext imageStmt() {
			return getRuleContext(ImageStmtContext.class,0);
		}
		public TextDeclContext textDecl() {
			return getRuleContext(TextDeclContext.class,0);
		}
		public SyncDeclContext syncDecl() {
			return getRuleContext(SyncDeclContext.class,0);
		}
		public SkillStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skillStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSkillStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSkillStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSkillStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillStmtContext skillStmt() throws RecognitionException {
		SkillStmtContext _localctx = new SkillStmtContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_skillStmt);
		try {
			setState(439);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(430);
				categoryStmt();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(431);
				skillSinStmt();
				}
				break;
			case ATTACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				attackStmt();
				}
				break;
			case DEFENSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(433);
				defenseStmt();
				}
				break;
			case QUANTITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(434);
				quantityStmt();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(435);
				keywordStmt();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(436);
				imageStmt();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(437);
				textDecl();
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 9);
				{
				setState(438);
				syncDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CategoryStmtContext extends ParserRuleContext {
		public TerminalNode CATEGORY() { return getToken(LPDLParser.CATEGORY, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public CategoryStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_categoryStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCategoryStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCategoryStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCategoryStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CategoryStmtContext categoryStmt() throws RecognitionException {
		CategoryStmtContext _localctx = new CategoryStmtContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_categoryStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			match(CATEGORY);
			setState(442);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SkillSinStmtContext extends ParserRuleContext {
		public TerminalNode SIN() { return getToken(LPDLParser.SIN, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public SkillSinStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skillSinStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSkillSinStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSkillSinStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSkillSinStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkillSinStmtContext skillSinStmt() throws RecognitionException {
		SkillSinStmtContext _localctx = new SkillSinStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_skillSinStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			match(SIN);
			setState(445);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttackStmtContext extends ParserRuleContext {
		public TerminalNode ATTACK() { return getToken(LPDLParser.ATTACK, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public AttackStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attackStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterAttackStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitAttackStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitAttackStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttackStmtContext attackStmt() throws RecognitionException {
		AttackStmtContext _localctx = new AttackStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attackStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(447);
			match(ATTACK);
			setState(448);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefenseStmtContext extends ParserRuleContext {
		public TerminalNode DEFENSE() { return getToken(LPDLParser.DEFENSE, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public DefenseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defenseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterDefenseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitDefenseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitDefenseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefenseStmtContext defenseStmt() throws RecognitionException {
		DefenseStmtContext _localctx = new DefenseStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_defenseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(DEFENSE);
			setState(451);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantityStmtContext extends ParserRuleContext {
		public TerminalNode QUANTITY() { return getToken(LPDLParser.QUANTITY, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public QuantityStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantityStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterQuantityStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitQuantityStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitQuantityStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantityStmtContext quantityStmt() throws RecognitionException {
		QuantityStmtContext _localctx = new QuantityStmtContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_quantityStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(453);
			match(QUANTITY);
			setState(454);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordStmtContext extends ParserRuleContext {
		public TerminalNode KEYWORD() { return getToken(LPDLParser.KEYWORD, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public KeywordStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterKeywordStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitKeywordStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitKeywordStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordStmtContext keywordStmt() throws RecognitionException {
		KeywordStmtContext _localctx = new KeywordStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_keywordStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(KEYWORD);
			setState(457);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImageStmtContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(LPDLParser.IMAGE, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode NONE() { return getToken(LPDLParser.NONE, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ImageStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterImageStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitImageStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitImageStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageStmtContext imageStmt() throws RecognitionException {
		ImageStmtContext _localctx = new ImageStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_imageStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(IMAGE);
			setState(463);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(460);
				match(IDENT);
				}
				break;
			case NONE:
				{
				setState(461);
				match(NONE);
				}
				break;
			case STRING:
				{
				setState(462);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyncDeclContext extends ParserRuleContext {
		public TerminalNode SYNC() { return getToken(LPDLParser.SYNC, 0); }
		public SyncLevelContext syncLevel() {
			return getRuleContext(SyncLevelContext.class,0);
		}
		public SyncBodyContext syncBody() {
			return getRuleContext(SyncBodyContext.class,0);
		}
		public SyncDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSyncDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSyncDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSyncDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncDeclContext syncDecl() throws RecognitionException {
		SyncDeclContext _localctx = new SyncDeclContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_syncDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(SYNC);
			setState(466);
			syncLevel();
			setState(467);
			syncBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyncLevelContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(LPDLParser.STRING, 0); }
		public SyncLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSyncLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSyncLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSyncLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncLevelContext syncLevel() throws RecognitionException {
		SyncLevelContext _localctx = new SyncLevelContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_syncLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==IDENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyncBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<SyncStmtContext> syncStmt() {
			return getRuleContexts(SyncStmtContext.class);
		}
		public SyncStmtContext syncStmt(int i) {
			return getRuleContext(SyncStmtContext.class,i);
		}
		public SyncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSyncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSyncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSyncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncBodyContext syncBody() throws RecognitionException {
		SyncBodyContext _localctx = new SyncBodyContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_syncBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(471);
			match(LBRACE);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 290133630779392L) != 0)) {
				{
				{
				setState(472);
				syncStmt();
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SyncStmtContext extends ParserRuleContext {
		public BasePowerStmtContext basePowerStmt() {
			return getRuleContext(BasePowerStmtContext.class,0);
		}
		public CoinPowerStmtContext coinPowerStmt() {
			return getRuleContext(CoinPowerStmtContext.class,0);
		}
		public CoinCountStmtContext coinCountStmt() {
			return getRuleContext(CoinCountStmtContext.class,0);
		}
		public WeightStmtContext weightStmt() {
			return getRuleContext(WeightStmtContext.class,0);
		}
		public LevelStmtContext levelStmt() {
			return getRuleContext(LevelStmtContext.class,0);
		}
		public EffectDeclContext effectDecl() {
			return getRuleContext(EffectDeclContext.class,0);
		}
		public CoinDeclContext coinDecl() {
			return getRuleContext(CoinDeclContext.class,0);
		}
		public SyncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSyncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSyncStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSyncStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SyncStmtContext syncStmt() throws RecognitionException {
		SyncStmtContext _localctx = new SyncStmtContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_syncStmt);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASEPOWER:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				basePowerStmt();
				}
				break;
			case COINPOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				coinPowerStmt();
				}
				break;
			case COINCOUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				coinCountStmt();
				}
				break;
			case WEIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				weightStmt();
				}
				break;
			case LEVEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				levelStmt();
				}
				break;
			case EFFECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(485);
				effectDecl();
				}
				break;
			case COIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(486);
				coinDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BasePowerStmtContext extends ParserRuleContext {
		public TerminalNode BASEPOWER() { return getToken(LPDLParser.BASEPOWER, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public BasePowerStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basePowerStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterBasePowerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitBasePowerStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitBasePowerStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BasePowerStmtContext basePowerStmt() throws RecognitionException {
		BasePowerStmtContext _localctx = new BasePowerStmtContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_basePowerStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(BASEPOWER);
			setState(490);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinPowerStmtContext extends ParserRuleContext {
		public TerminalNode COINPOWER() { return getToken(LPDLParser.COINPOWER, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public CoinPowerStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinPowerStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinPowerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinPowerStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinPowerStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinPowerStmtContext coinPowerStmt() throws RecognitionException {
		CoinPowerStmtContext _localctx = new CoinPowerStmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_coinPowerStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(COINPOWER);
			setState(493);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinCountStmtContext extends ParserRuleContext {
		public TerminalNode COINCOUNT() { return getToken(LPDLParser.COINCOUNT, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public CoinCountStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinCountStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinCountStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinCountStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinCountStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinCountStmtContext coinCountStmt() throws RecognitionException {
		CoinCountStmtContext _localctx = new CoinCountStmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_coinCountStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			match(COINCOUNT);
			setState(496);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WeightStmtContext extends ParserRuleContext {
		public TerminalNode WEIGHT() { return getToken(LPDLParser.WEIGHT, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public WeightStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterWeightStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitWeightStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitWeightStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightStmtContext weightStmt() throws RecognitionException {
		WeightStmtContext _localctx = new WeightStmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_weightStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			match(WEIGHT);
			setState(499);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelStmtContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(LPDLParser.LEVEL, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public LevelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterLevelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitLevelStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitLevelStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelStmtContext levelStmt() throws RecognitionException {
		LevelStmtContext _localctx = new LevelStmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_levelStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			match(LEVEL);
			setState(502);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectDeclContext extends ParserRuleContext {
		public TerminalNode EFFECT() { return getToken(LPDLParser.EFFECT, 0); }
		public EffectBodyContext effectBody() {
			return getRuleContext(EffectBodyContext.class,0);
		}
		public EffectHeaderContext effectHeader() {
			return getRuleContext(EffectHeaderContext.class,0);
		}
		public EffectDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectDeclContext effectDecl() throws RecognitionException {
		EffectDeclContext _localctx = new EffectDeclContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_effectDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(EFFECT);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(505);
				effectHeader();
				}
			}

			setState(508);
			effectBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectHeaderContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode STRING() { return getToken(LPDLParser.STRING, 0); }
		public EffectHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectHeaderContext effectHeader() throws RecognitionException {
		EffectHeaderContext _localctx = new EffectHeaderContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_effectHeader);
		try {
			setState(512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(511);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<EffectStmtContext> effectStmt() {
			return getRuleContexts(EffectStmtContext.class);
		}
		public EffectStmtContext effectStmt(int i) {
			return getRuleContext(EffectStmtContext.class,i);
		}
		public EffectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectBodyContext effectBody() throws RecognitionException {
		EffectBodyContext _localctx = new EffectBodyContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_effectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LBRACE);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 274810800007L) != 0)) {
				{
				{
				setState(515);
				effectStmt();
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectStmtContext extends ParserRuleContext {
		public TriggerStmtContext triggerStmt() {
			return getRuleContext(TriggerStmtContext.class,0);
		}
		public WhenStmtContext whenStmt() {
			return getRuleContext(WhenStmtContext.class,0);
		}
		public BranchBlockContext branchBlock() {
			return getRuleContext(BranchBlockContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(LPDLParser.ACTION, 0); }
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public ActionSimpleContext actionSimple() {
			return getRuleContext(ActionSimpleContext.class,0);
		}
		public EffectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectStmtContext effectStmt() throws RecognitionException {
		EffectStmtContext _localctx = new EffectStmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_effectStmt);
		try {
			setState(529);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				triggerStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				whenStmt();
				}
				break;
			case BRANCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				branchBlock();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(526);
				match(ACTION);
				setState(527);
				actionClause();
				}
				break;
			case APPLY:
			case REMOVE:
			case MODIFY:
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(528);
				actionSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerStmtContext extends ParserRuleContext {
		public TerminalNode TRIGGER() { return getToken(LPDLParser.TRIGGER, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TriggerStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTriggerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTriggerStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTriggerStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerStmtContext triggerStmt() throws RecognitionException {
		TriggerStmtContext _localctx = new TriggerStmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_triggerStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(TRIGGER);
			setState(532);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhenStmtContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(LPDLParser.WHEN, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public WhenStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterWhenStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitWhenStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitWhenStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenStmtContext whenStmt() throws RecognitionException {
		WhenStmtContext _localctx = new WhenStmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_whenStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(534);
			match(WHEN);
			setState(535);
			conditionExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BranchBlockContext extends ParserRuleContext {
		public TerminalNode BRANCH() { return getToken(LPDLParser.BRANCH, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<BranchStmtContext> branchStmt() {
			return getRuleContexts(BranchStmtContext.class);
		}
		public BranchStmtContext branchStmt(int i) {
			return getRuleContext(BranchStmtContext.class,i);
		}
		public BranchBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterBranchBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitBranchBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitBranchBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchBlockContext branchBlock() throws RecognitionException {
		BranchBlockContext _localctx = new BranchBlockContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_branchBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(BRANCH);
			setState(538);
			match(LBRACE);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 44)) & ~0x3f) == 0 && ((1L << (_la - 44)) & 137405400013L) != 0)) {
				{
				{
				setState(539);
				branchStmt();
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BranchStmtContext extends ParserRuleContext {
		public OrderStmtContext orderStmt() {
			return getRuleContext(OrderStmtContext.class,0);
		}
		public StopOnMatchStmtContext stopOnMatchStmt() {
			return getRuleContext(StopOnMatchStmtContext.class,0);
		}
		public WhenStmtContext whenStmt() {
			return getRuleContext(WhenStmtContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(LPDLParser.ACTION, 0); }
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public ActionSimpleContext actionSimple() {
			return getRuleContext(ActionSimpleContext.class,0);
		}
		public BranchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterBranchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitBranchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitBranchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchStmtContext branchStmt() throws RecognitionException {
		BranchStmtContext _localctx = new BranchStmtContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_branchStmt);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				orderStmt();
				}
				break;
			case STOPONMATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(548);
				stopOnMatchStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				whenStmt();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(550);
				match(ACTION);
				setState(551);
				actionClause();
				}
				break;
			case APPLY:
			case REMOVE:
			case MODIFY:
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
				enterOuterAlt(_localctx, 5);
				{
				setState(552);
				actionSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderStmtContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(LPDLParser.ORDER, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public OrderStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterOrderStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitOrderStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitOrderStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderStmtContext orderStmt() throws RecognitionException {
		OrderStmtContext _localctx = new OrderStmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_orderStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			match(ORDER);
			setState(556);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StopOnMatchStmtContext extends ParserRuleContext {
		public TerminalNode STOPONMATCH() { return getToken(LPDLParser.STOPONMATCH, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StopOnMatchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stopOnMatchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterStopOnMatchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitStopOnMatchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitStopOnMatchStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StopOnMatchStmtContext stopOnMatchStmt() throws RecognitionException {
		StopOnMatchStmtContext _localctx = new StopOnMatchStmtContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_stopOnMatchStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(STOPONMATCH);
			setState(559);
			booleanLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinDeclContext extends ParserRuleContext {
		public TerminalNode COIN() { return getToken(LPDLParser.COIN, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public CoinBodyContext coinBody() {
			return getRuleContext(CoinBodyContext.class,0);
		}
		public CoinDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinDeclContext coinDecl() throws RecognitionException {
		CoinDeclContext _localctx = new CoinDeclContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_coinDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(561);
			match(COIN);
			setState(562);
			match(INT);
			setState(563);
			match(IDENT);
			setState(564);
			coinBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<CoinStmtContext> coinStmt() {
			return getRuleContexts(CoinStmtContext.class);
		}
		public CoinStmtContext coinStmt(int i) {
			return getRuleContext(CoinStmtContext.class,i);
		}
		public CoinBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinBodyContext coinBody() throws RecognitionException {
		CoinBodyContext _localctx = new CoinBodyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_coinBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(LBRACE);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TEXT || _la==EFFECT) {
				{
				{
				setState(567);
				coinStmt();
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinStmtContext extends ParserRuleContext {
		public EffectInlineDeclContext effectInlineDecl() {
			return getRuleContext(EffectInlineDeclContext.class,0);
		}
		public TextDeclContext textDecl() {
			return getRuleContext(TextDeclContext.class,0);
		}
		public CoinStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinStmtContext coinStmt() throws RecognitionException {
		CoinStmtContext _localctx = new CoinStmtContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_coinStmt);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EFFECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(575);
				effectInlineDecl();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(576);
				textDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectInlineDeclContext extends ParserRuleContext {
		public TerminalNode EFFECT() { return getToken(LPDLParser.EFFECT, 0); }
		public EffectBodyContext effectBody() {
			return getRuleContext(EffectBodyContext.class,0);
		}
		public EffectInlineHeaderContext effectInlineHeader() {
			return getRuleContext(EffectInlineHeaderContext.class,0);
		}
		public EffectInlineDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectInlineDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectInlineDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectInlineDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectInlineDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectInlineDeclContext effectInlineDecl() throws RecognitionException {
		EffectInlineDeclContext _localctx = new EffectInlineDeclContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_effectInlineDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			match(EFFECT);
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(580);
				effectInlineHeader();
				}
			}

			setState(583);
			effectBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EffectInlineHeaderContext extends ParserRuleContext {
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public EffectInlineHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_effectInlineHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterEffectInlineHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitEffectInlineHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitEffectInlineHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EffectInlineHeaderContext effectInlineHeader() throws RecognitionException {
		EffectInlineHeaderContext _localctx = new EffectInlineHeaderContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_effectInlineHeader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
			stringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassiveDeclContext extends ParserRuleContext {
		public TerminalNode PASSIVE() { return getToken(LPDLParser.PASSIVE, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public PassiveBodyContext passiveBody() {
			return getRuleContext(PassiveBodyContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public PassiveDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passiveDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPassiveDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPassiveDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPassiveDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassiveDeclContext passiveDecl() throws RecognitionException {
		PassiveDeclContext _localctx = new PassiveDeclContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_passiveDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(PASSIVE);
			setState(588);
			match(IDENT);
			setState(590);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(589);
				stringLiteral();
				}
			}

			setState(592);
			passiveBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassiveBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public PassiveBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passiveBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPassiveBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPassiveBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPassiveBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassiveBodyContext passiveBody() throws RecognitionException {
		PassiveBodyContext _localctx = new PassiveBodyContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_passiveBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(LBRACE);
			setState(598);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 26)) & ~0x3f) == 0 && ((1L << (_la - 26)) & 36020001178517505L) != 0)) {
				{
				{
				setState(595);
				passiveStmt();
				}
				}
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(601);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PassiveStmtContext extends ParserRuleContext {
		public TriggerStmtContext triggerStmt() {
			return getRuleContext(TriggerStmtContext.class,0);
		}
		public WhenStmtContext whenStmt() {
			return getRuleContext(WhenStmtContext.class,0);
		}
		public TerminalNode ACTION() { return getToken(LPDLParser.ACTION, 0); }
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public ActionSimpleContext actionSimple() {
			return getRuleContext(ActionSimpleContext.class,0);
		}
		public BranchBlockContext branchBlock() {
			return getRuleContext(BranchBlockContext.class,0);
		}
		public TextDeclContext textDecl() {
			return getRuleContext(TextDeclContext.class,0);
		}
		public PassiveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passiveStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPassiveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPassiveStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPassiveStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PassiveStmtContext passiveStmt() throws RecognitionException {
		PassiveStmtContext _localctx = new PassiveStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_passiveStmt);
		try {
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				triggerStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				whenStmt();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
				match(ACTION);
				setState(606);
				actionClause();
				}
				break;
			case APPLY:
			case REMOVE:
			case MODIFY:
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				actionSimple();
				}
				break;
			case BRANCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(608);
				branchBlock();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(609);
				textDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionStmtContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(LPDLParser.ACTION, 0); }
		public ActionClauseContext actionClause() {
			return getRuleContext(ActionClauseContext.class,0);
		}
		public ActionSimpleContext actionSimple() {
			return getRuleContext(ActionSimpleContext.class,0);
		}
		public ActionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterActionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitActionStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitActionStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionStmtContext actionStmt() throws RecognitionException {
		ActionStmtContext _localctx = new ActionStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_actionStmt);
		try {
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				match(ACTION);
				setState(613);
				actionClause();
				}
				break;
			case APPLY:
			case REMOVE:
			case MODIFY:
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
				actionSimple();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionClauseContext extends ParserRuleContext {
		public VerbSpecContext verbSpec() {
			return getRuleContext(VerbSpecContext.class,0);
		}
		public ActionDetailContext actionDetail() {
			return getRuleContext(ActionDetailContext.class,0);
		}
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public ActionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterActionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitActionClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitActionClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionClauseContext actionClause() throws RecognitionException {
		ActionClauseContext _localctx = new ActionClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_actionClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 4095L) != 0)) {
				{
				setState(617);
				targetSpec();
				}
			}

			setState(620);
			verbSpec();
			setState(621);
			actionDetail();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionSimpleContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(LPDLParser.APPLY, 0); }
		public StatSpecContext statSpec() {
			return getRuleContext(StatSpecContext.class,0);
		}
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public PolicySpecContext policySpec() {
			return getRuleContext(PolicySpecContext.class,0);
		}
		public List<ActionOptionsContext> actionOptions() {
			return getRuleContexts(ActionOptionsContext.class);
		}
		public ActionOptionsContext actionOptions(int i) {
			return getRuleContext(ActionOptionsContext.class,i);
		}
		public TerminalNode REMOVE() { return getToken(LPDLParser.REMOVE, 0); }
		public TerminalNode MODIFY() { return getToken(LPDLParser.MODIFY, 0); }
		public TerminalNode POWER() { return getToken(LPDLParser.POWER, 0); }
		public TerminalNode DAMAGE() { return getToken(LPDLParser.DAMAGE, 0); }
		public ActionSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionSimple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterActionSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitActionSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitActionSimple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionSimpleContext actionSimple() throws RecognitionException {
		ActionSimpleContext _localctx = new ActionSimpleContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_actionSimple);
		int _la;
		try {
			setState(661);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 4095L) != 0)) {
					{
					setState(623);
					targetSpec();
					}
				}

				setState(626);
				match(APPLY);
				setState(627);
				statSpec();
				setState(629);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(628);
					policySpec();
					}
					break;
				}
				setState(631);
				additiveExpr();
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 3071L) != 0)) {
					{
					{
					setState(632);
					actionOptions();
					}
					}
					setState(637);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 4095L) != 0)) {
					{
					setState(638);
					targetSpec();
					}
				}

				setState(641);
				match(REMOVE);
				setState(642);
				statSpec();
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(643);
					additiveExpr();
					}
					break;
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 3071L) != 0)) {
					{
					{
					setState(646);
					actionOptions();
					}
					}
					setState(651);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(652);
				match(MODIFY);
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==POWER || _la==DAMAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(654);
				additiveExpr();
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 3071L) != 0)) {
					{
					{
					setState(655);
					actionOptions();
					}
					}
					setState(660);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TargetSpecContext extends ParserRuleContext {
		public TerminalNode SELF() { return getToken(LPDLParser.SELF, 0); }
		public TerminalNode TARGET() { return getToken(LPDLParser.TARGET, 0); }
		public TerminalNode ALLY() { return getToken(LPDLParser.ALLY, 0); }
		public TerminalNode ENEMY() { return getToken(LPDLParser.ENEMY, 0); }
		public TerminalNode ALL_ALLIES() { return getToken(LPDLParser.ALL_ALLIES, 0); }
		public TerminalNode ALL_ENEMIES() { return getToken(LPDLParser.ALL_ENEMIES, 0); }
		public TerminalNode SELF_ALLY() { return getToken(LPDLParser.SELF_ALLY, 0); }
		public TerminalNode ANY() { return getToken(LPDLParser.ANY, 0); }
		public TerminalNode RIGHT_ALLY() { return getToken(LPDLParser.RIGHT_ALLY, 0); }
		public TerminalNode LEFT_ALLY() { return getToken(LPDLParser.LEFT_ALLY, 0); }
		public TerminalNode LOWEST_HP_ALLY() { return getToken(LPDLParser.LOWEST_HP_ALLY, 0); }
		public TerminalNode HIGHEST_RESONANCE() { return getToken(LPDLParser.HIGHEST_RESONANCE, 0); }
		public TargetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTargetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTargetSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTargetSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetSpecContext targetSpec() throws RecognitionException {
		TargetSpecContext _localctx = new TargetSpecContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_targetSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 4095L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VerbSpecContext extends ParserRuleContext {
		public TerminalNode APPLY() { return getToken(LPDLParser.APPLY, 0); }
		public StatSpecContext statSpec() {
			return getRuleContext(StatSpecContext.class,0);
		}
		public ValueSpecContext valueSpec() {
			return getRuleContext(ValueSpecContext.class,0);
		}
		public PolicySpecContext policySpec() {
			return getRuleContext(PolicySpecContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(LPDLParser.REMOVE, 0); }
		public TerminalNode MODIFY() { return getToken(LPDLParser.MODIFY, 0); }
		public TerminalNode POWER() { return getToken(LPDLParser.POWER, 0); }
		public TerminalNode DAMAGE() { return getToken(LPDLParser.DAMAGE, 0); }
		public VerbSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterVerbSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitVerbSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitVerbSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerbSpecContext verbSpec() throws RecognitionException {
		VerbSpecContext _localctx = new VerbSpecContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_verbSpec);
		int _la;
		try {
			setState(677);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(APPLY);
				setState(666);
				statSpec();
				setState(668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(667);
					policySpec();
					}
					break;
				}
				setState(670);
				valueSpec();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				match(REMOVE);
				setState(673);
				statSpec();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(MODIFY);
				setState(675);
				_la = _input.LA(1);
				if ( !(_la==POWER || _la==DAMAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(676);
				valueSpec();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PolicySpecContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public PolicySpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_policySpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPolicySpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPolicySpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPolicySpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PolicySpecContext policySpec() throws RecognitionException {
		PolicySpecContext _localctx = new PolicySpecContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_policySpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatSpecContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public StatSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterStatSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitStatSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitStatSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatSpecContext statSpec() throws RecognitionException {
		StatSpecContext _localctx = new StatSpecContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_statSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueSpecContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ValueSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterValueSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitValueSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitValueSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueSpecContext valueSpec() throws RecognitionException {
		ValueSpecContext _localctx = new ValueSpecContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_valueSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionDetailContext extends ParserRuleContext {
		public List<ActionOptionsContext> actionOptions() {
			return getRuleContexts(ActionOptionsContext.class);
		}
		public ActionOptionsContext actionOptions(int i) {
			return getRuleContext(ActionOptionsContext.class,i);
		}
		public ActionDetailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionDetail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterActionDetail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitActionDetail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitActionDetail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionDetailContext actionDetail() throws RecognitionException {
		ActionDetailContext _localctx = new ActionDetailContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_actionDetail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 57)) & ~0x3f) == 0 && ((1L << (_la - 57)) & 3071L) != 0)) {
				{
				{
				setState(685);
				actionOptions();
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionOptionsContext extends ParserRuleContext {
		public TerminalNode CAPPED() { return getToken(LPDLParser.CAPPED, 0); }
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public TerminalNode CAP() { return getToken(LPDLParser.CAP, 0); }
		public TerminalNode PERTURN() { return getToken(LPDLParser.PERTURN, 0); }
		public TerminalNode NEXTTURN() { return getToken(LPDLParser.NEXTTURN, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode DURATION() { return getToken(LPDLParser.DURATION, 0); }
		public TerminalNode SCOPE() { return getToken(LPDLParser.SCOPE, 0); }
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public TerminalNode PRIORITY() { return getToken(LPDLParser.PRIORITY, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public TerminalNode UNIT() { return getToken(LPDLParser.UNIT, 0); }
		public UnitTypeContext unitType() {
			return getRuleContext(UnitTypeContext.class,0);
		}
		public TerminalNode TIMING() { return getToken(LPDLParser.TIMING, 0); }
		public TimingTypeContext timingType() {
			return getRuleContext(TimingTypeContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(LPDLParser.SELECT, 0); }
		public SelectorTypeContext selectorType() {
			return getRuleContext(SelectorTypeContext.class,0);
		}
		public TerminalNode FROM() { return getToken(LPDLParser.FROM, 0); }
		public TerminalNode COINS() { return getToken(LPDLParser.COINS, 0); }
		public CoinSelectorTypeContext coinSelectorType() {
			return getRuleContext(CoinSelectorTypeContext.class,0);
		}
		public ActionOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actionOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterActionOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitActionOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitActionOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionOptionsContext actionOptions() throws RecognitionException {
		ActionOptionsContext _localctx = new ActionOptionsContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_actionOptions);
		int _la;
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAPPED:
				enterOuterAlt(_localctx, 1);
				{
				setState(691);
				match(CAPPED);
				setState(692);
				additiveExpr();
				}
				break;
			case CAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(CAP);
				setState(694);
				additiveExpr();
				}
				break;
			case PERTURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				match(PERTURN);
				setState(696);
				additiveExpr();
				}
				break;
			case NEXTTURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(697);
				match(NEXTTURN);
				setState(698);
				booleanLiteral();
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(699);
				match(DURATION);
				setState(700);
				additiveExpr();
				}
				break;
			case SCOPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(701);
				match(SCOPE);
				setState(702);
				targetSpec();
				}
				break;
			case PRIORITY:
				enterOuterAlt(_localctx, 7);
				{
				setState(703);
				match(PRIORITY);
				setState(704);
				match(INT);
				}
				break;
			case UNIT:
				enterOuterAlt(_localctx, 8);
				{
				setState(705);
				match(UNIT);
				setState(706);
				unitType();
				}
				break;
			case TIMING:
				enterOuterAlt(_localctx, 9);
				{
				setState(707);
				match(TIMING);
				setState(708);
				timingType();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 10);
				{
				setState(709);
				match(SELECT);
				setState(710);
				selectorType();
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(711);
					match(FROM);
					setState(712);
					targetSpec();
					}
				}

				}
				break;
			case COINS:
				enterOuterAlt(_localctx, 11);
				{
				setState(715);
				match(COINS);
				setState(716);
				coinSelectorType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitTypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public UnitTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterUnitType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitUnitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitUnitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitTypeContext unitType() throws RecognitionException {
		UnitTypeContext _localctx = new UnitTypeContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_unitType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TimingTypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TimingTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timingType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTimingType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTimingType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTimingType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimingTypeContext timingType() throws RecognitionException {
		TimingTypeContext _localctx = new TimingTypeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_timingType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorTypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public SelectorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSelectorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSelectorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSelectorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorTypeContext selectorType() throws RecognitionException {
		SelectorTypeContext _localctx = new SelectorTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_selectorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CoinSelectorTypeContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public CoinSelectorTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coinSelectorType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterCoinSelectorType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitCoinSelectorType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitCoinSelectorType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CoinSelectorTypeContext coinSelectorType() throws RecognitionException {
		CoinSelectorTypeContext _localctx = new CoinSelectorTypeContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_coinSelectorType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(725);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionExprContext extends ParserRuleContext {
		public ConditionOrContext conditionOr() {
			return getRuleContext(ConditionOrContext.class,0);
		}
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitConditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_conditionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			conditionOr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionOrContext extends ParserRuleContext {
		public List<ConditionAndContext> conditionAnd() {
			return getRuleContexts(ConditionAndContext.class);
		}
		public ConditionAndContext conditionAnd(int i) {
			return getRuleContext(ConditionAndContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(LPDLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(LPDLParser.OR, i);
		}
		public ConditionOrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterConditionOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitConditionOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitConditionOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOrContext conditionOr() throws RecognitionException {
		ConditionOrContext _localctx = new ConditionOrContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_conditionOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(729);
			conditionAnd();
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(730);
				match(OR);
				setState(731);
				conditionAnd();
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionAndContext extends ParserRuleContext {
		public List<ConditionNotContext> conditionNot() {
			return getRuleContexts(ConditionNotContext.class);
		}
		public ConditionNotContext conditionNot(int i) {
			return getRuleContext(ConditionNotContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(LPDLParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(LPDLParser.AND, i);
		}
		public ConditionAndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterConditionAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitConditionAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitConditionAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionAndContext conditionAnd() throws RecognitionException {
		ConditionAndContext _localctx = new ConditionAndContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_conditionAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			conditionNot();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(738);
				match(AND);
				setState(739);
				conditionNot();
				}
				}
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNotContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(LPDLParser.NOT, 0); }
		public ConditionNotContext conditionNot() {
			return getRuleContext(ConditionNotContext.class,0);
		}
		public ConditionAtomContext conditionAtom() {
			return getRuleContext(ConditionAtomContext.class,0);
		}
		public ConditionNotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionNot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterConditionNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitConditionNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitConditionNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionNotContext conditionNot() throws RecognitionException {
		ConditionNotContext _localctx = new ConditionNotContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_conditionNot);
		try {
			setState(748);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(745);
				match(NOT);
				setState(746);
				conditionNot();
				}
				break;
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
			case LPAREN:
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(747);
				conditionAtom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionAtomContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(LPDLParser.LPAREN, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LPDLParser.RPAREN, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public RangeCheckContext rangeCheck() {
			return getRuleContext(RangeCheckContext.class,0);
		}
		public DivisibilityCheckContext divisibilityCheck() {
			return getRuleContext(DivisibilityCheckContext.class,0);
		}
		public TagCheckContext tagCheck() {
			return getRuleContext(TagCheckContext.class,0);
		}
		public StatusCheckContext statusCheck() {
			return getRuleContext(StatusCheckContext.class,0);
		}
		public PresenceCheckContext presenceCheck() {
			return getRuleContext(PresenceCheckContext.class,0);
		}
		public ConditionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterConditionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitConditionAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitConditionAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionAtomContext conditionAtom() throws RecognitionException {
		ConditionAtomContext _localctx = new ConditionAtomContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_conditionAtom);
		try {
			setState(760);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				match(LPAREN);
				setState(751);
				conditionExpr();
				setState(752);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(754);
				comparison();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				rangeCheck();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(756);
				divisibilityCheck();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(757);
				tagCheck();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(758);
				statusCheck();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(759);
				presenceCheck();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public ComparatorContext comparator() {
			return getRuleContext(ComparatorContext.class,0);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			side();
			setState(763);
			comparator();
			setState(764);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RangeCheckContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public TerminalNode IN() { return getToken(LPDLParser.IN, 0); }
		public TerminalNode DOTDOT() { return getToken(LPDLParser.DOTDOT, 0); }
		public TerminalNode LBRACK() { return getToken(LPDLParser.LBRACK, 0); }
		public TerminalNode COMMA() { return getToken(LPDLParser.COMMA, 0); }
		public TerminalNode RBRACK() { return getToken(LPDLParser.RBRACK, 0); }
		public RangeCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterRangeCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitRangeCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitRangeCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeCheckContext rangeCheck() throws RecognitionException {
		RangeCheckContext _localctx = new RangeCheckContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_rangeCheck);
		try {
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				side();
				setState(767);
				match(IN);
				setState(768);
				side();
				setState(769);
				match(DOTDOT);
				setState(770);
				side();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(772);
				side();
				setState(773);
				match(IN);
				setState(774);
				match(LBRACK);
				setState(775);
				side();
				setState(776);
				match(COMMA);
				setState(777);
				side();
				setState(778);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DivisibilityCheckContext extends ParserRuleContext {
		public List<SideContext> side() {
			return getRuleContexts(SideContext.class);
		}
		public SideContext side(int i) {
			return getRuleContext(SideContext.class,i);
		}
		public TerminalNode DIVISIBLE_BY() { return getToken(LPDLParser.DIVISIBLE_BY, 0); }
		public DivisibilityCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divisibilityCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterDivisibilityCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitDivisibilityCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitDivisibilityCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivisibilityCheckContext divisibilityCheck() throws RecognitionException {
		DivisibilityCheckContext _localctx = new DivisibilityCheckContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_divisibilityCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			side();
			setState(783);
			match(DIVISIBLE_BY);
			setState(784);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TagCheckContext extends ParserRuleContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public TerminalNode HAS_TAG() { return getToken(LPDLParser.HAS_TAG, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TagCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTagCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTagCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTagCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagCheckContext tagCheck() throws RecognitionException {
		TagCheckContext _localctx = new TagCheckContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_tagCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			side();
			setState(787);
			match(HAS_TAG);
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(788);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(789);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatusCheckContext extends ParserRuleContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public TerminalNode HAS_STATUS() { return getToken(LPDLParser.HAS_STATUS, 0); }
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public StatusCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statusCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterStatusCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitStatusCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitStatusCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatusCheckContext statusCheck() throws RecognitionException {
		StatusCheckContext _localctx = new StatusCheckContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_statusCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			side();
			setState(793);
			match(HAS_STATUS);
			setState(794);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PresenceCheckContext extends ParserRuleContext {
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public PresenceCheckContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_presenceCheck; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPresenceCheck(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPresenceCheck(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPresenceCheck(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PresenceCheckContext presenceCheck() throws RecognitionException {
		PresenceCheckContext _localctx = new PresenceCheckContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_presenceCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			side();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SideContext extends ParserRuleContext {
		public SidePrefixContext sidePrefix() {
			return getRuleContext(SidePrefixContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LPDLParser.DOT, 0); }
		public SideCoreContext sideCore() {
			return getRuleContext(SideCoreContext.class,0);
		}
		public SideContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_side; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSide(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSide(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSide(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideContext side() throws RecognitionException {
		SideContext _localctx = new SideContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_side);
		try {
			setState(803);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
				enterOuterAlt(_localctx, 1);
				{
				setState(798);
				sidePrefix();
				setState(799);
				match(DOT);
				setState(800);
				sideCore();
				}
				break;
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(802);
				sideCore();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SidePrefixContext extends ParserRuleContext {
		public TerminalNode SELF() { return getToken(LPDLParser.SELF, 0); }
		public TerminalNode TARGET() { return getToken(LPDLParser.TARGET, 0); }
		public TerminalNode ALLY() { return getToken(LPDLParser.ALLY, 0); }
		public TerminalNode ENEMY() { return getToken(LPDLParser.ENEMY, 0); }
		public TerminalNode ALL_ALLIES() { return getToken(LPDLParser.ALL_ALLIES, 0); }
		public TerminalNode ALL_ENEMIES() { return getToken(LPDLParser.ALL_ENEMIES, 0); }
		public TerminalNode SELF_ALLY() { return getToken(LPDLParser.SELF_ALLY, 0); }
		public TerminalNode ANY() { return getToken(LPDLParser.ANY, 0); }
		public TerminalNode RIGHT_ALLY() { return getToken(LPDLParser.RIGHT_ALLY, 0); }
		public TerminalNode LEFT_ALLY() { return getToken(LPDLParser.LEFT_ALLY, 0); }
		public TerminalNode LOWEST_HP_ALLY() { return getToken(LPDLParser.LOWEST_HP_ALLY, 0); }
		public TerminalNode HIGHEST_RESONANCE() { return getToken(LPDLParser.HIGHEST_RESONANCE, 0); }
		public SidePrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sidePrefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSidePrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSidePrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSidePrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SidePrefixContext sidePrefix() throws RecognitionException {
		SidePrefixContext _localctx = new SidePrefixContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_sidePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 4095L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SideCoreContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public SideCoreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sideCore; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterSideCore(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitSideCore(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitSideCore(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SideCoreContext sideCore() throws RecognitionException {
		SideCoreContext _localctx = new SideCoreContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_sideCore);
		try {
			setState(809);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(807);
				match(IDENT);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				numberLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(LPDLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(LPDLParser.NEQ, 0); }
		public TerminalNode GT() { return getToken(LPDLParser.GT, 0); }
		public TerminalNode GTE() { return getToken(LPDLParser.GTE, 0); }
		public TerminalNode LT() { return getToken(LPDLParser.LT, 0); }
		public TerminalNode LTE() { return getToken(LPDLParser.LTE, 0); }
		public ComparatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterComparator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitComparator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitComparator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparatorContext comparator() throws RecognitionException {
		ComparatorContext _localctx = new ComparatorContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(811);
			_la = _input.LA(1);
			if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public AdditiveExprContext additiveExpr() {
			return getRuleContext(AdditiveExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(813);
			additiveExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AdditiveExprContext extends ParserRuleContext {
		public List<MultiplicativeExprContext> multiplicativeExpr() {
			return getRuleContexts(MultiplicativeExprContext.class);
		}
		public MultiplicativeExprContext multiplicativeExpr(int i) {
			return getRuleContext(MultiplicativeExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(LPDLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(LPDLParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(LPDLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(LPDLParser.MINUS, i);
		}
		public AdditiveExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitAdditiveExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitAdditiveExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExprContext additiveExpr() throws RecognitionException {
		AdditiveExprContext _localctx = new AdditiveExprContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			multiplicativeExpr();
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(816);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(817);
				multiplicativeExpr();
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplicativeExprContext extends ParserRuleContext {
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(LPDLParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(LPDLParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(LPDLParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(LPDLParser.DIV, i);
		}
		public MultiplicativeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterMultiplicativeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitMultiplicativeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitMultiplicativeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExprContext multiplicativeExpr() throws RecognitionException {
		MultiplicativeExprContext _localctx = new MultiplicativeExprContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(823);
			unaryExpr();
			setState(828);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(824);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(825);
				unaryExpr();
				}
				}
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExprContext extends ParserRuleContext {
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(LPDLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(LPDLParser.MINUS, 0); }
		public PrimaryExprContext primaryExpr() {
			return getRuleContext(PrimaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitUnaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitUnaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_unaryExpr);
		int _la;
		try {
			setState(834);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(832);
				unaryExpr();
				}
				break;
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case SELF_ALLY:
			case ANY:
			case RIGHT_ALLY:
			case LEFT_ALLY:
			case LOWEST_HP_ALLY:
			case HIGHEST_RESONANCE:
			case LPAREN:
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				primaryExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprContext extends ParserRuleContext {
		public NumberLiteralContext numberLiteral() {
			return getRuleContext(NumberLiteralContext.class,0);
		}
		public SideContext side() {
			return getRuleContext(SideContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(LPDLParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(LPDLParser.RPAREN, 0); }
		public PrimaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPrimaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExprContext primaryExpr() throws RecognitionException {
		PrimaryExprContext _localctx = new PrimaryExprContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_primaryExpr);
		try {
			setState(842);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(836);
				numberLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(837);
				side();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(838);
				match(LPAREN);
				setState(839);
				expr();
				setState(840);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeckDeclContext extends ParserRuleContext {
		public TerminalNode DECK() { return getToken(LPDLParser.DECK, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DeckBodyContext deckBody() {
			return getRuleContext(DeckBodyContext.class,0);
		}
		public DeckDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterDeckDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitDeckDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitDeckDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckDeclContext deckDecl() throws RecognitionException {
		DeckDeclContext _localctx = new DeckDeclContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_deckDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(844);
			match(DECK);
			setState(845);
			stringLiteral();
			setState(846);
			deckBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeckBodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<DeckStmtContext> deckStmt() {
			return getRuleContexts(DeckStmtContext.class);
		}
		public DeckStmtContext deckStmt(int i) {
			return getRuleContext(DeckStmtContext.class,i);
		}
		public DeckBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterDeckBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitDeckBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitDeckBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckBodyContext deckBody() throws RecognitionException {
		DeckBodyContext _localctx = new DeckBodyContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_deckBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(LBRACE);
			setState(852);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145736L) != 0)) {
				{
				{
				setState(849);
				deckStmt();
				}
				}
				setState(854);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(855);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeckStmtContext extends ParserRuleContext {
		public PersonasBlockContext personasBlock() {
			return getRuleContext(PersonasBlockContext.class,0);
		}
		public SynergyBlockContext synergyBlock() {
			return getRuleContext(SynergyBlockContext.class,0);
		}
		public MetaStmtContext metaStmt() {
			return getRuleContext(MetaStmtContext.class,0);
		}
		public DeckStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deckStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterDeckStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitDeckStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitDeckStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeckStmtContext deckStmt() throws RecognitionException {
		DeckStmtContext _localctx = new DeckStmtContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_deckStmt);
		try {
			setState(860);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERSONAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(857);
				personasBlock();
				}
				break;
			case SYNERGY:
				enterOuterAlt(_localctx, 2);
				{
				setState(858);
				synergyBlock();
				}
				break;
			case META:
				enterOuterAlt(_localctx, 3);
				{
				setState(859);
				metaStmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonasBlockContext extends ParserRuleContext {
		public TerminalNode PERSONAS() { return getToken(LPDLParser.PERSONAS, 0); }
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<PersonasStmtContext> personasStmt() {
			return getRuleContexts(PersonasStmtContext.class);
		}
		public PersonasStmtContext personasStmt(int i) {
			return getRuleContext(PersonasStmtContext.class,i);
		}
		public PersonasBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personasBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPersonasBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPersonasBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPersonasBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonasBlockContext personasBlock() throws RecognitionException {
		PersonasBlockContext _localctx = new PersonasBlockContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_personasBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(862);
			match(PERSONAS);
			setState(863);
			match(LBRACE);
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				setState(864);
				personasStmt();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PersonasStmtContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(LPDLParser.ADD, 0); }
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public PersonasStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personasStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterPersonasStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitPersonasStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitPersonasStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PersonasStmtContext personasStmt() throws RecognitionException {
		PersonasStmtContext _localctx = new PersonasStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_personasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(872);
			match(ADD);
			setState(875);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(873);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(874);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(LPDLParser.LBRACE, 0); }
		public List<ObjectPairContext> objectPair() {
			return getRuleContexts(ObjectPairContext.class);
		}
		public ObjectPairContext objectPair(int i) {
			return getRuleContext(ObjectPairContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(LPDLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(LPDLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(LPDLParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(877);
			match(LBRACE);
			setState(878);
			objectPair();
			setState(883);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(879);
				match(COMMA);
				setState(880);
				objectPair();
				}
				}
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(886);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectPairContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LPDLParser.IDENT, 0); }
		public TerminalNode COLON() { return getToken(LPDLParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ObjectPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterObjectPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitObjectPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitObjectPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectPairContext objectPair() throws RecognitionException {
		ObjectPairContext _localctx = new ObjectPairContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_objectPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			match(IDENT);
			setState(889);
			match(COLON);
			setState(890);
			expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(LPDLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(LPDLParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(892);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(LPDLParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(LPDLParser.INT, 0); }
		public NumberLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterNumberLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitNumberLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitNumberLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralContext numberLiteral() throws RecognitionException {
		NumberLiteralContext _localctx = new NumberLiteralContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(894);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LPDLParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TripleStringLiteralContext extends ParserRuleContext {
		public TerminalNode TRIPLE_STRING() { return getToken(LPDLParser.TRIPLE_STRING, 0); }
		public TripleStringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tripleStringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTripleStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTripleStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTripleStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TripleStringLiteralContext tripleStringLiteral() throws RecognitionException {
		TripleStringLiteralContext _localctx = new TripleStringLiteralContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_tripleStringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			match(TRIPLE_STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextDeclContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(LPDLParser.TEXT, 0); }
		public TripleStringLiteralContext tripleStringLiteral() {
			return getRuleContext(TripleStringLiteralContext.class,0);
		}
		public TextDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).enterTextDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LPDLListener ) ((LPDLListener)listener).exitTextDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LPDLVisitor ) return ((LPDLVisitor<? extends T>)visitor).visitTextDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextDeclContext textDecl() throws RecognitionException {
		TextDeclContext _localctx = new TextDeclContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_textDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(900);
			match(TEXT);
			setState(901);
			tripleStringLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001v\u0388\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007Y\u0002"+
		"Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007^\u0002"+
		"_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007c\u0002"+
		"d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007h\u0002"+
		"i\u0007i\u0002j\u0007j\u0001\u0000\u0001\u0000\u0005\u0000\u00d9\b\u0000"+
		"\n\u0000\f\u0000\u00dc\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u00e6"+
		"\b\u0002\n\u0002\f\u0002\u00e9\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00fb\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0102\b\u0005\u0001\u0005\u0003\u0005"+
		"\u0105\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u0113"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u011a\b\n\n\n\f\n"+
		"\u011d\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0129\b\f\n\f\f\f\u012c\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0138\b\u000e\n\u000e\f\u000e\u013b"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0148\b\u000f\n\u000f\f\u000f\u014b\t\u000f\u0001\u000f\u0003\u000f"+
		"\u014e\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0155\b\u0010\n\u0010\f\u0010\u0158\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0160"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0167\b\u0012\n\u0012\f\u0012\u016a\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0176\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u017e\b\u0015"+
		"\n\u0015\f\u0015\u0181\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0188\b\u0016\u0001\u0016\u0004\u0016\u018b"+
		"\b\u0016\u000b\u0016\f\u0016\u018c\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u0192\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0197\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u019d\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01a2\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u01a8"+
		"\b\u0019\n\u0019\f\u0019\u01ab\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u01b8\b\u001a\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01d0"+
		"\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0005"+
		"$\u01da\b$\n$\f$\u01dd\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0003%\u01e8\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"\'\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0003+\u01fb\b+\u0001+\u0001+\u0001,\u0001,\u0003,\u0201\b,\u0001"+
		"-\u0001-\u0005-\u0205\b-\n-\f-\u0208\t-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u0212\b.\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00051\u021d\b1\n1\f1\u0220\t1\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u022a\b2\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00056\u0239\b6\n6\f6\u023c\t6\u00016\u00016\u00017\u00017\u0003"+
		"7\u0242\b7\u00018\u00018\u00038\u0246\b8\u00018\u00018\u00019\u00019\u0001"+
		":\u0001:\u0001:\u0003:\u024f\b:\u0001:\u0001:\u0001;\u0001;\u0005;\u0255"+
		"\b;\n;\f;\u0258\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0003<\u0263\b<\u0001=\u0001=\u0001=\u0003=\u0268\b=\u0001>\u0003"+
		">\u026b\b>\u0001>\u0001>\u0001>\u0001?\u0003?\u0271\b?\u0001?\u0001?\u0001"+
		"?\u0003?\u0276\b?\u0001?\u0001?\u0005?\u027a\b?\n?\f?\u027d\t?\u0001?"+
		"\u0003?\u0280\b?\u0001?\u0001?\u0001?\u0003?\u0285\b?\u0001?\u0005?\u0288"+
		"\b?\n?\f?\u028b\t?\u0001?\u0001?\u0001?\u0001?\u0005?\u0291\b?\n?\f?\u0294"+
		"\t?\u0003?\u0296\b?\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u029d\b"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u02a6\bA\u0001"+
		"B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001E\u0005E\u02af\bE\nE\fE\u02b2"+
		"\tE\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02ca\bF\u0001F\u0001F\u0003F\u02ce\bF\u0001G\u0001"+
		"G\u0001H\u0001H\u0001I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001L\u0001"+
		"L\u0001L\u0005L\u02dd\bL\nL\fL\u02e0\tL\u0001M\u0001M\u0001M\u0005M\u02e5"+
		"\bM\nM\fM\u02e8\tM\u0001N\u0001N\u0001N\u0003N\u02ed\bN\u0001O\u0001O"+
		"\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0001O\u0003O\u02f9"+
		"\bO\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0003Q\u030d"+
		"\bQ\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0001S\u0003S\u0317"+
		"\bS\u0001T\u0001T\u0001T\u0001T\u0001U\u0001U\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0003V\u0324\bV\u0001W\u0001W\u0001X\u0001X\u0003X\u032a\bX\u0001"+
		"Y\u0001Y\u0001Z\u0001Z\u0001[\u0001[\u0001[\u0005[\u0333\b[\n[\f[\u0336"+
		"\t[\u0001\\\u0001\\\u0001\\\u0005\\\u033b\b\\\n\\\f\\\u033e\t\\\u0001"+
		"]\u0001]\u0001]\u0003]\u0343\b]\u0001^\u0001^\u0001^\u0001^\u0001^\u0001"+
		"^\u0003^\u034b\b^\u0001_\u0001_\u0001_\u0001_\u0001`\u0001`\u0005`\u0353"+
		"\b`\n`\f`\u0356\t`\u0001`\u0001`\u0001a\u0001a\u0001a\u0003a\u035d\ba"+
		"\u0001b\u0001b\u0001b\u0005b\u0362\bb\nb\fb\u0365\tb\u0001b\u0001b\u0001"+
		"c\u0001c\u0001c\u0003c\u036c\bc\u0001d\u0001d\u0001d\u0001d\u0005d\u0372"+
		"\bd\nd\fd\u0375\td\u0001d\u0001d\u0001e\u0001e\u0001e\u0001e\u0001f\u0001"+
		"f\u0001g\u0001g\u0001h\u0001h\u0001i\u0001i\u0001j\u0001j\u0001j\u0001"+
		"j\u0000\u0000k\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprt"+
		"vxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u0000\b\u0002\u0000q"+
		"qss\u0001\u000067\u0001\u0000EP\u0001\u0000QV\u0001\u0000^_\u0001\u0000"+
		"`a\u0001\u0000op\u0001\u0000mn\u039e\u0000\u00da\u0001\u0000\u0000\u0000"+
		"\u0002\u00df\u0001\u0000\u0000\u0000\u0004\u00e3\u0001\u0000\u0000\u0000"+
		"\u0006\u00fa\u0001\u0000\u0000\u0000\b\u00fc\u0001\u0000\u0000\u0000\n"+
		"\u0104\u0001\u0000\u0000\u0000\f\u0106\u0001\u0000\u0000\u0000\u000e\u0109"+
		"\u0001\u0000\u0000\u0000\u0010\u010c\u0001\u0000\u0000\u0000\u0012\u010f"+
		"\u0001\u0000\u0000\u0000\u0014\u0114\u0001\u0000\u0000\u0000\u0016\u0120"+
		"\u0001\u0000\u0000\u0000\u0018\u0123\u0001\u0000\u0000\u0000\u001a\u012f"+
		"\u0001\u0000\u0000\u0000\u001c\u0132\u0001\u0000\u0000\u0000\u001e\u014d"+
		"\u0001\u0000\u0000\u0000 \u014f\u0001\u0000\u0000\u0000\"\u015f\u0001"+
		"\u0000\u0000\u0000$\u0161\u0001\u0000\u0000\u0000&\u0175\u0001\u0000\u0000"+
		"\u0000(\u0177\u0001\u0000\u0000\u0000*\u017a\u0001\u0000\u0000\u0000,"+
		"\u0184\u0001\u0000\u0000\u0000.\u019c\u0001\u0000\u0000\u00000\u019e\u0001"+
		"\u0000\u0000\u00002\u01a5\u0001\u0000\u0000\u00004\u01b7\u0001\u0000\u0000"+
		"\u00006\u01b9\u0001\u0000\u0000\u00008\u01bc\u0001\u0000\u0000\u0000:"+
		"\u01bf\u0001\u0000\u0000\u0000<\u01c2\u0001\u0000\u0000\u0000>\u01c5\u0001"+
		"\u0000\u0000\u0000@\u01c8\u0001\u0000\u0000\u0000B\u01cb\u0001\u0000\u0000"+
		"\u0000D\u01d1\u0001\u0000\u0000\u0000F\u01d5\u0001\u0000\u0000\u0000H"+
		"\u01d7\u0001\u0000\u0000\u0000J\u01e7\u0001\u0000\u0000\u0000L\u01e9\u0001"+
		"\u0000\u0000\u0000N\u01ec\u0001\u0000\u0000\u0000P\u01ef\u0001\u0000\u0000"+
		"\u0000R\u01f2\u0001\u0000\u0000\u0000T\u01f5\u0001\u0000\u0000\u0000V"+
		"\u01f8\u0001\u0000\u0000\u0000X\u0200\u0001\u0000\u0000\u0000Z\u0202\u0001"+
		"\u0000\u0000\u0000\\\u0211\u0001\u0000\u0000\u0000^\u0213\u0001\u0000"+
		"\u0000\u0000`\u0216\u0001\u0000\u0000\u0000b\u0219\u0001\u0000\u0000\u0000"+
		"d\u0229\u0001\u0000\u0000\u0000f\u022b\u0001\u0000\u0000\u0000h\u022e"+
		"\u0001\u0000\u0000\u0000j\u0231\u0001\u0000\u0000\u0000l\u0236\u0001\u0000"+
		"\u0000\u0000n\u0241\u0001\u0000\u0000\u0000p\u0243\u0001\u0000\u0000\u0000"+
		"r\u0249\u0001\u0000\u0000\u0000t\u024b\u0001\u0000\u0000\u0000v\u0252"+
		"\u0001\u0000\u0000\u0000x\u0262\u0001\u0000\u0000\u0000z\u0267\u0001\u0000"+
		"\u0000\u0000|\u026a\u0001\u0000\u0000\u0000~\u0295\u0001\u0000\u0000\u0000"+
		"\u0080\u0297\u0001\u0000\u0000\u0000\u0082\u02a5\u0001\u0000\u0000\u0000"+
		"\u0084\u02a7\u0001\u0000\u0000\u0000\u0086\u02a9\u0001\u0000\u0000\u0000"+
		"\u0088\u02ab\u0001\u0000\u0000\u0000\u008a\u02b0\u0001\u0000\u0000\u0000"+
		"\u008c\u02cd\u0001\u0000\u0000\u0000\u008e\u02cf\u0001\u0000\u0000\u0000"+
		"\u0090\u02d1\u0001\u0000\u0000\u0000\u0092\u02d3\u0001\u0000\u0000\u0000"+
		"\u0094\u02d5\u0001\u0000\u0000\u0000\u0096\u02d7\u0001\u0000\u0000\u0000"+
		"\u0098\u02d9\u0001\u0000\u0000\u0000\u009a\u02e1\u0001\u0000\u0000\u0000"+
		"\u009c\u02ec\u0001\u0000\u0000\u0000\u009e\u02f8\u0001\u0000\u0000\u0000"+
		"\u00a0\u02fa\u0001\u0000\u0000\u0000\u00a2\u030c\u0001\u0000\u0000\u0000"+
		"\u00a4\u030e\u0001\u0000\u0000\u0000\u00a6\u0312\u0001\u0000\u0000\u0000"+
		"\u00a8\u0318\u0001\u0000\u0000\u0000\u00aa\u031c\u0001\u0000\u0000\u0000"+
		"\u00ac\u0323\u0001\u0000\u0000\u0000\u00ae\u0325\u0001\u0000\u0000\u0000"+
		"\u00b0\u0329\u0001\u0000\u0000\u0000\u00b2\u032b\u0001\u0000\u0000\u0000"+
		"\u00b4\u032d\u0001\u0000\u0000\u0000\u00b6\u032f\u0001\u0000\u0000\u0000"+
		"\u00b8\u0337\u0001\u0000\u0000\u0000\u00ba\u0342\u0001\u0000\u0000\u0000"+
		"\u00bc\u034a\u0001\u0000\u0000\u0000\u00be\u034c\u0001\u0000\u0000\u0000"+
		"\u00c0\u0350\u0001\u0000\u0000\u0000\u00c2\u035c\u0001\u0000\u0000\u0000"+
		"\u00c4\u035e\u0001\u0000\u0000\u0000\u00c6\u0368\u0001\u0000\u0000\u0000"+
		"\u00c8\u036d\u0001\u0000\u0000\u0000\u00ca\u0378\u0001\u0000\u0000\u0000"+
		"\u00cc\u037c\u0001\u0000\u0000\u0000\u00ce\u037e\u0001\u0000\u0000\u0000"+
		"\u00d0\u0380\u0001\u0000\u0000\u0000\u00d2\u0382\u0001\u0000\u0000\u0000"+
		"\u00d4\u0384\u0001\u0000\u0000\u0000\u00d6\u00d9\u0003\u0002\u0001\u0000"+
		"\u00d7\u00d9\u0003\u00be_\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0005\u0000\u0000\u0001\u00de\u0001\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0001\u0000\u0000\u00e0\u00e1\u0003\u00d0h\u0000\u00e1\u00e2"+
		"\u0003\u0004\u0002\u0000\u00e2\u0003\u0001\u0000\u0000\u0000\u00e3\u00e7"+
		"\u0005b\u0000\u0000\u00e4\u00e6\u0003\u0006\u0003\u0000\u00e5\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005"+
		"c\u0000\u0000\u00eb\u0005\u0001\u0000\u0000\u0000\u00ec\u00fb\u0003\b"+
		"\u0004\u0000\u00ed\u00fb\u0003\u0012\t\u0000\u00ee\u00fb\u0003\f\u0006"+
		"\u0000\u00ef\u00fb\u0003\u000e\u0007\u0000\u00f0\u00fb\u0003\u0010\b\u0000"+
		"\u00f1\u00fb\u0003\u0014\n\u0000\u00f2\u00fb\u0003\u0018\f\u0000\u00f3"+
		"\u00fb\u0003\u001c\u000e\u0000\u00f4\u00fb\u0003 \u0010\u0000\u00f5\u00fb"+
		"\u0003*\u0015\u0000\u00f6\u00fb\u00030\u0018\u0000\u00f7\u00fb\u0003t"+
		":\u0000\u00f8\u00fb\u0003$\u0012\u0000\u00f9\u00fb\u0003(\u0014\u0000"+
		"\u00fa\u00ec\u0001\u0000\u0000\u0000\u00fa\u00ed\u0001\u0000\u0000\u0000"+
		"\u00fa\u00ee\u0001\u0000\u0000\u0000\u00fa\u00ef\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f0\u0001\u0000\u0000\u0000\u00fa\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f2\u0001\u0000\u0000\u0000\u00fa\u00f3\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f4\u0001\u0000\u0000\u0000\u00fa\u00f5\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f6\u0001\u0000\u0000\u0000\u00fa\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000"+
		"\u00fb\u0007\u0001\u0000\u0000\u0000\u00fc\u00fd\u0005\u0005\u0000\u0000"+
		"\u00fd\u00fe\u0003\n\u0005\u0000\u00fe\t\u0001\u0000\u0000\u0000\u00ff"+
		"\u0101\u0005m\u0000\u0000\u0100\u0102\u0005h\u0000\u0000\u0101\u0100\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0105\u0001"+
		"\u0000\u0000\u0000\u0103\u0105\u0005s\u0000\u0000\u0104\u00ff\u0001\u0000"+
		"\u0000\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u000b\u0001\u0000"+
		"\u0000\u0000\u0106\u0107\u0005\u0007\u0000\u0000\u0107\u0108\u0005s\u0000"+
		"\u0000\u0108\r\u0001\u0000\u0000\u0000\u0109\u010a\u0005\b\u0000\u0000"+
		"\u010a\u010b\u0003\u00d0h\u0000\u010b\u000f\u0001\u0000\u0000\u0000\u010c"+
		"\u010d\u0005\t\u0000\u0000\u010d\u010e\u0005m\u0000\u0000\u010e\u0011"+
		"\u0001\u0000\u0000\u0000\u010f\u0112\u0005\u0006\u0000\u0000\u0110\u0113"+
		"\u0003\u00d0h\u0000\u0111\u0113\u0005s\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0111\u0001\u0000\u0000\u0000\u0113\u0013\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0116\u0005b\u0000"+
		"\u0000\u0116\u011b\u0003\u0016\u000b\u0000\u0117\u0118\u0005i\u0000\u0000"+
		"\u0118\u011a\u0003\u0016\u000b\u0000\u0119\u0117\u0001\u0000\u0000\u0000"+
		"\u011a\u011d\u0001\u0000\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0001\u0000\u0000\u0000"+
		"\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u011f\u0005c\u0000\u0000\u011f"+
		"\u0015\u0001\u0000\u0000\u0000\u0120\u0121\u0005s\u0000\u0000\u0121\u0122"+
		"\u0005s\u0000\u0000\u0122\u0017\u0001\u0000\u0000\u0000\u0123\u0124\u0005"+
		"\u000b\u0000\u0000\u0124\u0125\u0005b\u0000\u0000\u0125\u012a\u0003\u001a"+
		"\r\u0000\u0126\u0127\u0005i\u0000\u0000\u0127\u0129\u0003\u001a\r\u0000"+
		"\u0128\u0126\u0001\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000"+
		"\u012b\u012d\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000"+
		"\u012d\u012e\u0005c\u0000\u0000\u012e\u0019\u0001\u0000\u0000\u0000\u012f"+
		"\u0130\u0005s\u0000\u0000\u0130\u0131\u0005m\u0000\u0000\u0131\u001b\u0001"+
		"\u0000\u0000\u0000\u0132\u0133\u0005\f\u0000\u0000\u0133\u0134\u0005b"+
		"\u0000\u0000\u0134\u0139\u0003\u001e\u000f\u0000\u0135\u0136\u0005i\u0000"+
		"\u0000\u0136\u0138\u0003\u001e\u000f\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013c\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013d\u0005c\u0000\u0000"+
		"\u013d\u001d\u0001\u0000\u0000\u0000\u013e\u013f\u0005\r\u0000\u0000\u013f"+
		"\u014e\u0005m\u0000\u0000\u0140\u0141\u0005\u000e\u0000\u0000\u0141\u014e"+
		"\u0003\u00ceg\u0000\u0142\u0143\u0005\u000f\u0000\u0000\u0143\u0144\u0005"+
		"f\u0000\u0000\u0144\u0149\u0005m\u0000\u0000\u0145\u0146\u0005i\u0000"+
		"\u0000\u0146\u0148\u0005m\u0000\u0000\u0147\u0145\u0001\u0000\u0000\u0000"+
		"\u0148\u014b\u0001\u0000\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000"+
		"\u0149\u014a\u0001\u0000\u0000\u0000\u014a\u014c\u0001\u0000\u0000\u0000"+
		"\u014b\u0149\u0001\u0000\u0000\u0000\u014c\u014e\u0005g\u0000\u0000\u014d"+
		"\u013e\u0001\u0000\u0000\u0000\u014d\u0140\u0001\u0000\u0000\u0000\u014d"+
		"\u0142\u0001\u0000\u0000\u0000\u014e\u001f\u0001\u0000\u0000\u0000\u014f"+
		"\u0150\u0005\u0010\u0000\u0000\u0150\u0151\u0005b\u0000\u0000\u0151\u0156"+
		"\u0003\"\u0011\u0000\u0152\u0153\u0005i\u0000\u0000\u0153\u0155\u0003"+
		"\"\u0011\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000"+
		"\u0000\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000"+
		"\u0000\u0000\u0157\u0159\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0159\u015a\u0005c\u0000\u0000\u015a!\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005\u0019\u0000\u0000\u015c\u0160\u0005s\u0000\u0000\u015d"+
		"\u015e\u0005\u0011\u0000\u0000\u015e\u0160\u0005m\u0000\u0000\u015f\u015b"+
		"\u0001\u0000\u0000\u0000\u015f\u015d\u0001\u0000\u0000\u0000\u0160#\u0001"+
		"\u0000\u0000\u0000\u0161\u0162\u0005\"\u0000\u0000\u0162\u0163\u0005b"+
		"\u0000\u0000\u0163\u0168\u0003&\u0013\u0000\u0164\u0165\u0005i\u0000\u0000"+
		"\u0165\u0167\u0003&\u0013\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167"+
		"\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a"+
		"\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0005c\u0000\u0000\u016c%\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005\u0019\u0000\u0000\u016e\u0176\u0005"+
		"s\u0000\u0000\u016f\u0170\u0005\u0012\u0000\u0000\u0170\u0176\u0003\u00d0"+
		"h\u0000\u0171\u0172\u0005?\u0000\u0000\u0172\u0176\u0005m\u0000\u0000"+
		"\u0173\u0174\u0005\u0013\u0000\u0000\u0174\u0176\u0003\u00ccf\u0000\u0175"+
		"\u016d\u0001\u0000\u0000\u0000\u0175\u016f\u0001\u0000\u0000\u0000\u0175"+
		"\u0171\u0001\u0000\u0000\u0000\u0175\u0173\u0001\u0000\u0000\u0000\u0176"+
		"\'\u0001\u0000\u0000\u0000\u0177\u0178\u0005\u0014\u0000\u0000\u0178\u0179"+
		"\u0003\u00c8d\u0000\u0179)\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0015"+
		"\u0000\u0000\u017b\u017f\u0005b\u0000\u0000\u017c\u017e\u0003,\u0016\u0000"+
		"\u017d\u017c\u0001\u0000\u0000\u0000\u017e\u0181\u0001\u0000\u0000\u0000"+
		"\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000"+
		"\u0180\u0182\u0001\u0000\u0000\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0182\u0183\u0005c\u0000\u0000\u0183+\u0001\u0000\u0000\u0000\u0184\u0187"+
		"\u0005\u0016\u0000\u0000\u0185\u0188\u0003\u00d0h\u0000\u0186\u0188\u0005"+
		"s\u0000\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186\u0001\u0000"+
		"\u0000\u0000\u0188\u018a\u0001\u0000\u0000\u0000\u0189\u018b\u0003.\u0017"+
		"\u0000\u018a\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d-\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u0017\u0000\u0000"+
		"\u018f\u0191\u0005s\u0000\u0000\u0190\u0192\u0003\u00b6[\u0000\u0191\u0190"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u019d"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0005\u0018\u0000\u0000\u0194\u0196"+
		"\u0005s\u0000\u0000\u0195\u0197\u0003\u00b6[\u0000\u0196\u0195\u0001\u0000"+
		"\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u019d\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0005\u0019\u0000\u0000\u0199\u019d\u0005s\u0000"+
		"\u0000\u019a\u019b\u0005\u001b\u0000\u0000\u019b\u019d\u0003\u00b6[\u0000"+
		"\u019c\u018e\u0001\u0000\u0000\u0000\u019c\u0193\u0001\u0000\u0000\u0000"+
		"\u019c\u0198\u0001\u0000\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000"+
		"\u019d/\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u001c\u0000\u0000\u019f"+
		"\u01a1\u0005m\u0000\u0000\u01a0\u01a2\u0003\u00d0h\u0000\u01a1\u01a0\u0001"+
		"\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001"+
		"\u0000\u0000\u0000\u01a3\u01a4\u00032\u0019\u0000\u01a41\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a9\u0005b\u0000\u0000\u01a6\u01a8\u00034\u001a\u0000\u01a7"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a8\u01ab\u0001\u0000\u0000\u0000\u01a9"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac"+
		"\u01ad\u0005c\u0000\u0000\u01ad3\u0001\u0000\u0000\u0000\u01ae\u01b8\u0003"+
		"6\u001b\u0000\u01af\u01b8\u00038\u001c\u0000\u01b0\u01b8\u0003:\u001d"+
		"\u0000\u01b1\u01b8\u0003<\u001e\u0000\u01b2\u01b8\u0003>\u001f\u0000\u01b3"+
		"\u01b8\u0003@ \u0000\u01b4\u01b8\u0003B!\u0000\u01b5\u01b8\u0003\u00d4"+
		"j\u0000\u01b6\u01b8\u0003D\"\u0000\u01b7\u01ae\u0001\u0000\u0000\u0000"+
		"\u01b7\u01af\u0001\u0000\u0000\u0000\u01b7\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b1\u0001\u0000\u0000\u0000\u01b7\u01b2\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b3\u0001\u0000\u0000\u0000\u01b7\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b85\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u001d\u0000\u0000\u01ba"+
		"\u01bb\u0005s\u0000\u0000\u01bb7\u0001\u0000\u0000\u0000\u01bc\u01bd\u0005"+
		"\u0007\u0000\u0000\u01bd\u01be\u0005s\u0000\u0000\u01be9\u0001\u0000\u0000"+
		"\u0000\u01bf\u01c0\u0005\u001e\u0000\u0000\u01c0\u01c1\u0005s\u0000\u0000"+
		"\u01c1;\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\u001f\u0000\u0000\u01c3"+
		"\u01c4\u0005s\u0000\u0000\u01c4=\u0001\u0000\u0000\u0000\u01c5\u01c6\u0005"+
		" \u0000\u0000\u01c6\u01c7\u0005m\u0000\u0000\u01c7?\u0001\u0000\u0000"+
		"\u0000\u01c8\u01c9\u0005!\u0000\u0000\u01c9\u01ca\u0005s\u0000\u0000\u01ca"+
		"A\u0001\u0000\u0000\u0000\u01cb\u01cf\u0005\"\u0000\u0000\u01cc\u01d0"+
		"\u0005s\u0000\u0000\u01cd\u01d0\u0005#\u0000\u0000\u01ce\u01d0\u0003\u00d0"+
		"h\u0000\u01cf\u01cc\u0001\u0000\u0000\u0000\u01cf\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cf\u01ce\u0001\u0000\u0000\u0000\u01d0C\u0001\u0000\u0000\u0000"+
		"\u01d1\u01d2\u0005$\u0000\u0000\u01d2\u01d3\u0003F#\u0000\u01d3\u01d4"+
		"\u0003H$\u0000\u01d4E\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007\u0000"+
		"\u0000\u0000\u01d6G\u0001\u0000\u0000\u0000\u01d7\u01db\u0005b\u0000\u0000"+
		"\u01d8\u01da\u0003J%\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01da\u01dd"+
		"\u0001\u0000\u0000\u0000\u01db\u01d9\u0001\u0000\u0000\u0000\u01db\u01dc"+
		"\u0001\u0000\u0000\u0000\u01dc\u01de\u0001\u0000\u0000\u0000\u01dd\u01db"+
		"\u0001\u0000\u0000\u0000\u01de\u01df\u0005c\u0000\u0000\u01dfI\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e8\u0003L&\u0000\u01e1\u01e8\u0003N\'\u0000\u01e2"+
		"\u01e8\u0003P(\u0000\u01e3\u01e8\u0003R)\u0000\u01e4\u01e8\u0003T*\u0000"+
		"\u01e5\u01e8\u0003V+\u0000\u01e6\u01e8\u0003j5\u0000\u01e7\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e1\u0001\u0000\u0000\u0000\u01e7\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e3\u0001\u0000\u0000\u0000\u01e7\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e8K\u0001\u0000\u0000\u0000\u01e9\u01ea\u0005%\u0000"+
		"\u0000\u01ea\u01eb\u0005m\u0000\u0000\u01ebM\u0001\u0000\u0000\u0000\u01ec"+
		"\u01ed\u0005&\u0000\u0000\u01ed\u01ee\u0005m\u0000\u0000\u01eeO\u0001"+
		"\u0000\u0000\u0000\u01ef\u01f0\u0005\'\u0000\u0000\u01f0\u01f1\u0005m"+
		"\u0000\u0000\u01f1Q\u0001\u0000\u0000\u0000\u01f2\u01f3\u0005(\u0000\u0000"+
		"\u01f3\u01f4\u0005m\u0000\u0000\u01f4S\u0001\u0000\u0000\u0000\u01f5\u01f6"+
		"\u0005)\u0000\u0000\u01f6\u01f7\u0005m\u0000\u0000\u01f7U\u0001\u0000"+
		"\u0000\u0000\u01f8\u01fa\u0005*\u0000\u0000\u01f9\u01fb\u0003X,\u0000"+
		"\u01fa\u01f9\u0001\u0000\u0000\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0003Z-\u0000\u01fdW"+
		"\u0001\u0000\u0000\u0000\u01fe\u0201\u0003\u00d0h\u0000\u01ff\u0201\u0005"+
		"q\u0000\u0000\u0200\u01fe\u0001\u0000\u0000\u0000\u0200\u01ff\u0001\u0000"+
		"\u0000\u0000\u0201Y\u0001\u0000\u0000\u0000\u0202\u0206\u0005b\u0000\u0000"+
		"\u0203\u0205\u0003\\.\u0000\u0204\u0203\u0001\u0000\u0000\u0000\u0205"+
		"\u0208\u0001\u0000\u0000\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0206"+
		"\u0207\u0001\u0000\u0000\u0000\u0207\u0209\u0001\u0000\u0000\u0000\u0208"+
		"\u0206\u0001\u0000\u0000\u0000\u0209\u020a\u0005c\u0000\u0000\u020a[\u0001"+
		"\u0000\u0000\u0000\u020b\u0212\u0003^/\u0000\u020c\u0212\u0003`0\u0000"+
		"\u020d\u0212\u0003b1\u0000\u020e\u020f\u00052\u0000\u0000\u020f\u0212"+
		"\u0003|>\u0000\u0210\u0212\u0003~?\u0000\u0211\u020b\u0001\u0000\u0000"+
		"\u0000\u0211\u020c\u0001\u0000\u0000\u0000\u0211\u020d\u0001\u0000\u0000"+
		"\u0000\u0211\u020e\u0001\u0000\u0000\u0000\u0211\u0210\u0001\u0000\u0000"+
		"\u0000\u0212]\u0001\u0000\u0000\u0000\u0213\u0214\u0005+\u0000\u0000\u0214"+
		"\u0215\u0005s\u0000\u0000\u0215_\u0001\u0000\u0000\u0000\u0216\u0217\u0005"+
		",\u0000\u0000\u0217\u0218\u0003\u0096K\u0000\u0218a\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005-\u0000\u0000\u021a\u021e\u0005b\u0000\u0000\u021b"+
		"\u021d\u0003d2\u0000\u021c\u021b\u0001\u0000\u0000\u0000\u021d\u0220\u0001"+
		"\u0000\u0000\u0000\u021e\u021c\u0001\u0000\u0000\u0000\u021e\u021f\u0001"+
		"\u0000\u0000\u0000\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021e\u0001"+
		"\u0000\u0000\u0000\u0221\u0222\u0005c\u0000\u0000\u0222c\u0001\u0000\u0000"+
		"\u0000\u0223\u022a\u0003f3\u0000\u0224\u022a\u0003h4\u0000\u0225\u022a"+
		"\u0003`0\u0000\u0226\u0227\u00052\u0000\u0000\u0227\u022a\u0003|>\u0000"+
		"\u0228\u022a\u0003~?\u0000\u0229\u0223\u0001\u0000\u0000\u0000\u0229\u0224"+
		"\u0001\u0000\u0000\u0000\u0229\u0225\u0001\u0000\u0000\u0000\u0229\u0226"+
		"\u0001\u0000\u0000\u0000\u0229\u0228\u0001\u0000\u0000\u0000\u022ae\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0005.\u0000\u0000\u022c\u022d\u0005m\u0000"+
		"\u0000\u022dg\u0001\u0000\u0000\u0000\u022e\u022f\u0005/\u0000\u0000\u022f"+
		"\u0230\u0003\u00ccf\u0000\u0230i\u0001\u0000\u0000\u0000\u0231\u0232\u0005"+
		"0\u0000\u0000\u0232\u0233\u0005m\u0000\u0000\u0233\u0234\u0005s\u0000"+
		"\u0000\u0234\u0235\u0003l6\u0000\u0235k\u0001\u0000\u0000\u0000\u0236"+
		"\u023a\u0005b\u0000\u0000\u0237\u0239\u0003n7\u0000\u0238\u0237\u0001"+
		"\u0000\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001"+
		"\u0000\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d\u0001"+
		"\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005"+
		"c\u0000\u0000\u023em\u0001\u0000\u0000\u0000\u023f\u0242\u0003p8\u0000"+
		"\u0240\u0242\u0003\u00d4j\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0240\u0001\u0000\u0000\u0000\u0242o\u0001\u0000\u0000\u0000\u0243\u0245"+
		"\u0005*\u0000\u0000\u0244\u0246\u0003r9\u0000\u0245\u0244\u0001\u0000"+
		"\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246\u0247\u0001\u0000"+
		"\u0000\u0000\u0247\u0248\u0003Z-\u0000\u0248q\u0001\u0000\u0000\u0000"+
		"\u0249\u024a\u0003\u00d0h\u0000\u024as\u0001\u0000\u0000\u0000\u024b\u024c"+
		"\u00051\u0000\u0000\u024c\u024e\u0005s\u0000\u0000\u024d\u024f\u0003\u00d0"+
		"h\u0000\u024e\u024d\u0001\u0000\u0000\u0000\u024e\u024f\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0251\u0003v;\u0000\u0251"+
		"u\u0001\u0000\u0000\u0000\u0252\u0256\u0005b\u0000\u0000\u0253\u0255\u0003"+
		"x<\u0000\u0254\u0253\u0001\u0000\u0000\u0000\u0255\u0258\u0001\u0000\u0000"+
		"\u0000\u0256\u0254\u0001\u0000\u0000\u0000\u0256\u0257\u0001\u0000\u0000"+
		"\u0000\u0257\u0259\u0001\u0000\u0000\u0000\u0258\u0256\u0001\u0000\u0000"+
		"\u0000\u0259\u025a\u0005c\u0000\u0000\u025aw\u0001\u0000\u0000\u0000\u025b"+
		"\u0263\u0003^/\u0000\u025c\u0263\u0003`0\u0000\u025d\u025e\u00052\u0000"+
		"\u0000\u025e\u0263\u0003|>\u0000\u025f\u0263\u0003~?\u0000\u0260\u0263"+
		"\u0003b1\u0000\u0261\u0263\u0003\u00d4j\u0000\u0262\u025b\u0001\u0000"+
		"\u0000\u0000\u0262\u025c\u0001\u0000\u0000\u0000\u0262\u025d\u0001\u0000"+
		"\u0000\u0000\u0262\u025f\u0001\u0000\u0000\u0000\u0262\u0260\u0001\u0000"+
		"\u0000\u0000\u0262\u0261\u0001\u0000\u0000\u0000\u0263y\u0001\u0000\u0000"+
		"\u0000\u0264\u0265\u00052\u0000\u0000\u0265\u0268\u0003|>\u0000\u0266"+
		"\u0268\u0003~?\u0000\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0266\u0001"+
		"\u0000\u0000\u0000\u0268{\u0001\u0000\u0000\u0000\u0269\u026b\u0003\u0080"+
		"@\u0000\u026a\u0269\u0001\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000"+
		"\u0000\u026b\u026c\u0001\u0000\u0000\u0000\u026c\u026d\u0003\u0082A\u0000"+
		"\u026d\u026e\u0003\u008aE\u0000\u026e}\u0001\u0000\u0000\u0000\u026f\u0271"+
		"\u0003\u0080@\u0000\u0270\u026f\u0001\u0000\u0000\u0000\u0270\u0271\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0005"+
		"3\u0000\u0000\u0273\u0275\u0003\u0086C\u0000\u0274\u0276\u0003\u0084B"+
		"\u0000\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000"+
		"\u0000\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u027b\u0003\u00b6[\u0000"+
		"\u0278\u027a\u0003\u008cF\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u027a"+
		"\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0001\u0000\u0000\u0000\u027c\u0296\u0001\u0000\u0000\u0000\u027d"+
		"\u027b\u0001\u0000\u0000\u0000\u027e\u0280\u0003\u0080@\u0000\u027f\u027e"+
		"\u0001\u0000\u0000\u0000\u027f\u0280\u0001\u0000\u0000\u0000\u0280\u0281"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u00054\u0000\u0000\u0282\u0284\u0003"+
		"\u0086C\u0000\u0283\u0285\u0003\u00b6[\u0000\u0284\u0283\u0001\u0000\u0000"+
		"\u0000\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0289\u0001\u0000\u0000"+
		"\u0000\u0286\u0288\u0003\u008cF\u0000\u0287\u0286\u0001\u0000\u0000\u0000"+
		"\u0288\u028b\u0001\u0000\u0000\u0000\u0289\u0287\u0001\u0000\u0000\u0000"+
		"\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u0296\u0001\u0000\u0000\u0000"+
		"\u028b\u0289\u0001\u0000\u0000\u0000\u028c\u028d\u00055\u0000\u0000\u028d"+
		"\u028e\u0007\u0001\u0000\u0000\u028e\u0292\u0003\u00b6[\u0000\u028f\u0291"+
		"\u0003\u008cF\u0000\u0290\u028f\u0001\u0000\u0000\u0000\u0291\u0294\u0001"+
		"\u0000\u0000\u0000\u0292\u0290\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u0296\u0001\u0000\u0000\u0000\u0294\u0292\u0001"+
		"\u0000\u0000\u0000\u0295\u0270\u0001\u0000\u0000\u0000\u0295\u027f\u0001"+
		"\u0000\u0000\u0000\u0295\u028c\u0001\u0000\u0000\u0000\u0296\u007f\u0001"+
		"\u0000\u0000\u0000\u0297\u0298\u0007\u0002\u0000\u0000\u0298\u0081\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u00053\u0000\u0000\u029a\u029c\u0003\u0086"+
		"C\u0000\u029b\u029d\u0003\u0084B\u0000\u029c\u029b\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0003\u0088D\u0000\u029f\u02a6\u0001\u0000\u0000\u0000\u02a0"+
		"\u02a1\u00054\u0000\u0000\u02a1\u02a6\u0003\u0086C\u0000\u02a2\u02a3\u0005"+
		"5\u0000\u0000\u02a3\u02a4\u0007\u0001\u0000\u0000\u02a4\u02a6\u0003\u0088"+
		"D\u0000\u02a5\u0299\u0001\u0000\u0000\u0000\u02a5\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a5\u02a2\u0001\u0000\u0000\u0000\u02a6\u0083\u0001\u0000\u0000"+
		"\u0000\u02a7\u02a8\u0005s\u0000\u0000\u02a8\u0085\u0001\u0000\u0000\u0000"+
		"\u02a9\u02aa\u0005s\u0000\u0000\u02aa\u0087\u0001\u0000\u0000\u0000\u02ab"+
		"\u02ac\u0003\u00b4Z\u0000\u02ac\u0089\u0001\u0000\u0000\u0000\u02ad\u02af"+
		"\u0003\u008cF\u0000\u02ae\u02ad\u0001\u0000\u0000\u0000\u02af\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001"+
		"\u0000\u0000\u0000\u02b1\u008b\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001"+
		"\u0000\u0000\u0000\u02b3\u02b4\u00059\u0000\u0000\u02b4\u02ce\u0003\u00b6"+
		"[\u0000\u02b5\u02b6\u0005:\u0000\u0000\u02b6\u02ce\u0003\u00b6[\u0000"+
		"\u02b7\u02b8\u0005;\u0000\u0000\u02b8\u02ce\u0003\u00b6[\u0000\u02b9\u02ba"+
		"\u0005<\u0000\u0000\u02ba\u02ce\u0003\u00ccf\u0000\u02bb\u02bc\u0005="+
		"\u0000\u0000\u02bc\u02ce\u0003\u00b6[\u0000\u02bd\u02be\u0005>\u0000\u0000"+
		"\u02be\u02ce\u0003\u0080@\u0000\u02bf\u02c0\u0005?\u0000\u0000\u02c0\u02ce"+
		"\u0005m\u0000\u0000\u02c1\u02c2\u0005@\u0000\u0000\u02c2\u02ce\u0003\u008e"+
		"G\u0000\u02c3\u02c4\u0005A\u0000\u0000\u02c4\u02ce\u0003\u0090H\u0000"+
		"\u02c5\u02c6\u0005B\u0000\u0000\u02c6\u02c9\u0003\u0092I\u0000\u02c7\u02c8"+
		"\u0005C\u0000\u0000\u02c8\u02ca\u0003\u0080@\u0000\u02c9\u02c7\u0001\u0000"+
		"\u0000\u0000\u02c9\u02ca\u0001\u0000\u0000\u0000\u02ca\u02ce\u0001\u0000"+
		"\u0000\u0000\u02cb\u02cc\u0005D\u0000\u0000\u02cc\u02ce\u0003\u0094J\u0000"+
		"\u02cd\u02b3\u0001\u0000\u0000\u0000\u02cd\u02b5\u0001\u0000\u0000\u0000"+
		"\u02cd\u02b7\u0001\u0000\u0000\u0000\u02cd\u02b9\u0001\u0000\u0000\u0000"+
		"\u02cd\u02bb\u0001\u0000\u0000\u0000\u02cd\u02bd\u0001\u0000\u0000\u0000"+
		"\u02cd\u02bf\u0001\u0000\u0000\u0000\u02cd\u02c1\u0001\u0000\u0000\u0000"+
		"\u02cd\u02c3\u0001\u0000\u0000\u0000\u02cd\u02c5\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cb\u0001\u0000\u0000\u0000\u02ce\u008d\u0001\u0000\u0000\u0000"+
		"\u02cf\u02d0\u0005s\u0000\u0000\u02d0\u008f\u0001\u0000\u0000\u0000\u02d1"+
		"\u02d2\u0005s\u0000\u0000\u02d2\u0091\u0001\u0000\u0000\u0000\u02d3\u02d4"+
		"\u0005s\u0000\u0000\u02d4\u0093\u0001\u0000\u0000\u0000\u02d5\u02d6\u0005"+
		"s\u0000\u0000\u02d6\u0095\u0001\u0000\u0000\u0000\u02d7\u02d8\u0003\u0098"+
		"L\u0000\u02d8\u0097\u0001\u0000\u0000\u0000\u02d9\u02de\u0003\u009aM\u0000"+
		"\u02da\u02db\u0005X\u0000\u0000\u02db\u02dd\u0003\u009aM\u0000\u02dc\u02da"+
		"\u0001\u0000\u0000\u0000\u02dd\u02e0\u0001\u0000\u0000\u0000\u02de\u02dc"+
		"\u0001\u0000\u0000\u0000\u02de\u02df\u0001\u0000\u0000\u0000\u02df\u0099"+
		"\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e1\u02e6"+
		"\u0003\u009cN\u0000\u02e2\u02e3\u0005W\u0000\u0000\u02e3\u02e5\u0003\u009c"+
		"N\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000"+
		"\u0000\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000"+
		"\u0000\u02e7\u009b\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000"+
		"\u0000\u02e9\u02ea\u0005Y\u0000\u0000\u02ea\u02ed\u0003\u009cN\u0000\u02eb"+
		"\u02ed\u0003\u009eO\u0000\u02ec\u02e9\u0001\u0000\u0000\u0000\u02ec\u02eb"+
		"\u0001\u0000\u0000\u0000\u02ed\u009d\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0005d\u0000\u0000\u02ef\u02f0\u0003\u0096K\u0000\u02f0\u02f1\u0005e"+
		"\u0000\u0000\u02f1\u02f9\u0001\u0000\u0000\u0000\u02f2\u02f9\u0003\u00a0"+
		"P\u0000\u02f3\u02f9\u0003\u00a2Q\u0000\u02f4\u02f9\u0003\u00a4R\u0000"+
		"\u02f5\u02f9\u0003\u00a6S\u0000\u02f6\u02f9\u0003\u00a8T\u0000\u02f7\u02f9"+
		"\u0003\u00aaU\u0000\u02f8\u02ee\u0001\u0000\u0000\u0000\u02f8\u02f2\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f3\u0001\u0000\u0000\u0000\u02f8\u02f4\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f5\u0001\u0000\u0000\u0000\u02f8\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f7\u0001\u0000\u0000\u0000\u02f9\u009f\u0001"+
		"\u0000\u0000\u0000\u02fa\u02fb\u0003\u00acV\u0000\u02fb\u02fc\u0003\u00b2"+
		"Y\u0000\u02fc\u02fd\u0003\u00acV\u0000\u02fd\u00a1\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0003\u00acV\u0000\u02ff\u0300\u0005Z\u0000\u0000\u0300\u0301"+
		"\u0003\u00acV\u0000\u0301\u0302\u0005l\u0000\u0000\u0302\u0303\u0003\u00ac"+
		"V\u0000\u0303\u030d\u0001\u0000\u0000\u0000\u0304\u0305\u0003\u00acV\u0000"+
		"\u0305\u0306\u0005Z\u0000\u0000\u0306\u0307\u0005f\u0000\u0000\u0307\u0308"+
		"\u0003\u00acV\u0000\u0308\u0309\u0005i\u0000\u0000\u0309\u030a\u0003\u00ac"+
		"V\u0000\u030a\u030b\u0005g\u0000\u0000\u030b\u030d\u0001\u0000\u0000\u0000"+
		"\u030c\u02fe\u0001\u0000\u0000\u0000\u030c\u0304\u0001\u0000\u0000\u0000"+
		"\u030d\u00a3\u0001\u0000\u0000\u0000\u030e\u030f\u0003\u00acV\u0000\u030f"+
		"\u0310\u0005[\u0000\u0000\u0310\u0311\u0003\u00acV\u0000\u0311\u00a5\u0001"+
		"\u0000\u0000\u0000\u0312\u0313\u0003\u00acV\u0000\u0313\u0316\u0005\\"+
		"\u0000\u0000\u0314\u0317\u0003\u00d0h\u0000\u0315\u0317\u0005s\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000"+
		"\u0317\u00a7\u0001\u0000\u0000\u0000\u0318\u0319\u0003\u00acV\u0000\u0319"+
		"\u031a\u0005]\u0000\u0000\u031a\u031b\u0005s\u0000\u0000\u031b\u00a9\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0003\u00acV\u0000\u031d\u00ab\u0001\u0000"+
		"\u0000\u0000\u031e\u031f\u0003\u00aeW\u0000\u031f\u0320\u0005k\u0000\u0000"+
		"\u0320\u0321\u0003\u00b0X\u0000\u0321\u0324\u0001\u0000\u0000\u0000\u0322"+
		"\u0324\u0003\u00b0X\u0000\u0323\u031e\u0001\u0000\u0000\u0000\u0323\u0322"+
		"\u0001\u0000\u0000\u0000\u0324\u00ad\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0007\u0002\u0000\u0000\u0326\u00af\u0001\u0000\u0000\u0000\u0327\u032a"+
		"\u0005s\u0000\u0000\u0328\u032a\u0003\u00ceg\u0000\u0329\u0327\u0001\u0000"+
		"\u0000\u0000\u0329\u0328\u0001\u0000\u0000\u0000\u032a\u00b1\u0001\u0000"+
		"\u0000\u0000\u032b\u032c\u0007\u0003\u0000\u0000\u032c\u00b3\u0001\u0000"+
		"\u0000\u0000\u032d\u032e\u0003\u00b6[\u0000\u032e\u00b5\u0001\u0000\u0000"+
		"\u0000\u032f\u0334\u0003\u00b8\\\u0000\u0330\u0331\u0007\u0004\u0000\u0000"+
		"\u0331\u0333\u0003\u00b8\\\u0000\u0332\u0330\u0001\u0000\u0000\u0000\u0333"+
		"\u0336\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0334"+
		"\u0335\u0001\u0000\u0000\u0000\u0335\u00b7\u0001\u0000\u0000\u0000\u0336"+
		"\u0334\u0001\u0000\u0000\u0000\u0337\u033c\u0003\u00ba]\u0000\u0338\u0339"+
		"\u0007\u0005\u0000\u0000\u0339\u033b\u0003\u00ba]\u0000\u033a\u0338\u0001"+
		"\u0000\u0000\u0000\u033b\u033e\u0001\u0000\u0000\u0000\u033c\u033a\u0001"+
		"\u0000\u0000\u0000\u033c\u033d\u0001\u0000\u0000\u0000\u033d\u00b9\u0001"+
		"\u0000\u0000\u0000\u033e\u033c\u0001\u0000\u0000\u0000\u033f\u0340\u0007"+
		"\u0004\u0000\u0000\u0340\u0343\u0003\u00ba]\u0000\u0341\u0343\u0003\u00bc"+
		"^\u0000\u0342\u033f\u0001\u0000\u0000\u0000\u0342\u0341\u0001\u0000\u0000"+
		"\u0000\u0343\u00bb\u0001\u0000\u0000\u0000\u0344\u034b\u0003\u00ceg\u0000"+
		"\u0345\u034b\u0003\u00acV\u0000\u0346\u0347\u0005d\u0000\u0000\u0347\u0348"+
		"\u0003\u00b4Z\u0000\u0348\u0349\u0005e\u0000\u0000\u0349\u034b\u0001\u0000"+
		"\u0000\u0000\u034a\u0344\u0001\u0000\u0000\u0000\u034a\u0345\u0001\u0000"+
		"\u0000\u0000\u034a\u0346\u0001\u0000\u0000\u0000\u034b\u00bd\u0001\u0000"+
		"\u0000\u0000\u034c\u034d\u0005\u0002\u0000\u0000\u034d\u034e\u0003\u00d0"+
		"h\u0000\u034e\u034f\u0003\u00c0`\u0000\u034f\u00bf\u0001\u0000\u0000\u0000"+
		"\u0350\u0354\u0005b\u0000\u0000\u0351\u0353\u0003\u00c2a\u0000\u0352\u0351"+
		"\u0001\u0000\u0000\u0000\u0353\u0356\u0001\u0000\u0000\u0000\u0354\u0352"+
		"\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0357"+
		"\u0001\u0000\u0000\u0000\u0356\u0354\u0001\u0000\u0000\u0000\u0357\u0358"+
		"\u0005c\u0000\u0000\u0358\u00c1\u0001\u0000\u0000\u0000\u0359\u035d\u0003"+
		"\u00c4b\u0000\u035a\u035d\u0003*\u0015\u0000\u035b\u035d\u0003(\u0014"+
		"\u0000\u035c\u0359\u0001\u0000\u0000\u0000\u035c\u035a\u0001\u0000\u0000"+
		"\u0000\u035c\u035b\u0001\u0000\u0000\u0000\u035d\u00c3\u0001\u0000\u0000"+
		"\u0000\u035e\u035f\u0005\u0003\u0000\u0000\u035f\u0363\u0005b\u0000\u0000"+
		"\u0360\u0362\u0003\u00c6c\u0000\u0361\u0360\u0001\u0000\u0000\u0000\u0362"+
		"\u0365\u0001\u0000\u0000\u0000\u0363\u0361\u0001\u0000\u0000\u0000\u0363"+
		"\u0364\u0001\u0000\u0000\u0000\u0364\u0366\u0001\u0000\u0000\u0000\u0365"+
		"\u0363\u0001\u0000\u0000\u0000\u0366\u0367\u0005c\u0000\u0000\u0367\u00c5"+
		"\u0001\u0000\u0000\u0000\u0368\u036b\u0005\u0004\u0000\u0000\u0369\u036c"+
		"\u0003\u00d0h\u0000\u036a\u036c\u0005s\u0000\u0000\u036b\u0369\u0001\u0000"+
		"\u0000\u0000\u036b\u036a\u0001\u0000\u0000\u0000\u036c\u00c7\u0001\u0000"+
		"\u0000\u0000\u036d\u036e\u0005b\u0000\u0000\u036e\u0373\u0003\u00cae\u0000"+
		"\u036f\u0370\u0005i\u0000\u0000\u0370\u0372\u0003\u00cae\u0000\u0371\u036f"+
		"\u0001\u0000\u0000\u0000\u0372\u0375\u0001\u0000\u0000\u0000\u0373\u0371"+
		"\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000\u0000\u0374\u0376"+
		"\u0001\u0000\u0000\u0000\u0375\u0373\u0001\u0000\u0000\u0000\u0376\u0377"+
		"\u0005c\u0000\u0000\u0377\u00c9\u0001\u0000\u0000\u0000\u0378\u0379\u0005"+
		"s\u0000\u0000\u0379\u037a\u0005j\u0000\u0000\u037a\u037b\u0003\u00b4Z"+
		"\u0000\u037b\u00cb\u0001\u0000\u0000\u0000\u037c\u037d\u0007\u0006\u0000"+
		"\u0000\u037d\u00cd\u0001\u0000\u0000\u0000\u037e\u037f\u0007\u0007\u0000"+
		"\u0000\u037f\u00cf\u0001\u0000\u0000\u0000\u0380\u0381\u0005q\u0000\u0000"+
		"\u0381\u00d1\u0001\u0000\u0000\u0000\u0382\u0383\u0005r\u0000\u0000\u0383"+
		"\u00d3\u0001\u0000\u0000\u0000\u0384\u0385\u0005\u001a\u0000\u0000\u0385"+
		"\u0386\u0003\u00d2i\u0000\u0386\u00d5\u0001\u0000\u0000\u0000H\u00d8\u00da"+
		"\u00e7\u00fa\u0101\u0104\u0112\u011b\u012a\u0139\u0149\u014d\u0156\u015f"+
		"\u0168\u0175\u017f\u0187\u018c\u0191\u0196\u019c\u01a1\u01a9\u01b7\u01cf"+
		"\u01db\u01e7\u01fa\u0200\u0206\u0211\u021e\u0229\u023a\u0241\u0245\u024e"+
		"\u0256\u0262\u0267\u026a\u0270\u0275\u027b\u027f\u0284\u0289\u0292\u0295"+
		"\u029c\u02a5\u02b0\u02c9\u02cd\u02de\u02e6\u02ec\u02f8\u030c\u0316\u0323"+
		"\u0329\u0334\u033c\u0342\u034a\u0354\u035c\u0363\u036b\u0373";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}