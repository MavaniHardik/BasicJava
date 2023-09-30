package lectureThreeOperators;

public class IncDecrOperation {
    public static void main(String[] args) {
        //increment
        int a=20;
        int b=10;
        System.out.println(a++);//a= 20+1
        System.out.println(a);// 21
        ++a;  //a =22
        System.out.println(a++);//a=22+1
        System.out.println(a);  //a=23
        System.out.println(a-b);  //23-10=13
        //decrement
        //a=23
        --a;//a= 23-1
        System.out.println(a); //a=22
        a--;  //a=22-1
        System.out.println(a--);//a=21-1
        System.out.println(a);//a=20
        System.out.println(a-b--);// 20-10=b 10-1
        System.out.println(b);//b=9



    }
}
