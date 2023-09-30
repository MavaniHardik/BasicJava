package lectureThreeOperators;

public class ComparisionOperator {
    public static void main(String[] args) {
        int a=8;
        int b=10;
        int c=10;
// ==
        boolean myAns= a==b; //8==10 its false
        System.out.println(myAns);
        boolean myAns2= b==c; // 10==10 its true
        System.out.println(myAns2);
        // < lessthan
        System.out.println(a<b); // 8 is less 10  true


        System.out.println(a>b); // 8 is grater 10 false
        System.out.println(b>c); // 10 is grater then 10 is false
        // <= and >=  less than or eual to and grater than and equal to
        System.out.println(c>=b);  // 10 is grater then or Eual to 10 is true
        System.out.println(a<=c);// 8 is less than 10 true
        // not eual to !=
        System.out.println(a!=b); //10 and 8 is not same so true
        System.out.println(b!=c); // 10 and 10 is same so false


    }
}
