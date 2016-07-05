package pe.jp.pattern.adapter;

/**
 * Created by Joel on 4/07/16.
 */
public class MotorComun extends Motor {

    public MotorComun() {
        super();
        System.out.println("Creando el motor comun");
    }

    @Override
    void encender() {
        System.out.println("encendiendo motor comun");
    }

    @Override
    void acelelar() {
        System.out.println("acelerando el motor");
    }

    @Override
    void apagar() {
        System.out.println("apagar el motor");
    }
}
