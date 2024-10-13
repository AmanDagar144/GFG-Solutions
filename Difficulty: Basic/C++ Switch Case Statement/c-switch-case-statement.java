//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.isInRange(N));
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static String isInRange(int N){
        // code here
    if(N==1){
        return "one";
    }if(N==2){
        return "two";
    }if(N==3){
        return "three";
    }if(N==4){
        return "four";
    }if(N==5){
        return "five";
    }if(N==6){
        return "six";
    }if(N==7){
        return "seven";
    }if(N==8){
        return "eight";
    }if(N==9){
        return "nine";
    }if(N==10){
        return "ten";
    }else{
        return "not in range";
    }
    }
}