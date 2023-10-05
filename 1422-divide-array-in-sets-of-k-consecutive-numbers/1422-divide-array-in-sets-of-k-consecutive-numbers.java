class Solution {
    public boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0)
            return false;

        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int num : nums)
        {
            minHeap.offer(num);
        }

        while(!minHeap.isEmpty())
        {
            int first=minHeap.poll();

            for(int i=first+1; i<first+k; i++)
            {
                if(!minHeap.remove(i))
                return false;
            }
        }
        return true;
    }
}