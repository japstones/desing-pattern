package pe.jp.pattern.adapter;

/**
 * Created by Joel on 4/07/16.
 */
public class AdapterWrapperPattern {
    public static void main(String ... arg){
        Guitar eGuitar = new ElectricGuitar();
        eGuitar.onGuitar();
        eGuitar.offGuitar();
        System.out.println("\n");
        Guitar eAGuitar = new ElectricAcousticGuitar();
        eAGuitar.onGuitar();
        eAGuitar.offGuitar();
    }
}
