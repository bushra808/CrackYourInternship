class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;

        if (n == 1) {
            return nums[0];
        }

        // Check for the first index
        if (nums[0] != nums[1]) {
            return nums[0];
        }

        // Check for the last index
        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }

        // Iterate through the middle elements
        for (int i = 1; i < n - 1; i++) {
            if (nums[i] != nums[i - 1] && nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        // Return -1 if no single non-duplicate element is found (this should not occur in a valid input)
        return -1;
    }
}
