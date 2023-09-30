package lectureFiveMethod;

public class ParameterizedHw {

    public static void main(String[] args) {
        employeeId(101);
        employeeName("Hardik Mavani");
        ParameterizedHw salary = new ParameterizedHw();
        salary.salary(40000);
        employeeId(201);
        employeeName("Hardik ");
        salary.salary(42000);


    }

    public static void employeeId(int a) {
        System.out.println("This Employee ID is " + a);
    }

    public static void employeeName(String name) {
        System.out.println("Employee Name is" + ' ' + name);
    }

    public void salary(int salary) {
        System.out.println("salary is " + salary);

    }
}
