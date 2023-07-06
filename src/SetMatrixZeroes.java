
public class SetMatrixZeroes {
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

        public void setZeroes(int[][] A) {
            int n=A.length;
            int m=A[0].length;
            boolean []rowsToZero=new boolean[n];
            boolean []colsToZero=new boolean[m];

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    if(A[i][j]==0)
                    {
                        rowsToZero[i]=true;
                        colsToZero[j]=true;
                    }
                }
            }

            for(int i=0;i<n;i++)
            {
                if(rowsToZero[i])
                {
                    for(int j=0;j<m;j++)
                    {
                        A[i][j]=0;
                    }
                }
            }
            for(int i=0;i<m;i++)
            {
                if(colsToZero[i])
                {
                    for(int j=0;j<n;j++)
                    {
                        A[j][i]=0;
                    }
                }
            }
        }
        public static void main(String []args)
        {
            int [][]A={{1,0,0},{1,1,1},{1,0,0}};
            SetMatrixZeroes op=new SetMatrixZeroes();
            System.out.println("MATRIX BEFORE");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
            op.setZeroes(A);
            System.out.println("MATRIX AFTER");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }

        }
}
