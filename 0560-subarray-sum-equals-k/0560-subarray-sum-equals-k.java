class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        int n=nums.length;
        int sum=0;
        int count=0;
        map.put(0, 1);

        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            if(map.containsKey(sum - k))
            count=count+map.get(sum-k);
        
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}