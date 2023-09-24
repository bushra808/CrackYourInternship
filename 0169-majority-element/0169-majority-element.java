class Solution {
    public int majorityElement(int[] nums) {
        
        int n=nums.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0; i<n; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                int count=map.get(nums[i]);
                map.put(nums[i], count + 1);
            }
        }

        for(int key: map.keySet())
        {
            int count=map.get(key);
            if(count>n/2){
            return key;
            }
        }

        return -1;
    }
}