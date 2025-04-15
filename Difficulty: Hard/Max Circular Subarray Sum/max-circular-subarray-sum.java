//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalSum = 0;
    int maxKadane = kadane(arr); 
    int minKadane = kadaneMin(arr); 
    for (int val : arr) {
        totalSum += val;
    }

    if (totalSum == minKadane) {
        return maxKadane; 
    }

    return Math.max(maxKadane, totalSum - minKadane);
}

private int kadane(int[] arr) {
    int maxSoFar = arr[0];
    int currMax = arr[0];
    for (int i = 1; i < arr.length; i++) {
        currMax = Math.max(arr[i], currMax + arr[i]);
        maxSoFar = Math.max(maxSoFar, currMax);
    }
    return maxSoFar;
}

private int kadaneMin(int[] arr) {
    int minSoFar = arr[0];
    int currMin = arr[0];
    for (int i = 1; i < arr.length; i++) {
        currMin = Math.min(arr[i], currMin + arr[i]);
        minSoFar = Math.min(minSoFar, currMin);
    }
    return minSoFar;
}
    
}
