package modifier;

public class AcessModifier {
    public  static int cbc=352; // public is aceess anywhere in Project
    private  static  int any=205; // visible only in Class
    protected static int hardik=302; // only visible in package and sub class

    // defult is not showing but visible only in package

int a=10; // defult example

    public static void main(String[] args) {
        AcessModifier am= new AcessModifier();
        System.out.println(am.a);
        System.out.println(cbc);
        System.out.println(any);
        System.out.println(hardik);



    }
}
