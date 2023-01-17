package DSA.ArrayPractice;

public class SumInArray {

    static boolean numInArray(int[] arr, int n){
        for(int i =0 ; i< arr.length; i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }

    static void addNum(int[] arr){
        int sum;
        for(int i =0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(numInArray(arr,sum)){
                    System.out.println(arr[i]+"+"+arr[j]+"="+sum);
                }
            }
        }
    }
    public static void main(String[] args){
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
        addNum(arr);
    }
}
