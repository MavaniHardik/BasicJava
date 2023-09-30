package lecture6Conditional;

public class LoopControlWhile {
    //while
    //do while
    public static void main(String[] args) {
        int a = 8;// start
        while (a <= 10) {//End
            System.out.println("Hardik");
            System.out.println("Mavani");
            a++;
        }//incriment
        number();
        // wihle method first check Condition then print
    }
    public static void number() {
        int d = 90;
        while (d <= 100) {
            System.out.println(d);
            d++; // 1,2,3,4,5,6,7,8,9,10,....100// Incriment
        }
    }
}

