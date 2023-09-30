package lectureFiveMethod;

public class HomeWorkImplimentMethod {
    public static void main(String[] args) {
        sumOfTwoNo();// calling sume of Two number
        myName();// calling myname
        HomeWorkImplimentMethod surname = new HomeWorkImplimentMethod();
        surname.surName();// calling with creat object surname
        HomeWorkImplimentMethod mobile = new HomeWorkImplimentMethod();
        mobile.mobile();//calling with creat object surname
    }
    public static void sumOfTwoNo() {
        int a = 12;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
    public static void myName() {
        String name = "Hardik";
        System.out.println(name);
    }
    public void surName() { //need creat object
        String name = "Mavani";
        System.out.println(name);
    }
    public void mobile() { //need creat Object
        Long number = 7442563477L;
        System.out.println(number);
    }
}
