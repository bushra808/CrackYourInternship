class Solution {
    //first approach uses extra memory, basically marks all 0's in different boolean array and updates row and column for every marked 0 in the bool array

    // public void setZeroes(int[][] A) {
        
    //     boolean[][] temp=new boolean[A.length][A[0].length];
    //     for(int i=0;i<A.length;i++)
    //     {
    //         for(int j=0;j<A[0].length; j++)
    //         {
    //             if(A[i][j]==0)
    //             {
    //                 temp[i][j]=true;
    //             }
    //         }
    //     }

    //     for(int i=0;i<A.length;i++)
    //     {
    //         for(int j=0;j<A[0].length; j++)
    //         {
    //             if(temp[i][j]==true)
    //             {
    //                 A[i][j]=-1;
    //                 makeRowAndColumnZero(A, i, j);
    //             }
    //         }
    //     }
        
    // }
    // public void makeRowAndColumnZero(int A[][], int i, int j)
    // {
    //     if (i<0 || i>=A.length || j<0 || j>=A[0].length || A[i][j]==0)
    //     {
    //         return;
    //     }
    //     else
    //     {
    
    //     // A[i][j]=0;
    //     for(int p=0;p<A.length;p++)
    //     {
    //         A[p][j]=0;
    //     }
    //     for(int q=0;q<A[0].length;q++)
    //     {
    //         A[i][q]=0;
    //     }
    //     }
    // }

    //this approach checks which rows and cols need to be changed and stores than in two bool arrays, then goes and iterates through the arrays and changes the rows/columns to 0 accordingly

    // public void setZeroes(int[][] A) {
    //     int n=A.length;
    //     int m=A[0].length;
    //     boolean rowsToZero[]=new boolean[n];
    //     boolean colsToZero[]=new boolean[m];

    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=0;j<m;j++)
    //         {
    //             if(A[i][j]==0)
    //             {
    //                 rowsToZero[i]=true;
    //                 colsToZero[j]=true;
    //             }
    //         }
    //     }
    //      for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             if(rowsToZero[i] || colsToZero[j])
    //                 A[i][j]=0;
    //         }
    //     }
    // }

    /*First, we initialize m and n with the number of rows and columns in the matrix, respectively. We also initialize two boolean variables, isRow0 and isCol0, to keep track of whether the first row and first column contain zeros.

We iterate through the first row and check if any element is zero. If we find a zero in the first row, we set isRow0 to true.

Similarly, we iterate through the first column and check if any element is zero. If we find a zero in the first column, we set isCol0 to true.

Next, we iterate through the rest of the matrix (excluding the first row and column). If we encounter a zero at position (i, j), we mark the corresponding element in the first row (matrix[0][j]) and first column (matrix[i][0]) as zero. This serves as a marker to indicate that the entire row and column should be set to zero later.

After marking the zeros, we iterate through the matrix again (excluding the first row and column). If either the corresponding element in the first row (matrix[0][j]) or the first column (matrix[i][0]) is zero, we set the current element matrix[i][j] to zero.

Finally, we handle the first row and first column separately. If isRow0 is true, we set all elements in the first row to zero. Similarly, if isCol0 is true, we set all elements in the first column to zero.*/

//MOST OPTIMAL SOLUTION

public void setZeroes(int[][] matrix){

		int m=matrix.length, n=matrix[0].length;
        boolean isRow0=false, isCol0=false;
        
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0)
                isRow0=true;
        }
        
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0)
                isCol0=true;
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        
        if(isRow0){
            for(int j=0;j<n;j++)
                matrix[0][j]=0;
        }
        
        if(isCol0){
            for(int i=0;i<m;i++)
                matrix[i][0]=0;
        }
    }
}