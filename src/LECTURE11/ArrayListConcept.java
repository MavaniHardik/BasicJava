package LECTURE11;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListConcept {
    //Array --Collection of variable
    //ArrayList --Dynamic in Size
    //Operation-- add,deletion,Search,Change

    public static void main(String[] args) {
       ArrayList<String> nextProduct=new ArrayList<>();
       nextProduct.add("Shirt");
       nextProduct.add("Men");
       nextProduct.add("T-Shirt");
       nextProduct.add("Trouser");
       nextProduct.add("Women");
       nextProduct.add("Jeans");
       nextProduct.add("Makup");
       nextProduct.size();
     nextProduct.remove("Trouser");
     nextProduct.add("Home improvement");
     nextProduct.remove(6);
        System.out.println(nextProduct);
        System.out.println(nextProduct.size());
    //nextProduct.

        LinkedList<String> newProduct=new LinkedList<>();
        newProduct.add("Paracetamol");
        newProduct.add("Vitamin-C");
        newProduct.add("Eye glass");
        newProduct.add("Power tools");
        newProduct.add("Glucose");
        newProduct.add("Glucose");
        newProduct.addFirst("IBU");
        newProduct.remove(4);
        System.out.println(newProduct);
        System.out.println(newProduct.contains("IBU"));
        newProduct.set(1,"IBU");// Replace at index 1
        System.out.println(newProduct);
        System.out.println(newProduct.get(1));
}
}
