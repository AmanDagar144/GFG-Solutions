#User function Template for python3

class Solution:
     def reverseString(self, s: str) -> str:
        # code here
        rev=" "
        for i in s:
            rev = i+rev
        return rev 
        
        
