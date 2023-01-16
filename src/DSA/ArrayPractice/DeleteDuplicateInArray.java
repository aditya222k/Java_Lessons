package DSA.ArrayPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

import static DSA.ArrayPractice.DuplicateIntegersInArray.arrayInput;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;

public class DeleteDuplicateInArray {
    static LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();

    static void delete(int[] arr){
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }

    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        delete(arr);
    }
}
