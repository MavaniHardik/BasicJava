package lectureThreeOperators;

public class AssignmentOperators {
    public static void main(String[] args) {
        //Assignment operator
        int a=8;
        a=20;
        //+=
        System.out.println(a);
        a+=10; //a=20 then ans a= 20+10=30
        System.out.println(a);
        a=a+10;
        System.out.println(a);
        System.out.println(a);

        //-=
        int b=30;
        b-=15;// b-15 means 30-15=15
        System.out.println(b);
        //*=
        int c=5;
        c*=6; // 5*6=30  means c*6
        System.out.println(c);
        //  /=
        int d=10;
        d/=2;  // d/2   10/2  =5
        System.out.println(d);

        // %=
        int m=20;
        System.out.println(m); // m=20
        m%=6; // m= 20%6  = 20/6   6 6 6=18  +2=20 ans is 2 Reminder(Shesh)
        System.out.println(m);
        /*
        Query when same again assign ans is same as first
         */
        m%=8;   // m%3 // ans should be 8 8= 16 + 4 = 20 ans Reminder is 4 but Ans comes 2
        System.out.println(m);

        m=16;
        m%=10;
        System.out.println(m);


    }
}
