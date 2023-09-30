package lectureThreeOperators;

public class LogicalOperator {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        boolean answer= a>10&&a>b;
              // false && false but ans is false
        System.out.println(answer);
        boolean myans = a==10 && a>b;
        // true && false but ans is false
        System.out.println(myans);
       myans = a==10 && a<b;
        // true && true  ans is true
        System.out.println(myans);



    }
}
