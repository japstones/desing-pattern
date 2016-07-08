package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public abstract class EmisionFactory {

    private static EmisionFactory instance;

    EmisionFactory(){

    }

    public final static EmisionFactory getInstance(){
        synchronized (EmisionFactory.class){
            if(instance == null) {
                instance = new EmisionFactoryDefault();
            }
            return instance;
        }
    }

    public abstract Emision getEmision(Invoice invoice);

    public abstract Emision getEmision(CreditNote creditNote);
}
