package pe.jp.pattern.bridge;

/**
 * Created by Joel on 1/07/16.
 */
public class GearLocking implements Product{

    private final String productName;

    public GearLocking(String productName){
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking System");
    }

}
