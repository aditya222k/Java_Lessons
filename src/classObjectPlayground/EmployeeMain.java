package classObjectPlayground;

public class EmployeeMain {
    public static void main(String[] args){
        Employee emp1=new Employee();//object creation of classObjectPlayground.Employee class
        emp1.eid=101;
        emp1.deptno=10;
        emp1.job="Man";
        emp1.ename="Manish";

        emp1.display();
    }
}
