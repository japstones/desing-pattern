package pe.jp.pattern.adapter;

/** We Adapter/Wrapper AcousticGuitar into
 *  * ElectronicAcousticGuitar to adapt into the GuitarModel
 * Created by Joel on 4/07/16.
 */
public class ElectricAcousticGuitar extends Guitar{
    private AcousticGuitar acoustic ;

    public ElectricAcousticGuitar() {
        this.acoustic = new AcousticGuitar();
    }

    @Override
    void onGuitar() {
        System.out.println("On Guitar");
        this.acoustic.play();
    }

    @Override
    void offGuitar() {
        System.out.println("Off Guitar");
        this.acoustic.leaveGuitar();
    }
}
