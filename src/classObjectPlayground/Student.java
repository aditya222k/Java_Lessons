package classObjectPlayground;

public class Student {
    int sid;
    String sname;
    char grade;

    Student(int id, String name,char g){
        sid=id;
        sname=name;
        grade=g;
    }

    void getValues(int id, String name,char g){
        sid=id;
        sname=name;
        grade=g;
    }
    void display(){
        System.out.println(sid);
        System.out.println(sname);
        System.out.println(grade);
    }

}
