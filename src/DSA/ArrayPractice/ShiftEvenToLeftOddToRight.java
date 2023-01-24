//TODO Check whats left


package DSA.ArrayPractice;

import java.util.Arrays;

public class ShiftEvenToLeftOddToRight {
    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void shift(int[] arr){
//        int mid = arr.length/2;
//        System.out.println(arr[mid]);
        int i=0;
        int j = arr.length-1;

        while(i<j){
            for(i=0; i<j; i++){
                if(arr[i]%2!=0)
                    break;
            }
            for(j=arr.length-1; j>0; j--){
                if(arr[j]%2==0)
                    break;
            }

                swap(arr, i, j);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        int[] arr = {1,4,7,3,6,8};
        shift(arr);
    }
}
