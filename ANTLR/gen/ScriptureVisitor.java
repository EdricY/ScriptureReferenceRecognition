// Generated from D:/git/ScriptureReferenceRecognition/ANTLR\Scripture.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ScriptureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ScriptureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ScriptureParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#scripture}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScripture(ScriptureParser.ScriptureContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#book}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBook(ScriptureParser.BookContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReference(ScriptureParser.ReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#addr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddr(ScriptureParser.AddrContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#addrverse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddrverse(ScriptureParser.AddrverseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#chapter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChapter(ScriptureParser.ChapterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#verselist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerselist(ScriptureParser.VerselistContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#verse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerse(ScriptureParser.VerseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#translation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranslation(ScriptureParser.TranslationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ScriptureParser#ordinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdinal(ScriptureParser.OrdinalContext ctx);
}