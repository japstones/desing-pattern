package pe.jp.pattern.brigde;

/**
 * Created by Joel on 7/07/16.
 */
public class Gasolina implements IMotor {
    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + " ml. de Gasoil");
    }

    @Override
    public void consumirCombustible() {

    }

    private void realizarCombustion(){
        System.out.println("Realizada combustion de la gasolina");
    }
}
