package lecture7;

public class Parsing1 {
    public static void main(String[] args) {
        String string="50";
        int i=Integer.parseInt(string);
        System.out.println(i);
        float f=Float.parseFloat(string);
        System.out.println(f);
        double d=Double.parseDouble(string);
        System.out.println(d);
        int Int=200;
        String value=String.valueOf(Int);
        System.out.println("Value is " +  value);
        short n=Short.parseShort(string);
        System.out.println(n);
    }
}
