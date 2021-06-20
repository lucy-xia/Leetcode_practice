class Solution {
    public void solve(char[][] board) {
        //corner case
        if(board.length==0|| board== null)
            return;
        int m=board.length;
        int n=board[0].length;
        
        //1.先遍历外围的一圈，并顺便dfs相邻的O，把它用保护色A覆盖
        for(int i=0; i<m; i++){
            if(board[i][0]=='O')
                helper(board, i,0);
            if(board[i][n-1]=='O')
                helper(board, i,n-1);
        }      
        for(int i=0; i<n; i++){
            if(board[0][i]=='O')
                helper(board, 0,i);
            if(board[m-1][i]=='O')
                helper(board, m-1,i);
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
        //2.两层for回圈找出没有被保护的O，按照题目要求用X替代
                if(board[i][j]=='O')
                    board[i][j]='X';
        //3.把原本用保护色A覆盖的O恢复成O
                if(board[i][j]=='A')
                    board[i][j]='O';
            }
        }
    }
    private void helper(char[][] board, int m, int n){
        if(m>board.length-1 || m< 0 || n <0 || n>board[0].length-1 || board[m][n]!='O')
            return;
        // if(board[m][n]=='X' || board[m][n]=='A')
        //     return;
        board[m][n]='A';
        helper(board,m+1,n);
        helper(board,m-1,n);
        helper(board,m,n+1);
        helper(board,m,n-1);
    }
}
