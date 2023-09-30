package homeWork;
// object state behaviour identity
public class ObjectCow {
    // state is cow
static String name= "cow";
static String colour= "red or white";
static int height=5;
static int age=12;
static String subname= "Gir Cow";

//Behaviour
public static void milk(){
    System.out.println("Daily produce milk 15 ltr.");

}
public static void  eating(){
    System.out.println("Cow is Eating corn leaves,cotton cake ");

}
public static void price(){
    System.out.println("5000 pound");
    System.out.println("EMI also Avilable");
    System.out.println("T&C apply");
}
    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(subname);
        System.out.println(colour);
        System.out.println(age);
        System.out.println(height);
       eating();
       milk();
       price();
    }








}
