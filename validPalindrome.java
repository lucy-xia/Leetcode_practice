class Solution {
    public boolean validPalindrome(String s) {
        if(s==null || s.length()==0)
            return true;
        
        char[] cur=s.toCharArray();
        int i=0;
        int j=cur.length-1;
        int count=0;
        
        while(i<j){
            if(i<j && cur[i]!=cur[j] && count==0){
                if(i<j && cur[i+1]!=cur[j] && count==0){
                   count++;
                   i--; 
                }
                else if(i<j && cur[i]!=cur[j-1] && count==0){
                    count++;
                    j++;
                }
            }
            else if(i<j && cur[i]!=cur[j] && count==1)
                return false;
            i++;
            j--;
        }
        return true;
        
    }
}