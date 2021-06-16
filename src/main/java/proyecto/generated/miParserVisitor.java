// Generated from C:/Users/Davo/Desktop/ProyectoCompiladores\miParser.g4 by ANTLR 4.9.1
package proyecto.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programST}
	 * labeled alternative in {@link miParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramST(miParser.ProgramSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationST(miParser.VariableDeclarationSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationST(miParser.ClassDeclarationSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentST(miParser.AssignmentSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementST(miParser.IfStatementSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementST(miParser.WhileStatementSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementST(miParser.ReturnStatementSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockST(miParser.BlockSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallST(miParser.FunctionCallSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCallST(miParser.ClassCallSTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link miParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockAST(miParser.BlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclarationAST}
	 * labeled alternative in {@link miParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamsAST(miParser.FormalParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamAST(miParser.FormalParamASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatementAST(miParser.WhileStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementAST(miParser.IfStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatementAST(miParser.ReturnStatementASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclarationAST}
	 * labeled alternative in {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclarationAST(miParser.ClassDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classVariableDeclarationAST}
	 * labeled alternative in {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclarationAST}
	 * labeled alternative in {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTypeAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTypeAST(miParser.SimpleTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeT}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeT(miParser.ArrayTypeTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAST(miParser.BooleanASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharAST(miParser.CharASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntAST(miParser.IntASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAST(miParser.StringASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeAST(miParser.ArrayTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link miParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAST(miParser.AssignmentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link miParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(miParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termF}
	 * labeled alternative in {@link miParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermF(miParser.TermFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code factorLiteralF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactorLiteralF(miParser.FactorLiteralFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdF(miParser.IdFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallF(miParser.FunctionCallFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookupF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupF(miParser.ArrayLookupFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthF(miParser.ArrayLengthFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpressionF(miParser.SubExpressionFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAllocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationExpressionF(miParser.ArrayAllocationExpressionFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpressionF(miParser.AllocationExpressionFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryF(miParser.UnaryFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link miParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAST(miParser.UnaryASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAllocationExpressionAST}
	 * labeled alternative in {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpressionAST(miParser.SubExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallAST(miParser.FunctionCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classCallAST}
	 * labeled alternative in {@link miParser#classCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCallAST(miParser.ClassCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamsAST(miParser.ActualParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupAST(miParser.ArrayLookupASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthAST(miParser.ArrayLengthASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntL(miParser.IntLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharL(miParser.CharLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanL(miParser.BooleanLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringL(miParser.StringLContext ctx);
}