class Solution {  
    public List<Integer> getRow(int rowIndex) {
    	List<Integer> result= new ArrayList();
    	for(int i=0; i <= rowIndex; i++){ //要取到等号
    		result.add(0,1); //index, value
    		for(int j=1; j< result.size()-1; j++){ //size 而不是 size()
    			result.set(j, result.get(j)+result.get(j+1));
    		}
    	}
    	return result;
    }
}