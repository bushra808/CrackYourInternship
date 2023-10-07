class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0; i<n; i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1); //calc freq
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>( (a, b) -> a.getValue() - b.getValue());

        //priority queue sorted in dec freq order

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(entry);

            if(minHeap.size()>k) //min heap full
            minHeap.poll(); // remove min freq ele
        }

        int ans[]=new int[k];

        int i=k-1;

        while (!minHeap.isEmpty()) {
            ans[i]=(minHeap.poll().getKey()); //.poll will return a <key, value> pair and getKey will fetch the key from it
            i--;
        }

        return ans;

    }
}