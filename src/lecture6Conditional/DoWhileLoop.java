package lecture6Conditional;

public class DoWhileLoop {
    public static void main(String[] args) {
       mymethod();
        Numbers();

}
    public static void mymethod(){
        int b=48;
        do { //first print then check
            System.out.println("MAVANI");
            b++;}
        while (b<=50);//Do while mehtod is run at leaset one time then check condition
    }

    public static void Numbers(){
        int c=90;
        while(c>=0){// odd even
           // System.out.println(c);
            System.out.println(c);
            c--;



        }
}}
