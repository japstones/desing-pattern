package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class ResponseXMLParser implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing response XML...");
        return "Response XML Message";

    }
}
