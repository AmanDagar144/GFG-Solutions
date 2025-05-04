//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases

        while (t-- > 0) {
            String arr1[] = br.readLine().trim().split(" ");
            String arr2[] = br.readLine().trim().split(" ");

            int a[] = new int[arr1.length];
            int b[] = new int[arr2.length];

            for (int i = 0; i < a.length; i++) a[i] = Integer.parseInt(arr1[i]);
            for (int i = 0; i < b.length; i++) b[i] = Integer.parseInt(arr2[i]);

            Solution ob = new Solution();
            ob.mergeArrays(a, b);

            StringBuffer str = new StringBuffer();
            for (int i = 0; i < a.length; i++) {
                str.append(a[i] + " ");
            }
            System.out.println(str);
            str = new StringBuffer();
            for (int i = 0; i < b.length; i++) {
                str.append(b[i] + " ");
            }
            System.out.println(str);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to merge the arrays.
    public void mergeArrays(int a[], int b[]) {
        // code here    
        int n = a.length, m = b.length;
        int gap = nextGap(n + m);
        
        while (gap > 0) {
            int i = 0, j = gap;
            while (j < (n + m)) {
                // i-th and j-th elements in the virtual combined array
                int val1 = get(a, b, n, i);
                int val2 = get(a, b, n, j);
                
                if (val1 > val2) {
                    set(a, b, n, i, val2);
                    set(a, b, n, j, val1);
                }
                i++;
                j++;
            }
            gap = nextGap(gap);
        }
    }

    // Helper to get element at virtual index
    private int get(int[] a, int[] b, int n, int index) {
        return (index < n) ? a[index] : b[index - n];
    }

    // Helper to set element at virtual index
    private void set(int[] a, int[] b, int n, int index, int value) {
        if (index < n)
            a[index] = value;
        else
            b[index - n] = value;
    }

    // Calculate next gap
    private int nextGap(int gap) {
        if (gap <= 1) return 0;
        return (gap / 2) + (gap % 2);

        
    }
}
