package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public class TestFactoryMethodPattern {
    public static void main(String... arg){
        DisplayService service = new FeedbackXMLDisplayService();
        service.display();
    }
}
