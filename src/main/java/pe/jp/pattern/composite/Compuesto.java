package pe.jp.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joel on 7/07/16.
 */
public class Compuesto extends Componente {

    private List<Componente> hijo;

    public Compuesto(String nombre) {
        super(nombre);
        this.hijo = new ArrayList<Componente>();
    }

    @Override
    void agregar(Componente c) {
        this.hijo.add(c);
    }

    @Override
    void eliminar(Componente c) {
        this.hijo.remove(c);
    }

    @Override
    void mostrar(int profundidad) {
        System.out.println(nombre + " nivel: " + profundidad);
        for (int i = 0; i < hijo.size(); i++)
            hijo.get(i).mostrar(profundidad + 1);
    }
}
