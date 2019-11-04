package com.apple.customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Jame","123456");
        Customer customer2 = new Customer("Tomes","582131");

        List list = new ArrayList();
        list.add(customer1);
        list.add(customer2);

        Map<String,Customer> map = new HashMap<>();
        map.put("001",customer1);
        map.put("002",customer2);

        map.get("002");

        Map<String,String> map1 = new HashMap<>();
        map1.put("003","this is me");

        System.out.println(list.get(0).toString());
    }
}
