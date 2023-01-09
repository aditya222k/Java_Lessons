import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPlayground {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        Scanner in = new Scanner(System.in);
        boolean flag=true;
//        hm.put(101,"john");
//        hm.put(102,"smith");
//        hm.put(103,"David");
//        hm.put(104,"Scott");
//        hm.put(105,"Manish");
//        System.out.println(hm);
//        System.out.println(hm);
//        System.out.println(hm.get(105));
//        System.out.println(hm.values());
//        for(Map.Entry m:hm.entrySet()) {
//            System.out.println(m.getKey() + " " + m.getValue());
//        }

        //User input in HashMap
        while(flag){
            System.out.println("enter a employ number");
            String eid= in.nextLine();
            if(eid.isBlank()) {
                flag=false;
                break;
            }else{
                System.out.println("enter a employ name");
                String name= in.nextLine();
                int y = Integer.parseInt(eid);
                hm.put(y,name);
            }
        }
        System.out.println(hm);
    }
}
