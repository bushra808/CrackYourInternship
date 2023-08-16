class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;
        
        
        int p=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==target)
            {
                if(p==0)
                {
                res[p]=i;
                res[p+1]=i;
                p++;
                }
                else if(p==1)
                {
                res[p]=i;
                }
            }
        }
        return res;
    }
}