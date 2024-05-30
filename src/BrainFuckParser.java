// Generated from /home/shaggy/IdeaProjects/BrainFuck/src/BrainFuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BrainFuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		RB=1, LB=2, PRINT=3, IN=4, INC=5, DEC=6, LMOV=7, RMOV=8, WS=9;
	public static final int
		RULE_main = 0, RULE_com = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"main", "com"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'['", "']'", "'.'", "','", "'+'", "'-'", "'<'", "'>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "RB", "LB", "PRINT", "IN", "INC", "DEC", "LMOV", "RMOV", "WS"
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
	public String getGrammarFileName() { return "BrainFuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BrainFuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	 
		public MainContext() { }
		public void copyFrom(MainContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BeginContext extends MainContext {
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public TerminalNode EOF() { return getToken(BrainFuckParser.EOF, 0); }
		public BeginContext(MainContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitBegin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_main);
		try {
			_localctx = new BeginContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			com();
			setState(5);
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
	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ComContext {
		public TerminalNode IN() { return getToken(BrainFuckParser.IN, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public InputContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitInput(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ComContext {
		public TerminalNode PRINT() { return getToken(BrainFuckParser.PRINT, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public PrintContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecContext extends ComContext {
		public TerminalNode DEC() { return getToken(BrainFuckParser.DEC, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public DecContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitDec(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RmovContext extends ComContext {
		public TerminalNode RMOV() { return getToken(BrainFuckParser.RMOV, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public RmovContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitRmov(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LmovContext extends ComContext {
		public TerminalNode LMOV() { return getToken(BrainFuckParser.LMOV, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public LmovContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitLmov(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EndContext extends ComContext {
		public EndContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitEnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LabelContext extends ComContext {
		public TerminalNode RB() { return getToken(BrainFuckParser.RB, 0); }
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public TerminalNode LB() { return getToken(BrainFuckParser.LB, 0); }
		public LabelContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncContext extends ComContext {
		public TerminalNode INC() { return getToken(BrainFuckParser.INC, 0); }
		public ComContext com() {
			return getRuleContext(ComContext.class,0);
		}
		public IncContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BrainFuckVisitor ) return ((BrainFuckVisitor<? extends T>)visitor).visitInc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_com);
		try {
			setState(25);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RB:
				_localctx = new LabelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(7);
				match(RB);
				setState(8);
				com();
				setState(9);
				match(LB);
				setState(10);
				com();
				}
				break;
			case PRINT:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(PRINT);
				setState(13);
				com();
				}
				break;
			case IN:
				_localctx = new InputContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(14);
				match(IN);
				setState(15);
				com();
				}
				break;
			case DEC:
				_localctx = new DecContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(DEC);
				setState(17);
				com();
				}
				break;
			case INC:
				_localctx = new IncContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(18);
				match(INC);
				setState(19);
				com();
				}
				break;
			case LMOV:
				_localctx = new LmovContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(20);
				match(LMOV);
				setState(21);
				com();
				}
				break;
			case RMOV:
				_localctx = new RmovContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(22);
				match(RMOV);
				setState(23);
				com();
				}
				break;
			case EOF:
			case LB:
				_localctx = new EndContext(_localctx);
				enterOuterAlt(_localctx, 8);
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
		"\u0004\u0001\t\u001c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0001\u0000"+
		"\u0000\u0002\u0000\u0002\u0000\u0000 \u0000\u0004\u0001\u0000\u0000\u0000"+
		"\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u0005\u0003\u0002\u0001\u0000"+
		"\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001\u0001\u0000\u0000\u0000"+
		"\u0007\b\u0005\u0001\u0000\u0000\b\t\u0003\u0002\u0001\u0000\t\n\u0005"+
		"\u0002\u0000\u0000\n\u000b\u0003\u0002\u0001\u0000\u000b\u001a\u0001\u0000"+
		"\u0000\u0000\f\r\u0005\u0003\u0000\u0000\r\u001a\u0003\u0002\u0001\u0000"+
		"\u000e\u000f\u0005\u0004\u0000\u0000\u000f\u001a\u0003\u0002\u0001\u0000"+
		"\u0010\u0011\u0005\u0006\u0000\u0000\u0011\u001a\u0003\u0002\u0001\u0000"+
		"\u0012\u0013\u0005\u0005\u0000\u0000\u0013\u001a\u0003\u0002\u0001\u0000"+
		"\u0014\u0015\u0005\u0007\u0000\u0000\u0015\u001a\u0003\u0002\u0001\u0000"+
		"\u0016\u0017\u0005\b\u0000\u0000\u0017\u001a\u0003\u0002\u0001\u0000\u0018"+
		"\u001a\u0001\u0000\u0000\u0000\u0019\u0007\u0001\u0000\u0000\u0000\u0019"+
		"\f\u0001\u0000\u0000\u0000\u0019\u000e\u0001\u0000\u0000\u0000\u0019\u0010"+
		"\u0001\u0000\u0000\u0000\u0019\u0012\u0001\u0000\u0000\u0000\u0019\u0014"+
		"\u0001\u0000\u0000\u0000\u0019\u0016\u0001\u0000\u0000\u0000\u0019\u0018"+
		"\u0001\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u0001\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}