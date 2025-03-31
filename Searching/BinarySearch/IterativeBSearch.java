//this is iteraterive binary search implementation for sorted array
import java.util.*;
import java.io.*;

class IterativeBSearch {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        // Taking array input
        System.out.println("Enter array elements separated by space:");
        String[] numsStr = read.readLine().trim().split(" ");
        int[] nums = new int[numsStr.length];
        // Converting string array to int array
        for (int i = 0; i < numsStr.length; i++) {
            nums[i] = Integer.parseInt(numsStr[i]);
        }
        // Taking target number input
        System.out.println("Enter number to search:");
        int x = Integer.parseInt(read.readLine());
        Search binary = new Search();
        int res = binary.bSearch(nums, x);
        System.out.println("Index of " + x + " is: " + res);
    }
}

class Search {
    int bSearch(int arr[], int x) {
        int low=0, n = arr.length-1,high=n;
       while (low <= high) {
           int mid = (low+high)/2;
           if (arr[mid] == x) return mid;
           else if (arr[mid] < x) low = mid + 1;
           else high = mid - 1;
       }
        return -1;
    }
}