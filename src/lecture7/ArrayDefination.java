package lecture7;

public class ArrayDefination {
    public static void main(String[] args) {
        // Array = collection of similar data type of variables
        // how to print the value?  by the index number strats from 0 ,,,
        // how to get the length of array? by using length
        // change the value
        // for each loop
        int a = 10;
        int b = 20;
        int c = 30;
        // int arr[]={.........};
        int my[] = {10, 20, 30, 40, 5, 50, 60, 10100, 1180, 90, 22, 1616, 1889, 792, 256, 234, 34, 340,}; //all value fit in box like same
        //  variable name[]                                                         fixed in size

        //index     0  1  2  3  4 5  6  7  8  9 10  11  12  13 14  15  16  17
        // (arraylist) learn after
        System.out.println(my[0]);
        System.out.println(my[6]);
        System.out.println(my.length);
        //     length is use for array
        String name = "Hardik";


        System.out.println(name.length());

        int maximum=my[0];
        for(int i=1;i<=my.length-1;i++) {
            if (maximum < my[i])
                maximum = my[i];
        }
        System.out.println(maximum);
    }
}
