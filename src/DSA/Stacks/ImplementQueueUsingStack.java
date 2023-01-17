package DSA.Stacks;
import java.util.*;
import static DSA.Stacks.ReverseUsingStack.*;

public class ImplementQueueUsingStack {
    static ArrayList<Integer> ar1=new ArrayList<>();
    static ArrayList<Integer> pushToQueue(int[] arr, int n) {
        addArraytoList(arr);
        int i=0;
        while( i<n) {
            ar1.add(ReverseUsingStack.pop());
            i++;
        }
        ar.addAll(ar1);
        ar1.clear();
        return ar;
    }

    public static void main(String[] args){
        int[] arr = {2,4,6,8,10};
        pushToQueue( arr, arr.length);
        System.out.println(pop());
        System.out.println(pop());
    }
}
