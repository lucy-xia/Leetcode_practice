/*
n=5:
countAndSay(1) = "1"
countAndSay(2) = "11" //
countAndSay(3) = "21"
countAndSay(4) = "1211"
countAndSay(5) = "111221"
countAndSay(6) = "312211"
*/

class Solution {  
    public String countAndSay(int n) {
    	String result = "1";

    	for(int i = 1; i<n; i++){
    		StringBuilder sb= new StringBuilder();
    		char start= say.charAt(0);
    		int count =0;
    		for(int j=0; j<say.length(); j++){
    			char c= say.charAt(j);
    			if(c==start){
    				count++;
    			}
    			else{
    				sb.append(count).append(start);
    				count =1;
    				start = say.charAt(j);
    			}
    			sb.append(count).append(start);
    			result= sb.toString();
    		}
    		return result;
    	}
    }
}