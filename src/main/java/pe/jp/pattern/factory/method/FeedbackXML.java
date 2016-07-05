package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class FeedbackXML implements XMLParser {
    @Override
    public String parse() {
        System.out.println("Parsing feedback XML...");
        return "Feedback XML Message";

    }
}
