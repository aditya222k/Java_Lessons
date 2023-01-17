package DSA.Stacks;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseUsingStack {
    static ArrayList<Integer> ar= new ArrayList<Integer>();

    static ArrayList<Integer> push(int n){
        ar.add(n);
        return ar;
    }
    static int pop(){
        int num= ar.get(ar.size()-1);
//        System.out.println("poped "+num);
        ar.remove(ar.size()-1);
        return num;
    }

    static String reverse(int[] arr){
        int[] arr1 = new int[arr.length];
        for(int i=0 ;i<arr.length;i++){
            push(arr[i]);
        }
        for(int i=0 ;i<arr.length;i++){
            arr1[i]=pop();
        }
        return Arrays.toString(arr1);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        System.out.println(reverse(arr));
    }
}
