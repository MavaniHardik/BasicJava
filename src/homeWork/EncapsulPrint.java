package homeWork;

public class EncapsulPrint {
    public static void main(String[] args) {
        Encapsul ps = new Encapsul();
        ps.getName();
        ps.setName("Hardik Mavani");
        ps.getAge();
        ps.setAge("26");
        ps.setName("Mavani");
        ps.setName("Hardik S Mavani");

        System.out.println(ps.getName() + " " + ps.getAge());

    }
}
