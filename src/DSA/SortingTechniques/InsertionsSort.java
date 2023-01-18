package DSA.SortingTechniques;
/*
It takes the second element as the key and starts comparing the first element with the key. If the key is greater it makes the next element the key.
If it is small it copies the value to the next element and then copies the key to the first element and makes the second element the key.
 */


import java.util.Arrays;

public class InsertionsSort {

    static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args){
        int[] arr ={64,25,12,22,11};
        int n=arr.length;
        insertionSort(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
//TODO merge sort
