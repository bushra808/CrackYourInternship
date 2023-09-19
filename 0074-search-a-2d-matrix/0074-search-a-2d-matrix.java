class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0; i<n; i++)
        {
            if(target>=matrix[i][0] && target<=matrix[i][m-1])
            {
            return binarySearch(i, target, m, matrix);
            }
        }
        return false;
    }

    public boolean binarySearch(int i, int target, int m, int[][] matrix)
    {
        int low=0, high=m-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;

            if(matrix[i][mid]==target)
            {
                return true;
            }
            if(matrix[i][mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
        return false;
    }
}