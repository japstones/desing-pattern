package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class FeedbackXMLDisplayService extends DisplayService {
    @Override
    protected XMLParser getParser() {
        return new FeedbackXML();
    }
}
