class Solution:
    def getMinMax(self, arr):
        # code here
        min = arr[0]
        max = arr[0]
        
        for i in arr:
            if i > max:
                max = i
            elif i < min:
                min = i
                
        return min,max
        