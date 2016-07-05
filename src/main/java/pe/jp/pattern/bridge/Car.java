package pe.jp.pattern.bridge;

/**
 * Created by Joel on 1/07/16.
 */
public abstract class Car {
    private final Product product;
    private final String carType;

    public Car(Product product,String carType){
        this.product = product;
        this.carType = carType;
    }

    public abstract void assemble();
    public abstract void produceProduct();

    public void printDetails(){
        System.out.println("Car: "+carType+", Product:"+product.productName());
    }
}
