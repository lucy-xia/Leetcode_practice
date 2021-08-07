//记忆化递归
class Solution {
    public int uniquePaths(int m, int n) {
        int [][] result=new int [m][n];
        return helper(m-1, n-1, result);
        
    }
    private int helper(int m, int n, int[][] result){
        if(m<0 || n<0) 
            return 0;
        if(m==0 && n==0) 
            return 1;
        if(result[m][n]>0) 
            return result[m][n];
        
        int left=helper(m, n-1, result);
        int right=helper(m-1, n, result);
        resualt[m][n]=left+right;
        
        return result[m][n];
    }
}

//dp
class Solution {
    public int uniquePaths(int m, int n) {
        if(n==1)
            return 1;
        
        int[] result=new int[m];
        
        for(int i=0; i<m; i++){
            result[i]=1;
        }
        
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                result[j]+=result[j-1];
            }
        }
        return result[m-1];
    }
}