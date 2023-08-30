class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0, r=n-1;
        int res=0;

        while(l<=r)
        {
        res=Math.max(res,((r-l)* (Math.min(height[l],height[r]))));
           if(height[r]<height[l])
           r--;
           else if(height[l]<height[r])
           l++;
           else
           {
               l++;
               r--;
           }
        }
        return res;
    }
}