

class Solution {
    // Function to search a given number in row-column sorted matrix.
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
    
        int low = 0, high = n * m - 1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / m;
            int col = mid % m;
            int midVal = mat[row][col];
    
            if (midVal == x) {
                return true;
            } else if (midVal < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    
        return false;
        
    }
}
