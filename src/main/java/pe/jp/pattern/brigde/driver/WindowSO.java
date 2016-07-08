package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public class WindowSO extends SistemOperativo {
    public WindowSO(Driver driver) {
        super(driver);
    }

    @Override
    void informacionSistemaOperativo() {
         System.out.println("Sitema Operativo Windows");
    }
}
