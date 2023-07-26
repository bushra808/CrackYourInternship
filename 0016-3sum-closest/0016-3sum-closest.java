class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int min=Integer.MAX_VALUE;
        int n=nums.length;
        int closestsum=0;
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++)
        {
            int left=i+1;
            int right=n-1;
            while (left < right) {
            int sum=nums[i]+nums[left]+nums[right];
            if(Math.abs(sum-target)<min)
            {
            min=Math.abs(sum-target);
            closestsum=sum;
            }
            if (sum==target)
            return sum;
            if(sum<target)
            left++;
            else
            right--;
            }
        }
        return closestsum;
    }
}