package lecture7;

public class TypeCasting {
    public static void main(String[] args) {
        // to store the value of one data type to different datatype
//small in big
        //wide type casting
        byte a=123;
        short b;
        b=a; // a is store in b
        System.out.println(b);


// big in to small
        // narrow type casting
        a=(byte)b;

        float f =12554.455f;
        int i=235;
        i=(int) f;
        System.out.println(i);
    }
}
