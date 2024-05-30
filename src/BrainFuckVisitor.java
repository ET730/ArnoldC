// Generated from /home/shaggy/IdeaProjects/BrainFuck/src/BrainFuck.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BrainFuckParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BrainFuckVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code begin}
	 * labeled alternative in {@link BrainFuckParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin(BrainFuckParser.BeginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code label}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(BrainFuckParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code print}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(BrainFuckParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(BrainFuckParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dec}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(BrainFuckParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inc}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInc(BrainFuckParser.IncContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lmov}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLmov(BrainFuckParser.LmovContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rmov}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRmov(BrainFuckParser.RmovContext ctx);
	/**
	 * Visit a parse tree produced by the {@code end}
	 * labeled alternative in {@link BrainFuckParser#com}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(BrainFuckParser.EndContext ctx);
}