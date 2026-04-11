class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Step 1: First window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: Slide window
        for (int i = k; i < nums.length; i++) {
            sum += nums[i];      // add next
            sum -= nums[i - k];  // remove previous

            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}