package Chapter5Assignment;
interface A{
    int a=100;
    int b=200;
    void sum();
}

class B implements A {
    public void sum(){
        System.out.println("a+b = " + (a + b));
    }

}
public class InterfaceSummation {

    public static void main(String[] args){
        B obj=new B();
        obj.sum();
    }
}
