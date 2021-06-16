package proyecto;

import proyecto.generated.miParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by oviquez on 19/9/2016.
 */
public class TablaSimbolos {
    LinkedList<Object> tabla;

    public int nivelActual;

    public class Ident{
        //esta clase se puede separar para después hacer herencia para meter una lista de los parametros de un método o clases por ejemplo.
        Token tok;
        int type; //esto probablemente cambie a un tipo más estructurado //Aquí cae 0 o 1 para int o char por eso hay que estructurarlo mejor para el proyecto
        int nivel;
        int valor;
        ParserRuleContext declCtx;
        ArrayList<miParser.SimpleTypeContext> idsFuncion;

        public Ident(Token t, int tp, ParserRuleContext decl){
            tok = t;
            type = tp;
            if(nivelActual == -1)
                nivel=nivelActual+1;
            else
                nivel=nivelActual;
            valor = 0;
            declCtx=decl;
        }



        public void setValue(int v){
            valor = v;
        }

        public int getNivel() {
            return nivel;
        }

        public void setIdsFuncion(ArrayList<miParser.SimpleTypeContext> idsFuncion){
            this.idsFuncion = idsFuncion;
        }
    }

    public TablaSimbolos() {
        tabla = new LinkedList<Object>();
        this.nivelActual=-1;
    }

    public void insertar(Token id, int tipo, ParserRuleContext decl)
    {
        //no se puede insertar un elemento repetido en el mismo nivel
        Ident i = new Ident(id,tipo,decl);
        tabla.addFirst(i);
    }

    public void insertarFuncion(Token id, int tipo, ParserRuleContext decl, ArrayList<miParser.SimpleTypeContext> ids)
    {
        //no se puede insertar un elemento repetido en el mismo nivel
        Ident i = new Ident(id,tipo,decl);
        i.setIdsFuncion(ids);
        tabla.addFirst(i);
    }

    public Ident buscar(String nombre)
    {
        //System.out.println("Name "+ nombre);
        Ident temp=null;
        for(Object id : tabla) {
            //System.out.println("Nombe obj "+ ((Ident) id).tok.getText());
            if (((Ident) id).tok.getText().equals(nombre))
                return ((Ident) id);
        }
        return temp;
    }

    public Ident buscarClases(String nombre)
    {
        Ident temp=null;
        for(Object id : tabla)
            if (((Ident)id).tok.getText().equals(nombre))
                if(((Ident)id).type == 10)
                    return ((Ident)id);
        return temp;
    }

    public void openScope(){
        nivelActual++;
    }

    public void closeScope(){
        tabla.removeIf(n -> (((Ident)n).nivel == nivelActual));
        nivelActual--;
    }

}

