package pe.jp.pattern.brigde.motor;

/**
 * Created by Joel on 7/07/16.
 */
public class Berlina extends Vehiculo {

    private int capacidadMaletero;

    public Berlina(IMotor motor, int capacidadMaletero) {
        super(motor);
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("Vehiculo de tipo Berlina con un maletero con una capacidad de " + capacidadMaletero + " litros.");
    }
}
