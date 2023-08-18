class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        int[] counts = new int[n];
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        mergeSort(nums, indices, counts, 0, n - 1);
        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }
    
    private void mergeSort(int[] nums, int[] indices, int[] counts, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, indices, counts, start, mid);
        mergeSort(nums, indices, counts, mid + 1, end);
        merge(nums, indices, counts, start, mid, end);
    }
    
    private void merge(int[] nums, int[] indices, int[] counts, int start, int mid, int end) {
        int[] mergedIndices = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;
        int rightCount = 0;
        while (i <= mid || j <= end) {
            if (i > mid || (j <= end && nums[indices[j]] < nums[indices[i]])) {
                mergedIndices[k] = indices[j];
                rightCount++;
                j++;
            } else {
                mergedIndices[k] = indices[i];
                counts[indices[i]] += rightCount;
                i++;
            }
            k++;
        }
        System.arraycopy(mergedIndices, 0, indices, start, mergedIndices.length);
    }
}