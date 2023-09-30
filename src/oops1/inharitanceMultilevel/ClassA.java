package oops1.inharitanceMultilevel;

public class ClassA{
    static int c = 30;
    static int d = 60;

    public static void parents() {
        System.out.println("This is class A");
    }

    public static void mummy() {
        System.out.println("this is mummy");
    }

    public static void main(String[] args) {
        parents();
        mummy();
    }
}
