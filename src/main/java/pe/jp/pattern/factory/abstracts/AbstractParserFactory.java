package pe.jp.pattern.factory.abstracts;

import pe.jp.pattern.factory.method.XMLParser;

/**
 * Created by Joel on 30/06/16.
 */
public interface AbstractParserFactory {
    public XMLParser getParserInstance(String parserType);

}
