package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public class Driver64Bits implements Driver {

    private String name;

    public Driver64Bits() {
        this.name = "Driver para arquitectura de 64 bits";
    }

    @Override
    public String getName() {
        return this.name;
    }
}
