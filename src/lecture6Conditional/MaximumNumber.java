package lecture6Conditional;
public class MaximumNumber {
    public static void main(String[] args) {
        minimum();
        int a = 110;
        int b = 58;
        int c = 245;
        int maximum;
        if (a >= b && a >= c) {
            maximum = a;
        } else if (b >= a && b >= c) {
            maximum = b;
        } else {
            maximum = c;
        }
        System.out.println("Maximum number is " + maximum);
    }
    public static void minimum() {
        int x = 56;
        int y = 34;
        int z = 90;
        int minimum;
        if (x <= y && x <= z) {
            minimum = x;
        } else if (y <= z && y <= x) {
            minimum = y;
        } else {
            minimum = z;
        }
        System.out.println("Minimum Number is" + minimum);
    }


}

