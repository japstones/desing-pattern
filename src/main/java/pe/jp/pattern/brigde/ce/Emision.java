package pe.jp.pattern.brigde.ce;

import java.text.MessageFormat;

/**
 * Created by Joel on 8/07/16.
 */
public abstract class Emision {
    private DocumentoElectronico comprobante;

    public Emision(DocumentoElectronico comprobante) {
        this.comprobante = comprobante;
    }

    public void generar() {
        System.out.println(MessageFormat.format("Generando una {0}", this.comprobante.getName()));
        XML xml = getGeneradorXML();
        xml.generarXML();

        System.out.println(MessageFormat.format("Fin de la emision de la {0}", this.comprobante.getName()));
    }

    protected DocumentoElectronico getDocumentoElectronico() {
        return this.comprobante;
    }

    protected abstract XML getGeneradorXML();
}
