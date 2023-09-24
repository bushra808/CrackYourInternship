import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int[][] merge(int[][] A) {
        int n = A.length;

        // Sorting based on the first indices
        Arrays.sort(A, Comparator.comparingInt(a -> a[0]));

        List<List<Integer>> ans = new ArrayList<>();
        int start = A[0][0];
        int end = A[0][1];

        for (int i = 1; i < n; i++) {
            if (A[i][0] <= end) {
                // Merge overlapping intervals
                end = Math.max(end, A[i][1]);
            } else {
                // Add the merged interval to the result
                ans.add(Arrays.asList(start, end));
                // Update start and end for the next interval
                start = A[i][0];
                end = A[i][1];
            }
        }

        // Add the last merged interval to the result
        ans.add(Arrays.asList(start, end));

        // Convert the result to a 2D array
        int[][] result = new int[ans.size()][2];
        for (int i = 0; i < ans.size(); i++) {
            List<Integer> interval = ans.get(i);
            result[i][0] = interval.get(0);
            result[i][1] = interval.get(1);
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = solution.merge(input);

        // Print the merged intervals
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
