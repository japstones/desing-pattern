package pe.jp.pattern.brigde.motor;

/**
 * Created by Joel on 7/07/16.
 */
public class Diesel implements IMotor{
    @Override
    public void inyectarCombustible(double cantidad) {
        System.out.println("Inyectando " + cantidad + " ml. de Gasoil");
    }

    @Override
    public void consumirCombustible() {
        this.realizarExplosion();
    }

    private void realizarExplosion(){
        System.out.println("Realizada la explosión del Gasoil");
    }
}
