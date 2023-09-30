package oops1.polymerphism.overLoading;
//Overloding
public class MethodOverloding {

    public static void main(String[] args) {
        MethodOverloding methodOverloding = new MethodOverloding();
        methodOverloding.addTwoNumber();
        methodOverloding.addTwoNumber(10, 20);
        methodOverloding.addTwoNumber(10, 20, 30);
        //method overloding--- method having same name but same name in class but different parameter
        //add two number

    }

    public void addTwoNumber() {
        //case1
        int a = 10;
        int b = 20;
        System.out.println(a + b);

    }

    public void addTwoNumber(int a, int b) {
        //case 2
        System.out.println(a + b);
    }

    public void addTwoNumber(int a, int b, int c) {
        System.out.println(a + b + c);


    }
}