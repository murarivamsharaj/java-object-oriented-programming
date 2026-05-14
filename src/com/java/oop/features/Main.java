package com.java.oop.features;

public class Main {
    public static void main(String[] args) {
      //  Customer customer = new Customer();
      //  customer.id = 21;
        //customer.displayCustomerDetails();

       // Customer customer1 = new Customer(22,"Murari","Murari@gmail.com",8679869L, (byte) 32,67869);
    RegularCustomer regularCustomer = new RegularCustomer();
    regularCustomer.id = 40;
    regularCustomer.cashBackPoints = 500;
    regularCustomer.displayCustomerDetails();
    }
}


