package pe.jp.pattern.factory.method;

/**
 * Created by Joel on 30/06/16.
 */
public abstract class DisplayService {
    public void display(){
        XMLParser parser = getParser();
        String msg = parser.parse();
        System.out.println(msg);
    }

    protected abstract XMLParser getParser();
}
