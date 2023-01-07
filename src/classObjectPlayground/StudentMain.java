package classObjectPlayground;

public class StudentMain {
    public static void main(String[] args) {
//        Student stu1 =new Student();//stu1 is obejct reference variable
        //Approach 1 - assigning the values using object reference variable
        /*
        stu1.sid=100;
        stu1.sname="muskesh";
        stu1.grade='A';*/

        //Approach 2 using method
//        stu1.getValues(120,"muskesh",'A');

        //Approach 3 Constructor
        Student stu1 =new Student(100,"Mukesh",'A');


        stu1.display();
    }

}
