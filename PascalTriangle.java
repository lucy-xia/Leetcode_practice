class Solution {  
    public List<List<Integer>> PascalTriangle(int numRows) {
    	List<List<Integer>> result = new ArrayList<>();
    	if(numRows==0 ) 
    		return result;
    	if(numRows==1){
    		List<Integer> first_row= new ArrayList<>();
    		first_row.add(1);
    		result.add(first_row);
    	}
    	for(int i=1; i<numRows; i++){ //如果numRows小於2，根本不會進入
    		List<Integer> previous= result.get(i-1);
    		List<Integer> current = new ArrayList<>();
    		current.add(1);
    		for(int j=1; j<i; j++){ //i剛好用來控制j的大小
    			current.add=previous(j-1)+previous(j);		
    		}
    		current.add(1);
    		result.add(current);
    	}
    	return result;
    }
}
	   1
	  1 1
	 1 2 1
	1 3 3 1
