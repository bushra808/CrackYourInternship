class Solution {
    public int numIdenticalPairs(int[] nums) {
        int i=0, j=i+1;
        int n=nums.length;
        int c=0;
        
        while(i<j && j<=n-1)
        {
            while(j<=n-1)
            {
                if(nums[i]==nums[j])
                c++;

                j++;
            }
            i++;
            j=i+1;
        }
        return c;
    }
}