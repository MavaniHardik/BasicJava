package lecture7;

public class OddNumber {
    public static void main(String[] args) {
        int listnumber[] = {25, 24, 360, 32, 27, 9, 5, 4, 6, 27, 18};
        checkOddNumber(listnumber);
        System.out.println("  ");
        evenNumbers(listnumber);
        maximum(listnumber);
    }

    public static void checkOddNumber(int list[]) {

        for (int i = 0; i <= list.length - 1; i++) {
            if (list[i] % 2 != 0) {
                System.out.println(list[i] + "  odd number");
            }
        }
    }

    public static void evenNumbers(int list[]) {
        for (int i = 0; i <= list.length - 1; i++) {
            if (list[i] % 2 == 0) {
                System.out.println(list[i] + "  Even Number");
            }
        }
    }

    public static void maximum(int max[]) {
        for (int i = 0; i <= max.length - 1; i++) {
            if (max[i] >= max[0] + max[10]) { // when change index number maximum value is showing differnt ??
                System.out.println(max[i] + " maximum");
            }
        }
    }
}


