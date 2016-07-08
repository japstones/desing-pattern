package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public class LinuxSO extends SistemOperativo {
    public LinuxSO(Driver driver) {
        super(driver);
    }

    @Override
    void informacionSistemaOperativo() {
         System.out.println("Sitema Operativo Linux");
    }
}
