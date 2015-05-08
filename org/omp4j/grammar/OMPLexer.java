// Generated from OMP.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OMPLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__2=1, T__1=2, T__0=3, OMP=4, PARALLEL=5, FOR=6, SECTIONS=7, SECTION=8, 
		SINGLE=9, MASTER=10, BARRIER=11, ATOMIC=12, CRITICAL=13, OMPTHREADNUM=14, 
		OMPNUMTHREADS=15, PUBLIC=16, PRIVATE=17, FIRSTPRIVATE=18, SCHEDULE=19, 
		THREAD_NUM=20, VAR=21, FULLNAME=22, NUMBER=23, WS=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'"
	};
	public static final String[] ruleNames = {
		"T__2", "T__1", "T__0", "OMP", "PARALLEL", "FOR", "SECTIONS", "SECTION", 
		"SINGLE", "MASTER", "BARRIER", "ATOMIC", "CRITICAL", "OMPTHREADNUM", "OMPNUMTHREADS", 
		"PUBLIC", "PRIVATE", "FIRSTPRIVATE", "SCHEDULE", "THREAD_NUM", "VAR", 
		"FULLNAME", "NUMBER", "WS", "JavaLetter", "JavaLetterOrDigit", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore"
	};


	public OMPLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "OMP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24: return JavaLetter_sempred((RuleContext)_localctx, predIndex);
		case 25: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u011a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u00e0\n\26\f\26\16\26\u00e3\13\26"+
		"\3\27\3\27\7\27\u00e7\n\27\f\27\16\27\u00ea\13\27\3\30\3\30\3\31\6\31"+
		"\u00ef\n\31\r\31\16\31\u00f0\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\5"+
		"\32\u00fb\n\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0103\n\33\3\34\3\34"+
		"\5\34\u0107\n\34\3\34\5\34\u010a\n\34\3\35\3\35\5\35\u010e\n\35\3\36\3"+
		"\36\3\37\6\37\u0113\n\37\r\37\16\37\u0114\3 \3 \5 \u0119\n \2\2!\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\2\65\2\67\29\2;\2=\2?\2\3\2"+
		"\t\5\2\13\f\16\17\"\"\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01"+
		"\3\2\udc02\ue001\7\2&&\62;C\\aac|\3\2\63;\u011e\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3A\3\2"+
		"\2\2\5C\3\2\2\2\7E\3\2\2\2\tG\3\2\2\2\13K\3\2\2\2\rT\3\2\2\2\17X\3\2\2"+
		"\2\21a\3\2\2\2\23i\3\2\2\2\25p\3\2\2\2\27w\3\2\2\2\31\177\3\2\2\2\33\u0086"+
		"\3\2\2\2\35\u008f\3\2\2\2\37\u009e\3\2\2\2!\u00ae\3\2\2\2#\u00b5\3\2\2"+
		"\2%\u00bd\3\2\2\2\'\u00ca\3\2\2\2)\u00d3\3\2\2\2+\u00dd\3\2\2\2-\u00e4"+
		"\3\2\2\2/\u00eb\3\2\2\2\61\u00ee\3\2\2\2\63\u00fa\3\2\2\2\65\u0102\3\2"+
		"\2\2\67\u0104\3\2\2\29\u010d\3\2\2\2;\u010f\3\2\2\2=\u0112\3\2\2\2?\u0118"+
		"\3\2\2\2AB\7*\2\2B\4\3\2\2\2CD\7+\2\2D\6\3\2\2\2EF\7.\2\2F\b\3\2\2\2G"+
		"H\7q\2\2HI\7o\2\2IJ\7r\2\2J\n\3\2\2\2KL\7r\2\2LM\7c\2\2MN\7t\2\2NO\7c"+
		"\2\2OP\7n\2\2PQ\7n\2\2QR\7g\2\2RS\7n\2\2S\f\3\2\2\2TU\7h\2\2UV\7q\2\2"+
		"VW\7t\2\2W\16\3\2\2\2XY\7u\2\2YZ\7g\2\2Z[\7e\2\2[\\\7v\2\2\\]\7k\2\2]"+
		"^\7q\2\2^_\7p\2\2_`\7u\2\2`\20\3\2\2\2ab\7u\2\2bc\7g\2\2cd\7e\2\2de\7"+
		"v\2\2ef\7k\2\2fg\7q\2\2gh\7p\2\2h\22\3\2\2\2ij\7u\2\2jk\7k\2\2kl\7p\2"+
		"\2lm\7i\2\2mn\7n\2\2no\7g\2\2o\24\3\2\2\2pq\7o\2\2qr\7c\2\2rs\7u\2\2s"+
		"t\7v\2\2tu\7g\2\2uv\7t\2\2v\26\3\2\2\2wx\7d\2\2xy\7c\2\2yz\7t\2\2z{\7"+
		"t\2\2{|\7k\2\2|}\7g\2\2}~\7t\2\2~\30\3\2\2\2\177\u0080\7c\2\2\u0080\u0081"+
		"\7v\2\2\u0081\u0082\7q\2\2\u0082\u0083\7o\2\2\u0083\u0084\7k\2\2\u0084"+
		"\u0085\7e\2\2\u0085\32\3\2\2\2\u0086\u0087\7e\2\2\u0087\u0088\7t\2\2\u0088"+
		"\u0089\7k\2\2\u0089\u008a\7v\2\2\u008a\u008b\7k\2\2\u008b\u008c\7e\2\2"+
		"\u008c\u008d\7c\2\2\u008d\u008e\7n\2\2\u008e\34\3\2\2\2\u008f\u0090\7"+
		"Q\2\2\u0090\u0091\7O\2\2\u0091\u0092\7R\2\2\u0092\u0093\7a\2\2\u0093\u0094"+
		"\7V\2\2\u0094\u0095\7J\2\2\u0095\u0096\7T\2\2\u0096\u0097\7G\2\2\u0097"+
		"\u0098\7C\2\2\u0098\u0099\7F\2\2\u0099\u009a\7a\2\2\u009a\u009b\7P\2\2"+
		"\u009b\u009c\7W\2\2\u009c\u009d\7O\2\2\u009d\36\3\2\2\2\u009e\u009f\7"+
		"Q\2\2\u009f\u00a0\7O\2\2\u00a0\u00a1\7R\2\2\u00a1\u00a2\7a\2\2\u00a2\u00a3"+
		"\7P\2\2\u00a3\u00a4\7W\2\2\u00a4\u00a5\7O\2\2\u00a5\u00a6\7a\2\2\u00a6"+
		"\u00a7\7V\2\2\u00a7\u00a8\7J\2\2\u00a8\u00a9\7T\2\2\u00a9\u00aa\7G\2\2"+
		"\u00aa\u00ab\7C\2\2\u00ab\u00ac\7F\2\2\u00ac\u00ad\7U\2\2\u00ad \3\2\2"+
		"\2\u00ae\u00af\7r\2\2\u00af\u00b0\7w\2\2\u00b0\u00b1\7d\2\2\u00b1\u00b2"+
		"\7n\2\2\u00b2\u00b3\7k\2\2\u00b3\u00b4\7e\2\2\u00b4\"\3\2\2\2\u00b5\u00b6"+
		"\7r\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7x\2\2\u00b9"+
		"\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7g\2\2\u00bc$\3\2\2\2\u00bd"+
		"\u00be\7h\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7u\2\2"+
		"\u00c1\u00c2\7v\2\2\u00c2\u00c3\7r\2\2\u00c3\u00c4\7t\2\2\u00c4\u00c5"+
		"\7k\2\2\u00c5\u00c6\7x\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7v\2\2\u00c8"+
		"\u00c9\7g\2\2\u00c9&\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7e\2\2\u00cc"+
		"\u00cd\7j\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7f\2\2\u00cf\u00d0\7w\2\2"+
		"\u00d0\u00d1\7n\2\2\u00d1\u00d2\7g\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7v\2"+
		"\2\u00d4\u00d5\7j\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8"+
		"\7c\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da\7P\2\2\u00da\u00db\7w\2\2\u00db"+
		"\u00dc\7o\2\2\u00dc*\3\2\2\2\u00dd\u00e1\5\63\32\2\u00de\u00e0\5\65\33"+
		"\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2,\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e8\5\63\32\2\u00e5"+
		"\u00e7\5\65\33\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9.\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\5\67\34\2\u00ec\60\3\2\2\2\u00ed\u00ef\t\2\2\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\31\2\2\u00f3\62\3\2\2\2\u00f4\u00fb\t\3\2\2\u00f5\u00f6"+
		"\n\4\2\2\u00f6\u00fb\6\32\2\2\u00f7\u00f8\t\5\2\2\u00f8\u00f9\t\6\2\2"+
		"\u00f9\u00fb\6\32\3\2\u00fa\u00f4\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fa\u00f7"+
		"\3\2\2\2\u00fb\64\3\2\2\2\u00fc\u0103\t\7\2\2\u00fd\u00fe\n\4\2\2\u00fe"+
		"\u0103\6\33\4\2\u00ff\u0100\t\5\2\2\u0100\u0101\t\6\2\2\u0101\u0103\6"+
		"\33\5\2\u0102\u00fc\3\2\2\2\u0102\u00fd\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"\66\3\2\2\2\u0104\u0109\59\35\2\u0105\u0107\5=\37\2\u0106\u0105\3\2\2"+
		"\2\u0106\u0107\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\59\35\2\u0109\u0106"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a8\3\2\2\2\u010b\u010e\7\62\2\2\u010c"+
		"\u010e\5;\36\2\u010d\u010b\3\2\2\2\u010d\u010c\3\2\2\2\u010e:\3\2\2\2"+
		"\u010f\u0110\t\b\2\2\u0110<\3\2\2\2\u0111\u0113\5? \2\u0112\u0111\3\2"+
		"\2\2\u0113\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		">\3\2\2\2\u0116\u0119\59\35\2\u0117\u0119\7a\2\2\u0118\u0116\3\2\2\2\u0118"+
		"\u0117\3\2\2\2\u0119@\3\2\2\2\r\2\u00e1\u00e8\u00f0\u00fa\u0102\u0106"+
		"\u0109\u010d\u0114\u0118\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}