package oops1.inharitanceMultilevel;

public class ClassC extends ClassB {
    // Properties of class B come in but also in class B class A properties

    //Class C   << Class  B
    //          Class B<< Class A

    int c = 20;
    public static void Child2() {

        ClassC cc = new ClassC();
        System.out.println("Child 2 age" + cc.c);
    }

    public static void main(String[] args) {
        Child2();
        mummy();
        parents();
        childage();
    }
}
