//This particular solution give index of searched item if not found returns -1

import java.io.*;

class linearSearch {
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
        Search linear = new Search();
        int res = linear.linearSearch(nums, x);
        System.out.println("Index of " + x + " is: " + res);
    }
}

class Search {
    int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) return i;
        }
        return -1;
    }
}