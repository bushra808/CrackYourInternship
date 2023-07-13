class Solution {
    public int missingNumber(int[] A) {
        int i,n;n=A.length;
        // int max=A[0];
        int sum1=0;
        for(i=0;i<n;i++)
        {
            sum1=sum1+A[i];
        }
        int k=0;
        int sum2=0;
        sum2=(n*(n+1)/2);
            return sum2-sum1;
    }
}