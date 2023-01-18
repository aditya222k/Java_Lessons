package DSA.SortingTechniques;
/*
https://www.geeksforgeeks.org/sorting-algorithms/
iterates through the array till the number of swaps becomes 0. It checks the two neighbours and swaps them if the one is greater than others. The outer loop
is to make sure that if there are no swaps in the inner loop it quits
*/

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        int n=arr.length;
        boolean swapped;
        for (int i=0; i < n - 1; i++)
        {
            swapped=false;
            for (int j=0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp=arr[j];
                    arr[j]=arr[j + 1];
                    arr[j + 1]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    static void recursiveBubbleSort(int[] arr, int n){
        int count =0;
        for(int i=0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp= arr[i];
                arr[i]= arr[i+1];
                arr[i+1]= temp;
                count=count+1;
            }

        }
            if(count==0){
                return;
            }
            recursiveBubbleSort(arr,n-1);
    }

    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        int n=arr.length;
//        System.out.println(Arrays.toString(recursiveBubbleSort(arr,n)));
        recursiveBubbleSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
