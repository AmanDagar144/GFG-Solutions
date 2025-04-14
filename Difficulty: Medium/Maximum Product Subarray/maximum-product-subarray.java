//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n = arr.length;
    
        int result = arr[0];
        
        int maxEndingHere = arr[0];
        int minEndingHere = arr[0];
        
        for (int i = 1; i < n; i++) {
            int temp = maxEndingHere;
            
            maxEndingHere = Math.max(Math.max(arr[i], maxEndingHere * arr[i]), minEndingHere * arr[i]);
            minEndingHere = Math.min(Math.min(arr[i], temp * arr[i]), minEndingHere * arr[i]);
            
            result = Math.max(result, maxEndingHere);
        }
        
        return result;
    }
}