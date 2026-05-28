class Solution:
    def isPrime(self, n):
        if n > 1:
            
            for i in range(2,n//2):
                if n % i == 0:
                    return False
            
            return True
                