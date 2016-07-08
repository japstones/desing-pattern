package pe.jp.pattern.brigde.motor;

/**
 * Created by Joel on 7/07/16.
 */
public class Monovolumen extends Vehiculo {
    private boolean puertaCorrediza;

    public Monovolumen(IMotor motor, boolean puertaCorrediza) {
        super(motor);
        this.puertaCorrediza = puertaCorrediza;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Vehiculo de tipo Berlina " + (puertaCorrediza ? "con" : "sin") +
                " puerta corrediza.");
    }
}
