package oops1.polymerphism.overLoading;

public class Overloading1 {
    //overloading example
    public static void main(String[] args) {
        Overloading1 overloading1=new Overloading1();
        overloading1.addNumbers();
        overloading1.addNumbers(10,35,50);
        overloading1.addNumbers(60,70);
    }
    public void addNumbers(){
        int a=112;
        int b=10;
        System.out.println(a+b);

    }
    public void addNumbers(int a,int b){
        System.out.println(a+b);
    }

    public void addNumbers(int a,int b,int c){
        System.out.println(a+b+c);

    }
}
