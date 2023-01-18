package DSA.ArrayPractice;
import static DSA.ArrayPractice.SumInArray.mapArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static DSA.ArrayPractice.DuplicateIntegersInArray.arrayInput;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;

public class SumOfPairs {
    static void sumPair(int[] arr, int tar){
        for(int i:arr){
            for(int j:arr){
                if((i+j)==tar){
                    System.out.println(i+","+j);
                }
            }
        }
    }
    static void hashedSumOfPair(HashMap abc, int tar, int[] arr){
        for(int i=0; i<arr.length;i++){
            if(abc.containsKey(tar-arr[i])){
                System.out.println(arr[i]+","+(tar-arr[i]));
            }
        }
    }
    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        System.out.println("enter target");
        int target= in.nextInt();
        sumPair(arr,target);
        System.out.println("-------------------------------");
        hashedSumOfPair(mapArray(arr),target,arr);
    }
}
