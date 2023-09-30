package oops1;

public class ConstructorParameterzid {
// parameterized

    // constructor syntex
    ConstructorParameterzid(int a, int b){

        //print value
        System.out.println(a+b);
        System.out.println(a*b);

    }

    public static void main(String[] args) {

        // creat object and call automatic
        ConstructorParameterzid cs=new ConstructorParameterzid(10,20);
        ConstructorParameterzid cs1=new ConstructorParameterzid(30,30);

    }
}
