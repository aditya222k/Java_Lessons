interface AB {
    int a=10;
    void m1();
}

public class InterfacePlayground implements AB{
    public void m1(){
        System.out.println(a);
    }
    public static void main(String[] args){
        InterfacePlayground ip =new InterfacePlayground();
        ip.m1();
    }
}
