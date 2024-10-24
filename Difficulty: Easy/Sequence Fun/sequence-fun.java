//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.NthTerm(n);
            System.out.println(ans);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution
{
    public int NthTerm(int n)
    {
       
        long a = 1;
        
        for (int i = 1; i <= n; i++) {
            a = (a * i + 1) % 1000000007;
        }
        
        return (int) a;
        // here
    }
}