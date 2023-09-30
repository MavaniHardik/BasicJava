package lecture6Conditional;

public class ConditionWithMethod {
    //deposite
    // withdraw
    public static int balance = 1000;


    public static void main(String[] args) {
        deposit(100);
        withdraw(500);
        withdraw(2000);
    }


    public static void deposit(int amount) {
        balance = balance + amount;
    }

    public static void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println("yes you can withdraw");
        } else {
            System.out.println("sorry you dont have enough balance");
        }
    }
}