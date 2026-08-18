class Solution {
    public int[] runningSum(int[] nums) {
        // Start from the second element (index 1)
        for (int i = 1; i < nums.length; i++) {
            // Add the previous element's value to the current element
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

        
    
