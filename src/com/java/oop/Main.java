package com.java.oop;

public class Main {
    public Main() {
    }

    static void main() {
        Product product = new Product();
        product.id = 9702;
        product.name = "Centrino Loafer for Men | Stylish & Comfortable with Soft Cushioned Insole | Hand-Stitched Design for Trendy   ";
        product.reviewsCount = 82;
        product.isAvailable = true;
        product.company = "Centrino";
        product.category = "Footware";
        product.ratings = 3.3F;
        product.maxRetailPrice = 749;
        product.discountPercentage = -70;

        System.out.println("id =" + product.id);
        System.out.println("name =" + product.name);
        System.out.println("reviewscount =" + product.reviewsCount);
        System.out.println("isAvailable =" + product.isAvailable);
        System.out.println("company =" + product.company);
        System.out.println("category =" + product.category);
        System.out.println("ratings =" + product.ratings);
        System.out.println("max retail price =" + product.maxRetailPrice);
        System.out.println("Discount percentage = " + product.discountPercentage);
        System.out.println("\n");

        Product product2 = new Product();
        product2.id = 47;
        product2.name = "Bata Men's Lace-up Sneaker";
        product2.reviewsCount = 2272;
        product2.isAvailable = true;
        product2.company = "Bata";
        product2.category = "Footware";
        product2.ratings = 4.1F;
        product2.maxRetailPrice = 1359;
        product2.discountPercentage = -20;

        System.out.println("id =" + product2.id);
        System.out.println("name =" + product2.name);
        System.out.println("reviewscount =" + product2.reviewsCount);
        System.out.println("isAvailable  =" + product2.isAvailable);
        System.out.println("company =" + product2.company);
        System.out.println("category =" + product2.category);
        System.out.println("ratings =" + product2.ratings);
        System.out.println("max retail price =" + product2.maxRetailPrice);
        System.out.println("Discount percentage = " + product2.discountPercentage);
        System.out.println("\n");

        CustomerDetails customer = new CustomerDetails();
        System.out.println("id " + customer.id);
        System.out.println("name " + customer.name);
        System.out.println("contact no" + customer.contactNo);
        System.out.println("age " + customer.age);
        System.out.println("isactive" + customer.isActive);
        System.out.println("address" + customer.address);
        System.out.println("email" + customer.email);

        CustomerDetails customer2 = new CustomerDetails(67, "rahul", 8767869L, (byte) 67, false, "jublee hills", "ygggibi@gmail.com");
        System.out.println("id  " + customer2.id);
        System.out.println("name " + customer2.name);
        System.out.println("contact no" + customer2.contactNo);
        System.out.println("age" + customer2.age);
        System.out.println("isactive " + customer2.isActive);


        CustomerDetails customer3 = new CustomerDetails(87,"sanjay",89374828L,(byte)78,true,"madhapur","kjhsiero8@gmail.com");
        System.out.println("id  " + customer3.id);
        System.out.println("name " + customer3.name);
        System.out.println("contact no" + customer3.contactNo);
        System.out.println("age" + customer3.age);
        System.out.println("isactive " + customer3.isActive);
    }
    }

