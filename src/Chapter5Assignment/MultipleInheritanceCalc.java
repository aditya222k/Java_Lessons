package Chapter5Assignment;

interface AA{
    int a = 400;
    int b = 500;
    void add();
}

interface BB{
    int x = 200;
    int y = 300;
    void mul();
}


public class MultipleInheritanceCalc implements AA,BB {
    @Override
    public void add() {
        System.out.println("a+b = " + (a + b));
    }

    @Override
    public void mul() {
        System.out.println("x*y = " + (x * y));
    }

    public static void main(String[] args){
        MultipleInheritanceCalc mic=new MultipleInheritanceCalc();
        mic.add();
        mic.mul();
    }
}
