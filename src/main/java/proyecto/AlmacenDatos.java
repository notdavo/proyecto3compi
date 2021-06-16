package proyecto;

import org.antlr.v4.runtime.ParserRuleContext;

import java.util.LinkedList;

public class AlmacenDatos {
    LinkedList<Instancia> almacen;

    public class Instancia{
        String nombre;
        Object valor;
        ParserRuleContext ctx;
        int nivelActual = -1;

        public Instancia(String nombre, Object valor) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = null;
        }

        public Instancia(String nombre, Object valor, ParserRuleContext ctx) {
            this.nombre = nombre;
            this.valor = valor;
            this.ctx = ctx;
        }
    }

    public AlmacenDatos() {
        this.almacen = new LinkedList<Instancia>();
    }

    public void agregarInstancia(String n, Object v){
        this.almacen.add(new Instancia(n,v));
    }

    public void agregarInstancia(String n, Object v, ParserRuleContext c){
        this.almacen.add(new Instancia(n,v,c));
    }

    public Instancia getInstancia(String n){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                return id;
        return null;
    }

    public Instancia getInstancia2(String n, int nivel){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                if(id.nivelActual == nivel)
                    return id;
        return null;
    }

    public void setInstancia(String n, Object v, int nivel){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                if(id.nivelActual == nivel)
                    id.valor = v;
                else if(id.nivelActual == -1)
                    id.valor = v;
                else if(n.equals("cont"))
                    id.valor = v;
    }

    public void setNivel(String n, int nivel){
        for(Instancia id : almacen)
            if (id.nombre.equals(n))
                if(id.nivelActual == -1)
                    id.nivelActual = nivel;
    }

    public void recorrer(){
        for(Instancia id : almacen)
            System.out.println(id.nombre + " " + id.valor + " " + id.nivelActual);
    }
}

