class Solution {
    public boolean searchMatrixII(int[][] matrix, int target) {
        int row=0;
        int col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
        	int num= matrix[row][col];
        	if(num == target)
        		return true;
        	else if(num>target)
        		col--;
        	else if(num<target)
        		row++;
        }
        return false;
    }
}