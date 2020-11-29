package pers.guchh.xmlTest.book;

import java.math.BigDecimal;

public class Book {
    private String name;
    private String sn;
    private BigDecimal price;

    public Book(String name, String sn, BigDecimal price){
        this.name = name;
        this.sn = sn;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", sn='" + sn + '\'' +
                ", price=" + price +
                '}';
    }
}
