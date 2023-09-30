package homeWork;

import static modifier.AcessModifier.cbc;


public class Test1 {
    public static void main(String[] args) {
        boolean A=false;
        System.out.println(A);

//A=5; need in int change variable in a
        int a=18;
        int b=10;
        int c=20;
        float B=18f;
//bodmas brakat order division multipl add subctrat
        System.out.println(b*c);
        int d=6;
        System.out.println(c*d);
        // (a+b)*c-d/a+B
        System.out.println(a+b); //=28

        System.out.println(d/B);//.3333  //0 when d/a and d/B =0.333

        System.out.println(28*c);//=560
        System.out.println(560-0.3333+b);//569.67

        System.out.println((a+b)*c-d/B+b);
        System.out.println(cbc);//cbc=352 from access modifier




    }
}
