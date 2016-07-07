package pe.jp.pattern.brigde;

/**
 * Created by Joel on 7/07/16.
 */
public class Cliente {
    public static void main(String ... arg){
        IMotor motorDiesel = new Diesel();
        Vehiculo berlina = new Berlina(motorDiesel, 4);

        berlina.mostrarCaracteristicas();
        berlina.acelerar(2.4d);
    }
}
