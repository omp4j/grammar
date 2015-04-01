// Generated from OMP.g4 by ANTLR 4.4
package org.omp4j.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OMPParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OMPVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallelForModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallelForModifiers(@NotNull OMPParser.OmpParallelForModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompCritical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpCritical(@NotNull OMPParser.OmpCriticalContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpFor(@NotNull OMPParser.OmpForContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpUnit(@NotNull OMPParser.OmpUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallelModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallelModifier(@NotNull OMPParser.OmpParallelModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompSection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpSection(@NotNull OMPParser.OmpSectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompSections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpSections(@NotNull OMPParser.OmpSectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpSingle(@NotNull OMPParser.OmpSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompBarrier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpBarrier(@NotNull OMPParser.OmpBarrierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompAtomic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpAtomic(@NotNull OMPParser.OmpAtomicContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompFirstPrivate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpFirstPrivate(@NotNull OMPParser.OmpFirstPrivateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#sectionsModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionsModifier(@NotNull OMPParser.SectionsModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompAccessModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpAccessModifier(@NotNull OMPParser.OmpAccessModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallelFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallelFor(@NotNull OMPParser.OmpParallelForContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallelForModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallelForModifier(@NotNull OMPParser.OmpParallelForModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompPrivate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpPrivate(@NotNull OMPParser.OmpPrivateContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompSchedule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpSchedule(@NotNull OMPParser.OmpScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpVar(@NotNull OMPParser.OmpVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpMaster(@NotNull OMPParser.OmpMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#sectionsModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSectionsModifiers(@NotNull OMPParser.SectionsModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallel(@NotNull OMPParser.OmpParallelContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompPublic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpPublic(@NotNull OMPParser.OmpPublicContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompThreadNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpThreadNum(@NotNull OMPParser.OmpThreadNumContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompParallelModifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpParallelModifiers(@NotNull OMPParser.OmpParallelModifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompNumThreads}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpNumThreads(@NotNull OMPParser.OmpNumThreadsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompVars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpVars(@NotNull OMPParser.OmpVarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#ompNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOmpNumber(@NotNull OMPParser.OmpNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link OMPParser#threadNum}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadNum(@NotNull OMPParser.ThreadNumContext ctx);
}