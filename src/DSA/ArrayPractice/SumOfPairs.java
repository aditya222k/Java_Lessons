package DSA.ArrayPractice;
//TODO: complete using Hashmaps like in SumInArray.java

import java.util.HashMap;
import java.util.Map;

import static DSA.ArrayPractice.DuplicateIntegersInArray.arrayInput;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;

public class SumOfPairs {

    static void sumPair(int[] arr, int tar){
        for(int i=0 ; i<arr.length;i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]+arr[j]==tar){
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        System.out.println("enter target");
        int target= in.nextInt();
        sumPair(arr,target);
    }
}
