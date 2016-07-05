package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class OrderXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing order XML...");
        return "Order XML Message";
    }
}
