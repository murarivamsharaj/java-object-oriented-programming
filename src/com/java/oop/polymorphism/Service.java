package com.java.oop.polymorphism;

// FIX 1: Removed the outer class wrapper "public class Service { package ...; public class Service { ... } }"
//         A file cannot have a package statement inside a class body
// FIX 2: Correct import path for Product and Laptop

import com.java.oop.inheritance.Laptop;
import com.java.oop.inheritance.Product;

public class Service {

    /* Overloaded add() methods — uncomment if needed
    public Product add(Product product){
        System.out.println("Service: " + product);
        return product;
    }
    public Laptop add(Laptop laptop){
        return laptop;
    }
    public double add(double a, double b){
        return a + b;
    }
    public boolean add(int index, Product product){
        return true;
    }
    */

    public void displayDetails(Product product) {
        // Polymorphism: even if a Laptop or MobilePhone is passed,
        // their overridden displayDetails() will be called at runtime
        product.displayDetails();
    }
}
