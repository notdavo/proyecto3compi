parser grammar miParser;
options {
    tokenVocab = miScanner;
}

program : ( statement )*                                                       #programST;

statement         :   variableDeclaration PyComa                               #variableDeclarationST
                    | classDeclaration                                         #classDeclarationST
                    | assignment PyComa                                        #assignmentST
	                | arrayAssignment PyComa                                   #arrayAssignmentST
                    //| printStatement PyComa                                    #printStatementST
                    | ifStatement                                              #ifStatementST
                    | whileStatement                                           #whileStatementST
                    | returnStatement PyComa                                   #returnStatementST
                    | functionDeclaration                                      #functionDeclarationST
                    | block                                                    #blockST
                    | functionCall PyComa                                      #functionCallST
                    | classCall PyComa                                         #classCallST;

block :   LLAIZQ (statement)* LLADER                                           #blockAST;
functionDeclaration     :  type ID PIZQ (formalParams)? PDER block             #functionDeclarationAST;
formalParams     : formalParam (COMA formalParam)*                             #formalParamsAST;
formalParam      : type ID                                                     #formalParamAST;
whileStatement   : WHILE PIZQ expression PDER block                            #whileStatementAST;
ifStatement      : IF PIZQ expression PDER block (ELSE block)?                 #ifStatementAST;
returnStatement  : RETURN expression                                           #returnStatementAST;
//printStatement   : PRINT PIZQ actualParams PDER                                           #printStatementAST;
//classDeclaration    : CLASS ID LLAIZQ  (classVariableDeclaration PyComa)* LLADER      #classDeclarationAST;
classDeclaration    : CLASS ID block      #classDeclarationAST;
classVariableDeclaration       : simpleType ID (ASSIGN expression)?            #classVariableDeclarationAST;
variableDeclaration     : type ID  (ASSIGN expression)?                        #variableDeclarationAST;

type             : simpleType                                                  #simpleTypeAST
                 | arrayType                                                   #arrayTypeT;
simpleType
locals [ParserRuleContext decl=null]
                 : BOOLEAN                                                     #booleanAST
                 | CHAR                                                        #charAST
                 | INT                                                         #intAST
                 | STRING                                                      #stringAST;

arrayType        : simpleType PCIZQ PCDER                                      #arrayTypeAST;
assignment       : ID (POINT ID)? ASSIGN expression                            #assignmentAST;
arrayAssignment  : ID PCIZQ expression PCDER ASSIGN expression                 #arrayAssignmentAST;
expression       : simpleExpression (REOPERATOR simpleExpression)*             #expressionAST;
simpleExpression : term  (ADDITIVEOP term)*                                    #simpleExpressionAST;

term             : factor (MULTIPLICATEOP factor)*                             #termF;
factor           : literal                                                     #factorLiteralF
                 | ID  (POINT ID)?                                             #idF
                 | functionCall                                                #functionCallF
                 | arrayLookup                                                 #arrayLookupF
                 | arrayLength                                                 #arrayLengthF
                 | subExpression                                               #subExpressionF
                 | arrayAllocationExpression                                   #arrayAllocationExpressionF
                 | allocationExpression                                        #allocationExpressionF
                 | unary                                                       #unaryF;
unary            : UNARY (expression)*                                         #unaryAST;
allocationExpression    : NEW ID  PIZQ PDER                                    #allocationExpressionAST;
arrayAllocationExpression        : NEW simpleType PCIZQ expression PCDER       #arrayAllocationExpressionAST;
subExpression    : PIZQ expression PDER                                        #subExpressionAST;
functionCall     : ID PIZQ (actualParams)? PDER                                #functionCallAST;
classCall        : ID ID ASSIGN NEW ID PIZQ PDER                               #classCallAST;
actualParams     : expression (COMA expression)*                               #actualParamsAST;
arrayLookup      : ID PCIZQ expression PCDER                                   #arrayLookupAST;
arrayLength      : ID POINT LENGTH                                             #arrayLengthAST;
boolLiteral      : TRUE | FALSE                                                #boolLiteralAST;
literal          : INTLITERAL                                                  #intL
                 | CHARLITERAL                                                 #charL
                 | boolLiteral                                                 #booleanL
                 | STRINGLITERAL                                               #stringL;


