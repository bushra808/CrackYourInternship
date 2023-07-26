class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int pos=0;
        int i=0;
        for(i=0;i<n;i++)
        {
            pos=BinarySearch(numbers, target-numbers[i], i);
            if(pos!=-2)
            break;
        }
        return new int[]{i+1,pos+1};
    }
    public int BinarySearch(int[] A, int num, int j)
    {
        int left=0, right=A.length-1;
        int mid=0; int ans=-2;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(A[mid]==num && mid!=j)
            {
                ans=mid;
                break; }
            else if(A[mid]>num)
            right=mid-1;
            else
            left=mid+1;
        }
        return ans;
    }
}