package pe.jp.pattern.adapter;

/**
 * Created by Joel on 4/07/16.
 */
public class ElectricGuitar extends Guitar {
    @Override
    void onGuitar() {
        System.out.println("Playing Electronic Guitar");
    }

    @Override
    void offGuitar() {
        System.out.println("I'm tired to play the guitar");
    }
}
