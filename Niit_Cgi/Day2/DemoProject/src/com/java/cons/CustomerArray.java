package com.java.cons;

public class CustomerArray {

    public static void main(String[] args) {
        Customer[] arrCustomer = new Customer[] {
                new Customer(1, "Sneha", Gender.FEMALE,47825.3,1),
                new Customer(2, "Vedanth", Gender.MALE,57825.3,2),
                new Customer(3, "Tharun", Gender.MALE,90833.3,3),
                new Customer(4, "Sowmya", Gender.FEMALE,91142.3,1),
                new Customer(5, "Pooja", Gender.FEMALE,98744.3,2),
        };

        System.out.println("Customer Records are  ");
        System.out.println("----------------------");
        for (Customer c: arrCustomer ) {
            System.out.println(c);
        }
    }
}
