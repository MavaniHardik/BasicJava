package lecture7;

public class ChangeTheValue {
    public static void main(String[] args) {
 // if you are try to access out of bound index -- it will give yoy error

//        int c=10;
//        c++;
//        System.out.println(c);
        int list[] = {10, 20, 30, 40, 5, 50, 60, 70, 80, 90, 22, 677, 889, 792, 256, 234, 34, 340,};
           //index     0  1   2   3   4  5   6   7   8   9   10   11  12   13    14  15  16  17
        list[2]=34;
        list[2]++;
        System.out.println(list[2]);
        list[6]=list[6]+list[7];
        System.out.println(list[6]);
        list[0]=list[1]*list[12];
        System.out.println(list[0]);
        for(int i=0;i<=list.length-1;i++){
            System.out.println(list[i]);
            // for each loop
            // it will take each value from the array and store in the variable and then we can print
            // you don't have control on index ,it will print all the values
        for (int a:list){  // for each loop
            System.out.println(a);
        }
        // to fix the size of array
            String names[]=new String[6];
        names[0]="Hardik";
        names[1]="Mavani";
        names[2]="Nirav";
        names[3]="goyani";
        names[4]="Deep";
        names[5]="Pritesh";
        for (String c:names){
            System.out.println(c);
        }}}}
