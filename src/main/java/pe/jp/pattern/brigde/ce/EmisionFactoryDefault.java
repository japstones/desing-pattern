package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public class EmisionFactoryDefault extends EmisionFactory{
    @Override
    public Emision getEmision(Invoice invoice) {
        return new InvoiceEmision(invoice);
    }

    @Override
    public Emision getEmision(CreditNote creditNote) {
        return new CreditNoteEmision(creditNote);
    }
}
