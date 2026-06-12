#User function Template for python3

class Solution:
    def armstrongNumber (self, n):
        # code here 
        temp = n
        total = 0
        # l = len(str(n))
        while n > 0:
            digit = n % 10
            total += digit**3
            n = n//10
        
        return temp == total
        

        
        