package com.learning.designpatterns.prototype;

public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bookShop = new BookShop();
        bookShop.setShopName("Oracle");
        bookShop.loadData();


        BookShop bookShop2 = (BookShop) bookShop.clone(); //shallow cloning
        bookShop.getBooks().remove(2);//if we shallow clone the object, any changes to the Original object
        // will affect the cloned object as well as they both are referring to the same memory location
        bookShop2.setShopName("AllBooks");

        System.out.println(bookShop);
        System.out.println(bookShop2);

    }
}
