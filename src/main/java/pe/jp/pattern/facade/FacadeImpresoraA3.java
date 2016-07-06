package pe.jp.pattern.facade;

/**
 * Created by Joel on 6/07/16.
 */
public class FacadeImpresoraA3 {
    private Impresora impresora;

    public FacadeImpresoraA3(String texto) {
        super();
        impresora = new Impresora();
        impresora.setColor(true);
        impresora.setHoja("A3");
        impresora.setTipoDocumento("PDF");
        impresora.setTexto(texto);
    }

    public void imprimir(){
        impresora.imprimir();
    }
}
