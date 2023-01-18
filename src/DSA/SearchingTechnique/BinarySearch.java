package DSA.SearchingTechnique;
/*
Divide the array based on whether the mid is less or more than the number and then keep doing it with the sub array that
is received till middle is not equal to the target.
 */

public class BinarySearch {
    static void binarySearch(int[] arr, int tar) {
        int l=0, h=arr.length - 1;
        while (h - l > 0) {
            int mid=(h - l) / 2;
            if (arr[mid] == tar) {
                System.out.println("found at " + arr[mid]);
                break;
            }
            if (arr[mid] > tar) {
                h=mid - 1;
            } else if (arr[mid] < tar) {
                l=mid + 1;
            }
        }
        if (arr[l] == tar) {
            System.out.println("found at " + arr[l]);
        }
        if (arr[h] == tar) {
            System.out.println("found at" + arr[h]);
        }
    }

    static int recursiveBinarySearch(int[] arr, int h, int l, int tar) {
        if (h >= l) {
            int mid=(h + l) / 2;

            if (arr[mid] == tar) {
                return mid;
            } else if (arr[mid] > tar) {
                h=mid - 1;
                return recursiveBinarySearch(arr, h, l, tar);
            } else if (arr[mid] < tar) {
                l=mid + 1;
                return recursiveBinarySearch(arr, h, l, tar);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target=3;
        int n=arr.length;
//        binarySearch(arr, target);
        int res=recursiveBinarySearch(arr, arr.length - 1, 0, 6);
        if (res == -1)
            System.out.println("element not found");
        else
            System.out.println("element found");
    }
}
