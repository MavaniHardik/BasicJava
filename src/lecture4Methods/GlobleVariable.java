package lecture4Methods;

public class GlobleVariable {
   int a=25;   // globle variable
   int b=30;
   public static void main(String[] args) {
      int a=12;
        System.out.println(a);
        GlobleVariable gv=new GlobleVariable();//object created gv
        System.out.println(gv.a);
        System.out.println(gv.b);
    }
    public void myhome() {
        int c=32;
        int d=62;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    public  void hometown(){

        int e=5;
        System.out.println(e);
        System.out.println(a);

    }
}
