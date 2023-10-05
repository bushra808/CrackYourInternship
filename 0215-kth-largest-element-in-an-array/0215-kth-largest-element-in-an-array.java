//min heap contains k elements, and we ensure that the elements that are not in the min heap are smaller than all the ele of the min heap. This way, the min heap will contain the k largest elements (largest at leaves and smallest(k-largest) at the root)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n=nums.length;

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        int i;
        for(i=0; i<k; i++)
        minHeap.offer(nums[i]);

        while(i<n)
        {
             if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.offer(nums[i]);
            }
            i++;
        }
        return minHeap.peek();
    }
}