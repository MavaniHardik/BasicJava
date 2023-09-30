package lectureFiveMethod;

public class ReturnMethodHomework {
    static int balance = 2000;
    public static void main(String[] args) {
        moneyWithdraw(200);
        System.out.println(balance);
        moneyWithdraw(50);
        System.out.println(balance);
        moneyDeposit(5005);
        System.out.println(balance);
        moneyWithdraw(222);
        System.out.println(balance);
        moneyWithdraw(824);
        System.out.println(balance);
        float intrestgain = intrest(balance,5.5f);
        System.out.println(intrestgain);
        System.out.println(intrestgain + balance);
        System.out.println(balance);
        moneyDeposit(30000);
        System.out.println(balance);
        System.out.println(intrest(balance,6.5f));
        System.out.println(balance + intrestgain);
        System.out.println(intrestgain + balance);
    }
    public static void moneyWithdraw(int withdraw) {
        balance = balance - withdraw;
    }
    public static void moneyDeposit(int Deposit) {
        balance = balance + Deposit;
    }
    public static float intrest(int balance,float interest) {
        float intrestgain = (balance * interest) / 100;
        return intrestgain;
    }
}
