package pe.jp.pattern.adapter;

/**
 * Esta clase es desde la cual heredaran los diferentes tipo de motores, provee los metodos comunes
 * (encender, acelerar, apagar) para el funcionamiento de los mismos.
 * Created by Joel on 4/07/16.
 */
public abstract class Motor {
    abstract void encender();
    abstract void acelelar();
    abstract void apagar();
}
