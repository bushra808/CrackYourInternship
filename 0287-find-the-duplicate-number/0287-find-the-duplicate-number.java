class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int index=Math.abs(nums[i])-1;
            // System.out.println(index);
            if(nums[index]>0)
            {
                nums[index]=-nums[index];
            }
            else
            {
            return (Math.abs(nums[Math.abs(i)]));
            }
        }
        return -1;
    }
}