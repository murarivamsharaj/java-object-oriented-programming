package com.java.oop.abstraction;

public class MySQLRepository extends Repository{
    @Override
    void connectToDb() {
        System.out.println("Connection to mysql successfully");

    }

    @Override
    void addCustomerTodb(Customer customer) {
        System.out.println("customer add to MYSQL database successfully");
    }
}
