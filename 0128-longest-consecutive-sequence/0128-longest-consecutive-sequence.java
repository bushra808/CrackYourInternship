class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if (n==0)
        return 0;
        int prevSmall=Integer.MIN_VALUE, count=1, maxCount=0;
        for(int i=0; i<n; i++)
        {
            if(prevSmall==nums[i]-1)
            {
                count++;
            }
            else if(nums[i]!=prevSmall)
            {
                count=1;
            }
            prevSmall=nums[i];
            maxCount=Math.max(count, maxCount);
            
        }
        return maxCount;
    }
}