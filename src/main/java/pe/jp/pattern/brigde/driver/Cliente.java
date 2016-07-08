package pe.jp.pattern.brigde.driver;

/**
 * Created by Joel on 8/07/16.
 */
public class Cliente {
    public static void main(String ... arg){
        Driver driver = new Driver64Bits();
        SistemOperativo so = new LinuxSO(driver);

        so.informacionSistemaOperativo();
        so.informacionDeDriver();

        System.out.println("\n");

        driver = new Driver32Bits();
        so = new WindowSO(driver);
        so.informacionSistemaOperativo();
        so.informacionDeDriver();
    }
}
