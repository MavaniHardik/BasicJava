package lecture7;

public class PlaywithArray {
    public static void main(String[] args) {

        int  numbers[]={25,2,33,64,67,89,975,44,67,34,97,44};
                // index0  1 2  3  4  5  6  7  8   9  10 11 12
        // change value
        numbers[2]=20;   // 2 is now 20
        System.out.println(numbers[2]);

        // print lenth of array
        System.out.println(numbers.length);

        // all value print

        for (int i=0;i<=numbers.length-1;i++){
          System.out.println(numbers[i]);
            if(numbers[i]==33){
                System.out.println("position+" + i);



                }
            }
        }


    }

