class A{// parent class
    int a;
    void display(){
        System.out.println(a);
    }
}
class B extends A{ //B is child class
    int b;
    void print(){
        System.out.println(b);
    }
}

class C extends B{ //C is a child class of B
    int c;
    void run(){
        System.out.println(c);
    }
}

public class InheritancePlayground {
    public static void main(String[] args){
        A aobj = new A();
        aobj.a =100;
        aobj.display();

        B obj = new B();
        obj.b=120;
        obj.a=500;
        obj.print();
        obj.display();

        C cobj = new C();
        cobj.a=1000;
        cobj.b=2000;
        cobj.c=3000;
        cobj.run();
        cobj.display();
        cobj.print();


    }
}

