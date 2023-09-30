package LECTURE11;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashMapCollection {
    public static void main(String[] args) {
        //Hash Map  --- Key -Value Pair
        //              1-- Hardik
        //              2-- Amit
        //              3-- Nirav
        //              4-- Jay

        HashMap<Integer,String> name=new HashMap<>();
        name.put(1,"Hardik");
        name.put(2,"Amit");
        name.put(3,"Nirav");
        name.put(4,"Jay");

        System.out.println(name);
        System.out.println(name.get(4));


        LinkedHashMap<String,Integer> price=new LinkedHashMap<>();
        price.put("Samsumg S23",700);
        price.put("Samsung S23 Ultra",1249);
        price.put("Iphone 14", 1100 );
        price.put("Iphone 14 Pro",1400);
        price.put("Iqoo Z7",200);
        price.put("Iqoo Z7 Pro",250);
        price.put("Realme 10T Pro",300);
        System.out.println(price);


        

    }

}
