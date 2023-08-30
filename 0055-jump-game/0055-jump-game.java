class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length, r=n-1;
        for(int i=n-2; i>=0; i--)
        {
            if(nums[i]>=(r-i))
            r=i;
            System.out.println(r+" ");
        }
        return r==0?true:false;
    }
}