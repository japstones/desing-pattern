package pe.jp.pattern.composite;

/**
 * Created by Joel on 6/07/16.
 */
public abstract class Componente {
    protected String nombre;

    protected Componente(String nombre) {
        this.nombre = nombre;
    }

    abstract void agregar(Componente c);

    abstract void eliminar(Componente c);

    abstract void mostrar(int profundidad);
}
