package homeWork.Abstraction;

public  class AbstractB extends Abstraction{
    int amount;
    @Override
    public void animalSound() {
        System.out.println("Anmimal can talk like human");
    }
    @Override
 public void intrestRate() {
        amount=1000;
        int i=amount*2/100;
        System.out.println(amount);
        System.out.println("intrest "+ i);
    }
    public static void main(String[] args) {
        AbstractB abstractB=new AbstractB();
        //object can be created for abstracton class
        Abstraction abstraction=new AbstractB();
        abstraction.animalSound();
        abstractB.amount=4000;
        abstraction.intrestRate();
        abstractB.amount=6000;
        abstraction.intrestRate();
        System.out.println(abstractB.amount);
        abstractB.myAccount();
        abstraction.run();


    }
}
