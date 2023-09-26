// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {
//         ArrayList<List<Integer>> sets = new ArrayList<>();
//         findSets(nums, 0, new ArrayList<>(), sets);
//         return sets;
//     }

//     public void findSets(int[] nums, int i, ArrayList<Integer> currentSet, ArrayList<List<Integer>> sets) {
//         if (i == nums.length) {
//             sets.add(new ArrayList<>(currentSet)); // Add a copy of the currentSet to sets
//             return;
//         }

//         // Exclude the current element
//         findSets(nums, i + 1, currentSet, sets);

//         // Include the current element
//         currentSet.add(nums[i]);
//         findSets(nums, i + 1, currentSet, sets);

//         // Backtrack (remove the current element) to explore other subsets
//         currentSet.remove(currentSet.size() - 1);
//     }
// }


class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> sets = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<>(), sets);
        return sets;
    }

    private void generateSubsets(int[] nums, int start, List<Integer> current, List<List<Integer>> sets) {
        sets.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, sets);
            current.remove(current.size() - 1);
        }
    }
}
