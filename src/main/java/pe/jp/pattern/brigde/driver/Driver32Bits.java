package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public class Driver32Bits implements Driver {

    private String name;

    public Driver32Bits() {
        this.name = "Driver para arquitectura de 32 bits";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
