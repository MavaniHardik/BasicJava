package homeWork.InterfaceHybrid;
//Class B properties come in class M
// M <<  B  <<  A
public class C extends B{
    @Override
    public void a() {
        System.out.println("This is A");
    }

    @Override
    public void b() {
        System.out.println("This is B");
    }

    @Override
    public void d() {
        System.out.println("This is D");
    }
}
