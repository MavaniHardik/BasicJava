package oops1.polymerphism.overLoading;

public class BankingOverloading {
    static int balance = 1000;
    public static void main(String[] args) {
        //method overloding--- method having same name but different parameter
        //add two number
        //deposit-1000
        //chrismas offer 1000-5 cashbak
        BankingOverloading bankingOverloading = new BankingOverloading();
        String season = "Christmas";
        if (season == "Normal") {
            bankingOverloading.deposit(100);
        } else if (season == "Christmas") {
            //  banking.deposit(100,5);
            bankingOverloading.deposit(100, 5);
            bankingOverloading.deposit(2000, 5);
            bankingOverloading.intrest();
        }
    }
    public void deposit(int depositMoney) {
        balance = balance + depositMoney;
        System.out.println(balance);
    }
    public void deposit(int depositMoney, int cashbackPercentage) {
        int cashbackMoney = (depositMoney * cashbackPercentage) / 100;
        System.out.println("You got cashback of " + cashbackMoney);
        balance = balance + (depositMoney + cashbackMoney);
        System.out.println("Total balance is " + balance);
    }
public void intrest(){
        int intrest=(balance*5/100);
    System.out.println("intrest earned " +  intrest);
    //System.out.println(balance+intrest "total");
}

}

