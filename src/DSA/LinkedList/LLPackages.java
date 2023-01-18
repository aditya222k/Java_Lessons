package DSA.LinkedList;
import java.util.LinkedList;

public class LLPackages {
    public static void main(String[] args){
        LinkedList<String> list= new LinkedList<>();
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("last");
        System.out.println(list.contains("This"));
    }
}
