package LECTURE11;

public class ExcemptionHandling {
    //Array
    //Catch,Finallly,Throw
    public static void main(String[] args) {


    String names[]={"Hardik","Amit","Deep"};
                    //0       1      2
//Exemption Handling
        try {System.out.println(names[3]);

        }catch (Exception e) {
            System.out.println(e);
        }finally {
            System.out.println("Out of code is moved");
        }
        System.out.println(names[2]);
        System.out.println(names[1]);
    }
public void addnumbers(){
        int a=200;
        int b=20;
        int c=a+b;



}
}


