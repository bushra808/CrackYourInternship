import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort the candidates array to handle duplicates
        findCombinations(candidates, 0, target, result, new ArrayList<>());
        return result;
    }

    public void findCombinations(int[] candidates, int startIndex, int target, ArrayList<List<Integer>> result, ArrayList<Integer> currComb) {
        if (target == 0) {
            result.add(new ArrayList<>(currComb)); // Found a valid combination
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if (i > startIndex && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates to avoid duplicate combinations
            }

            if (candidates[i] > target) {
                break; // Stop if the current candidate is larger than the remaining target
            }

            currComb.add(candidates[i]);
            findCombinations(candidates, i + 1, target - candidates[i], result, currComb);
            currComb.remove(currComb.size() - 1);
        }
    }
}
