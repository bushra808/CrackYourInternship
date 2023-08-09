class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int l=0, r=n-1;
        int i=0;
        while(i<=r)
        {
           if(nums[i]==0)
           {
               swap(nums, i, l);
               l++;
           }
            if(nums[i]==2)
           {
               swap(nums, i, r);
               r--;
           }
           else
           i++;
        }
    }
    public void swap(int a[], int i, int ptr)
    {
        int temp=a[i];
        a[i]=a[ptr];
        a[ptr]=temp;
    }
}