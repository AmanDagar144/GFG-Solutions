//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.findPages(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends



//Back-end complete function Template for Java

class Solution {
    public static int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        if (k > n) return -1; // Not enough books

        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages); // at least one book per student
            high += pages;
        }

        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isFeasible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    // Helper function to check if we can allocate with maxPages
    private static boolean isFeasible(int[] arr, int k, int maxPages) {
        int studentCount = 1;
        int currentSum = 0;

        for (int pages : arr) {
            if (currentSum + pages > maxPages) {
                studentCount++;
                currentSum = pages;
                if (studentCount > k) return false;
            } else {
                currentSum += pages;
            }
        }

        return true;
        
    }
}