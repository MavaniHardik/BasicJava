package oops1;



public class Object {
    // state
    int i=10;


    public static void main(String[] args) {
        // physcical entity
        //istance of class-object
        Object Oc=new Object();
        System.out.println(Oc.i);
        Oc.barking();
        Oc.sleeping();
        Oc.i=30;
        Oc.sleeping();
        //import from other class by object // Class name is ObjectConcept2
        ObjectConcept2 oc2=new ObjectConcept2();
       System.out.println(oc2.a);
    }
    // behaviour
    public void barking(){
        System.out.println("Dog is Barking");

    }

    public void sleeping(){
        System.out.println("Dog is Sleeping");
    }
}
