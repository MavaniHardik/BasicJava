package oops2.multipleInheritance;

public class MyName implements Interface1,Interface2{
    //Multiple inheritance--- this is use by only Interface also interface is use by Implements key word
    @Override
    public void myName() {
        String Name="Hardik";
        System.out.println(Name);
    }

    @Override
    public void mySurname() {


    }

    public static void main(String[] args) {
        MyName myName=new MyName();
        myName.myName();
    }
}
