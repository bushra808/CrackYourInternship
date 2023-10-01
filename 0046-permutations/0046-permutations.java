import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(nums, current, ans);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> current, List<List<Integer>> ans) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current)); // Add a valid permutation to the result
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!current.contains(nums[i])) { // Check if the element is not already in the current permutation
                current.add(nums[i]); // Add the element to the current permutation
                backtrack(nums, current, ans); // Recursively generate the next part of the permutation
                current.remove(current.size() - 1); // Backtrack by removing the last added element
            }
        }
    }
}
