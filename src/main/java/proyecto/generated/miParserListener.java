// Generated from C:/Users/Davo/Desktop/ProyectoCompiladores\miParser.g4 by ANTLR 4.9.1
package proyecto.generated;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miParser}.
 */
public interface miParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code programST}
	 * labeled alternative in {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgramST(miParser.ProgramSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code programST}
	 * labeled alternative in {@link miParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgramST(miParser.ProgramSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationST(miParser.VariableDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationST(miParser.VariableDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationST(miParser.ClassDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationST(miParser.ClassDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentST(miParser.AssignmentSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentST(miParser.AssignmentSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementST(miParser.IfStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementST(miParser.IfStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementST(miParser.WhileStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementST(miParser.WhileStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementST(miParser.ReturnStatementSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementST(miParser.ReturnStatementSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockST(miParser.BlockSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockST(miParser.BlockSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallST(miParser.FunctionCallSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallST(miParser.FunctionCallSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClassCallST(miParser.ClassCallSTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classCallST}
	 * labeled alternative in {@link miParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClassCallST(miParser.ClassCallSTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlockAST(miParser.BlockASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link miParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlockAST(miParser.BlockASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionDeclarationAST}
	 * labeled alternative in {@link miParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionDeclarationAST}
	 * labeled alternative in {@link miParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamsAST(miParser.FormalParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link miParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamsAST(miParser.FormalParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamAST(miParser.FormalParamASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link miParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamAST(miParser.FormalParamASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatementAST(miParser.WhileStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatementAST}
	 * labeled alternative in {@link miParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatementAST(miParser.WhileStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementAST(miParser.IfStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementAST}
	 * labeled alternative in {@link miParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementAST(miParser.IfStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatementAST(miParser.ReturnStatementASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStatementAST}
	 * labeled alternative in {@link miParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatementAST(miParser.ReturnStatementASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classDeclarationAST}
	 * labeled alternative in {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationAST(miParser.ClassDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classDeclarationAST}
	 * labeled alternative in {@link miParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationAST(miParser.ClassDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classVariableDeclarationAST}
	 * labeled alternative in {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classVariableDeclarationAST}
	 * labeled alternative in {@link miParser#classVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableDeclarationAST}
	 * labeled alternative in {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableDeclarationAST}
	 * labeled alternative in {@link miParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTypeAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTypeAST(miParser.SimpleTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTypeAST}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTypeAST(miParser.SimpleTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeT}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeT(miParser.ArrayTypeTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeT}
	 * labeled alternative in {@link miParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeT(miParser.ArrayTypeTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAST(miParser.BooleanASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAST(miParser.BooleanASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterCharAST(miParser.CharASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitCharAST(miParser.CharASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterIntAST(miParser.IntASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitIntAST(miParser.IntASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterStringAST(miParser.StringASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAST}
	 * labeled alternative in {@link miParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitStringAST(miParser.StringASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayTypeAST(miParser.ArrayTypeASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link miParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayTypeAST(miParser.ArrayTypeASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentAST(miParser.AssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link miParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentAST(miParser.AssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link miParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAST(miParser.ExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link miParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAST(miParser.ExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExpressionAST}
	 * labeled alternative in {@link miParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code termF}
	 * labeled alternative in {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTermF(miParser.TermFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code termF}
	 * labeled alternative in {@link miParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTermF(miParser.TermFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code factorLiteralF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactorLiteralF(miParser.FactorLiteralFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code factorLiteralF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactorLiteralF(miParser.FactorLiteralFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterIdF(miParser.IdFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitIdF(miParser.IdFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallF(miParser.FunctionCallFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallF(miParser.FunctionCallFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookupF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookupF(miParser.ArrayLookupFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookupF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookupF(miParser.ArrayLookupFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthF(miParser.ArrayLengthFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthF(miParser.ArrayLengthFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterSubExpressionF(miParser.SubExpressionFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitSubExpressionF(miParser.SubExpressionFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAllocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpressionF(miParser.ArrayAllocationExpressionFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAllocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpressionF(miParser.ArrayAllocationExpressionFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpressionF(miParser.AllocationExpressionFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocationExpressionF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpressionF(miParser.AllocationExpressionFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterUnaryF(miParser.UnaryFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryF}
	 * labeled alternative in {@link miParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitUnaryF(miParser.UnaryFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnaryAST(miParser.UnaryASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link miParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnaryAST(miParser.UnaryASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code allocationExpressionAST}
	 * labeled alternative in {@link miParser#allocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAllocationExpressionAST}
	 * labeled alternative in {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAllocationExpressionAST}
	 * labeled alternative in {@link miParser#arrayAllocationExpression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpressionAST(miParser.SubExpressionASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpressionAST}
	 * labeled alternative in {@link miParser#subExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpressionAST(miParser.SubExpressionASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallAST(miParser.FunctionCallASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link miParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallAST(miParser.FunctionCallASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classCallAST}
	 * labeled alternative in {@link miParser#classCall}.
	 * @param ctx the parse tree
	 */
	void enterClassCallAST(miParser.ClassCallASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classCallAST}
	 * labeled alternative in {@link miParser#classCall}.
	 * @param ctx the parse tree
	 */
	void exitClassCallAST(miParser.ClassCallASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void enterActualParamsAST(miParser.ActualParamsASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link miParser#actualParams}.
	 * @param ctx the parse tree
	 */
	void exitActualParamsAST(miParser.ActualParamsASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void enterArrayLookupAST(miParser.ArrayLookupASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link miParser#arrayLookup}.
	 * @param ctx the parse tree
	 */
	void exitArrayLookupAST(miParser.ArrayLookupASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthAST(miParser.ArrayLengthASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link miParser#arrayLength}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthAST(miParser.ArrayLengthASTContext ctx);
	/**
	 * Enter a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link miParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(miParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterIntL(miParser.IntLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitIntL(miParser.IntLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterCharL(miParser.CharLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitCharL(miParser.CharLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterBooleanL(miParser.BooleanLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitBooleanL(miParser.BooleanLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterStringL(miParser.StringLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringL}
	 * labeled alternative in {@link miParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitStringL(miParser.StringLContext ctx);
}