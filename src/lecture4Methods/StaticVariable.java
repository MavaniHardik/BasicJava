package lecture4Methods;

public class StaticVariable {

    static int a=10;
    static int b=25;

    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
        a=20;

        System.out.println(a);
        System.out.println(b++);
        System.out.println(b);

    }

    public void staticmethod (){
        System.out.println(a);
        System.out.println(b);

    }

}
