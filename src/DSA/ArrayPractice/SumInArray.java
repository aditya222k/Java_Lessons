package DSA.ArrayPractice;

import java.util.HashMap;

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
    static HashMap<Integer,Integer > maps = new HashMap<>();
    static HashMap<Integer, Integer> mapArray(int[] arr){
        for(int i=0; i<arr.length;i++){
            maps.put(arr[i],i);
        }
        return maps;
    }

    static void checkSum(int[] arr, HashMap<Integer, Integer> maps){//TODO: to check two numbers we need two for loops
        int sum;
        for(int i =0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=arr[i]+arr[j];
                if(maps.containsKey(sum)){
                    System.out.println(arr[i]+"+"+arr[j]+"="+sum);
                }
            }
        }
    }

    public static void main(String[] args){
        int [] arr= {1,2,3,4,5,6,7,8,9,10};
//        addNum(arr);
        mapArray(arr);
        checkSum(arr,maps);

    }
}
