package lecture6Conditional;

public class ConditionalStatement
{
    public static void main(String[] args) {
        // conditional Statement
        //1 If Elase
        //2.if elase ladder
        int a=10;
        int b=20;
        int c=30;
        if (a==b || b==c){
            System.out.println("Numbers are Same");
        }
        else if (a>b && a>c){
            System.out.println("a is Biggest");
        } else if (b>a && b>c){
            System.out.println("b is Biggest");
        }
        else {
            System.out.println("C is Biggest");
        }

    }

}
