package homeWork;

//import sun.util.resources.cldr.nyn.CalendarData_nyn_UG;

import static modifier.AcessModifier.cbc;

public class AboutMe {
    public static void main(String[] args) {
        String name="Hardik";
        String surname="Mavani";
        int age=27;
        char gender='M';
        int address=21;
        String fullAdd="aldenham Road";
        String postcode= "WD194ab";
        Long mobile=7442563477L;
        boolean aboveInformationIsRight=true;

        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(address);
        System.out.println(fullAdd);
        System.out.println(postcode);
        System.out.println(mobile);
        System.out.println(aboveInformationIsRight);

        System.out.println(cbc); //cbc value is 352 from modifier access modifier


}}
