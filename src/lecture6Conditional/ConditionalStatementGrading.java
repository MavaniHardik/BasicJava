package lecture6Conditional;

public class ConditionalStatementGrading {
    //100-90=A
    //89-80=B
    //79-70=C
    //69-60=D
    //>60=Fail

    //Else If Ladder
    public static void main(String[] args) {
        int mark = 99;
        if (mark > 100) {
            System.out.println("input Error");
        } else if (mark >= 90) {
            System.out.println("Pass with A Grade");
        } else if (mark > 80) {
            System.out.println("Pass with B Grade");
        } else if (mark > 70) {
            System.out.println("Pass with C Grade");
        } else if (mark > 60) {
            System.out.println("Pass with D Grade");
        } else if (mark < 60) {
            System.out.println("Need to Improvement ");
        }

    }
}
