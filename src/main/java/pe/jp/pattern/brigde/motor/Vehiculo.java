package pe.jp.pattern.brigde.motor;

/**
 * Created by Joel on 7/07/16.
 */
public abstract class Vehiculo {
    private IMotor motor;

    protected Vehiculo(IMotor motor) {
        this.motor = motor;
    }

    public void acelerar(double combustible) {
        this.motor.inyectarCombustible(combustible);
        this.motor.consumirCombustible();
    }

    public void frenar() {
        System.out.println("El vehiculo estra frenando!");
    }

    public abstract void mostrarCaracteristicas();
}
