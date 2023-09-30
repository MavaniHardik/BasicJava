package lecture4Methods;

public class LocalVariable {

    public static void main(String[] args) {
        watford();// calling
        LocalVariable LV=new LocalVariable();
        LV.Bushey();//caling
        int a=20;


        System.out.println(a);

    }

    public static void  watford(){
        int b=30;

        System.out.println(b);
    }
public void Bushey(){
        int c=25;
    System.out.println(c);

}

}