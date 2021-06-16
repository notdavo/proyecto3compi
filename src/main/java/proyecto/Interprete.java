package proyecto;

import proyecto.generated.miParser;
import proyecto.generated.miParserBaseVisitor;

import java.util.Stack;

public class Interprete extends miParserBaseVisitor {
    private Stack<Object> pilaExpresiones;
    private AlmacenDatos almacenDatos;
    private TablaSimbolos tabla;

    private String todoPrints = "";

    public Interprete(){
        tabla = new TablaSimbolos();
        this.pilaExpresiones= new Stack<Object>();
        this.almacenDatos = new AlmacenDatos();
    }

    @Override
    public Object visitProgramST(miParser.ProgramSTContext ctx) {
        tabla.openScope();
        for(miParser.StatementContext c : ctx.statement()){
            Object a = this.visit(c);
        }
        tabla.closeScope();
        return null;
    }

    @Override
    public Object visitVariableDeclarationST(miParser.VariableDeclarationSTContext ctx) {
        this.visit(ctx.variableDeclaration());
        return null;
    }

    @Override
    public Object visitClassDeclarationST(miParser.ClassDeclarationSTContext ctx) {
        tabla.openScope();
        this.visit(ctx.classDeclaration());
        tabla.closeScope();
        return null;
    }

    @Override
    public Object visitAssignmentST(miParser.AssignmentSTContext ctx) {
        return super.visitAssignmentST(ctx);
    }

    @Override
    public Object visitArrayAssignmentST(miParser.ArrayAssignmentSTContext ctx) {
        return super.visitArrayAssignmentST(ctx);
    }

    @Override
    public Object visitIfStatementST(miParser.IfStatementSTContext ctx) {
        this.visit(ctx.ifStatement());
        return null;
    }

    @Override
    public Object visitWhileStatementST(miParser.WhileStatementSTContext ctx) {
        return super.visitWhileStatementST(ctx);
    }

    @Override
    public Object visitReturnStatementST(miParser.ReturnStatementSTContext ctx) {
        return super.visitReturnStatementST(ctx);
    }

    @Override
    public Object visitFunctionDeclarationST(miParser.FunctionDeclarationSTContext ctx) {
        return this.visit(ctx.functionDeclaration());
    }

    @Override
    public Object visitBlockST(miParser.BlockSTContext ctx) {
        return super.visitBlockST(ctx);
    }

    @Override
    public Object visitFunctionCallST(miParser.FunctionCallSTContext ctx) {
        visit(ctx.functionCall());
        //TODO: hay que saber si el método no es void para no hacer pop
        //pilaExpresiones.pop();
        return null;
    }

    @Override
    public Object visitClassCallST(miParser.ClassCallSTContext ctx) {
        return super.visitClassCallST(ctx);
    }

    @Override
    public Object visitBlockAST(miParser.BlockASTContext ctx) {
        for(miParser.StatementContext c : ctx.statement()){
            Object a = this.visit(c);
        }
        return null;
    }

    @Override
    public Object visitFunctionDeclarationAST(miParser.FunctionDeclarationASTContext ctx) {
        almacenDatos.agregarInstancia(ctx.ID().getText(),null,ctx);
        return null;
    }

    @Override
    public Object visitFormalParamsAST(miParser.FormalParamsASTContext ctx) {
        for(miParser.FormalParamContext v : ctx.formalParam()) {
            String n = (String) visit(v);
            almacenDatos.setInstancia(n,pilaExpresiones.pop(), tabla.nivelActual);
        }

        return null;
    }

    @Override
    public Object visitFormalParamAST(miParser.FormalParamASTContext ctx) {
        Object a = visit(ctx.type());
        String tipo = a.toString();
        if (tipo.equals("int"))
            this.almacenDatos.agregarInstancia(ctx.ID().getText(),0);
        else if(tipo.equals("char"))
            this.almacenDatos.agregarInstancia(ctx.ID().getText(),' ');
        else if(tipo.equals("string"))
            this.almacenDatos.agregarInstancia(ctx.ID().getText()," ");
        else if(tipo.equals("boolean"))
            this.almacenDatos.agregarInstancia(ctx.ID().getText(),true);
        return ctx.ID().getText();
    }

    @Override
    public Object visitWhileStatementAST(miParser.WhileStatementASTContext ctx) {
        tabla.openScope();
        boolean bandera = true;
        while(bandera) {
            Object a = this.visit(ctx.expression());
            bandera = (boolean) a;
            if ((boolean) a) {
                this.visit(ctx.block());
            }
        }
        tabla.closeScope();
        return null;
    }

    @Override
    public Object visitIfStatementAST(miParser.IfStatementASTContext ctx) {
        tabla.openScope();
        Object a = this.visit(ctx.expression());
        if((boolean)a){
            this.visit(ctx.block(0));
        }else{
            if(ctx.ELSE() != null){
                this.visit(ctx.block(1));
            }
        }
        tabla.closeScope();
        return null;
    }

    @Override
    public Object visitReturnStatementAST(miParser.ReturnStatementASTContext ctx) {
        pilaExpresiones.push(visit(ctx.expression()));
        return null;
    }

    @Override
    public Object visitClassVariableDeclarationAST(miParser.ClassVariableDeclarationASTContext ctx) {

        return null;

    }

    @Override
    public Object visitVariableDeclarationAST(miParser.VariableDeclarationASTContext ctx) {
        String tipo = ctx.type().getText();
        String nombre = ctx.ID().getText();

        if(almacenDatos.getInstancia(ctx.ID().getText()) == null) {
            if (tipo.equals("int")) {
                this.almacenDatos.agregarInstancia(ctx.ID().getText(), 0);
                this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
            } else if (tipo.equals("char")) {
                this.almacenDatos.agregarInstancia(ctx.ID().getText(), ' ');
                this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
            } else if (tipo.equals("string")) {
                this.almacenDatos.agregarInstancia(ctx.ID().getText(), "");
                this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
            } else if (tipo.equals("boolean")) {
                this.almacenDatos.agregarInstancia(ctx.ID().getText(), true);
                this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
            }
        }else{
            if(almacenDatos.getInstancia(ctx.ID().getText()).nivelActual != tabla.nivelActual){
                if (tipo.equals("int")) {
                    this.almacenDatos.agregarInstancia(ctx.ID().getText(), 0);
                    this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
                } else if (tipo.equals("char")) {
                    this.almacenDatos.agregarInstancia(ctx.ID().getText(), ' ');
                    this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
                } else if (tipo.equals("string")) {
                    this.almacenDatos.agregarInstancia(ctx.ID().getText(), "");
                    this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
                } else if (tipo.equals("boolean")) {
                    this.almacenDatos.agregarInstancia(ctx.ID().getText(), true);
                    this.almacenDatos.setNivel(ctx.ID().getText(), tabla.nivelActual);
                }
            }
        }

        if(ctx.ASSIGN() != null){
            Object asignacion = this.visit(ctx.expression());
            if(tipo.equals("int")){
                int valor = Integer.parseInt(asignacion.toString());
                almacenDatos.setInstancia(nombre,valor, tabla.nivelActual);
            }else if(tipo.equals("string")){
                String valor = asignacion.toString();
                if(valor.charAt(0) == '"')
                    valor = valor.substring(1, valor.length() - 1);
                almacenDatos.setInstancia(nombre,valor, tabla.nivelActual);
            }else if(tipo.equals("char")){
                char valor = asignacion.toString().charAt(1);
                almacenDatos.setInstancia(nombre,valor, tabla.nivelActual);
            }else if(tipo.equals("boolean")){
                boolean valor;
                if(asignacion.toString().equals("true"))
                    valor = true;
                else
                    valor = false;
                almacenDatos.setInstancia(nombre,valor, tabla.nivelActual);
            }
        }
        return ctx.ID().getText();
    }

    @Override
    public Object visitSimpleTypeAST(miParser.SimpleTypeASTContext ctx) {
        Object a = this.visit(ctx.simpleType());
        return a;
    }

    @Override
    public Object visitArrayTypeT(miParser.ArrayTypeTContext ctx) {
        return super.visitArrayTypeT(ctx);
    }

    @Override
    public Object visitBooleanAST(miParser.BooleanASTContext ctx) {
        return ctx.BOOLEAN();
    }

    @Override
    public Object visitCharAST(miParser.CharASTContext ctx) {
        return ctx.CHAR();
    }

    @Override
    public Object visitIntAST(miParser.IntASTContext ctx) {
        return ctx.INT();
    }

    @Override
    public Object visitStringAST(miParser.StringASTContext ctx) {
        return ctx.STRING();
    }

    @Override
    public Object visitArrayTypeAST(miParser.ArrayTypeASTContext ctx) {
        return super.visitArrayTypeAST(ctx);
    }

    @Override
    public Object visitAssignmentAST(miParser.AssignmentASTContext ctx) {
        Object asignacion = this.visit(ctx.expression());
        String nombre = ctx.ID(0).toString();
        if(asignacion.toString().equals("true") || asignacion.toString().equals("false")){
            if(asignacion.toString().equals("true"))
                almacenDatos.setInstancia(nombre,true, tabla.nivelActual);
            else
                almacenDatos.setInstancia(nombre,false, tabla.nivelActual);
        }else if(asignacion.toString().charAt(0) == '"'){
            almacenDatos.setInstancia(nombre,asignacion.toString(), tabla.nivelActual);
        }else{
            try{
                int a = (int) asignacion;
                almacenDatos.setInstancia(nombre,a, tabla.nivelActual);
            }catch(ClassCastException e){
                char a = asignacion.toString().charAt(0);
                almacenDatos.setInstancia(nombre,asignacion.toString().charAt(0), tabla.nivelActual);
            }
        }
        return null;
    }

    @Override
    public Object visitArrayAssignmentAST(miParser.ArrayAssignmentASTContext ctx) {
        return super.visitArrayAssignmentAST(ctx);
    }

    @Override
    public Object visitExpressionAST(miParser.ExpressionASTContext ctx) {
        Object v1 = visit(ctx.simpleExpression(0));
        if(ctx.REOPERATOR().size() != 0){
            for(int i=1; i< ctx.simpleExpression().size(); i++){
                Object op = ctx.REOPERATOR(i-1);
                Object v2 = this.visit(ctx.simpleExpression(i));
                if(op != null)
                    v1 =operar(v1,v2,op.toString());
            }
        }
        return v1;
    }

    private Object operar(Object v1, Object v2, String op){
        Object result=null;
        try{
            if (op.equals("+")) {
                result = Integer.parseInt(v1.toString()) + Integer.parseInt(v2.toString());
            }else if (op.equals("*")) {
                result = Integer.parseInt(v1.toString()) * Integer.parseInt(v2.toString());
            }else if (op.equals("/"))
                result = Integer.parseInt(v1.toString()) / Integer.parseInt(v2.toString());
            else if (op.equals("-"))
                result = Integer.parseInt(v1.toString()) - Integer.parseInt(v2.toString());
            else if (op.equals("<")) {
                result = Integer.parseInt(v1.toString()) < Integer.parseInt(v2.toString());
            }else if (op.equals(">"))
                result = ((Integer) v1) > ((Integer) v2);
            else if (op.equals("<="))
                result = ((Integer) v1) <= ((Integer) v2);
            else if (op.equals(">="))
                result = ((Integer) v1) >= ((Integer) v2);
            else if (op.equals("==")) {
                result = v1.toString().equals(v2.toString());
            }
        }catch (ClassCastException e) {
            if (op.equals("+")) {
                String valor1 = (String) v1;
                String valor2 = (String) v2;
                result = valor1 + valor2;
            }
        }catch(NumberFormatException e2){
            if (op.equals("+")) {
                String valor1 = (String) v1;
                String valor2 = (String) v2;
                result = valor1 + valor2;
            }
        }
        return result;
    }

    @Override
    public Object visitSimpleExpressionAST(miParser.SimpleExpressionASTContext ctx) {
        Object v1 = this.visit(ctx.term(0));
        if(ctx.ADDITIVEOP().size() != 0){
            for(int i=1; i< ctx.term().size(); i++){
                Object op = ctx.ADDITIVEOP(i-1);
                Object v2 = this.visit(ctx.term(i));
                if(op != null)
                    v1 =operar(v1,v2,op.toString());
            }
        }
        return v1;
    }

    @Override
    public Object visitTermF(miParser.TermFContext ctx) {
        Object v1 = this.visit(ctx.factor(0));
        if(ctx.MULTIPLICATEOP().size() != 0){
            for(int i=1; i< ctx.factor().size(); i++){
                Object op = ctx.MULTIPLICATEOP(i-1);
                Object v2 = this.visit(ctx.factor(i));
                if(op != null)
                    v1 =operar(v1,v2,op.toString());
            }
        }
        return v1;
    }

    @Override
    public Object visitFactorLiteralF(miParser.FactorLiteralFContext ctx) {
        return this.visit(ctx.literal());
    }

    @Override
    public Object visitIdF(miParser.IdFContext ctx) {
        AlmacenDatos.Instancia a = almacenDatos.getInstancia2(ctx.ID(0).getText(), tabla.nivelActual);

        if(a == null){
            AlmacenDatos.Instancia a2 = almacenDatos.getInstancia(ctx.ID(0).getText());
            return a2.valor;
        }
        return a.valor;
    }

    @Override
    public Object visitFunctionCallF(miParser.FunctionCallFContext ctx) {
        visit(ctx.functionCall());
        return pilaExpresiones.pop();
    }

    @Override
    public Object visitArrayLookupF(miParser.ArrayLookupFContext ctx) {
        return super.visitArrayLookupF(ctx);
    }

    @Override
    public Object visitArrayLengthF(miParser.ArrayLengthFContext ctx) {
        return super.visitArrayLengthF(ctx);
    }

    @Override
    public Object visitSubExpressionF(miParser.SubExpressionFContext ctx) {
        return super.visitSubExpressionF(ctx);
    }

    @Override
    public Object visitArrayAllocationExpressionF(miParser.ArrayAllocationExpressionFContext ctx) {
        return super.visitArrayAllocationExpressionF(ctx);
    }

    @Override
    public Object visitAllocationExpressionF(miParser.AllocationExpressionFContext ctx) {
        return super.visitAllocationExpressionF(ctx);
    }

    @Override
    public Object visitUnaryF(miParser.UnaryFContext ctx) {
        return super.visitUnaryF(ctx);
    }

    @Override
    public Object visitUnaryAST(miParser.UnaryASTContext ctx) {
        return super.visitUnaryAST(ctx);
    }

    @Override
    public Object visitAllocationExpressionAST(miParser.AllocationExpressionASTContext ctx) {
        return super.visitAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitArrayAllocationExpressionAST(miParser.ArrayAllocationExpressionASTContext ctx) {
        return super.visitArrayAllocationExpressionAST(ctx);
    }

    @Override
    public Object visitSubExpressionAST(miParser.SubExpressionASTContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitFunctionCallAST(miParser.FunctionCallASTContext ctx) {
        Object result=null;

        if (ctx.ID().getText().equals("print")) {
            Object a = visit(ctx.actualParams());
            //System.out.println(pilaExpresiones.pop());
            todoPrints = todoPrints + pilaExpresiones.pop() + "\n";
        }else if (ctx.ID().getText().equals("len")) {
            Object a = this.visit(ctx.actualParams());
            String valor2 = a.toString();
            if(valor2.charAt(0) == '"') {
                valor2 = valor2.substring(1, valor2.length() - 1);
                //System.out.println("Len: "+valor2.length());
                todoPrints = todoPrints + "Len: "+valor2.length() + "\n";
            }else {
                //System.out.println("Len: " + valor2.length());
                todoPrints = todoPrints + "Len: "+valor2.length() + "\n";
            }

        }else if (ctx.ID().getText().equals("chr")){
            Object a = ctx.actualParams().getText();
            AlmacenDatos.Instancia inst = almacenDatos.getInstancia(a.toString());
            String nombreI = inst.nombre;
            Object valorI = inst.valor;
            int aa = Integer.parseInt(valorI.toString());
            char valorChar = (char) (aa+'0');
            this.almacenDatos.setInstancia(nombreI,valorChar, tabla.nivelActual);
        }else if (ctx.ID().getText().equals("ord")){
            Object a = ctx.actualParams().getText();
            AlmacenDatos.Instancia inst = almacenDatos.getInstancia(a.toString());
            String nombreI = inst.nombre;
            Object valorI = inst.valor;
            int charToInt = Character.getNumericValue(valorI.toString().charAt(1));
            this.almacenDatos.setInstancia(nombreI,charToInt, tabla.nivelActual);
        }
        else {
            //TODO: crear almacen local

            AlmacenDatos.Instancia i = almacenDatos.getInstancia(ctx.ID().getText());
            //lidiar con parametros reales y formales
            visit(ctx.actualParams());
            Object a = visit(((miParser.FunctionDeclarationASTContext) i.ctx).formalParams());

            //tengo que visitar cuerpo del método
            tabla.openScope();
            visit(((miParser.FunctionDeclarationASTContext) i.ctx).block());
            tabla.closeScope();
            //TODO: eliminar almacen local
        }
        //retornar
        return result;
    }

    @Override
    public Object visitClassCallAST(miParser.ClassCallASTContext ctx) {
        return super.visitClassCallAST(ctx);
    }

    @Override
    public Object visitActualParamsAST(miParser.ActualParamsASTContext ctx) {
        Object a = this.visit(ctx.expression(0));
        for(int i= ctx.expression().size()-1; i>=0; i--) {
            pilaExpresiones.push(visit(ctx.expression(i)));
        }
        return a;
    }

    @Override
    public Object visitArrayLookupAST(miParser.ArrayLookupASTContext ctx) {
        return super.visitArrayLookupAST(ctx);
    }

    @Override
    public Object visitArrayLengthAST(miParser.ArrayLengthASTContext ctx) {
        return super.visitArrayLengthAST(ctx);
    }

    @Override
    public Object visitBoolLiteral(miParser.BoolLiteralContext ctx) {
        return super.visitBoolLiteral(ctx);
    }

    @Override
    public Object visitIntL(miParser.IntLContext ctx) {
        return ctx.INTLITERAL();
    }

    @Override
    public Object visitCharL(miParser.CharLContext ctx) {
        return ctx.CHARLITERAL();
    }

    @Override
    public Object visitBooleanL(miParser.BooleanLContext ctx) {
        return this.visit(ctx.boolLiteral());
    }

    @Override
    public Object visitStringL(miParser.StringLContext ctx) {
        return ctx.STRINGLITERAL();
    }

    public String getMensaje(){
        return todoPrints;
    }
}
