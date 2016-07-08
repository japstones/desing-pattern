package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public class InvoiceEmision extends Emision {

    public InvoiceEmision(Invoice invoice) {
        super(invoice);
    }

    @Override
    public final XML getGeneradorXML() {
        return new XML(getDocumentoElectronico());
    }
}
