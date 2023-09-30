package oops1.polymerphism.overRiding;

public class ClassB extends ClassA {

    public static void main(String[] args) {
        myName();
        mySurname();
    }
//over ride or over Write
    public  static void myName(){
        System.out.println("My name  Hardik");

    }
    public static void mySurname(){
        System.out.println("My surname is Mavani");
    }
}
