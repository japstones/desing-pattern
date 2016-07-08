package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public class CreditNoteEmision extends Emision {

    public CreditNoteEmision(CreditNote creditNote) {
        super(creditNote);
    }

    @Override
    public final XML getGeneradorXML() {
        return new XML(getDocumentoElectronico());
    }
}
