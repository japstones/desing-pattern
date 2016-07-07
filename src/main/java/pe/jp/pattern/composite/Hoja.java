package pe.jp.pattern.composite;

/**
 * Created by Joel on 7/07/16.
 */
public class Hoja extends Componente {
    public Hoja(String nombre) {
        super(nombre);
    }

    @Override
    void agregar(Componente c) {
        System.out.println("no se puede agregar la hoja");
    }

    @Override
    void eliminar(Componente c) {
        System.out.println("no se puede quitar la hoja");
    }

    @Override
    void mostrar(int profundidad) {
        System.out.println('-' + "" + nombre);
    }
}
