//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java

class Geeks {

    // Function to take input using Scanner class
    static void IOFunction(Scanner sc) {
        // Your code here
        // Take input and print all the VALUES
            int a=sc.nextInt();
            float b=sc.nextFloat();
            long c=sc.nextLong();
            byte d=sc.nextByte();
            sc.nextLine();
            String s=sc.nextLine();
            
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(s);
        
    }
}

//{ Driver Code Starts.

class GFG {

    // Driver Code
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            // Creating an object of class Geeks
            Geeks g = new Geeks();

            // Calling the IOFunction() of class Geeks
            g.IOFunction(scn);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends