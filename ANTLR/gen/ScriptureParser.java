// Generated from D:/git/ScriptureReferenceRecognition/ANTLR\Scripture.g4 by ANTLR 4.7.2
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
			null, "';'", "':'", "'-'", "','", "'('", "')'"
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
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
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
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(55);
					match(T__2);
					}
				}

				setState(58);
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
			setState(62);
			match(DIGIT);
			setState(63);
			match(T__1);
			setState(64);
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
			setState(66);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				verse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				verse();
				setState(70);
				match(T__3);
				setState(71);
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
		int _la;
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(75);
				match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(DIGIT);
				setState(77);
				match(T__2);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(78);
					match(T__2);
					}
				}

				setState(81);
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
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__4);
				setState(85);
				match(NAME);
				setState(86);
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
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\fa\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\6\2\32\n\2\r\2\16\2\33\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3"+
		"&\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6;\n\6\3\6\3\6\5\6?\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\tL\n\t\3\n\3\n\3\n\3\n\5\nR\n\n\3\n\5\nU\n\n\3\13\3\13"+
		"\3\13\3\13\5\13[\n\13\3\f\3\f\5\f_\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22"+
		"\24\26\2\2\2a\2\31\3\2\2\2\4%\3\2\2\2\6\'\3\2\2\2\b\60\3\2\2\2\n>\3\2"+
		"\2\2\f@\3\2\2\2\16D\3\2\2\2\20K\3\2\2\2\22T\3\2\2\2\24Z\3\2\2\2\26^\3"+
		"\2\2\2\30\32\5\4\3\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31\3\2\2\2\33\34\3"+
		"\2\2\2\34\35\3\2\2\2\35\36\7\2\2\3\36\3\3\2\2\2\37 \5\6\4\2 !\5\b\5\2"+
		"!\"\5\24\13\2\"#\7\13\2\2#&\3\2\2\2$&\7\13\2\2%\37\3\2\2\2%$\3\2\2\2&"+
		"\5\3\2\2\2\'(\5\26\f\2()\7\t\2\2)\7\3\2\2\2*\61\5\n\6\2+,\5\n\6\2,-\7"+
		"\3\2\2-.\5\b\5\2.\61\3\2\2\2/\61\3\2\2\2\60*\3\2\2\2\60+\3\2\2\2\60/\3"+
		"\2\2\2\61\t\3\2\2\2\62?\5\16\b\2\63\64\5\16\b\2\64\65\7\4\2\2\65\66\5"+
		"\20\t\2\66?\3\2\2\2\678\5\f\7\28:\7\5\2\29;\7\5\2\2:9\3\2\2\2:;\3\2\2"+
		"\2;<\3\2\2\2<=\5\f\7\2=?\3\2\2\2>\62\3\2\2\2>\63\3\2\2\2>\67\3\2\2\2?"+
		"\13\3\2\2\2@A\7\n\2\2AB\7\4\2\2BC\7\n\2\2C\r\3\2\2\2DE\7\n\2\2E\17\3\2"+
		"\2\2FL\5\22\n\2GH\5\22\n\2HI\7\6\2\2IJ\5\20\t\2JL\3\2\2\2KF\3\2\2\2KG"+
		"\3\2\2\2L\21\3\2\2\2MU\7\n\2\2NO\7\n\2\2OQ\7\5\2\2PR\7\5\2\2QP\3\2\2\2"+
		"QR\3\2\2\2RS\3\2\2\2SU\7\n\2\2TM\3\2\2\2TN\3\2\2\2U\23\3\2\2\2VW\7\7\2"+
		"\2WX\7\t\2\2X[\7\b\2\2Y[\3\2\2\2ZV\3\2\2\2ZY\3\2\2\2[\25\3\2\2\2\\_\7"+
		"\n\2\2]_\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\27\3\2\2\2\f\33%\60:>KQTZ^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}