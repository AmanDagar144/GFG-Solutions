// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                if (arr[left] == arr[right]) {
                    int total = right - left + 1;
                    count += (total * (total - 1)) / 2;
                    break;
                } else {
                    int leftVal = arr[left];
                    int rightVal = arr[right];
                    int leftCount = 0;
                    int rightCount = 0;

                    while (left <= right && arr[left] == leftVal) {
                        left++;
                        leftCount++;
                    }

                    while (right >= left && arr[right] == rightVal) {
                        right--;
                        rightCount++;
                    }

                    count += leftCount * rightCount;
                }
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return count;        
    }
}
