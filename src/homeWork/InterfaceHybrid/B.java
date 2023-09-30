package homeWork.InterfaceHybrid;
// Class A properties come in class B this Class
// B---<<---A
abstract class B implements A {
    //only C is implimented

    @Override
    public void c() {
        System.out.println("This is C");
    }

}
