import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPlayground {
    public static void main(String[] args){ //user input for ArrayList till uer passes blank
        ArrayList<Object> intList=new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean flag=true;
//        System.out.println("enter a number");
        while(flag){
            System.out.println("enter a number");
            String x= in.nextLine();
            if(x.isBlank()) {
                flag=false;
                break;
            }else{
                int y = Integer.parseInt(x);
                intList.add(y);
            }
        }
//        while(in.hasNextLine()){
//            System.out.println("enter a number");
//            String x= in.nextLine();
//            if(x.isBlank()) {
//                break;
//            }else{
//                int y = Integer.parseInt(x);
//                intList.add(y);
//
//            }
//        }
//        System.out.println(intList);
//        ArrayList<Object> list= new ArrayList<>();//declaration
//         list.add("Welcome");
//         list.add(213);
//         list.add('s');
//         list.add(true);
//        System.out.println(list.size());//size of list
//        System.out.println(list.get(3));//get an object from particular index
//        list.add(2,false);
//        System.out.println(list);
//        System.out.println(list);
//        for(Object i:list){
//            System.out.println(i);
//        }


    }
}
