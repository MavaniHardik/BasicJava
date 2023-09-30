package lecture6Conditional;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2024;
        boolean isleap = false;
        if (year % 4 == 0) {
            isleap = true;
            if (isleap) System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}