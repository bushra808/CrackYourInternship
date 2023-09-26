class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<List<Integer>> sets = new ArrayList<>();
        findSets(nums, 0, new ArrayList<>(), sets);
        return sets;
    }

    public void findSets(int[] nums, int i, ArrayList<Integer> currentSet, ArrayList<List<Integer>> sets) {
        if (i == nums.length) {
            sets.add(new ArrayList<>(currentSet)); // Add a copy of the currentSet to sets
            return;
        }

        // Exclude the current element
        findSets(nums, i + 1, currentSet, sets);

        // Include the current element
        currentSet.add(nums[i]);
        findSets(nums, i + 1, currentSet, sets);

        // Backtrack (remove the current element) to explore other subsets
        currentSet.remove(currentSet.size() - 1);
    }
}
