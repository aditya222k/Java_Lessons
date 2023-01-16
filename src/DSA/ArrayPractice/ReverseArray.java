package DSA.ArrayPractice;

import static DSA.ArrayPractice.DuplicateIntegersInArray.arrayInput;
import static DSA.ArrayPractice.DuplicateIntegersInArray.in;

public class ReverseArray {

    static void reverseArray(int[] arr){
        int[] arr1=new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            arr1[arr.length-i-1] = arr[i];
            System.out.println("check");
        }
        for(int i=0; i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
    public static void main(String[] args){
        int n = in.nextInt();
        int[] arr=arrayInput(n);
        reverseArray(arr);
    }
}
