class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length;
        int m=board[0].length;
        // boolean visited[][]=new boolean[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    // visited[i][j]=true;
                    if(dfs(i,j,0,board,word))
                    {
                    return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(int i, int j, int index, char[][]board, String word)
    {
        if(index==word.length()) // that means word matches
        return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(index))
        return false;

        board[i][j]='*'; //instead of visited we are modifying the array as we move on, marking visited nodes in board
        boolean res=(dfs(i+1,j,index+1,board,word) || 
                    dfs(i-1,j,index+1,board,word) ||
                    dfs(i,j+1,index+1,board,word) ||
                    dfs(i,j-1,index+1,board,word));
        board[i][j]=word.charAt(index); //here we are unmarking them

        return res;
    }
}