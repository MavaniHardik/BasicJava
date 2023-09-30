package oops1.inharitanceMultilevel;

public class ClassB extends ClassA {
    // Class B   <<<- Class A
    // properties of class A come in this
    int i = 30;

    public static void childage() {
        ClassB cb1 = new ClassB();
        System.out.println("Child 1 age is " + cb1.i);
    }

    public static void main(String[] args) {
        childage();
        ClassB cb = new ClassB();
        mummy();
        parents();
    }
}
