//直接把整列看作是一維數組來對待
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    	//corner case
    	if(matrix==null) 
    		return false;
    	int row=matrix.length;
    	int col=matrix[1].length;
    	int start=0;
    	int end=row*col-1;

    	while(start<end-1){ //binary search
    		int mid=start+(end-start)/2;
    		int cur=matrix[mid/col][mid%col];
    		if(cur==target)
    			return true;
    		if(cur>target)
    			end=mid;
    		else if(cur>mid && cur<end)
    			start=mid;
    	}
    	if(matrix[start/col][start%col]==target ||matrix[end/col][end%col])
    		return true;
    	else
    		return false;
    }
}