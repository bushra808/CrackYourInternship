class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) {
            return nums[0]; // Special case for arrays with a single element
        }

        int left = 0;
        int right = nums.length - 1;

        // Check for single element at the beginning
        if (nums[left] != nums[left + 1]) {
            return nums[left];
        }
        // Check for single element at the end
        if (nums[right] != nums[right - 1]) {
            return nums[right];
        }

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check for single element
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            // If mid is even, check elements to the right
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    left = mid + 2; // Move to the right of the duplicate pair
                } else {
                    right = mid; // Stay on the left of the pair
                }
            }
            // If mid is odd, check elements to the left
            else {
                if (nums[mid] == nums[mid - 1]) {
                    left = mid + 1; // Move to the right of the duplicate pair
                } else {
                    right = mid; // Stay on the left of the pair
                }
            }
        }

        return nums[left];
    }
}
