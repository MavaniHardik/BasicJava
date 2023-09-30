package lectureFiveMethod;
public class ReturnMethod {
    public static void main(String[] args) {
        int c =SumOfTwoNumber(25,30);
        System.out.println(c);
        int e =substractionOfThreeNumber(25,30);
        System.out.println(e);
        int d=multiplication(8,5);
        System.out.println(d);



    }
    public static int SumOfTwoNumber(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    public static int substractionOfThreeNumber(int a, int b){
        int e= a-b;
        return e;
    }
public static int multiplication(int a,int b){
        int d=a*b;
        return d;

}
public int division(int a,int b){  // how to call this method in main method
        int n=a/b;
    ReturnMethod rm=new ReturnMethod();
        return n;


    }
}
