//{ Driver Code Starts
// Initial template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();
            Solution ob = new Solution();

            System.out.println(ob.revStr(s));
        }
    }
}
// } Driver Code Ends


class Solution {
    static String revStr(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        return sb.reverse().toString();
    // String a="";
    // for(int i=s.length()-1;i>=0;i--){
    //     a=a+s.charAt(i);
    // }
    // return a;
        
        // for(int i=0;i<sb.length()/2;i++){
        //     int f=i;
        //     int b=sb.length()-1-i;
        //     char x=sb.charAt(f);
        //     char c=sb.charAt(b);
        //     sb.setCharAt(f,c);
        //     sb.setCharAt(b,x);
        // }
        // return s;
    }
}