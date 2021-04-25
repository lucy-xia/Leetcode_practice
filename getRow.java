class Solution {  
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> result= new ArrayList();
    	for(int i=0; i <= rowIndex; i++){
    		result.add(0,1); //index, value
    		for(int j=1; j< result.size(); j++){
    			result.set(j, result.get(j)+result.get(j+1));
    		}
    	}
    	return result;
    }
}