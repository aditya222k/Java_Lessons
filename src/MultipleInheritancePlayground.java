interface ABC {
    int x = 100;

    void m1();
}
interface XYZ {
    int y = 300;

    void m2();
}


public class MultipleInheritancePlayground implements ABC,XYZ
{
    public void m1(){
        System.out.println(x);
    }
    public void m2(){
        System.out.println(y);
    }
    public static void main(String[] args){
        MultipleInheritancePlayground mi = new MultipleInheritancePlayground();
        mi.m1();
        mi.m2();
    }
}
