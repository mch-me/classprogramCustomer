package com.apple.customer;

import java.util.ArrayList;
import java.util.List;
public class Manager {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jame","123456");
        Customer customer2 = new Customer("Tomes","582131");

        List list = new ArrayList();
        list.add(customer1);
        list.add(customer2);

        System.out.println(list.get(1).toString());
    }
}
