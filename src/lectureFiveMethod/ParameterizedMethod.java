package lectureFiveMethod;

public class ParameterizedMethod {
    public static void main(String[] args) {
        additionOfTwoNo(25, 30);
        additionOfTwoNo(80, 90);
        additionOfTwoNo(50, 70);
        ParameterizedMethod subtraction = new ParameterizedMethod();
        System.out.println("Subtraction");
        subtraction.subctratin(30, 20);
        subtraction.subctratin(25, 40);
        subtraction.subctratin(80, 70);
        System.out.println("Division");
        divisionofTwonumber(50, 20);
        divisionofTwonumber(100, 20);
        divisionofTwonumber(752, 33);
        System.out.println("Multiplication");
        multiplication(25, 8);
        multiplication(12, 7);
    }
    public static void additionOfTwoNo(int a, int b) {
        System.out.println(a + b);
    }
    public void subctratin(int a, int b) {
        System.out.println(a - b);
    }
    public static void divisionofTwonumber(float a, float b) {
        System.out.println(a / b);
    }
    public static void multiplication(int a, int b) {
        System.out.println(a * b);
    }
}

