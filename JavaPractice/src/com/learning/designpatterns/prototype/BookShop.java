package com.learning.designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
    private String shopName;
    private List<Book> books = new ArrayList<>();

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadData() {
        //loading the data can be from database or any other external source
        for(int i=0;i<10; i++) {
            this.books.add(new Book("Book"+i,i));
        }
    }
    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", books=" + books +
                '}';
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException { //performing deep cloning
        BookShop bookShop = new BookShop();
        for(Book b : this.getBooks())
        {
            bookShop.getBooks().add(b);
        }
        return bookShop;
    }
}
