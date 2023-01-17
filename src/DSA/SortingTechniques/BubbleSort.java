package DSA.SortingTechniques;
//TODO; complete using recursion as well
/*
iterates through the array till the number of swaps becomes 0. It checks the two neighbours and swaps them if the one is greater than others. The outer loop
is to make sure that if there are no swaps in the inner loop it quits
*/

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        boolean flag=false;
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

    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
}
