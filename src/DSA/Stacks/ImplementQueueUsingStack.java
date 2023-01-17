package DSA.Stacks;
import java.util.*;

import static DSA.Stacks.ReverseUsingStack.*;

public class ImplementQueueUsingStack {

    static ArrayList<Integer> ar1=new ArrayList<>();

    static ArrayList<Integer> pushingIntoTemp(ArrayList<Integer> ar, int n) {
        int i=0;
        while( i<n) {
            ar1.add(ReverseUsingStack.pop());
            i++;
        }
        ar.addAll(ar1);
        ar1.clear();
        return ar;
    }

    static int deque(){
        int i=ar.size();
        int j=0;
//        while (j<i){
//            System.out.println(pop());
//            j++;
//        }
        return pop();
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        pushingIntoTemp(addArraytoList(arr), arr.length);
        System.out.println(deque());
        System.out.println(deque());
    }

}
