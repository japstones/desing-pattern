package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public abstract class SistemOperativo {
    private Driver driver;

    protected SistemOperativo(Driver driver) {
        this.driver = driver;
    }

    public void informacionDeDriver(){
        System.out.println(this.driver.getName());
    }

    abstract void informacionSistemaOperativo();
}
