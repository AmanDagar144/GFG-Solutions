// User function Template for Java

class Solution {
    public List<Integer> sumClosest(int[] arr, int target) {
        // code here
        List<Integer> result = new ArrayList<>();
        if (arr == null || arr.length < 2) return result;

        int n = arr.length;
        Arrays.sort(arr);

        int left = 0, right = n - 1;
        int closestSum = Integer.MAX_VALUE;
        int maxDiff = -1;

        while (left < right) {
            int a = arr[left], b = arr[right];
            int sum = a + b;
            int diff = Math.abs(sum - target);

            if (diff < Math.abs(closestSum - target)) {
                closestSum = sum;
                result = Arrays.asList(a, b);
                maxDiff = Math.abs(a - b);
            } else if (diff == Math.abs(closestSum - target)) {
                int currentDiff = Math.abs(a - b);
                if (currentDiff > maxDiff) {
                    result = Arrays.asList(a, b);
                    maxDiff = currentDiff;
                }
            }

            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;        
    }
}