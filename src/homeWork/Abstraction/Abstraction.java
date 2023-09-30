package homeWork.Abstraction;
// abstract class is compulsory key word insted of public,privet,protected
abstract class Abstraction {
    //no implimention
    void run(){
        System.out.println("Dog can Run");
    }
    public abstract void animalSound();
    public abstract void intrestRate();

    public void myAccount(){
        System.out.println("Bank account ");
    }

    public static void main(String[] args) {

    }
}
