package DSA.SortingTechniques;

/* in selection sort the outer for creates range for insorted array in the array. The inner array find the smallest number in
range set by outer for loop. Once the smalled element in the range is found it is replaced by the first element in of the outer for loop range
like this the range keep shifting to left hence reducing the amount of integers it has to go through and reducing the range*/

// Time Complexity= O[N^2]

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] arr){
        int min_index= 0;
        int n = arr.length;
        for(int i=0; i<n;i++){
            min_index=i;
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int tmp= arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=tmp;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr ={64,25,12,22,11};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }
}