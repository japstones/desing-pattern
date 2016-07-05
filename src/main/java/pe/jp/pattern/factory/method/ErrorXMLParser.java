package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class ErrorXMLParser implements XMLParser{

    @Override
    public String parse() {
        System.out.println("Parsing error XML...");
        return "Error XML Message";
    }
}
