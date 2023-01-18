package DSA.SortingTechniques;

//O(nlog n)

import java.util.Arrays;

public class QuickSort {
    static int[] arr={64, 25, 22, 11};


    static int partition(int l, int h) {
        int i=l;
        int j=h;
        int pivot=arr[l];
        while (i < j) {
            for (i=l; i < h; i++) {
                if (arr[i] > pivot)
                    break;
            }
            for (j=h; j > l; j--) {
                if (arr[j] < pivot)
                    break;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);
        return j;
    }

    static void quickSort(int l, int h) {
        if (l < h) {
            int j=partition(l, h);
            quickSort(l, j);
            quickSort(j + 1, h);

        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int n=arr.length;
        quickSort(0, n - 1);
        System.out.println(Arrays.toString(arr));
    }
}



