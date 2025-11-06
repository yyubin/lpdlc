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
		BOOST=23, SUPPORT=24, TYPE=25, VALUE=26, SKILL=27, CATEGORY=28, ATTACK=29, 
		DEFENSE=30, QUANTITY=31, KEYWORD=32, IMAGE=33, NONE=34, SYNC=35, BASEPOWER=36, 
		COINPOWER=37, COINCOUNT=38, WEIGHT=39, LEVEL=40, EFFECT=41, TRIGGER=42, 
		WHEN=43, BRANCH=44, ORDER=45, STOPONMATCH=46, COIN=47, PASSIVE=48, ACTION=49, 
		APPLY=50, REMOVE=51, MODIFY=52, POWER=53, DAMAGE=54, POLICY=55, CAPPED=56, 
		CAP=57, PERTURN=58, NEXTTURN=59, DURATION=60, SCOPE=61, PRIORITY=62, SELF=63, 
		TARGET=64, ALLY=65, ENEMY=66, ALL_ALLIES=67, ALL_ENEMIES=68, EQ=69, NEQ=70, 
		GTE=71, LTE=72, GT=73, LT=74, AND=75, OR=76, NOT=77, PLUS=78, MINUS=79, 
		MUL=80, DIV=81, LBRACE=82, RBRACE=83, LPAREN=84, RPAREN=85, LBRACK=86, 
		RBRACK=87, STAR=88, COMMA=89, COLON=90, DOT=91, INT=92, FLOAT=93, TRUE=94, 
		FALSE=95, STRING=96, IDENT=97, WS=98, LINE_COMMENT=99, BLOCK_COMMENT=100;
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
		RULE_conditionExpr = 71, RULE_conditionOr = 72, RULE_conditionAnd = 73, 
		RULE_conditionNot = 74, RULE_conditionAtom = 75, RULE_comparison = 76, 
		RULE_presenceCheck = 77, RULE_side = 78, RULE_sidePrefix = 79, RULE_sideCore = 80, 
		RULE_comparator = 81, RULE_expr = 82, RULE_additiveExpr = 83, RULE_multiplicativeExpr = 84, 
		RULE_unaryExpr = 85, RULE_primaryExpr = 86, RULE_deckDecl = 87, RULE_deckBody = 88, 
		RULE_deckStmt = 89, RULE_personasBlock = 90, RULE_personasStmt = 91, RULE_objectLiteral = 92, 
		RULE_objectPair = 93, RULE_booleanLiteral = 94, RULE_numberLiteral = 95, 
		RULE_stringLiteral = 96;
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
			"actionOptions", "conditionExpr", "conditionOr", "conditionAnd", "conditionNot", 
			"conditionAtom", "comparison", "presenceCheck", "side", "sidePrefix", 
			"sideCore", "comparator", "expr", "additiveExpr", "multiplicativeExpr", 
			"unaryExpr", "primaryExpr", "deckDecl", "deckBody", "deckStmt", "personasBlock", 
			"personasStmt", "objectLiteral", "objectPair", "booleanLiteral", "numberLiteral", 
			"stringLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'persona'", "'deck'", "'personas'", "'add'", "'grade'", "'sinner'", 
			"'sin'", "'release'", "'maxLevel'", "'resistance'", "'speed'", "'health'", 
			"'base'", "'growth'", "'disturbed'", "'season'", "'number'", "'url'", 
			"'primary'", "'meta'", "'synergy'", "'with'", "'boost'", "'support'", 
			"'type'", "'value'", "'skill'", "'category'", "'attack'", "'defense'", 
			"'quantity'", "'keyword'", "'image'", "'none'", "'sync'", "'basePower'", 
			"'coinPower'", "'coinCount'", "'weight'", "'level'", "'effect'", "'trigger'", 
			"'when'", "'branch'", "'order'", "'stopOnMatch'", "'coin'", "'passive'", 
			"'action'", "'apply'", "'remove'", "'modify'", "'power'", "'damage'", 
			"'policy'", "'capped'", "'cap'", "'perTurn'", "'nextTurn'", "'duration'", 
			"'scope'", "'priority'", "'self'", "'target'", "'ally'", "'enemy'", "'all_allies'", 
			"'all_enemies'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'AND'", 
			"'OR'", "'NOT'", "'+'", "'-'", "'*'", "'/'", "'{'", "'}'", "'('", "')'", 
			"'['", "']'", "'\\u2605'", "','", "':'", "'.'", null, null, "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PERSONA", "DECK", "PERSONAS", "ADD", "GRADE", "SINNER", "SIN", 
			"RELEASE", "MAXLEVEL", "RESISTANCE", "SPEED", "HEALTH", "BASE", "GROWTH", 
			"DISTURBED", "SEASON", "NUMBER", "URL", "PRIMARY", "META", "SYNERGY", 
			"WITH", "BOOST", "SUPPORT", "TYPE", "VALUE", "SKILL", "CATEGORY", "ATTACK", 
			"DEFENSE", "QUANTITY", "KEYWORD", "IMAGE", "NONE", "SYNC", "BASEPOWER", 
			"COINPOWER", "COINCOUNT", "WEIGHT", "LEVEL", "EFFECT", "TRIGGER", "WHEN", 
			"BRANCH", "ORDER", "STOPONMATCH", "COIN", "PASSIVE", "ACTION", "APPLY", 
			"REMOVE", "MODIFY", "POWER", "DAMAGE", "POLICY", "CAPPED", "CAP", "PERTURN", 
			"NEXTTURN", "DURATION", "SCOPE", "PRIORITY", "SELF", "TARGET", "ALLY", 
			"ENEMY", "ALL_ALLIES", "ALL_ENEMIES", "EQ", "NEQ", "GTE", "LTE", "GT", 
			"LT", "AND", "OR", "NOT", "PLUS", "MINUS", "MUL", "DIV", "LBRACE", "RBRACE", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "STAR", "COMMA", "COLON", "DOT", 
			"INT", "FLOAT", "TRUE", "FALSE", "STRING", "IDENT", "WS", "LINE_COMMENT", 
			"BLOCK_COMMENT"
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
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PERSONA || _la==DECK) {
				{
				setState(196);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PERSONA:
					{
					setState(194);
					personaDecl();
					}
					break;
				case DECK:
					{
					setState(195);
					deckDecl();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(200);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(201);
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
			setState(203);
			match(PERSONA);
			setState(204);
			stringLiteral();
			setState(205);
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
			setState(207);
			match(LBRACE);
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 281483704082400L) != 0)) {
				{
				{
				setState(208);
				personaStmt();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214);
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
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case GRADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				gradeStmt();
				}
				break;
			case SINNER:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				sinnerStmt();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(218);
				sinStmt();
				}
				break;
			case RELEASE:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				releaseStmt();
				}
				break;
			case MAXLEVEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(220);
				maxLevelStmt();
				}
				break;
			case RESISTANCE:
				enterOuterAlt(_localctx, 6);
				{
				setState(221);
				resistanceStmt();
				}
				break;
			case SPEED:
				enterOuterAlt(_localctx, 7);
				{
				setState(222);
				speedStmt();
				}
				break;
			case HEALTH:
				enterOuterAlt(_localctx, 8);
				{
				setState(223);
				healthStmt();
				}
				break;
			case SEASON:
				enterOuterAlt(_localctx, 9);
				{
				setState(224);
				seasonStmt();
				}
				break;
			case SYNERGY:
				enterOuterAlt(_localctx, 10);
				{
				setState(225);
				synergyBlock();
				}
				break;
			case SKILL:
				enterOuterAlt(_localctx, 11);
				{
				setState(226);
				skillDecl();
				}
				break;
			case PASSIVE:
				enterOuterAlt(_localctx, 12);
				{
				setState(227);
				passiveDecl();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(228);
				imageDecl();
				}
				break;
			case META:
				enterOuterAlt(_localctx, 14);
				{
				setState(229);
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
			setState(232);
			match(GRADE);
			setState(233);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(INT);
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STAR) {
					{
					setState(236);
					match(STAR);
					}
				}

				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
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
			setState(242);
			match(SIN);
			setState(243);
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
			setState(245);
			match(RELEASE);
			setState(246);
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
			setState(248);
			match(MAXLEVEL);
			setState(249);
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
			setState(251);
			match(SINNER);
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(252);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(253);
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
			setState(256);
			match(RESISTANCE);
			setState(257);
			match(LBRACE);
			setState(258);
			resistancePair();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(259);
				match(COMMA);
				setState(260);
				resistancePair();
				}
				}
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(266);
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
			setState(268);
			match(IDENT);
			setState(269);
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
			setState(271);
			match(SPEED);
			setState(272);
			match(LBRACE);
			setState(273);
			speedPair();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(274);
				match(COMMA);
				setState(275);
				speedPair();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(281);
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
			setState(283);
			match(IDENT);
			setState(284);
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
			setState(286);
			match(HEALTH);
			setState(287);
			match(LBRACE);
			setState(288);
			healthField();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(289);
				match(COMMA);
				setState(290);
				healthField();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
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
			setState(313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(BASE);
				setState(299);
				match(INT);
				}
				break;
			case GROWTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(GROWTH);
				setState(301);
				numberLiteral();
				}
				break;
			case DISTURBED:
				enterOuterAlt(_localctx, 3);
				{
				setState(302);
				match(DISTURBED);
				setState(303);
				match(LBRACK);
				setState(304);
				match(INT);
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(305);
					match(COMMA);
					setState(306);
					match(INT);
					}
					}
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(312);
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
			setState(315);
			match(SEASON);
			setState(316);
			match(LBRACE);
			setState(317);
			seasonField();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(318);
				match(COMMA);
				setState(319);
				seasonField();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
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
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(327);
				match(TYPE);
				setState(328);
				match(IDENT);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(NUMBER);
				setState(330);
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
			setState(333);
			match(IMAGE);
			setState(334);
			match(LBRACE);
			setState(335);
			imageField();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(336);
				match(COMMA);
				setState(337);
				imageField();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
			setState(353);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(345);
				match(TYPE);
				setState(346);
				match(IDENT);
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(URL);
				setState(348);
				stringLiteral();
				}
				break;
			case PRIORITY:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(PRIORITY);
				setState(350);
				match(INT);
				}
				break;
			case PRIMARY:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				match(PRIMARY);
				setState(352);
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
			setState(355);
			match(META);
			setState(356);
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
			setState(358);
			match(SYNERGY);
			setState(359);
			match(LBRACE);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WITH) {
				{
				{
				setState(360);
				synergyStmt();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
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
			setState(368);
			match(WITH);
			setState(371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(369);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(370);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(373);
				synergyDetail();
				}
				}
				setState(376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0) );
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
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOST:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				match(BOOST);
				setState(379);
				match(IDENT);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 18792677439L) != 0)) {
					{
					setState(380);
					additiveExpr();
					}
				}

				}
				break;
			case SUPPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(383);
				match(SUPPORT);
				setState(384);
				match(IDENT);
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 18792677439L) != 0)) {
					{
					setState(385);
					additiveExpr();
					}
				}

				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				match(TYPE);
				setState(389);
				match(IDENT);
				}
				break;
			case VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(390);
				match(VALUE);
				setState(391);
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
			setState(394);
			match(SKILL);
			setState(395);
			match(INT);
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(396);
				stringLiteral();
				}
			}

			setState(399);
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
			setState(401);
			match(LBRACE);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 51271172224L) != 0)) {
				{
				{
				setState(402);
				skillStmt();
				}
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(408);
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
			setState(418);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CATEGORY:
				enterOuterAlt(_localctx, 1);
				{
				setState(410);
				categoryStmt();
				}
				break;
			case SIN:
				enterOuterAlt(_localctx, 2);
				{
				setState(411);
				skillSinStmt();
				}
				break;
			case ATTACK:
				enterOuterAlt(_localctx, 3);
				{
				setState(412);
				attackStmt();
				}
				break;
			case DEFENSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				defenseStmt();
				}
				break;
			case QUANTITY:
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				quantityStmt();
				}
				break;
			case KEYWORD:
				enterOuterAlt(_localctx, 6);
				{
				setState(415);
				keywordStmt();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 7);
				{
				setState(416);
				imageStmt();
				}
				break;
			case SYNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(417);
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
			setState(420);
			match(CATEGORY);
			setState(421);
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
			setState(423);
			match(SIN);
			setState(424);
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
			setState(426);
			match(ATTACK);
			setState(427);
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
			setState(429);
			match(DEFENSE);
			setState(430);
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
			setState(432);
			match(QUANTITY);
			setState(433);
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
			setState(435);
			match(KEYWORD);
			setState(436);
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
			setState(438);
			match(IMAGE);
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(439);
				match(IDENT);
				}
				break;
			case NONE:
				{
				setState(440);
				match(NONE);
				}
				break;
			case STRING:
				{
				setState(441);
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
			setState(444);
			match(SYNC);
			setState(445);
			syncLevel();
			setState(446);
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
			setState(448);
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
			setState(450);
			match(LBRACE);
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 145066815389696L) != 0)) {
				{
				{
				setState(451);
				syncStmt();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
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
			setState(466);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BASEPOWER:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				basePowerStmt();
				}
				break;
			case COINPOWER:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				coinPowerStmt();
				}
				break;
			case COINCOUNT:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
				coinCountStmt();
				}
				break;
			case WEIGHT:
				enterOuterAlt(_localctx, 4);
				{
				setState(462);
				weightStmt();
				}
				break;
			case LEVEL:
				enterOuterAlt(_localctx, 5);
				{
				setState(463);
				levelStmt();
				}
				break;
			case EFFECT:
				enterOuterAlt(_localctx, 6);
				{
				setState(464);
				effectDecl();
				}
				break;
			case COIN:
				enterOuterAlt(_localctx, 7);
				{
				setState(465);
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
			setState(468);
			match(BASEPOWER);
			setState(469);
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
			setState(471);
			match(COINPOWER);
			setState(472);
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
			setState(474);
			match(COINCOUNT);
			setState(475);
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
			setState(477);
			match(WEIGHT);
			setState(478);
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
			setState(480);
			match(LEVEL);
			setState(481);
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
			setState(483);
			match(EFFECT);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(484);
				effectHeader();
				}
			}

			setState(487);
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
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(490);
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
			setState(493);
			match(LBRACE);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 132122503L) != 0)) {
				{
				{
				setState(494);
				effectStmt();
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
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
			setState(508);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				triggerStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				whenStmt();
				}
				break;
			case BRANCH:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				branchBlock();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(505);
				match(ACTION);
				setState(506);
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
				enterOuterAlt(_localctx, 5);
				{
				setState(507);
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
			setState(510);
			match(TRIGGER);
			setState(511);
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
			setState(513);
			match(WHEN);
			setState(514);
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
			setState(516);
			match(BRANCH);
			setState(517);
			match(LBRACE);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 66061261L) != 0)) {
				{
				{
				setState(518);
				branchStmt();
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
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
			setState(532);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(526);
				orderStmt();
				}
				break;
			case STOPONMATCH:
				enterOuterAlt(_localctx, 2);
				{
				setState(527);
				stopOnMatchStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 3);
				{
				setState(528);
				whenStmt();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				match(ACTION);
				setState(530);
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
				enterOuterAlt(_localctx, 5);
				{
				setState(531);
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
			setState(534);
			match(ORDER);
			setState(535);
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
			setState(537);
			match(STOPONMATCH);
			setState(538);
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
			setState(540);
			match(COIN);
			setState(541);
			match(INT);
			setState(542);
			match(IDENT);
			setState(543);
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
			setState(545);
			match(LBRACE);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EFFECT) {
				{
				{
				setState(546);
				coinStmt();
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			effectInlineDecl();
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
			setState(556);
			match(EFFECT);
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(557);
				effectInlineHeader();
				}
			}

			setState(560);
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
			setState(562);
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
			setState(564);
			match(PASSIVE);
			setState(565);
			match(IDENT);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(566);
				stringLiteral();
				}
			}

			setState(569);
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
			setState(571);
			match(LBRACE);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & 132122503L) != 0)) {
				{
				{
				setState(572);
				passiveStmt();
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
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
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRIGGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				triggerStmt();
				}
				break;
			case WHEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				whenStmt();
				}
				break;
			case ACTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				match(ACTION);
				setState(583);
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
				enterOuterAlt(_localctx, 4);
				{
				setState(584);
				actionSimple();
				}
				break;
			case BRANCH:
				enterOuterAlt(_localctx, 5);
				{
				setState(585);
				branchBlock();
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
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(ACTION);
				setState(589);
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
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
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
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) {
				{
				setState(593);
				targetSpec();
				}
			}

			setState(596);
			verbSpec();
			setState(597);
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
			setState(637);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(600);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) {
					{
					setState(599);
					targetSpec();
					}
				}

				setState(602);
				match(APPLY);
				setState(603);
				statSpec();
				setState(605);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(604);
					policySpec();
					}
					break;
				}
				setState(607);
				additiveExpr();
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314442816847872L) != 0)) {
					{
					{
					setState(608);
					actionOptions();
					}
					}
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) {
					{
					setState(614);
					targetSpec();
					}
				}

				setState(617);
				match(REMOVE);
				setState(618);
				statSpec();
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(619);
					additiveExpr();
					}
					break;
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314442816847872L) != 0)) {
					{
					{
					setState(622);
					actionOptions();
					}
					}
					setState(627);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(628);
				match(MODIFY);
				setState(629);
				_la = _input.LA(1);
				if ( !(_la==POWER || _la==DAMAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(630);
				additiveExpr();
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314442816847872L) != 0)) {
					{
					{
					setState(631);
					actionOptions();
					}
					}
					setState(636);
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
			setState(639);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) ) {
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
			setState(653);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPLY:
				enterOuterAlt(_localctx, 1);
				{
				setState(641);
				match(APPLY);
				setState(642);
				statSpec();
				setState(644);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(643);
					policySpec();
					}
					break;
				}
				setState(646);
				valueSpec();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(648);
				match(REMOVE);
				setState(649);
				statSpec();
				}
				break;
			case MODIFY:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(MODIFY);
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==POWER || _la==DAMAGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(652);
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
			setState(655);
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
			setState(657);
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
			setState(659);
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
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9151314442816847872L) != 0)) {
				{
				{
				setState(661);
				actionOptions();
				}
				}
				setState(666);
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
		try {
			setState(681);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAPPED:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(CAPPED);
				setState(668);
				additiveExpr();
				}
				break;
			case CAP:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(CAP);
				setState(670);
				additiveExpr();
				}
				break;
			case PERTURN:
				enterOuterAlt(_localctx, 3);
				{
				setState(671);
				match(PERTURN);
				setState(672);
				additiveExpr();
				}
				break;
			case NEXTTURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				match(NEXTTURN);
				setState(674);
				booleanLiteral();
				}
				break;
			case DURATION:
				enterOuterAlt(_localctx, 5);
				{
				setState(675);
				match(DURATION);
				setState(676);
				additiveExpr();
				}
				break;
			case SCOPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(677);
				match(SCOPE);
				setState(678);
				targetSpec();
				}
				break;
			case PRIORITY:
				enterOuterAlt(_localctx, 7);
				{
				setState(679);
				match(PRIORITY);
				setState(680);
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
		enterRule(_localctx, 142, RULE_conditionExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(683);
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
		enterRule(_localctx, 144, RULE_conditionOr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			conditionAnd();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(686);
				match(OR);
				setState(687);
				conditionAnd();
				}
				}
				setState(692);
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
		enterRule(_localctx, 146, RULE_conditionAnd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			conditionNot();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(694);
				match(AND);
				setState(695);
				conditionNot();
				}
				}
				setState(700);
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
		enterRule(_localctx, 148, RULE_conditionNot);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(NOT);
				setState(702);
				conditionNot();
				}
				break;
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case LPAREN:
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(703);
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
		enterRule(_localctx, 150, RULE_conditionAtom);
		try {
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(706);
				match(LPAREN);
				setState(707);
				conditionExpr();
				setState(708);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				comparison();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
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
		enterRule(_localctx, 152, RULE_comparison);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			side();
			setState(715);
			comparator();
			setState(716);
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
		enterRule(_localctx, 154, RULE_presenceCheck);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
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
		enterRule(_localctx, 156, RULE_side);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				sidePrefix();
				setState(721);
				match(DOT);
				setState(722);
				sideCore();
				}
				break;
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(724);
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
		enterRule(_localctx, 158, RULE_sidePrefix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) ) {
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
		enterRule(_localctx, 160, RULE_sideCore);
		try {
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				match(IDENT);
				}
				break;
			case INT:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
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
		enterRule(_localctx, 162, RULE_comparator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 63L) != 0)) ) {
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
		enterRule(_localctx, 164, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
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
		enterRule(_localctx, 166, RULE_additiveExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(737);
			multiplicativeExpr();
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(738);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(739);
				multiplicativeExpr();
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
		enterRule(_localctx, 168, RULE_multiplicativeExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			unaryExpr();
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(747);
				unaryExpr();
				}
				}
				setState(752);
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
		enterRule(_localctx, 170, RULE_unaryExpr);
		int _la;
		try {
			setState(756);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 1);
				{
				setState(753);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(754);
				unaryExpr();
				}
				break;
			case SELF:
			case TARGET:
			case ALLY:
			case ENEMY:
			case ALL_ALLIES:
			case ALL_ENEMIES:
			case LPAREN:
			case INT:
			case FLOAT:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(755);
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
		enterRule(_localctx, 172, RULE_primaryExpr);
		try {
			setState(764);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				numberLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				side();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(760);
				match(LPAREN);
				setState(761);
				expr();
				setState(762);
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
		enterRule(_localctx, 174, RULE_deckDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			match(DECK);
			setState(767);
			stringLiteral();
			setState(768);
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
		enterRule(_localctx, 176, RULE_deckBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			match(LBRACE);
			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3145736L) != 0)) {
				{
				{
				setState(771);
				deckStmt();
				}
				}
				setState(776);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(777);
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
		enterRule(_localctx, 178, RULE_deckStmt);
		try {
			setState(782);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERSONAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(779);
				personasBlock();
				}
				break;
			case SYNERGY:
				enterOuterAlt(_localctx, 2);
				{
				setState(780);
				synergyBlock();
				}
				break;
			case META:
				enterOuterAlt(_localctx, 3);
				{
				setState(781);
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
		enterRule(_localctx, 180, RULE_personasBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			match(PERSONAS);
			setState(785);
			match(LBRACE);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD) {
				{
				{
				setState(786);
				personasStmt();
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
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
		enterRule(_localctx, 182, RULE_personasStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			match(ADD);
			setState(797);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(795);
				stringLiteral();
				}
				break;
			case IDENT:
				{
				setState(796);
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
		enterRule(_localctx, 184, RULE_objectLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(799);
			match(LBRACE);
			setState(800);
			objectPair();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(801);
				match(COMMA);
				setState(802);
				objectPair();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
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
		enterRule(_localctx, 186, RULE_objectPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			match(IDENT);
			setState(811);
			match(COLON);
			setState(812);
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
		enterRule(_localctx, 188, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
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
		enterRule(_localctx, 190, RULE_numberLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
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
		enterRule(_localctx, 192, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
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

	public static final String _serializedATN =
		"\u0004\u0001d\u0335\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"_\u0007_\u0002`\u0007`\u0001\u0000\u0001\u0000\u0005\u0000\u00c5\b\u0000"+
		"\n\u0000\f\u0000\u00c8\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u00d2"+
		"\b\u0002\n\u0002\f\u0002\u00d5\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00e7\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u00ee\b\u0005\u0001\u0005\u0003\u0005"+
		"\u00f1\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t\u00ff"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0106\b\n\n\n\f\n"+
		"\u0109\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0115\b\f\n\f\f\f\u0118\t\f\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u0124\b\u000e\n\u000e\f\u000e\u0127"+
		"\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u0134\b\u000f\n\u000f\f\u000f\u0137\t\u000f\u0001\u000f\u0003\u000f"+
		"\u013a\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u0141\b\u0010\n\u0010\f\u0010\u0144\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u014c"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005"+
		"\u0012\u0153\b\u0012\n\u0012\f\u0012\u0156\t\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0162\b\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u016a\b\u0015"+
		"\n\u0015\f\u0015\u016d\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u0174\b\u0016\u0001\u0016\u0004\u0016\u0177"+
		"\b\u0016\u000b\u0016\f\u0016\u0178\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0003\u0017\u017e\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0183\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u0189\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u018e\b"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0005\u0019\u0194"+
		"\b\u0019\n\u0019\f\u0019\u0197\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u01a3\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01bb\b!\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001$\u0001$\u0005$\u01c5\b"+
		"$\n$\f$\u01c8\t$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0003%\u01d3\b%\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0003+\u01e6\b+\u0001+\u0001+\u0001,\u0001,\u0003,\u01ec\b,\u0001"+
		"-\u0001-\u0005-\u01f0\b-\n-\f-\u01f3\t-\u0001-\u0001-\u0001.\u0001.\u0001"+
		".\u0001.\u0001.\u0001.\u0003.\u01fd\b.\u0001/\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u00051\u0208\b1\n1\f1\u020b\t1\u00011\u0001"+
		"1\u00012\u00012\u00012\u00012\u00012\u00012\u00032\u0215\b2\u00013\u0001"+
		"3\u00013\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u0001"+
		"6\u00016\u00056\u0224\b6\n6\f6\u0227\t6\u00016\u00016\u00017\u00017\u0001"+
		"8\u00018\u00038\u022f\b8\u00018\u00018\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0003:\u0238\b:\u0001:\u0001:\u0001;\u0001;\u0005;\u023e\b;\n;\f;\u0241"+
		"\t;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0003<\u024b"+
		"\b<\u0001=\u0001=\u0001=\u0003=\u0250\b=\u0001>\u0003>\u0253\b>\u0001"+
		">\u0001>\u0001>\u0001?\u0003?\u0259\b?\u0001?\u0001?\u0001?\u0003?\u025e"+
		"\b?\u0001?\u0001?\u0005?\u0262\b?\n?\f?\u0265\t?\u0001?\u0003?\u0268\b"+
		"?\u0001?\u0001?\u0001?\u0003?\u026d\b?\u0001?\u0005?\u0270\b?\n?\f?\u0273"+
		"\t?\u0001?\u0001?\u0001?\u0001?\u0005?\u0279\b?\n?\f?\u027c\t?\u0003?"+
		"\u027e\b?\u0001@\u0001@\u0001A\u0001A\u0001A\u0003A\u0285\bA\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001A\u0001A\u0003A\u028e\bA\u0001B\u0001B\u0001"+
		"C\u0001C\u0001D\u0001D\u0001E\u0005E\u0297\bE\nE\fE\u029a\tE\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001"+
		"F\u0001F\u0001F\u0003F\u02aa\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0005"+
		"H\u02b1\bH\nH\fH\u02b4\tH\u0001I\u0001I\u0001I\u0005I\u02b9\bI\nI\fI\u02bc"+
		"\tI\u0001J\u0001J\u0001J\u0003J\u02c1\bJ\u0001K\u0001K\u0001K\u0001K\u0001"+
		"K\u0001K\u0003K\u02c9\bK\u0001L\u0001L\u0001L\u0001L\u0001M\u0001M\u0001"+
		"N\u0001N\u0001N\u0001N\u0001N\u0003N\u02d6\bN\u0001O\u0001O\u0001P\u0001"+
		"P\u0003P\u02dc\bP\u0001Q\u0001Q\u0001R\u0001R\u0001S\u0001S\u0001S\u0005"+
		"S\u02e5\bS\nS\fS\u02e8\tS\u0001T\u0001T\u0001T\u0005T\u02ed\bT\nT\fT\u02f0"+
		"\tT\u0001U\u0001U\u0001U\u0003U\u02f5\bU\u0001V\u0001V\u0001V\u0001V\u0001"+
		"V\u0001V\u0003V\u02fd\bV\u0001W\u0001W\u0001W\u0001W\u0001X\u0001X\u0005"+
		"X\u0305\bX\nX\fX\u0308\tX\u0001X\u0001X\u0001Y\u0001Y\u0001Y\u0003Y\u030f"+
		"\bY\u0001Z\u0001Z\u0001Z\u0005Z\u0314\bZ\nZ\fZ\u0317\tZ\u0001Z\u0001Z"+
		"\u0001[\u0001[\u0001[\u0003[\u031e\b[\u0001\\\u0001\\\u0001\\\u0001\\"+
		"\u0005\\\u0324\b\\\n\\\f\\\u0327\t\\\u0001\\\u0001\\\u0001]\u0001]\u0001"+
		"]\u0001]\u0001^\u0001^\u0001_\u0001_\u0001`\u0001`\u0001`\u0000\u0000"+
		"a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082"+
		"\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a"+
		"\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2"+
		"\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u0000\b\u0001\u0000`a\u0001"+
		"\u000056\u0001\u0000?D\u0001\u0000EJ\u0001\u0000NO\u0001\u0000PQ\u0001"+
		"\u0000^_\u0001\u0000\\]\u0347\u0000\u00c6\u0001\u0000\u0000\u0000\u0002"+
		"\u00cb\u0001\u0000\u0000\u0000\u0004\u00cf\u0001\u0000\u0000\u0000\u0006"+
		"\u00e6\u0001\u0000\u0000\u0000\b\u00e8\u0001\u0000\u0000\u0000\n\u00f0"+
		"\u0001\u0000\u0000\u0000\f\u00f2\u0001\u0000\u0000\u0000\u000e\u00f5\u0001"+
		"\u0000\u0000\u0000\u0010\u00f8\u0001\u0000\u0000\u0000\u0012\u00fb\u0001"+
		"\u0000\u0000\u0000\u0014\u0100\u0001\u0000\u0000\u0000\u0016\u010c\u0001"+
		"\u0000\u0000\u0000\u0018\u010f\u0001\u0000\u0000\u0000\u001a\u011b\u0001"+
		"\u0000\u0000\u0000\u001c\u011e\u0001\u0000\u0000\u0000\u001e\u0139\u0001"+
		"\u0000\u0000\u0000 \u013b\u0001\u0000\u0000\u0000\"\u014b\u0001\u0000"+
		"\u0000\u0000$\u014d\u0001\u0000\u0000\u0000&\u0161\u0001\u0000\u0000\u0000"+
		"(\u0163\u0001\u0000\u0000\u0000*\u0166\u0001\u0000\u0000\u0000,\u0170"+
		"\u0001\u0000\u0000\u0000.\u0188\u0001\u0000\u0000\u00000\u018a\u0001\u0000"+
		"\u0000\u00002\u0191\u0001\u0000\u0000\u00004\u01a2\u0001\u0000\u0000\u0000"+
		"6\u01a4\u0001\u0000\u0000\u00008\u01a7\u0001\u0000\u0000\u0000:\u01aa"+
		"\u0001\u0000\u0000\u0000<\u01ad\u0001\u0000\u0000\u0000>\u01b0\u0001\u0000"+
		"\u0000\u0000@\u01b3\u0001\u0000\u0000\u0000B\u01b6\u0001\u0000\u0000\u0000"+
		"D\u01bc\u0001\u0000\u0000\u0000F\u01c0\u0001\u0000\u0000\u0000H\u01c2"+
		"\u0001\u0000\u0000\u0000J\u01d2\u0001\u0000\u0000\u0000L\u01d4\u0001\u0000"+
		"\u0000\u0000N\u01d7\u0001\u0000\u0000\u0000P\u01da\u0001\u0000\u0000\u0000"+
		"R\u01dd\u0001\u0000\u0000\u0000T\u01e0\u0001\u0000\u0000\u0000V\u01e3"+
		"\u0001\u0000\u0000\u0000X\u01eb\u0001\u0000\u0000\u0000Z\u01ed\u0001\u0000"+
		"\u0000\u0000\\\u01fc\u0001\u0000\u0000\u0000^\u01fe\u0001\u0000\u0000"+
		"\u0000`\u0201\u0001\u0000\u0000\u0000b\u0204\u0001\u0000\u0000\u0000d"+
		"\u0214\u0001\u0000\u0000\u0000f\u0216\u0001\u0000\u0000\u0000h\u0219\u0001"+
		"\u0000\u0000\u0000j\u021c\u0001\u0000\u0000\u0000l\u0221\u0001\u0000\u0000"+
		"\u0000n\u022a\u0001\u0000\u0000\u0000p\u022c\u0001\u0000\u0000\u0000r"+
		"\u0232\u0001\u0000\u0000\u0000t\u0234\u0001\u0000\u0000\u0000v\u023b\u0001"+
		"\u0000\u0000\u0000x\u024a\u0001\u0000\u0000\u0000z\u024f\u0001\u0000\u0000"+
		"\u0000|\u0252\u0001\u0000\u0000\u0000~\u027d\u0001\u0000\u0000\u0000\u0080"+
		"\u027f\u0001\u0000\u0000\u0000\u0082\u028d\u0001\u0000\u0000\u0000\u0084"+
		"\u028f\u0001\u0000\u0000\u0000\u0086\u0291\u0001\u0000\u0000\u0000\u0088"+
		"\u0293\u0001\u0000\u0000\u0000\u008a\u0298\u0001\u0000\u0000\u0000\u008c"+
		"\u02a9\u0001\u0000\u0000\u0000\u008e\u02ab\u0001\u0000\u0000\u0000\u0090"+
		"\u02ad\u0001\u0000\u0000\u0000\u0092\u02b5\u0001\u0000\u0000\u0000\u0094"+
		"\u02c0\u0001\u0000\u0000\u0000\u0096\u02c8\u0001\u0000\u0000\u0000\u0098"+
		"\u02ca\u0001\u0000\u0000\u0000\u009a\u02ce\u0001\u0000\u0000\u0000\u009c"+
		"\u02d5\u0001\u0000\u0000\u0000\u009e\u02d7\u0001\u0000\u0000\u0000\u00a0"+
		"\u02db\u0001\u0000\u0000\u0000\u00a2\u02dd\u0001\u0000\u0000\u0000\u00a4"+
		"\u02df\u0001\u0000\u0000\u0000\u00a6\u02e1\u0001\u0000\u0000\u0000\u00a8"+
		"\u02e9\u0001\u0000\u0000\u0000\u00aa\u02f4\u0001\u0000\u0000\u0000\u00ac"+
		"\u02fc\u0001\u0000\u0000\u0000\u00ae\u02fe\u0001\u0000\u0000\u0000\u00b0"+
		"\u0302\u0001\u0000\u0000\u0000\u00b2\u030e\u0001\u0000\u0000\u0000\u00b4"+
		"\u0310\u0001\u0000\u0000\u0000\u00b6\u031a\u0001\u0000\u0000\u0000\u00b8"+
		"\u031f\u0001\u0000\u0000\u0000\u00ba\u032a\u0001\u0000\u0000\u0000\u00bc"+
		"\u032e\u0001\u0000\u0000\u0000\u00be\u0330\u0001\u0000\u0000\u0000\u00c0"+
		"\u0332\u0001\u0000\u0000\u0000\u00c2\u00c5\u0003\u0002\u0001\u0000\u00c3"+
		"\u00c5\u0003\u00aeW\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0000\u0000\u0001\u00ca\u0001\u0001\u0000\u0000\u0000\u00cb\u00cc"+
		"\u0005\u0001\u0000\u0000\u00cc\u00cd\u0003\u00c0`\u0000\u00cd\u00ce\u0003"+
		"\u0004\u0002\u0000\u00ce\u0003\u0001\u0000\u0000\u0000\u00cf\u00d3\u0005"+
		"R\u0000\u0000\u00d0\u00d2\u0003\u0006\u0003\u0000\u00d1\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005S\u0000"+
		"\u0000\u00d7\u0005\u0001\u0000\u0000\u0000\u00d8\u00e7\u0003\b\u0004\u0000"+
		"\u00d9\u00e7\u0003\u0012\t\u0000\u00da\u00e7\u0003\f\u0006\u0000\u00db"+
		"\u00e7\u0003\u000e\u0007\u0000\u00dc\u00e7\u0003\u0010\b\u0000\u00dd\u00e7"+
		"\u0003\u0014\n\u0000\u00de\u00e7\u0003\u0018\f\u0000\u00df\u00e7\u0003"+
		"\u001c\u000e\u0000\u00e0\u00e7\u0003 \u0010\u0000\u00e1\u00e7\u0003*\u0015"+
		"\u0000\u00e2\u00e7\u00030\u0018\u0000\u00e3\u00e7\u0003t:\u0000\u00e4"+
		"\u00e7\u0003$\u0012\u0000\u00e5\u00e7\u0003(\u0014\u0000\u00e6\u00d8\u0001"+
		"\u0000\u0000\u0000\u00e6\u00d9\u0001\u0000\u0000\u0000\u00e6\u00da\u0001"+
		"\u0000\u0000\u0000\u00e6\u00db\u0001\u0000\u0000\u0000\u00e6\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e6\u00dd\u0001\u0000\u0000\u0000\u00e6\u00de\u0001"+
		"\u0000\u0000\u0000\u00e6\u00df\u0001\u0000\u0000\u0000\u00e6\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e1\u0001\u0000\u0000\u0000\u00e6\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e3\u0001\u0000\u0000\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u0007\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u0005\u0005\u0000\u0000\u00e9\u00ea\u0003"+
		"\n\u0005\u0000\u00ea\t\u0001\u0000\u0000\u0000\u00eb\u00ed\u0005\\\u0000"+
		"\u0000\u00ec\u00ee\u0005X\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f1\u0005a\u0000\u0000\u00f0\u00eb\u0001\u0000\u0000\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f1\u000b\u0001\u0000\u0000\u0000\u00f2"+
		"\u00f3\u0005\u0007\u0000\u0000\u00f3\u00f4\u0005a\u0000\u0000\u00f4\r"+
		"\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\b\u0000\u0000\u00f6\u00f7\u0003"+
		"\u00c0`\u0000\u00f7\u000f\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\t"+
		"\u0000\u0000\u00f9\u00fa\u0005\\\u0000\u0000\u00fa\u0011\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fe\u0005\u0006\u0000\u0000\u00fc\u00ff\u0003\u00c0`\u0000"+
		"\u00fd\u00ff\u0005a\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00ff\u0013\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u0005\n\u0000\u0000\u0101\u0102\u0005R\u0000\u0000\u0102\u0107"+
		"\u0003\u0016\u000b\u0000\u0103\u0104\u0005Y\u0000\u0000\u0104\u0106\u0003"+
		"\u0016\u000b\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106\u0109\u0001"+
		"\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107\u0108\u0001"+
		"\u0000\u0000\u0000\u0108\u010a\u0001\u0000\u0000\u0000\u0109\u0107\u0001"+
		"\u0000\u0000\u0000\u010a\u010b\u0005S\u0000\u0000\u010b\u0015\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0005a\u0000\u0000\u010d\u010e\u0005a\u0000\u0000"+
		"\u010e\u0017\u0001\u0000\u0000\u0000\u010f\u0110\u0005\u000b\u0000\u0000"+
		"\u0110\u0111\u0005R\u0000\u0000\u0111\u0116\u0003\u001a\r\u0000\u0112"+
		"\u0113\u0005Y\u0000\u0000\u0113\u0115\u0003\u001a\r\u0000\u0114\u0112"+
		"\u0001\u0000\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119"+
		"\u0001\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011a"+
		"\u0005S\u0000\u0000\u011a\u0019\u0001\u0000\u0000\u0000\u011b\u011c\u0005"+
		"a\u0000\u0000\u011c\u011d\u0005\\\u0000\u0000\u011d\u001b\u0001\u0000"+
		"\u0000\u0000\u011e\u011f\u0005\f\u0000\u0000\u011f\u0120\u0005R\u0000"+
		"\u0000\u0120\u0125\u0003\u001e\u000f\u0000\u0121\u0122\u0005Y\u0000\u0000"+
		"\u0122\u0124\u0003\u001e\u000f\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000"+
		"\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005S\u0000\u0000\u0129"+
		"\u001d\u0001\u0000\u0000\u0000\u012a\u012b\u0005\r\u0000\u0000\u012b\u013a"+
		"\u0005\\\u0000\u0000\u012c\u012d\u0005\u000e\u0000\u0000\u012d\u013a\u0003"+
		"\u00be_\u0000\u012e\u012f\u0005\u000f\u0000\u0000\u012f\u0130\u0005V\u0000"+
		"\u0000\u0130\u0135\u0005\\\u0000\u0000\u0131\u0132\u0005Y\u0000\u0000"+
		"\u0132\u0134\u0005\\\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0134"+
		"\u0137\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137"+
		"\u0135\u0001\u0000\u0000\u0000\u0138\u013a\u0005W\u0000\u0000\u0139\u012a"+
		"\u0001\u0000\u0000\u0000\u0139\u012c\u0001\u0000\u0000\u0000\u0139\u012e"+
		"\u0001\u0000\u0000\u0000\u013a\u001f\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0005\u0010\u0000\u0000\u013c\u013d\u0005R\u0000\u0000\u013d\u0142\u0003"+
		"\"\u0011\u0000\u013e\u013f\u0005Y\u0000\u0000\u013f\u0141\u0003\"\u0011"+
		"\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000"+
		"\u0000\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000"+
		"\u0000\u0143\u0145\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000"+
		"\u0000\u0145\u0146\u0005S\u0000\u0000\u0146!\u0001\u0000\u0000\u0000\u0147"+
		"\u0148\u0005\u0019\u0000\u0000\u0148\u014c\u0005a\u0000\u0000\u0149\u014a"+
		"\u0005\u0011\u0000\u0000\u014a\u014c\u0005\\\u0000\u0000\u014b\u0147\u0001"+
		"\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c#\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005!\u0000\u0000\u014e\u014f\u0005R\u0000\u0000"+
		"\u014f\u0154\u0003&\u0013\u0000\u0150\u0151\u0005Y\u0000\u0000\u0151\u0153"+
		"\u0003&\u0013\u0000\u0152\u0150\u0001\u0000\u0000\u0000\u0153\u0156\u0001"+
		"\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155\u0001"+
		"\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0157\u0158\u0005S\u0000\u0000\u0158%\u0001\u0000\u0000"+
		"\u0000\u0159\u015a\u0005\u0019\u0000\u0000\u015a\u0162\u0005a\u0000\u0000"+
		"\u015b\u015c\u0005\u0012\u0000\u0000\u015c\u0162\u0003\u00c0`\u0000\u015d"+
		"\u015e\u0005>\u0000\u0000\u015e\u0162\u0005\\\u0000\u0000\u015f\u0160"+
		"\u0005\u0013\u0000\u0000\u0160\u0162\u0003\u00bc^\u0000\u0161\u0159\u0001"+
		"\u0000\u0000\u0000\u0161\u015b\u0001\u0000\u0000\u0000\u0161\u015d\u0001"+
		"\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000\u0000\u0162\'\u0001\u0000"+
		"\u0000\u0000\u0163\u0164\u0005\u0014\u0000\u0000\u0164\u0165\u0003\u00b8"+
		"\\\u0000\u0165)\u0001\u0000\u0000\u0000\u0166\u0167\u0005\u0015\u0000"+
		"\u0000\u0167\u016b\u0005R\u0000\u0000\u0168\u016a\u0003,\u0016\u0000\u0169"+
		"\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000\u0000\u0000\u016b"+
		"\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c"+
		"\u016e\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000\u0000\u016e"+
		"\u016f\u0005S\u0000\u0000\u016f+\u0001\u0000\u0000\u0000\u0170\u0173\u0005"+
		"\u0016\u0000\u0000\u0171\u0174\u0003\u00c0`\u0000\u0172\u0174\u0005a\u0000"+
		"\u0000\u0173\u0171\u0001\u0000\u0000\u0000\u0173\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0176\u0001\u0000\u0000\u0000\u0175\u0177\u0003.\u0017\u0000"+
		"\u0176\u0175\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u0176\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000"+
		"\u0179-\u0001\u0000\u0000\u0000\u017a\u017b\u0005\u0017\u0000\u0000\u017b"+
		"\u017d\u0005a\u0000\u0000\u017c\u017e\u0003\u00a6S\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u0189\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0005\u0018\u0000\u0000\u0180\u0182\u0005"+
		"a\u0000\u0000\u0181\u0183\u0003\u00a6S\u0000\u0182\u0181\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0189\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0005\u0019\u0000\u0000\u0185\u0189\u0005a\u0000\u0000"+
		"\u0186\u0187\u0005\u001a\u0000\u0000\u0187\u0189\u0003\u00a6S\u0000\u0188"+
		"\u017a\u0001\u0000\u0000\u0000\u0188\u017f\u0001\u0000\u0000\u0000\u0188"+
		"\u0184\u0001\u0000\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189"+
		"/\u0001\u0000\u0000\u0000\u018a\u018b\u0005\u001b\u0000\u0000\u018b\u018d"+
		"\u0005\\\u0000\u0000\u018c\u018e\u0003\u00c0`\u0000\u018d\u018c\u0001"+
		"\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u018f\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u00032\u0019\u0000\u01901\u0001\u0000\u0000"+
		"\u0000\u0191\u0195\u0005R\u0000\u0000\u0192\u0194\u00034\u001a\u0000\u0193"+
		"\u0192\u0001\u0000\u0000\u0000\u0194\u0197\u0001\u0000\u0000\u0000\u0195"+
		"\u0193\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000\u0196"+
		"\u0198\u0001\u0000\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000\u0198"+
		"\u0199\u0005S\u0000\u0000\u01993\u0001\u0000\u0000\u0000\u019a\u01a3\u0003"+
		"6\u001b\u0000\u019b\u01a3\u00038\u001c\u0000\u019c\u01a3\u0003:\u001d"+
		"\u0000\u019d\u01a3\u0003<\u001e\u0000\u019e\u01a3\u0003>\u001f\u0000\u019f"+
		"\u01a3\u0003@ \u0000\u01a0\u01a3\u0003B!\u0000\u01a1\u01a3\u0003D\"\u0000"+
		"\u01a2\u019a\u0001\u0000\u0000\u0000\u01a2\u019b\u0001\u0000\u0000\u0000"+
		"\u01a2\u019c\u0001\u0000\u0000\u0000\u01a2\u019d\u0001\u0000\u0000\u0000"+
		"\u01a2\u019e\u0001\u0000\u0000\u0000\u01a2\u019f\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a35\u0001\u0000\u0000\u0000\u01a4\u01a5\u0005\u001c\u0000\u0000\u01a5"+
		"\u01a6\u0005a\u0000\u0000\u01a67\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005"+
		"\u0007\u0000\u0000\u01a8\u01a9\u0005a\u0000\u0000\u01a99\u0001\u0000\u0000"+
		"\u0000\u01aa\u01ab\u0005\u001d\u0000\u0000\u01ab\u01ac\u0005a\u0000\u0000"+
		"\u01ac;\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u001e\u0000\u0000\u01ae"+
		"\u01af\u0005a\u0000\u0000\u01af=\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005"+
		"\u001f\u0000\u0000\u01b1\u01b2\u0005\\\u0000\u0000\u01b2?\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0005 \u0000\u0000\u01b4\u01b5\u0005a\u0000\u0000"+
		"\u01b5A\u0001\u0000\u0000\u0000\u01b6\u01ba\u0005!\u0000\u0000\u01b7\u01bb"+
		"\u0005a\u0000\u0000\u01b8\u01bb\u0005\"\u0000\u0000\u01b9\u01bb\u0003"+
		"\u00c0`\u0000\u01ba\u01b7\u0001\u0000\u0000\u0000\u01ba\u01b8\u0001\u0000"+
		"\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01bbC\u0001\u0000\u0000"+
		"\u0000\u01bc\u01bd\u0005#\u0000\u0000\u01bd\u01be\u0003F#\u0000\u01be"+
		"\u01bf\u0003H$\u0000\u01bfE\u0001\u0000\u0000\u0000\u01c0\u01c1\u0007"+
		"\u0000\u0000\u0000\u01c1G\u0001\u0000\u0000\u0000\u01c2\u01c6\u0005R\u0000"+
		"\u0000\u01c3\u01c5\u0003J%\u0000\u01c4\u01c3\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c6\u01c4\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u0001\u0000\u0000\u0000\u01c7\u01c9\u0001\u0000\u0000\u0000\u01c8"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c9\u01ca\u0005S\u0000\u0000\u01caI\u0001"+
		"\u0000\u0000\u0000\u01cb\u01d3\u0003L&\u0000\u01cc\u01d3\u0003N\'\u0000"+
		"\u01cd\u01d3\u0003P(\u0000\u01ce\u01d3\u0003R)\u0000\u01cf\u01d3\u0003"+
		"T*\u0000\u01d0\u01d3\u0003V+\u0000\u01d1\u01d3\u0003j5\u0000\u01d2\u01cb"+
		"\u0001\u0000\u0000\u0000\u01d2\u01cc\u0001\u0000\u0000\u0000\u01d2\u01cd"+
		"\u0001\u0000\u0000\u0000\u01d2\u01ce\u0001\u0000\u0000\u0000\u01d2\u01cf"+
		"\u0001\u0000\u0000\u0000\u01d2\u01d0\u0001\u0000\u0000\u0000\u01d2\u01d1"+
		"\u0001\u0000\u0000\u0000\u01d3K\u0001\u0000\u0000\u0000\u01d4\u01d5\u0005"+
		"$\u0000\u0000\u01d5\u01d6\u0005\\\u0000\u0000\u01d6M\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0005%\u0000\u0000\u01d8\u01d9\u0005\\\u0000\u0000"+
		"\u01d9O\u0001\u0000\u0000\u0000\u01da\u01db\u0005&\u0000\u0000\u01db\u01dc"+
		"\u0005\\\u0000\u0000\u01dcQ\u0001\u0000\u0000\u0000\u01dd\u01de\u0005"+
		"\'\u0000\u0000\u01de\u01df\u0005\\\u0000\u0000\u01dfS\u0001\u0000\u0000"+
		"\u0000\u01e0\u01e1\u0005(\u0000\u0000\u01e1\u01e2\u0005\\\u0000\u0000"+
		"\u01e2U\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005)\u0000\u0000\u01e4\u01e6"+
		"\u0003X,\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000"+
		"\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7\u01e8\u0003Z-\u0000"+
		"\u01e8W\u0001\u0000\u0000\u0000\u01e9\u01ec\u0003\u00c0`\u0000\u01ea\u01ec"+
		"\u0005`\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ecY\u0001\u0000\u0000\u0000\u01ed\u01f1\u0005R\u0000"+
		"\u0000\u01ee\u01f0\u0003\\.\u0000\u01ef\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f0\u01f3\u0001\u0000\u0000\u0000\u01f1\u01ef\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\u01f4\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f1\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005S\u0000\u0000\u01f5"+
		"[\u0001\u0000\u0000\u0000\u01f6\u01fd\u0003^/\u0000\u01f7\u01fd\u0003"+
		"`0\u0000\u01f8\u01fd\u0003b1\u0000\u01f9\u01fa\u00051\u0000\u0000\u01fa"+
		"\u01fd\u0003|>\u0000\u01fb\u01fd\u0003~?\u0000\u01fc\u01f6\u0001\u0000"+
		"\u0000\u0000\u01fc\u01f7\u0001\u0000\u0000\u0000\u01fc\u01f8\u0001\u0000"+
		"\u0000\u0000\u01fc\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fd]\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005*\u0000\u0000"+
		"\u01ff\u0200\u0005a\u0000\u0000\u0200_\u0001\u0000\u0000\u0000\u0201\u0202"+
		"\u0005+\u0000\u0000\u0202\u0203\u0003\u008eG\u0000\u0203a\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0005,\u0000\u0000\u0205\u0209\u0005R\u0000\u0000"+
		"\u0206\u0208\u0003d2\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208\u020b"+
		"\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000\u0000\u0209\u020a"+
		"\u0001\u0000\u0000\u0000\u020a\u020c\u0001\u0000\u0000\u0000\u020b\u0209"+
		"\u0001\u0000\u0000\u0000\u020c\u020d\u0005S\u0000\u0000\u020dc\u0001\u0000"+
		"\u0000\u0000\u020e\u0215\u0003f3\u0000\u020f\u0215\u0003h4\u0000\u0210"+
		"\u0215\u0003`0\u0000\u0211\u0212\u00051\u0000\u0000\u0212\u0215\u0003"+
		"|>\u0000\u0213\u0215\u0003~?\u0000\u0214\u020e\u0001\u0000\u0000\u0000"+
		"\u0214\u020f\u0001\u0000\u0000\u0000\u0214\u0210\u0001\u0000\u0000\u0000"+
		"\u0214\u0211\u0001\u0000\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000"+
		"\u0215e\u0001\u0000\u0000\u0000\u0216\u0217\u0005-\u0000\u0000\u0217\u0218"+
		"\u0005\\\u0000\u0000\u0218g\u0001\u0000\u0000\u0000\u0219\u021a\u0005"+
		".\u0000\u0000\u021a\u021b\u0003\u00bc^\u0000\u021bi\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0005/\u0000\u0000\u021d\u021e\u0005\\\u0000\u0000"+
		"\u021e\u021f\u0005a\u0000\u0000\u021f\u0220\u0003l6\u0000\u0220k\u0001"+
		"\u0000\u0000\u0000\u0221\u0225\u0005R\u0000\u0000\u0222\u0224\u0003n7"+
		"\u0000\u0223\u0222\u0001\u0000\u0000\u0000\u0224\u0227\u0001\u0000\u0000"+
		"\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
		"\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0225\u0001\u0000\u0000"+
		"\u0000\u0228\u0229\u0005S\u0000\u0000\u0229m\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0003p8\u0000\u022bo\u0001\u0000\u0000\u0000\u022c\u022e\u0005"+
		")\u0000\u0000\u022d\u022f\u0003r9\u0000\u022e\u022d\u0001\u0000\u0000"+
		"\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0003Z-\u0000\u0231q\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u0003\u00c0`\u0000\u0233s\u0001\u0000\u0000\u0000\u0234\u0235\u0005"+
		"0\u0000\u0000\u0235\u0237\u0005a\u0000\u0000\u0236\u0238\u0003\u00c0`"+
		"\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u023a\u0003v;\u0000\u023a"+
		"u\u0001\u0000\u0000\u0000\u023b\u023f\u0005R\u0000\u0000\u023c\u023e\u0003"+
		"x<\u0000\u023d\u023c\u0001\u0000\u0000\u0000\u023e\u0241\u0001\u0000\u0000"+
		"\u0000\u023f\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000"+
		"\u0000\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000"+
		"\u0000\u0242\u0243\u0005S\u0000\u0000\u0243w\u0001\u0000\u0000\u0000\u0244"+
		"\u024b\u0003^/\u0000\u0245\u024b\u0003`0\u0000\u0246\u0247\u00051\u0000"+
		"\u0000\u0247\u024b\u0003|>\u0000\u0248\u024b\u0003~?\u0000\u0249\u024b"+
		"\u0003b1\u0000\u024a\u0244\u0001\u0000\u0000\u0000\u024a\u0245\u0001\u0000"+
		"\u0000\u0000\u024a\u0246\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000"+
		"\u0000\u0000\u024a\u0249\u0001\u0000\u0000\u0000\u024by\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u00051\u0000\u0000\u024d\u0250\u0003|>\u0000\u024e"+
		"\u0250\u0003~?\u0000\u024f\u024c\u0001\u0000\u0000\u0000\u024f\u024e\u0001"+
		"\u0000\u0000\u0000\u0250{\u0001\u0000\u0000\u0000\u0251\u0253\u0003\u0080"+
		"@\u0000\u0252\u0251\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000"+
		"\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0003\u0082A\u0000"+
		"\u0255\u0256\u0003\u008aE\u0000\u0256}\u0001\u0000\u0000\u0000\u0257\u0259"+
		"\u0003\u0080@\u0000\u0258\u0257\u0001\u0000\u0000\u0000\u0258\u0259\u0001"+
		"\u0000\u0000\u0000\u0259\u025a\u0001\u0000\u0000\u0000\u025a\u025b\u0005"+
		"2\u0000\u0000\u025b\u025d\u0003\u0086C\u0000\u025c\u025e\u0003\u0084B"+
		"\u0000\u025d\u025c\u0001\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u0263\u0003\u00a6S\u0000"+
		"\u0260\u0262\u0003\u008cF\u0000\u0261\u0260\u0001\u0000\u0000\u0000\u0262"+
		"\u0265\u0001\u0000\u0000\u0000\u0263\u0261\u0001\u0000\u0000\u0000\u0263"+
		"\u0264\u0001\u0000\u0000\u0000\u0264\u027e\u0001\u0000\u0000\u0000\u0265"+
		"\u0263\u0001\u0000\u0000\u0000\u0266\u0268\u0003\u0080@\u0000\u0267\u0266"+
		"\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269"+
		"\u0001\u0000\u0000\u0000\u0269\u026a\u00053\u0000\u0000\u026a\u026c\u0003"+
		"\u0086C\u0000\u026b\u026d\u0003\u00a6S\u0000\u026c\u026b\u0001\u0000\u0000"+
		"\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0271\u0001\u0000\u0000"+
		"\u0000\u026e\u0270\u0003\u008cF\u0000\u026f\u026e\u0001\u0000\u0000\u0000"+
		"\u0270\u0273\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u027e\u0001\u0000\u0000\u0000"+
		"\u0273\u0271\u0001\u0000\u0000\u0000\u0274\u0275\u00054\u0000\u0000\u0275"+
		"\u0276\u0007\u0001\u0000\u0000\u0276\u027a\u0003\u00a6S\u0000\u0277\u0279"+
		"\u0003\u008cF\u0000\u0278\u0277\u0001\u0000\u0000\u0000\u0279\u027c\u0001"+
		"\u0000\u0000\u0000\u027a\u0278\u0001\u0000\u0000\u0000\u027a\u027b\u0001"+
		"\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a\u0001"+
		"\u0000\u0000\u0000\u027d\u0258\u0001\u0000\u0000\u0000\u027d\u0267\u0001"+
		"\u0000\u0000\u0000\u027d\u0274\u0001\u0000\u0000\u0000\u027e\u007f\u0001"+
		"\u0000\u0000\u0000\u027f\u0280\u0007\u0002\u0000\u0000\u0280\u0081\u0001"+
		"\u0000\u0000\u0000\u0281\u0282\u00052\u0000\u0000\u0282\u0284\u0003\u0086"+
		"C\u0000\u0283\u0285\u0003\u0084B\u0000\u0284\u0283\u0001\u0000\u0000\u0000"+
		"\u0284\u0285\u0001\u0000\u0000\u0000\u0285\u0286\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0003\u0088D\u0000\u0287\u028e\u0001\u0000\u0000\u0000\u0288"+
		"\u0289\u00053\u0000\u0000\u0289\u028e\u0003\u0086C\u0000\u028a\u028b\u0005"+
		"4\u0000\u0000\u028b\u028c\u0007\u0001\u0000\u0000\u028c\u028e\u0003\u0088"+
		"D\u0000\u028d\u0281\u0001\u0000\u0000\u0000\u028d\u0288\u0001\u0000\u0000"+
		"\u0000\u028d\u028a\u0001\u0000\u0000\u0000\u028e\u0083\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0005a\u0000\u0000\u0290\u0085\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0005a\u0000\u0000\u0292\u0087\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0003\u00a4R\u0000\u0294\u0089\u0001\u0000\u0000\u0000\u0295\u0297"+
		"\u0003\u008cF\u0000\u0296\u0295\u0001\u0000\u0000\u0000\u0297\u029a\u0001"+
		"\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000\u0000\u0298\u0299\u0001"+
		"\u0000\u0000\u0000\u0299\u008b\u0001\u0000\u0000\u0000\u029a\u0298\u0001"+
		"\u0000\u0000\u0000\u029b\u029c\u00058\u0000\u0000\u029c\u02aa\u0003\u00a6"+
		"S\u0000\u029d\u029e\u00059\u0000\u0000\u029e\u02aa\u0003\u00a6S\u0000"+
		"\u029f\u02a0\u0005:\u0000\u0000\u02a0\u02aa\u0003\u00a6S\u0000\u02a1\u02a2"+
		"\u0005;\u0000\u0000\u02a2\u02aa\u0003\u00bc^\u0000\u02a3\u02a4\u0005<"+
		"\u0000\u0000\u02a4\u02aa\u0003\u00a6S\u0000\u02a5\u02a6\u0005=\u0000\u0000"+
		"\u02a6\u02aa\u0003\u0080@\u0000\u02a7\u02a8\u0005>\u0000\u0000\u02a8\u02aa"+
		"\u0005\\\u0000\u0000\u02a9\u029b\u0001\u0000\u0000\u0000\u02a9\u029d\u0001"+
		"\u0000\u0000\u0000\u02a9\u029f\u0001\u0000\u0000\u0000\u02a9\u02a1\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a3\u0001\u0000\u0000\u0000\u02a9\u02a5\u0001"+
		"\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000\u0000\u0000\u02aa\u008d\u0001"+
		"\u0000\u0000\u0000\u02ab\u02ac\u0003\u0090H\u0000\u02ac\u008f\u0001\u0000"+
		"\u0000\u0000\u02ad\u02b2\u0003\u0092I\u0000\u02ae\u02af\u0005L\u0000\u0000"+
		"\u02af\u02b1\u0003\u0092I\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1"+
		"\u02b4\u0001\u0000\u0000\u0000\u02b2\u02b0\u0001\u0000\u0000\u0000\u02b2"+
		"\u02b3\u0001\u0000\u0000\u0000\u02b3\u0091\u0001\u0000\u0000\u0000\u02b4"+
		"\u02b2\u0001\u0000\u0000\u0000\u02b5\u02ba\u0003\u0094J\u0000\u02b6\u02b7"+
		"\u0005K\u0000\u0000\u02b7\u02b9\u0003\u0094J\u0000\u02b8\u02b6\u0001\u0000"+
		"\u0000\u0000\u02b9\u02bc\u0001\u0000\u0000\u0000\u02ba\u02b8\u0001\u0000"+
		"\u0000\u0000\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u0093\u0001\u0000"+
		"\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000\u0000\u02bd\u02be\u0005M\u0000"+
		"\u0000\u02be\u02c1\u0003\u0094J\u0000\u02bf\u02c1\u0003\u0096K\u0000\u02c0"+
		"\u02bd\u0001\u0000\u0000\u0000\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c1"+
		"\u0095\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005T\u0000\u0000\u02c3\u02c4"+
		"\u0003\u008eG\u0000\u02c4\u02c5\u0005U\u0000\u0000\u02c5\u02c9\u0001\u0000"+
		"\u0000\u0000\u02c6\u02c9\u0003\u0098L\u0000\u02c7\u02c9\u0003\u009aM\u0000"+
		"\u02c8\u02c2\u0001\u0000\u0000\u0000\u02c8\u02c6\u0001\u0000\u0000\u0000"+
		"\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u0097\u0001\u0000\u0000\u0000"+
		"\u02ca\u02cb\u0003\u009cN\u0000\u02cb\u02cc\u0003\u00a2Q\u0000\u02cc\u02cd"+
		"\u0003\u009cN\u0000\u02cd\u0099\u0001\u0000\u0000\u0000\u02ce\u02cf\u0003"+
		"\u009cN\u0000\u02cf\u009b\u0001\u0000\u0000\u0000\u02d0\u02d1\u0003\u009e"+
		"O\u0000\u02d1\u02d2\u0005[\u0000\u0000\u02d2\u02d3\u0003\u00a0P\u0000"+
		"\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d6\u0003\u00a0P\u0000\u02d5"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d5\u02d4\u0001\u0000\u0000\u0000\u02d6"+
		"\u009d\u0001\u0000\u0000\u0000\u02d7\u02d8\u0007\u0002\u0000\u0000\u02d8"+
		"\u009f\u0001\u0000\u0000\u0000\u02d9\u02dc\u0005a\u0000\u0000\u02da\u02dc"+
		"\u0003\u00be_\u0000\u02db\u02d9\u0001\u0000\u0000\u0000\u02db\u02da\u0001"+
		"\u0000\u0000\u0000\u02dc\u00a1\u0001\u0000\u0000\u0000\u02dd\u02de\u0007"+
		"\u0003\u0000\u0000\u02de\u00a3\u0001\u0000\u0000\u0000\u02df\u02e0\u0003"+
		"\u00a6S\u0000\u02e0\u00a5\u0001\u0000\u0000\u0000\u02e1\u02e6\u0003\u00a8"+
		"T\u0000\u02e2\u02e3\u0007\u0004\u0000\u0000\u02e3\u02e5\u0003\u00a8T\u0000"+
		"\u02e4\u02e2\u0001\u0000\u0000\u0000\u02e5\u02e8\u0001\u0000\u0000\u0000"+
		"\u02e6\u02e4\u0001\u0000\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000"+
		"\u02e7\u00a7\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e9\u02ee\u0003\u00aaU\u0000\u02ea\u02eb\u0007\u0005\u0000\u0000\u02eb"+
		"\u02ed\u0003\u00aaU\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ed\u02f0"+
		"\u0001\u0000\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ef"+
		"\u0001\u0000\u0000\u0000\u02ef\u00a9\u0001\u0000\u0000\u0000\u02f0\u02ee"+
		"\u0001\u0000\u0000\u0000\u02f1\u02f2\u0007\u0004\u0000\u0000\u02f2\u02f5"+
		"\u0003\u00aaU\u0000\u02f3\u02f5\u0003\u00acV\u0000\u02f4\u02f1\u0001\u0000"+
		"\u0000\u0000\u02f4\u02f3\u0001\u0000\u0000\u0000\u02f5\u00ab\u0001\u0000"+
		"\u0000\u0000\u02f6\u02fd\u0003\u00be_\u0000\u02f7\u02fd\u0003\u009cN\u0000"+
		"\u02f8\u02f9\u0005T\u0000\u0000\u02f9\u02fa\u0003\u00a4R\u0000\u02fa\u02fb"+
		"\u0005U\u0000\u0000\u02fb\u02fd\u0001\u0000\u0000\u0000\u02fc\u02f6\u0001"+
		"\u0000\u0000\u0000\u02fc\u02f7\u0001\u0000\u0000\u0000\u02fc\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fd\u00ad\u0001\u0000\u0000\u0000\u02fe\u02ff\u0005"+
		"\u0002\u0000\u0000\u02ff\u0300\u0003\u00c0`\u0000\u0300\u0301\u0003\u00b0"+
		"X\u0000\u0301\u00af\u0001\u0000\u0000\u0000\u0302\u0306\u0005R\u0000\u0000"+
		"\u0303\u0305\u0003\u00b2Y\u0000\u0304\u0303\u0001\u0000\u0000\u0000\u0305"+
		"\u0308\u0001\u0000\u0000\u0000\u0306\u0304\u0001\u0000\u0000\u0000\u0306"+
		"\u0307\u0001\u0000\u0000\u0000\u0307\u0309\u0001\u0000\u0000\u0000\u0308"+
		"\u0306\u0001\u0000\u0000\u0000\u0309\u030a\u0005S\u0000\u0000\u030a\u00b1"+
		"\u0001\u0000\u0000\u0000\u030b\u030f\u0003\u00b4Z\u0000\u030c\u030f\u0003"+
		"*\u0015\u0000\u030d\u030f\u0003(\u0014\u0000\u030e\u030b\u0001\u0000\u0000"+
		"\u0000\u030e\u030c\u0001\u0000\u0000\u0000\u030e\u030d\u0001\u0000\u0000"+
		"\u0000\u030f\u00b3\u0001\u0000\u0000\u0000\u0310\u0311\u0005\u0003\u0000"+
		"\u0000\u0311\u0315\u0005R\u0000\u0000\u0312\u0314\u0003\u00b6[\u0000\u0313"+
		"\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001\u0000\u0000\u0000\u0315"+
		"\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001\u0000\u0000\u0000\u0316"+
		"\u0318\u0001\u0000\u0000\u0000\u0317\u0315\u0001\u0000\u0000\u0000\u0318"+
		"\u0319\u0005S\u0000\u0000\u0319\u00b5\u0001\u0000\u0000\u0000\u031a\u031d"+
		"\u0005\u0004\u0000\u0000\u031b\u031e\u0003\u00c0`\u0000\u031c\u031e\u0005"+
		"a\u0000\u0000\u031d\u031b\u0001\u0000\u0000\u0000\u031d\u031c\u0001\u0000"+
		"\u0000\u0000\u031e\u00b7\u0001\u0000\u0000\u0000\u031f\u0320\u0005R\u0000"+
		"\u0000\u0320\u0325\u0003\u00ba]\u0000\u0321\u0322\u0005Y\u0000\u0000\u0322"+
		"\u0324\u0003\u00ba]\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0324\u0327"+
		"\u0001\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326"+
		"\u0001\u0000\u0000\u0000\u0326\u0328\u0001\u0000\u0000\u0000\u0327\u0325"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0005S\u0000\u0000\u0329\u00b9\u0001"+
		"\u0000\u0000\u0000\u032a\u032b\u0005a\u0000\u0000\u032b\u032c\u0005Z\u0000"+
		"\u0000\u032c\u032d\u0003\u00a4R\u0000\u032d\u00bb\u0001\u0000\u0000\u0000"+
		"\u032e\u032f\u0007\u0006\u0000\u0000\u032f\u00bd\u0001\u0000\u0000\u0000"+
		"\u0330\u0331\u0007\u0007\u0000\u0000\u0331\u00bf\u0001\u0000\u0000\u0000"+
		"\u0332\u0333\u0005`\u0000\u0000\u0333\u00c1\u0001\u0000\u0000\u0000D\u00c4"+
		"\u00c6\u00d3\u00e6\u00ed\u00f0\u00fe\u0107\u0116\u0125\u0135\u0139\u0142"+
		"\u014b\u0154\u0161\u016b\u0173\u0178\u017d\u0182\u0188\u018d\u0195\u01a2"+
		"\u01ba\u01c6\u01d2\u01e5\u01eb\u01f1\u01fc\u0209\u0214\u0225\u022e\u0237"+
		"\u023f\u024a\u024f\u0252\u0258\u025d\u0263\u0267\u026c\u0271\u027a\u027d"+
		"\u0284\u028d\u0298\u02a9\u02b2\u02ba\u02c0\u02c8\u02d5\u02db\u02e6\u02ee"+
		"\u02f4\u02fc\u0306\u030e\u0315\u031d\u0325";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}