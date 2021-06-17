class Solution {
    Set<Integer> columns = new HashSet<Integer>();
    Set<Integer> diagonals1 = new HashSet<Integer>();
    Set<Integer> diagonals2 = new HashSet<Integer>();

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result= new ArrayList<>();
        
        //corner case
        if(n==0)
            return result;
        
        char[][] cur= new char[n][n];
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<n; j++){
        //         cur[i][j]='.';
        //     }
        // }
        for(int i=0; i<n; i++){
            Arrays.fill(cur[i], '.');
        }
        //Arrays.fill(cur,'.');

        helper(result,n, cur, 0);
        return result;
    }
    private void helper(List<List<String>> result, int n, char[][] cur, int row){
        if(row==n) {
            List<String> tmp= new ArrayList<>();
            for(int i=0; i<n; i++)
                tmp.add(String.valueOf(cur[i]));
            result.add(tmp);
        }
        for(int i=0; i<n; i++){
            if(!columns.contains(i) && !diagonals1.contains(row-i) && !diagonals2.contains(row+i)){
                columns.add(i);
                diagonals1.add(row-i);
                diagonals2.add(row+i);
                cur[row][i]='Q';
                helper(result, n, cur, row+1);
                cur[row][i]='.';
                columns.remove(i);
                diagonals1.remove(row-i);
                diagonals2.remove(row+i);
            }
        }
    }
}