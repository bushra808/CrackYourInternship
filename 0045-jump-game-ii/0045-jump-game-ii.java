class Solution {
    public int jump(int[] nums) {
        int n=nums.length, l=0, r=0; //initially window is of len 0
        int c=0; //total count
        while(r<n-1)
        {
            int farthest=0; //the farthest we can jump at any given instance
            for(int i=l;i<=r;i++)
            {
                farthest=Math.max(farthest, nums[i]+i);
            }
            l=r+1;
            r=farthest;
            c++;
        }
        return c;
    }
}
//this works because 5 hai tb bhi 4 tk jaa skte hai