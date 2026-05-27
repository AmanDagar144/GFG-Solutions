#User function Template for python3

class Solution:
    def isFactorial (self, N):
        # code here
        fact = 1
        for i in range(1,N+1):
            fact = fact*i
            if fact == N:
                return 1
            elif fact>N:
                return 0