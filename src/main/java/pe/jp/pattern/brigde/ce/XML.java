package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public  class XML {
    private DocumentoElectronico comprobante;

    public XML(DocumentoElectronico comprobante) {
        this.comprobante = comprobante;
    }

    public void generarXML(){
        System.out.println("Generar XML de " + this.comprobante.getName());
    }
}
