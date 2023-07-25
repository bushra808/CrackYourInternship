class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int p1, p2; p1=0;p2=n-1;
        int max=0;
        while(p2!=p1)
        {
            if(arr[p1]>arr[p2])
            p2--;
            else
            p1++;
        }
        return p1;
    }
}