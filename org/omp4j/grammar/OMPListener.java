// Generated from OMP.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OMPParser}.
 */
public interface OMPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallelForModifiers}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallelForModifiers(@NotNull OMPParser.OmpParallelForModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallelForModifiers}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallelForModifiers(@NotNull OMPParser.OmpParallelForModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompCritical}.
	 * @param ctx the parse tree
	 */
	void enterOmpCritical(@NotNull OMPParser.OmpCriticalContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompCritical}.
	 * @param ctx the parse tree
	 */
	void exitOmpCritical(@NotNull OMPParser.OmpCriticalContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompFor}.
	 * @param ctx the parse tree
	 */
	void enterOmpFor(@NotNull OMPParser.OmpForContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompFor}.
	 * @param ctx the parse tree
	 */
	void exitOmpFor(@NotNull OMPParser.OmpForContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompUnit}.
	 * @param ctx the parse tree
	 */
	void enterOmpUnit(@NotNull OMPParser.OmpUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompUnit}.
	 * @param ctx the parse tree
	 */
	void exitOmpUnit(@NotNull OMPParser.OmpUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallelModifier}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallelModifier(@NotNull OMPParser.OmpParallelModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallelModifier}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallelModifier(@NotNull OMPParser.OmpParallelModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompSection}.
	 * @param ctx the parse tree
	 */
	void enterOmpSection(@NotNull OMPParser.OmpSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompSection}.
	 * @param ctx the parse tree
	 */
	void exitOmpSection(@NotNull OMPParser.OmpSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompSections}.
	 * @param ctx the parse tree
	 */
	void enterOmpSections(@NotNull OMPParser.OmpSectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompSections}.
	 * @param ctx the parse tree
	 */
	void exitOmpSections(@NotNull OMPParser.OmpSectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompSingle}.
	 * @param ctx the parse tree
	 */
	void enterOmpSingle(@NotNull OMPParser.OmpSingleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompSingle}.
	 * @param ctx the parse tree
	 */
	void exitOmpSingle(@NotNull OMPParser.OmpSingleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompBarrier}.
	 * @param ctx the parse tree
	 */
	void enterOmpBarrier(@NotNull OMPParser.OmpBarrierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompBarrier}.
	 * @param ctx the parse tree
	 */
	void exitOmpBarrier(@NotNull OMPParser.OmpBarrierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompAtomic}.
	 * @param ctx the parse tree
	 */
	void enterOmpAtomic(@NotNull OMPParser.OmpAtomicContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompAtomic}.
	 * @param ctx the parse tree
	 */
	void exitOmpAtomic(@NotNull OMPParser.OmpAtomicContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#sectionsModifier}.
	 * @param ctx the parse tree
	 */
	void enterSectionsModifier(@NotNull OMPParser.SectionsModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#sectionsModifier}.
	 * @param ctx the parse tree
	 */
	void exitSectionsModifier(@NotNull OMPParser.SectionsModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompAccessModifier}.
	 * @param ctx the parse tree
	 */
	void enterOmpAccessModifier(@NotNull OMPParser.OmpAccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompAccessModifier}.
	 * @param ctx the parse tree
	 */
	void exitOmpAccessModifier(@NotNull OMPParser.OmpAccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallelFor}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallelFor(@NotNull OMPParser.OmpParallelForContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallelFor}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallelFor(@NotNull OMPParser.OmpParallelForContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallelForModifier}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallelForModifier(@NotNull OMPParser.OmpParallelForModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallelForModifier}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallelForModifier(@NotNull OMPParser.OmpParallelForModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompSchedule}.
	 * @param ctx the parse tree
	 */
	void enterOmpSchedule(@NotNull OMPParser.OmpScheduleContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompSchedule}.
	 * @param ctx the parse tree
	 */
	void exitOmpSchedule(@NotNull OMPParser.OmpScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompVar}.
	 * @param ctx the parse tree
	 */
	void enterOmpVar(@NotNull OMPParser.OmpVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompVar}.
	 * @param ctx the parse tree
	 */
	void exitOmpVar(@NotNull OMPParser.OmpVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompMaster}.
	 * @param ctx the parse tree
	 */
	void enterOmpMaster(@NotNull OMPParser.OmpMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompMaster}.
	 * @param ctx the parse tree
	 */
	void exitOmpMaster(@NotNull OMPParser.OmpMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#sectionsModifiers}.
	 * @param ctx the parse tree
	 */
	void enterSectionsModifiers(@NotNull OMPParser.SectionsModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#sectionsModifiers}.
	 * @param ctx the parse tree
	 */
	void exitSectionsModifiers(@NotNull OMPParser.SectionsModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallel}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallel(@NotNull OMPParser.OmpParallelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallel}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallel(@NotNull OMPParser.OmpParallelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompThreadNum}.
	 * @param ctx the parse tree
	 */
	void enterOmpThreadNum(@NotNull OMPParser.OmpThreadNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompThreadNum}.
	 * @param ctx the parse tree
	 */
	void exitOmpThreadNum(@NotNull OMPParser.OmpThreadNumContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompParallelModifiers}.
	 * @param ctx the parse tree
	 */
	void enterOmpParallelModifiers(@NotNull OMPParser.OmpParallelModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompParallelModifiers}.
	 * @param ctx the parse tree
	 */
	void exitOmpParallelModifiers(@NotNull OMPParser.OmpParallelModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompNumThreads}.
	 * @param ctx the parse tree
	 */
	void enterOmpNumThreads(@NotNull OMPParser.OmpNumThreadsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompNumThreads}.
	 * @param ctx the parse tree
	 */
	void exitOmpNumThreads(@NotNull OMPParser.OmpNumThreadsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompVars}.
	 * @param ctx the parse tree
	 */
	void enterOmpVars(@NotNull OMPParser.OmpVarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompVars}.
	 * @param ctx the parse tree
	 */
	void exitOmpVars(@NotNull OMPParser.OmpVarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#ompNumber}.
	 * @param ctx the parse tree
	 */
	void enterOmpNumber(@NotNull OMPParser.OmpNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#ompNumber}.
	 * @param ctx the parse tree
	 */
	void exitOmpNumber(@NotNull OMPParser.OmpNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link OMPParser#threadNum}.
	 * @param ctx the parse tree
	 */
	void enterThreadNum(@NotNull OMPParser.ThreadNumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OMPParser#threadNum}.
	 * @param ctx the parse tree
	 */
	void exitThreadNum(@NotNull OMPParser.ThreadNumContext ctx);
}