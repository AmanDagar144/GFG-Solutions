#User function Template for python3

class Solution:
    #Function to return list containing first n fibonacci numbers.
    def fibonacciNumbers(self,n):
        # your code here
        a = 0 
        b = 1
        d = []
        for i in range(n):
            d.append(a)#0
            c = a + b
            a = b
            b = c
        return d
            
        