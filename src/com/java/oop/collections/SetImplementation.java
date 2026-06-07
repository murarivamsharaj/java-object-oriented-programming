package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetImplementation {
    static void main() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Murari");
        hashSet.add("Anil");
        System.out.println(hashSet.size());
       for (String str : hashSet) {
           System.out.println(str);

        }
    }
}
