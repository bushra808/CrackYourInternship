class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<List<Integer>> sum = new ArrayList<>();
        findCombinations(candidates, 0, target, sum, new ArrayList<>());
        return sum;
    }

    public void findCombinations(int[] candidates, int startIndex, int target, ArrayList<List<Integer>> sum, ArrayList<Integer> currComb) {
        if (target == 0) {
            sum.add(new ArrayList<>(currComb)); // Found a valid combination
            return;
        }

        if (target < 0 || startIndex == candidates.length) {
            return; // Stop if target is negative or we've reached the end of candidates
        }

        // Include the current candidate
        currComb.add(candidates[startIndex]);
        findCombinations(candidates, startIndex, target - candidates[startIndex], sum, currComb);
        currComb.remove(currComb.size() - 1);

        // Exclude the current candidate and move to the next
        findCombinations(candidates, startIndex + 1, target, sum, currComb);
    }
}
