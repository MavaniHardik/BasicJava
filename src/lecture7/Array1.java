package lecture7;

public class Array1 {
    public static void main(String[] args) {
        int number[] = {254, 254, 648, 248, 669, 782, 12, 1633, 564, 347, 69764, 941};
        numbers(number);



        }

    public static void numbers(int num[]) {
        for (int i = 0; i <= num.length - 1; i++) {
            System.out.println(i);  // print lenght of array
            int maximum = num[i]; //print numbers with array number
            System.out.println(maximum);

        }
    }
public static void fruit(String s){


    String fruitNames[] = {"apple", "Banana", "Graps", "Pomogranet", "Orange", "Plum", "Avocado"};
        for (String fruit : fruitNames)

    {
        System.out.println(fruit);
        for (int i = 0; i <= s.length() - 1; i++) {
            System.out.println(fruitNames[i]);


        }
    }}}


//       if (number[0]>=number[1]);
//        else if (number[2]>=number[3]);
//        System.out.println(number[3]);
//        for(int max=number[0]>=[11]);



