class A1{
    void m1(){
        System.out.println("This is m1 from A1");
    }
}

interface B1{
    void m2();
}
interface B2{
    void m3();
}

public class HybridInheritancePlayground extends A1 implements B1,B2{

    @Override
    public void m2() {
        System.out.println("this is m2 from B1");
    }

    @Override
    public void m3() {
        System.out.println("This is m3 from B2");
    }

    public static void main(String[] args){
        HybridInheritancePlayground hi = new HybridInheritancePlayground();
        hi.m1();
        hi.m2();
        hi.m3();
    }

}
