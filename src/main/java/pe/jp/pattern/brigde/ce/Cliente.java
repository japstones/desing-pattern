package pe.jp.pattern.brigde.ce;

/**
 * Created by Joel on 8/07/16.
 */
public class Cliente {
    public static void main(String... arg) {
        EmisionFactory factory = EmisionFactory.getInstance();

        Invoice invoice = new Invoice();
        Emision eInvoice = factory.getEmision(invoice);

        eInvoice.generar();

        System.out.println("\n");
        CreditNote creditNote = new CreditNote();
        Emision eCreditNote = factory.getEmision(creditNote);
        eCreditNote.generar();
    }
}
