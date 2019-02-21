// Generated from D:/git/BibleReferenceRecognition\Scripture.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ScriptureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NAME=7, DIGIT=8, NEWLINE=9, 
		WS=10;
	public static final int
		RULE_prog = 0, RULE_scripture = 1, RULE_book = 2, RULE_reference = 3, 
		RULE_addr = 4, RULE_addrverse = 5, RULE_chapter = 6, RULE_verselist = 7, 
		RULE_verse = 8, RULE_translation = 9, RULE_ordinal = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "scripture", "book", "reference", "addr", "addrverse", "chapter", 
			"verselist", "verse", "translation", "ordinal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':'", "'--'", "','", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "NAME", "DIGIT", "NEWLINE", 
			"WS"
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
	public String getGrammarFileName() { return "Scripture.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ScriptureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ScriptureParser.EOF, 0); }
		public List<ScriptureContext> scripture() {
			return getRuleContexts(ScriptureContext.class);
		}
		public ScriptureContext scripture(int i) {
			return getRuleContext(ScriptureContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				scripture();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << DIGIT) | (1L << NEWLINE))) != 0) );
			setState(27);
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

	public static class ScriptureContext extends ParserRuleContext {
		public BookContext book() {
			return getRuleContext(BookContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TranslationContext translation() {
			return getRuleContext(TranslationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(ScriptureParser.NEWLINE, 0); }
		public ScriptureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scripture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterScripture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitScripture(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitScripture(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptureContext scripture() throws RecognitionException {
		ScriptureContext _localctx = new ScriptureContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_scripture);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				book();
				setState(30);
				reference();
				setState(31);
				translation();
				setState(32);
				match(NEWLINE);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				match(NEWLINE);
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

	public static class BookContext extends ParserRuleContext {
		public OrdinalContext ordinal() {
			return getRuleContext(OrdinalContext.class,0);
		}
		public TerminalNode NAME() { return getToken(ScriptureParser.NAME, 0); }
		public BookContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_book; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterBook(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitBook(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitBook(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BookContext book() throws RecognitionException {
		BookContext _localctx = new BookContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_book);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			ordinal();
			setState(38);
			match(NAME);
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

	public static class ReferenceContext extends ParserRuleContext {
		public AddrContext addr() {
			return getRuleContext(AddrContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitReference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReferenceContext reference() throws RecognitionException {
		ReferenceContext _localctx = new ReferenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reference);
		try {
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				addr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				addr();
				setState(42);
				match(T__0);
				setState(43);
				reference();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AddrContext extends ParserRuleContext {
		public ChapterContext chapter() {
			return getRuleContext(ChapterContext.class,0);
		}
		public VerselistContext verselist() {
			return getRuleContext(VerselistContext.class,0);
		}
		public List<AddrverseContext> addrverse() {
			return getRuleContexts(AddrverseContext.class);
		}
		public AddrverseContext addrverse(int i) {
			return getRuleContext(AddrverseContext.class,i);
		}
		public AddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterAddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitAddr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitAddr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddrContext addr() throws RecognitionException {
		AddrContext _localctx = new AddrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_addr);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				chapter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				chapter();
				setState(50);
				match(T__1);
				setState(51);
				verselist();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				addrverse();
				setState(54);
				match(T__2);
				setState(55);
				addrverse();
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

	public static class AddrverseContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ScriptureParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ScriptureParser.DIGIT, i);
		}
		public AddrverseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrverse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterAddrverse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitAddrverse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitAddrverse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddrverseContext addrverse() throws RecognitionException {
		AddrverseContext _localctx = new AddrverseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_addrverse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(DIGIT);
			setState(60);
			match(T__1);
			setState(61);
			match(DIGIT);
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

	public static class ChapterContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ScriptureParser.DIGIT, 0); }
		public ChapterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chapter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterChapter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitChapter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitChapter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChapterContext chapter() throws RecognitionException {
		ChapterContext _localctx = new ChapterContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_chapter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(DIGIT);
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

	public static class VerselistContext extends ParserRuleContext {
		public VerseContext verse() {
			return getRuleContext(VerseContext.class,0);
		}
		public VerselistContext verselist() {
			return getRuleContext(VerselistContext.class,0);
		}
		public VerselistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verselist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterVerselist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitVerselist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitVerselist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerselistContext verselist() throws RecognitionException {
		VerselistContext _localctx = new VerselistContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_verselist);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				verse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				verse();
				setState(67);
				match(T__3);
				setState(68);
				verselist();
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

	public static class VerseContext extends ParserRuleContext {
		public List<TerminalNode> DIGIT() { return getTokens(ScriptureParser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(ScriptureParser.DIGIT, i);
		}
		public VerseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterVerse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitVerse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitVerse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerseContext verse() throws RecognitionException {
		VerseContext _localctx = new VerseContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_verse);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(DIGIT);
				setState(74);
				match(T__2);
				setState(75);
				match(DIGIT);
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

	public static class TranslationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(ScriptureParser.NAME, 0); }
		public TranslationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterTranslation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitTranslation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitTranslation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationContext translation() throws RecognitionException {
		TranslationContext _localctx = new TranslationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_translation);
		try {
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(T__4);
				setState(79);
				match(NAME);
				setState(80);
				match(T__5);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class OrdinalContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(ScriptureParser.DIGIT, 0); }
		public OrdinalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordinal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).enterOrdinal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ScriptureListener ) ((ScriptureListener)listener).exitOrdinal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ScriptureVisitor ) return ((ScriptureVisitor<? extends T>)visitor).visitOrdinal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrdinalContext ordinal() throws RecognitionException {
		OrdinalContext _localctx = new OrdinalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ordinal);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(DIGIT);
				}
				break;
			case NAME:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\5\tI\n\t\3\n\3\n\3\n\3\n\5\nO\n\n\3\13\3\13\3\13\3\13\5\13U\n\13\3"+
		"\f\3\f\5\fY\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\2Y\2\31\3\2\2"+
		"\2\4%\3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\n;\3\2\2\2\f=\3\2\2\2\16A\3\2\2"+
		"\2\20H\3\2\2\2\22N\3\2\2\2\24T\3\2\2\2\26X\3\2\2\2\30\32\5\4\3\2\31\30"+
		"\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36"+
		"\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2 !\5\b\5\2!\"\5\24\13\2\"#\7\13\2\2#"+
		"&\3\2\2\2$&\7\13\2\2%\37\3\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\5\26\f\2()\7"+
		"\t\2\2)\7\3\2\2\2*\61\5\n\6\2+,\5\n\6\2,-\7\3\2\2-.\5\b\5\2.\61\3\2\2"+
		"\2/\61\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60/\3\2\2\2\61\t\3\2\2\2\62<\5"+
		"\16\b\2\63\64\5\16\b\2\64\65\7\4\2\2\65\66\5\20\t\2\66<\3\2\2\2\678\5"+
		"\f\7\289\7\5\2\29:\5\f\7\2:<\3\2\2\2;\62\3\2\2\2;\63\3\2\2\2;\67\3\2\2"+
		"\2<\13\3\2\2\2=>\7\n\2\2>?\7\4\2\2?@\7\n\2\2@\r\3\2\2\2AB\7\n\2\2B\17"+
		"\3\2\2\2CI\5\22\n\2DE\5\22\n\2EF\7\6\2\2FG\5\20\t\2GI\3\2\2\2HC\3\2\2"+
		"\2HD\3\2\2\2I\21\3\2\2\2JO\7\n\2\2KL\7\n\2\2LM\7\5\2\2MO\7\n\2\2NJ\3\2"+
		"\2\2NK\3\2\2\2O\23\3\2\2\2PQ\7\7\2\2QR\7\t\2\2RU\7\b\2\2SU\3\2\2\2TP\3"+
		"\2\2\2TS\3\2\2\2U\25\3\2\2\2VY\7\n\2\2WY\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y"+
		"\27\3\2\2\2\n\33%\60;HNTX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}