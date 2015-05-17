// Generated from OMP.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OMPParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, OMP=5, PARALLEL=6, FOR=7, SECTIONS=8, 
		SECTION=9, SINGLE=10, MASTER=11, BARRIER=12, ATOMIC=13, CRITICAL=14, PUBLIC=15, 
		PRIVATE=16, FIRSTPRIVATE=17, SCHEDULE=18, THREAD_NUM=19, VAR=20, FULLNAME=21, 
		NUMBER=22, WS=23;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "','", "'.'", "'omp'", "'parallel'", "'for'", 
		"'sections'", "'section'", "'single'", "'master'", "'barrier'", "'atomic'", 
		"'critical'", "'public'", "'private'", "'firstprivate'", "'schedule'", 
		"'threadNum'", "VAR", "FULLNAME", "NUMBER", "WS"
	};
	public static final int
		RULE_ompUnit = 0, RULE_ompParallel = 1, RULE_ompParallelModifiers = 2, 
		RULE_ompParallelModifier = 3, RULE_ompParallelFor = 4, RULE_ompParallelForModifiers = 5, 
		RULE_ompParallelForModifier = 6, RULE_ompSections = 7, RULE_sectionsModifiers = 8, 
		RULE_sectionsModifier = 9, RULE_ompFor = 10, RULE_ompSection = 11, RULE_ompSingle = 12, 
		RULE_ompMaster = 13, RULE_ompBarrier = 14, RULE_ompAtomic = 15, RULE_ompCritical = 16, 
		RULE_ompPublic = 17, RULE_ompPrivate = 18, RULE_ompFirstPrivate = 19, 
		RULE_ompSchedule = 20, RULE_threadNum = 21, RULE_ompAccessModifier = 22, 
		RULE_ompVars = 23, RULE_ompVar = 24, RULE_ompNumber = 25;
	public static final String[] ruleNames = {
		"ompUnit", "ompParallel", "ompParallelModifiers", "ompParallelModifier", 
		"ompParallelFor", "ompParallelForModifiers", "ompParallelForModifier", 
		"ompSections", "sectionsModifiers", "sectionsModifier", "ompFor", "ompSection", 
		"ompSingle", "ompMaster", "ompBarrier", "ompAtomic", "ompCritical", "ompPublic", 
		"ompPrivate", "ompFirstPrivate", "ompSchedule", "threadNum", "ompAccessModifier", 
		"ompVars", "ompVar", "ompNumber"
	};

	@Override
	public String getGrammarFileName() { return "OMP.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OMPParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OmpUnitContext extends ParserRuleContext {
		public OmpParallelContext ompParallel() {
			return getRuleContext(OmpParallelContext.class,0);
		}
		public TerminalNode OMP() { return getToken(OMPParser.OMP, 0); }
		public TerminalNode EOF() { return getToken(OMPParser.EOF, 0); }
		public OmpForContext ompFor() {
			return getRuleContext(OmpForContext.class,0);
		}
		public OmpSectionContext ompSection() {
			return getRuleContext(OmpSectionContext.class,0);
		}
		public OmpMasterContext ompMaster() {
			return getRuleContext(OmpMasterContext.class,0);
		}
		public OmpCriticalContext ompCritical() {
			return getRuleContext(OmpCriticalContext.class,0);
		}
		public OmpParallelForContext ompParallelFor() {
			return getRuleContext(OmpParallelForContext.class,0);
		}
		public OmpSingleContext ompSingle() {
			return getRuleContext(OmpSingleContext.class,0);
		}
		public OmpBarrierContext ompBarrier() {
			return getRuleContext(OmpBarrierContext.class,0);
		}
		public OmpAtomicContext ompAtomic() {
			return getRuleContext(OmpAtomicContext.class,0);
		}
		public OmpSectionsContext ompSections() {
			return getRuleContext(OmpSectionsContext.class,0);
		}
		public OmpUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpUnitContext ompUnit() throws RecognitionException {
		OmpUnitContext _localctx = new OmpUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ompUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52); match(OMP);
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(53); ompParallel();
				}
				break;
			case 2:
				{
				setState(54); ompParallelFor();
				}
				break;
			case 3:
				{
				setState(55); ompFor();
				}
				break;
			case 4:
				{
				setState(56); ompSections();
				}
				break;
			case 5:
				{
				setState(57); ompSection();
				}
				break;
			case 6:
				{
				setState(58); ompSingle();
				}
				break;
			case 7:
				{
				setState(59); ompMaster();
				}
				break;
			case 8:
				{
				setState(60); ompBarrier();
				}
				break;
			case 9:
				{
				setState(61); ompAtomic();
				}
				break;
			case 10:
				{
				setState(62); ompCritical();
				}
				break;
			}
			setState(65); match(EOF);
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

	public static class OmpParallelContext extends ParserRuleContext {
		public static java.util.HashSet<String> names;
		public OmpParallelModifiersContext ompParallelModifiers() {
			return getRuleContext(OmpParallelModifiersContext.class,0);
		}
		public TerminalNode PARALLEL() { return getToken(OMPParser.PARALLEL, 0); }
		public OmpParallelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelContext ompParallel() throws RecognitionException {
		OmpParallelContext _localctx = new OmpParallelContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_ompParallel);

		        OmpParallelContext.names = new java.util.HashSet<String>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); match(PARALLEL);
			setState(68); ompParallelModifiers();
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

	public static class OmpParallelModifiersContext extends ParserRuleContext {
		public OmpParallelModifiersContext ompParallelModifiers() {
			return getRuleContext(OmpParallelModifiersContext.class,0);
		}
		public OmpParallelModifierContext ompParallelModifier() {
			return getRuleContext(OmpParallelModifierContext.class,0);
		}
		public OmpParallelModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelModifiersContext ompParallelModifiers() throws RecognitionException {
		OmpParallelModifiersContext _localctx = new OmpParallelModifiersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ompParallelModifiers);
		try {
			setState(74);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); ompParallelModifier();
				setState(71); ompParallelModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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

	public static class OmpParallelModifierContext extends ParserRuleContext {
		public ThreadNumContext threadNum() {
			return getRuleContext(ThreadNumContext.class,0);
		}
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public OmpAccessModifierContext ompAccessModifier() {
			return getRuleContext(OmpAccessModifierContext.class,0);
		}
		public OmpParallelModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelModifierContext ompParallelModifier() throws RecognitionException {
		OmpParallelModifierContext _localctx = new OmpParallelModifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ompParallelModifier);
		try {
			setState(85);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				if (!(!((OmpParallelContext)getInvokingContext(1)).names.contains("schedule"))) throw new FailedPredicateException(this, "!$ompParallel::names.contains(\"schedule\")");
				setState(77); ompSchedule();
				((OmpParallelContext)getInvokingContext(1)).names.add("schedule");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				if (!(!((OmpParallelContext)getInvokingContext(1)).names.contains("threadNum"))) throw new FailedPredicateException(this, "!$ompParallel::names.contains(\"threadNum\")");
				setState(81); threadNum();
				((OmpParallelContext)getInvokingContext(1)).names.add("threadNum");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84); ompAccessModifier();
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

	public static class OmpParallelForContext extends ParserRuleContext {
		public static java.util.HashSet<String> names;
		public TerminalNode PARALLEL() { return getToken(OMPParser.PARALLEL, 0); }
		public TerminalNode FOR() { return getToken(OMPParser.FOR, 0); }
		public OmpParallelForModifiersContext ompParallelForModifiers() {
			return getRuleContext(OmpParallelForModifiersContext.class,0);
		}
		public OmpParallelForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForContext ompParallelFor() throws RecognitionException {
		OmpParallelForContext _localctx = new OmpParallelForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ompParallelFor);

		        OmpParallelForContext.names = new java.util.HashSet<String>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87); match(PARALLEL);
			setState(88); match(FOR);
			setState(89); ompParallelForModifiers();
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

	public static class OmpParallelForModifiersContext extends ParserRuleContext {
		public OmpParallelForModifierContext ompParallelForModifier() {
			return getRuleContext(OmpParallelForModifierContext.class,0);
		}
		public OmpParallelForModifiersContext ompParallelForModifiers() {
			return getRuleContext(OmpParallelForModifiersContext.class,0);
		}
		public OmpParallelForModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelForModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelForModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelForModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForModifiersContext ompParallelForModifiers() throws RecognitionException {
		OmpParallelForModifiersContext _localctx = new OmpParallelForModifiersContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ompParallelForModifiers);
		try {
			setState(96);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				if (!(((OmpParallelForContext)getInvokingContext(4)).names.size() < 3)) throw new FailedPredicateException(this, "$ompParallelFor::names.size() < 3");
				setState(92); ompParallelForModifier();
				setState(93); ompParallelForModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				if (!(((OmpParallelForContext)getInvokingContext(4)).names.size() <= 3)) throw new FailedPredicateException(this, "$ompParallelFor::names.size() <= 3");
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

	public static class OmpParallelForModifierContext extends ParserRuleContext {
		public ThreadNumContext threadNum() {
			return getRuleContext(ThreadNumContext.class,0);
		}
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public OmpAccessModifierContext ompAccessModifier() {
			return getRuleContext(OmpAccessModifierContext.class,0);
		}
		public OmpParallelForModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompParallelForModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpParallelForModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpParallelForModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpParallelForModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpParallelForModifierContext ompParallelForModifier() throws RecognitionException {
		OmpParallelForModifierContext _localctx = new OmpParallelForModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ompParallelForModifier);
		try {
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				if (!(!((OmpParallelForContext)getInvokingContext(4)).names.contains("schedule"))) throw new FailedPredicateException(this, "!$ompParallelFor::names.contains(\"schedule\")");
				setState(99); ompSchedule();
				((OmpParallelForContext)getInvokingContext(4)).names.add("schedule");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				if (!(!((OmpParallelForContext)getInvokingContext(4)).names.contains("threadNum"))) throw new FailedPredicateException(this, "!$ompParallelFor::names.contains(\"threadNum\")");
				setState(103); threadNum();
				((OmpParallelForContext)getInvokingContext(4)).names.add("threadNum");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106); ompAccessModifier();
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

	public static class OmpSectionsContext extends ParserRuleContext {
		public static java.util.HashSet<String> names;
		public TerminalNode SECTIONS() { return getToken(OMPParser.SECTIONS, 0); }
		public SectionsModifiersContext sectionsModifiers() {
			return getRuleContext(SectionsModifiersContext.class,0);
		}
		public OmpSectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSectionsContext ompSections() throws RecognitionException {
		OmpSectionsContext _localctx = new OmpSectionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ompSections);

		        OmpSectionsContext.names = new java.util.HashSet<String>();
		    
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109); match(SECTIONS);
			setState(110); sectionsModifiers();
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

	public static class SectionsModifiersContext extends ParserRuleContext {
		public SectionsModifiersContext sectionsModifiers() {
			return getRuleContext(SectionsModifiersContext.class,0);
		}
		public SectionsModifierContext sectionsModifier() {
			return getRuleContext(SectionsModifierContext.class,0);
		}
		public SectionsModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionsModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterSectionsModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitSectionsModifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitSectionsModifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsModifiersContext sectionsModifiers() throws RecognitionException {
		SectionsModifiersContext _localctx = new SectionsModifiersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_sectionsModifiers);
		try {
			setState(117);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				if (!(((OmpSectionsContext)getInvokingContext(7)).names.size() < 2)) throw new FailedPredicateException(this, "$ompSections::names.size() < 2");
				setState(113); sectionsModifier();
				setState(114); sectionsModifiers();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				if (!(((OmpSectionsContext)getInvokingContext(7)).names.size() <= 2)) throw new FailedPredicateException(this, "$ompSections::names.size() <= 2");
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

	public static class SectionsModifierContext extends ParserRuleContext {
		public ThreadNumContext threadNum() {
			return getRuleContext(ThreadNumContext.class,0);
		}
		public OmpScheduleContext ompSchedule() {
			return getRuleContext(OmpScheduleContext.class,0);
		}
		public SectionsModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sectionsModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterSectionsModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitSectionsModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitSectionsModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SectionsModifierContext sectionsModifier() throws RecognitionException {
		SectionsModifierContext _localctx = new SectionsModifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sectionsModifier);
		try {
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				if (!(!((OmpSectionsContext)getInvokingContext(7)).names.contains("schedule"))) throw new FailedPredicateException(this, "!$ompSections::names.contains(\"schedule\")");
				setState(120); ompSchedule();
				((OmpSectionsContext)getInvokingContext(7)).names.add("schedule");
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				if (!(!((OmpSectionsContext)getInvokingContext(7)).names.contains("threadNum"))) throw new FailedPredicateException(this, "!$ompSections::names.contains(\"threadNum\")");
				setState(124); threadNum();
				((OmpSectionsContext)getInvokingContext(7)).names.add("threadNum");
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

	public static class OmpForContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(OMPParser.FOR, 0); }
		public OmpAccessModifierContext ompAccessModifier(int i) {
			return getRuleContext(OmpAccessModifierContext.class,i);
		}
		public List<OmpAccessModifierContext> ompAccessModifier() {
			return getRuleContexts(OmpAccessModifierContext.class);
		}
		public OmpForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpForContext ompFor() throws RecognitionException {
		OmpForContext _localctx = new OmpForContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_ompFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129); match(FOR);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PUBLIC) | (1L << PRIVATE) | (1L << FIRSTPRIVATE))) != 0)) {
				{
				{
				setState(130); ompAccessModifier();
				}
				}
				setState(135);
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

	public static class OmpSectionContext extends ParserRuleContext {
		public TerminalNode SECTION() { return getToken(OMPParser.SECTION, 0); }
		public OmpSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSectionContext ompSection() throws RecognitionException {
		OmpSectionContext _localctx = new OmpSectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ompSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(SECTION);
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

	public static class OmpSingleContext extends ParserRuleContext {
		public TerminalNode SINGLE() { return getToken(OMPParser.SINGLE, 0); }
		public OmpSingleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSingle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpSingleContext ompSingle() throws RecognitionException {
		OmpSingleContext _localctx = new OmpSingleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ompSingle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); match(SINGLE);
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

	public static class OmpMasterContext extends ParserRuleContext {
		public TerminalNode MASTER() { return getToken(OMPParser.MASTER, 0); }
		public OmpMasterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompMaster; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpMaster(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpMaster(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpMaster(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpMasterContext ompMaster() throws RecognitionException {
		OmpMasterContext _localctx = new OmpMasterContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ompMaster);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); match(MASTER);
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

	public static class OmpBarrierContext extends ParserRuleContext {
		public TerminalNode BARRIER() { return getToken(OMPParser.BARRIER, 0); }
		public OmpBarrierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompBarrier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpBarrier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpBarrier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpBarrier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpBarrierContext ompBarrier() throws RecognitionException {
		OmpBarrierContext _localctx = new OmpBarrierContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ompBarrier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142); match(BARRIER);
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

	public static class OmpAtomicContext extends ParserRuleContext {
		public TerminalNode ATOMIC() { return getToken(OMPParser.ATOMIC, 0); }
		public OmpAtomicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAtomic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpAtomic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpAtomic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpAtomic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpAtomicContext ompAtomic() throws RecognitionException {
		OmpAtomicContext _localctx = new OmpAtomicContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ompAtomic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144); match(ATOMIC);
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

	public static class OmpCriticalContext extends ParserRuleContext {
		public TerminalNode CRITICAL() { return getToken(OMPParser.CRITICAL, 0); }
		public OmpVarContext ompVar() {
			return getRuleContext(OmpVarContext.class,0);
		}
		public OmpCriticalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompCritical; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpCritical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpCritical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpCritical(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpCriticalContext ompCritical() throws RecognitionException {
		OmpCriticalContext _localctx = new OmpCriticalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ompCritical);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146); match(CRITICAL);
			setState(151);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(147); match(T__3);
				setState(148); ompVar();
				setState(149); match(T__2);
				}
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

	public static class OmpPublicContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(OMPParser.PUBLIC, 0); }
		public OmpPublicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompPublic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpPublic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpPublic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpPublic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpPublicContext ompPublic() throws RecognitionException {
		OmpPublicContext _localctx = new OmpPublicContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ompPublic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153); match(PUBLIC);
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

	public static class OmpPrivateContext extends ParserRuleContext {
		public TerminalNode PRIVATE() { return getToken(OMPParser.PRIVATE, 0); }
		public OmpPrivateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompPrivate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpPrivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpPrivate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpPrivate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpPrivateContext ompPrivate() throws RecognitionException {
		OmpPrivateContext _localctx = new OmpPrivateContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ompPrivate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155); match(PRIVATE);
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

	public static class OmpFirstPrivateContext extends ParserRuleContext {
		public TerminalNode FIRSTPRIVATE() { return getToken(OMPParser.FIRSTPRIVATE, 0); }
		public OmpFirstPrivateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompFirstPrivate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpFirstPrivate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpFirstPrivate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpFirstPrivate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpFirstPrivateContext ompFirstPrivate() throws RecognitionException {
		OmpFirstPrivateContext _localctx = new OmpFirstPrivateContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ompFirstPrivate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157); match(FIRSTPRIVATE);
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

	public static class OmpScheduleContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(OMPParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(OMPParser.VAR, i);
		}
		public TerminalNode SCHEDULE() { return getToken(OMPParser.SCHEDULE, 0); }
		public OmpScheduleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompSchedule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpSchedule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpSchedule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpSchedule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpScheduleContext ompSchedule() throws RecognitionException {
		OmpScheduleContext _localctx = new OmpScheduleContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ompSchedule);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159); match(SCHEDULE);
			setState(160); match(T__3);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(161);
					_la = _input.LA(1);
					if ( !(_la==T__0 || _la==VAR) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(167); match(T__2);
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

	public static class ThreadNumContext extends ParserRuleContext {
		public TerminalNode THREAD_NUM() { return getToken(OMPParser.THREAD_NUM, 0); }
		public OmpNumberContext ompNumber() {
			return getRuleContext(OmpNumberContext.class,0);
		}
		public ThreadNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_threadNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterThreadNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitThreadNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitThreadNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThreadNumContext threadNum() throws RecognitionException {
		ThreadNumContext _localctx = new ThreadNumContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_threadNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169); match(THREAD_NUM);
			setState(170); match(T__3);
			setState(171); ompNumber();
			setState(172); match(T__2);
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

	public static class OmpAccessModifierContext extends ParserRuleContext {
		public OmpFirstPrivateContext ompFirstPrivate() {
			return getRuleContext(OmpFirstPrivateContext.class,0);
		}
		public OmpPublicContext ompPublic() {
			return getRuleContext(OmpPublicContext.class,0);
		}
		public OmpPrivateContext ompPrivate() {
			return getRuleContext(OmpPrivateContext.class,0);
		}
		public OmpVarsContext ompVars() {
			return getRuleContext(OmpVarsContext.class,0);
		}
		public OmpAccessModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompAccessModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpAccessModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpAccessModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpAccessModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpAccessModifierContext ompAccessModifier() throws RecognitionException {
		OmpAccessModifierContext _localctx = new OmpAccessModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_ompAccessModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			switch (_input.LA(1)) {
			case PUBLIC:
				{
				setState(174); ompPublic();
				}
				break;
			case PRIVATE:
				{
				setState(175); ompPrivate();
				}
				break;
			case FIRSTPRIVATE:
				{
				setState(176); ompFirstPrivate();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(179); match(T__3);
			setState(180); ompVars();
			setState(181); match(T__2);
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

	public static class OmpVarsContext extends ParserRuleContext {
		public List<OmpVarContext> ompVar() {
			return getRuleContexts(OmpVarContext.class);
		}
		public OmpVarContext ompVar(int i) {
			return getRuleContext(OmpVarContext.class,i);
		}
		public OmpVarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompVars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpVarsContext ompVars() throws RecognitionException {
		OmpVarsContext _localctx = new OmpVarsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_ompVars);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(183); ompVar();
				}
				break;
			case 2:
				{
				setState(187); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(184); ompVar();
						setState(185); match(T__1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(189); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(191); ompVar();
				}
				break;
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

	public static class OmpVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(OMPParser.VAR, 0); }
		public OmpVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpVarContext ompVar() throws RecognitionException {
		OmpVarContext _localctx = new OmpVarContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ompVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195); match(VAR);
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

	public static class OmpNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(OMPParser.NUMBER, 0); }
		public OmpNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ompNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).enterOmpNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OMPListener ) ((OMPListener)listener).exitOmpNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof OMPVisitor ) return ((OMPVisitor<? extends T>)visitor).visitOmpNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OmpNumberContext ompNumber() throws RecognitionException {
		OmpNumberContext _localctx = new OmpNumberContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ompNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(NUMBER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3: return ompParallelModifier_sempred((OmpParallelModifierContext)_localctx, predIndex);
		case 5: return ompParallelForModifiers_sempred((OmpParallelForModifiersContext)_localctx, predIndex);
		case 6: return ompParallelForModifier_sempred((OmpParallelForModifierContext)_localctx, predIndex);
		case 8: return sectionsModifiers_sempred((SectionsModifiersContext)_localctx, predIndex);
		case 9: return sectionsModifier_sempred((SectionsModifierContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ompParallelModifier_sempred(OmpParallelModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return !((OmpParallelContext)getInvokingContext(1)).names.contains("schedule");
		case 1: return !((OmpParallelContext)getInvokingContext(1)).names.contains("threadNum");
		}
		return true;
	}
	private boolean sectionsModifiers_sempred(SectionsModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6: return ((OmpSectionsContext)getInvokingContext(7)).names.size() < 2;
		case 7: return ((OmpSectionsContext)getInvokingContext(7)).names.size() <= 2;
		}
		return true;
	}
	private boolean ompParallelForModifiers_sempred(OmpParallelForModifiersContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return ((OmpParallelForContext)getInvokingContext(4)).names.size() < 3;
		case 3: return ((OmpParallelForContext)getInvokingContext(4)).names.size() <= 3;
		}
		return true;
	}
	private boolean ompParallelForModifier_sempred(OmpParallelForModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4: return !((OmpParallelForContext)getInvokingContext(4)).names.contains("schedule");
		case 5: return !((OmpParallelForContext)getInvokingContext(4)).names.contains("threadNum");
		}
		return true;
	}
	private boolean sectionsModifier_sempred(SectionsModifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8: return !((OmpSectionsContext)getInvokingContext(7)).names.contains("schedule");
		case 9: return !((OmpSectionsContext)getInvokingContext(7)).names.contains("threadNum");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\31\u00ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2B"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4M\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5X\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7c\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\5\nx\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0082\n"+
		"\13\3\f\3\f\7\f\u0086\n\f\f\f\16\f\u0089\13\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u009a\n\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\7\26\u00a5\n\26\f\26\16\26\u00a8"+
		"\13\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\5\30\u00b4\n"+
		"\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\6\31\u00be\n\31\r\31\16\31"+
		"\u00bf\3\31\3\31\5\31\u00c4\n\31\3\32\3\32\3\33\3\33\3\33\3\u00a6\2\34"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\3\4\2\6\6"+
		"\26\26\u00c7\2\66\3\2\2\2\4E\3\2\2\2\6L\3\2\2\2\bW\3\2\2\2\nY\3\2\2\2"+
		"\fb\3\2\2\2\16m\3\2\2\2\20o\3\2\2\2\22w\3\2\2\2\24\u0081\3\2\2\2\26\u0083"+
		"\3\2\2\2\30\u008a\3\2\2\2\32\u008c\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3"+
		"\2\2\2 \u0092\3\2\2\2\"\u0094\3\2\2\2$\u009b\3\2\2\2&\u009d\3\2\2\2(\u009f"+
		"\3\2\2\2*\u00a1\3\2\2\2,\u00ab\3\2\2\2.\u00b3\3\2\2\2\60\u00c3\3\2\2\2"+
		"\62\u00c5\3\2\2\2\64\u00c7\3\2\2\2\66A\7\7\2\2\67B\5\4\3\28B\5\n\6\29"+
		"B\5\26\f\2:B\5\20\t\2;B\5\30\r\2<B\5\32\16\2=B\5\34\17\2>B\5\36\20\2?"+
		"B\5 \21\2@B\5\"\22\2A\67\3\2\2\2A8\3\2\2\2A9\3\2\2\2A:\3\2\2\2A;\3\2\2"+
		"\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2BC\3\2\2\2CD\7\2\2"+
		"\3D\3\3\2\2\2EF\7\b\2\2FG\5\6\4\2G\5\3\2\2\2HI\5\b\5\2IJ\5\6\4\2JM\3\2"+
		"\2\2KM\3\2\2\2LH\3\2\2\2LK\3\2\2\2M\7\3\2\2\2NO\6\5\2\3OP\5*\26\2PQ\b"+
		"\5\1\2QX\3\2\2\2RS\6\5\3\3ST\5,\27\2TU\b\5\1\2UX\3\2\2\2VX\5.\30\2WN\3"+
		"\2\2\2WR\3\2\2\2WV\3\2\2\2X\t\3\2\2\2YZ\7\b\2\2Z[\7\t\2\2[\\\5\f\7\2\\"+
		"\13\3\2\2\2]^\6\7\4\3^_\5\16\b\2_`\5\f\7\2`c\3\2\2\2ac\6\7\5\3b]\3\2\2"+
		"\2ba\3\2\2\2c\r\3\2\2\2de\6\b\6\3ef\5*\26\2fg\b\b\1\2gn\3\2\2\2hi\6\b"+
		"\7\3ij\5,\27\2jk\b\b\1\2kn\3\2\2\2ln\5.\30\2md\3\2\2\2mh\3\2\2\2ml\3\2"+
		"\2\2n\17\3\2\2\2op\7\n\2\2pq\5\22\n\2q\21\3\2\2\2rs\6\n\b\3st\5\24\13"+
		"\2tu\5\22\n\2ux\3\2\2\2vx\6\n\t\3wr\3\2\2\2wv\3\2\2\2x\23\3\2\2\2yz\6"+
		"\13\n\3z{\5*\26\2{|\b\13\1\2|\u0082\3\2\2\2}~\6\13\13\3~\177\5,\27\2\177"+
		"\u0080\b\13\1\2\u0080\u0082\3\2\2\2\u0081y\3\2\2\2\u0081}\3\2\2\2\u0082"+
		"\25\3\2\2\2\u0083\u0087\7\t\2\2\u0084\u0086\5.\30\2\u0085\u0084\3\2\2"+
		"\2\u0086\u0089\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\27"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7\13\2\2\u008b\31\3\2\2\2\u008c"+
		"\u008d\7\f\2\2\u008d\33\3\2\2\2\u008e\u008f\7\r\2\2\u008f\35\3\2\2\2\u0090"+
		"\u0091\7\16\2\2\u0091\37\3\2\2\2\u0092\u0093\7\17\2\2\u0093!\3\2\2\2\u0094"+
		"\u0099\7\20\2\2\u0095\u0096\7\3\2\2\u0096\u0097\5\62\32\2\u0097\u0098"+
		"\7\4\2\2\u0098\u009a\3\2\2\2\u0099\u0095\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"#\3\2\2\2\u009b\u009c\7\21\2\2\u009c%\3\2\2\2\u009d\u009e\7\22\2\2\u009e"+
		"\'\3\2\2\2\u009f\u00a0\7\23\2\2\u00a0)\3\2\2\2\u00a1\u00a2\7\24\2\2\u00a2"+
		"\u00a6\7\3\2\2\u00a3\u00a5\t\2\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2"+
		"\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa+\3\2\2\2\u00ab\u00ac\7\25\2\2"+
		"\u00ac\u00ad\7\3\2\2\u00ad\u00ae\5\64\33\2\u00ae\u00af\7\4\2\2\u00af-"+
		"\3\2\2\2\u00b0\u00b4\5$\23\2\u00b1\u00b4\5&\24\2\u00b2\u00b4\5(\25\2\u00b3"+
		"\u00b0\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\7\3\2\2\u00b6\u00b7\5\60\31\2\u00b7\u00b8\7\4\2\2\u00b8"+
		"/\3\2\2\2\u00b9\u00c4\5\62\32\2\u00ba\u00bb\5\62\32\2\u00bb\u00bc\7\5"+
		"\2\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\5\62"+
		"\32\2\u00c2\u00c4\3\2\2\2\u00c3\u00b9\3\2\2\2\u00c3\u00bd\3\2\2\2\u00c4"+
		"\61\3\2\2\2\u00c5\u00c6\7\26\2\2\u00c6\63\3\2\2\2\u00c7\u00c8\7\30\2\2"+
		"\u00c8\65\3\2\2\2\17ALWbmw\u0081\u0087\u0099\u00a6\u00b3\u00bf\u00c3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}