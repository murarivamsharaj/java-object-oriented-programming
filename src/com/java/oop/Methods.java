package com.java.oop;

import javax.xml.namespace.QName;

public class Methods {

    String name = "Murari";
    int maxRetailPrice = 23435;
    boolean availableStock = false;


    static void main() {
        Methods methods = new Methods();
        methods.displayProductDetails();
        int i = methods.multiplyNumbers(2,5);
        System.out.println("print i:" + i);

    }
    void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("MRP: " + maxRetailPrice);
        System.out.println("Available Stock: " + availableStock);
    }
    int multiplyNumbers(int a,int b) {
        int x = a * b;
      return x;
    }



}
