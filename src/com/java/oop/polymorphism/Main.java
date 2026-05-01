package com.java.oop.polymorphism;

// FIX 1: Removed the outer class wrapper — same nested class/package bug as Service.java
// FIX 2: Kept correct imports since Laptop and Product are in a different package here

import com.java.oop.inheritance.Laptop;
import com.java.oop.inheritance.Product;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(1, "product1", 1000, 10, 4.5f, 100, "Dell", "Laptop");
        System.out.println(product);
        // Prints: Product{id=1, name='product1', ...}  — because toString() is overridden
        // Without override it would print: com.java.oop.inheritance.Product@<hashcode>

        Laptop laptop = new Laptop(2, "Dell Laptop", 1000, 10, 4.5f, 100, "Dell", "Laptop", 1024, "Windows");
        System.out.println(laptop);

        Service service = new Service();
        // Polymorphism in action: Laptop object passed where Product is expected.
        // Java calls Laptop's overridden displayDetails() at RUNTIME (dynamic dispatch)
        service.displayDetails(laptop);
    }
}
