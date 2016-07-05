package pe.jp.pattern.adapter;

/**
 * Created by Joel on 4/07/16.
 */
public class MotorElectrico {
    private boolean conectado = false;

    public MotorElectrico() {
        System.out.println("Creando motor electrico");
        this.conectado = false;
    }

    public void conectar(){
        System.out.println("Conectando el motor electrico");
    }

    public void activar(){
        if(!conectado){
            System.out.println("NO se puede activar porque no " +
            "esta conectado el motor electrico");
        } else {
            System.out.println("Esta conectado, activando motor electrico");
        }
    }

    public void moverMasRapido(){
        if(!conectado){
            System.out.println("No se puede mover rapido el motor, porque no esta conectado...");
        } else {
            System.out.println("Moviendo mas rapdio, aumentando voltaje");
        }
    }

    public void detener(){
        if(!conectado){
            System.out.println("No se puede detener el motor, porque no esta conectado...");
        } else {
            System.out.println("Deteniendo el motor electrico");
        }
    }

    public void desconectar(){
        System.out.println("Desconectando el motor electrico");
        this.conectado = false;
    }


}
