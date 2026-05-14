package com.java.oop.features;

public class RegularCustomer extends Customer {
    int cashBackPoints;

    public RegularCustomer() {
        super();
    }

    void displayCustomerDetails() {
        super.displayCustomerDetails();
        System.out.println("show cash back points :" + cashBackPoints);
    }
}

