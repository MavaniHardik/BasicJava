package homeWork;

import java.util.ArrayList;

public class Arraylistclass {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(3001);
        numbers.add(11150);
        numbers.add(100);
        numbers.add(222);
        numbers.add(604);
        numbers.remove(6);
      System.out.println(numbers);
        int maximum=numbers.get(0);
        //   variable= arraylist.syntex(index start)
        for(     int i=1;            i<numbers.size();         i++)    {
            // i variable= start 1 ; i < array size length;     increment
            if (maximum<numbers.get(i))
            //if  maximum< array then get variable i
                maximum=numbers.get(i);
            // otherwise maximum= array. get variable i
            System.out.println(i);
            // print variable i this show index
        }
        System.out.println(" Maximum value is  "+ maximum);
// print variable i this show maximum value

        int minimum=numbers.get(0);
         for ( int i =0; i<numbers.size(); i++) {

             if (minimum>numbers.get(i))
                 minimum=numbers.get(i);
         }
        System.out.println("Minumum value is "+ minimum);

    }
}
