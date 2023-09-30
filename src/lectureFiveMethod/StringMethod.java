package lectureFiveMethod;

import lecture1FirstBasicJava.PrintMyName;

public class StringMethod {
    public static void main(String[] args) {
String myName="Hardik";
String SurName="Mavani";
String address= "21 Aldenham Road near bushey station";
String fullname= myName+' '+SurName;
        System.out.println(fullname);
        System.out.println(fullname.toLowerCase());
        System.out.println(myName.concat(SurName));
        System.out.println(myName.compareTo(SurName));
        System.out.println(myName.matches(myName));
        System.out.println(myName.toUpperCase());
        System.out.println(SurName.contains(SurName));
        System.out.println(SurName.contains(myName));
        System.out.println(SurName.length());
        System.out.println(address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toLowerCase());

    }
}
