package LECTURE11;

import java.util.HashSet;
import java.util.LinkedHashSet;


public class HashSetConcept {
    public static void main(String[] args) {
        //ArrayList  --Slower ,allows duplicate value
        //LinkedList-- Faster
        //HashSet--1)-- Not allows Duplicate value
        //LinkedHashSet--- Faster

        HashSet<String> studentNames = new HashSet<>();
        studentNames.add("Hardik");
        studentNames.add("Amit");
        studentNames.add("Deep");
        studentNames.add("Amit");
        studentNames.remove("Deep");
        studentNames.add("Jay");
        studentNames.add("Ram");
        studentNames.add("Krish");
        studentNames.remove("Jay");
        studentNames.remove("Hardik");
        studentNames.add("Hardik Mavani");

        System.out.println(studentNames);
        System.out.println(studentNames.size());

        LinkedHashSet<String> fruits = new LinkedHashSet<>();
        fruits.add("Grapes");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("kiwi");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        System.out.println(fruits);



    }

}
