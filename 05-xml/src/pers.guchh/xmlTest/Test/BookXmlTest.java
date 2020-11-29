package pers.guchh.xmlTest.Test;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;
import pers.guchh.xmlTest.book.Book;


import java.math.BigDecimal;
import java.util.List;

public class BookXmlTest {
    @Test
    public void runtiest() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("../book.xml");
        //System.out.println(document);
        Element rootElement = document.getRootElement();
        List<Element> elements = rootElement.elements();
        for (Element book:elements
             ) {
            String sn = book.attributeValue("sn");
            String name = book.elementText("name");
            String price = book.elementText("price");
            System.out.println(new Book(name,sn,new BigDecimal(price)));
        }

    }
}
