package DSA.SearchingTechnique;

/*
Normal search goes through each and every element and check if the number is equal to that number or not
O(N)
 */
public class LinearSearch {
    static void linearSearch(int[] arr,int n,int tar){
        int count=0;
        for(int i=0; i<n-1;i++){
            if(arr[i]==tar){
                count++;
            }
        }
        System.out.println("Found "+tar+" "+count+" times");
    }
    public static void main(String[] args) {
        int[] arr={7, 12, 64, 25, 12, 22, 11};
        int target=12;
        int n=arr.length;
        linearSearch(arr,n,target);

    }
}
