class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // Sort the input array to group duplicates together
        HashSet<List<Integer>> sets = new HashSet<>();
        findSets(nums, 0, new ArrayList<>(), sets);
        List<List<Integer>> result = new ArrayList<>(sets);
        return result;
    }

    public void findSets(int[] nums, int i, ArrayList<Integer> currSet, HashSet<List<Integer>> sets) {
        if (i == nums.length) {
            sets.add(new ArrayList<>(currSet));
            return;
        }

        // Include the current element
        currSet.add(nums[i]);
        findSets(nums, i + 1, currSet, sets);

        // Exclude the current element and any duplicates
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
            i++;
        }
        currSet.remove(currSet.size() - 1);

        // Continue generating subsets without the duplicate element
        findSets(nums, i + 1, currSet, sets);
    }
}
