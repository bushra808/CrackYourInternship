class Solution {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        int c=0;
        HashMap<Integer, Integer> map=new HashMap<>();

        for(int i=0; i<n; i++)
        {
            int val=map.getOrDefault(nums[i], 0);
            c+=val;
            map.put(nums[i], val+1);
        }
        return c;
    }
}