package com.java.oop.collections;


import java.util.TreeSet;

public class SetImplementation {
    static void main() {
        TreeSet<String> set = new TreeSet<>();
        set.add("Murari");
        set.add("Sujith");
        set.add("deepak");
        set.add("Swajal");
        set.add("Anil");
        System.out.println(set.size());
        for (String str : set) {
            System.out.println(str);

        }
    }
}
