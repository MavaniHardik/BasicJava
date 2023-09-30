package oops1;

// constructor is a method have same name as class
// it have not return type
//to call the constructor >>> need creat object and it called automaticaly
/* type of constructor
    1. Pre defined(defult) - null(blank0
    2. User defined
       2.1 Simple
       2.2 Parameterized
 */
public class Constructor {
    //Simple
    Constructor() {
        System.out.println("Constrictior");
    }

    // Parameterized
    Constructor(int i) {
        System.out.println("Value is " + i);
    }

    public static void main(String[] args) {

        //Creat object to call automatic
        Constructor Cs1 = new Constructor();
        Constructor Cs2 = new Constructor(20);

    }
}







