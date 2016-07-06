package pe.jp.pattern.facade;

/**
 * Created by Joel on 6/07/16.
 */
public class PrincipalCliente {
    public static void main (String ... arg){
        FacadeImpresoraA3 a3 = new FacadeImpresoraA3("Mi texto de A3");
        a3.imprimir();

        FacadeImpresoraA4 a4 = new FacadeImpresoraA4("Mi texto de A4");
        a4.imprimir();
    }
}
