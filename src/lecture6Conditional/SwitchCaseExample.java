package lecture6Conditional;

public class SwitchCaseExample {
    public static void main(String[] args) {
        /*
        January=1
        Feb=2
        March=3
        April=4
        May=5
        June=6
        July=7
        August=8
        September=9
        October=10
        November=11
        December=12
         */

        String monthName = "April";

        switch (monthName) {
            case "January":
                System.out.println("1");
                break;
            case "Febuary":
                System.out.println("2");
                break;
            case "March":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
                break;
            case "May":
                System.out.println("5");
                break;
        }

    }
}
