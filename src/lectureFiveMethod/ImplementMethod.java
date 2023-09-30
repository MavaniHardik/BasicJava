package lectureFiveMethod;
//method is bolock of statement used to achive a task
/* types of method
1.predefined  this method are already defined by JAVA and it hase some meaning
2.User defined  this method are created by doveloper/user
 */

//Impotance of method---1.code is organized(neat and clean)
//                     2.Reusability
public class ImplementMethod {

    public static void main(String[] args) {
        sumOfTwoNumber();  // calling method  // by static
        ImplementMethod Im = new ImplementMethod(); // creat object
        Im.sumOfThreeNumber();
    }
// method vis created
    public static void sumOfTwoNumber() {
        // User Defined Method
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
    public void sumOfThreeNumber() {
        //user defined method
        int a = 5;
        int b = 8;
        int c = 10;
        int d = a + b + c;
        System.out.println(d);
    }
}
