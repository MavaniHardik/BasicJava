package lecture7;

public class Parsing {
    // parshing--- primitive data type to non primitive data type
    // String > int, float,double

    public static void main(String[] args) {
        String value="10";
        int i= Integer.parseInt(value);//  syntex parse
        System.out.println(i);
        i++;
        System.out.println(i);
        float f=Float.parseFloat(value);
        System.out.println(f);
        double d=Double.parseDouble(value);
        System.out.println(d);
        int j=20;
        String value2=String.valueOf(j);/// syntex  valueof
        System.out.println("Integer is converted to String"+ value2);
    }
}
