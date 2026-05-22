package com.java.oop.abstraction;

public class Main {
    static void main() {
        Customer customer1 = new Customer(9786, "deepak", "deepak@gmail.com", 857859L, (byte) 78, 35378);
        CustomerService customerService = new CustomerService();
        customerService.addCustomeDb(customer1);

    }

}
