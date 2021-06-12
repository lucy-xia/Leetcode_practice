class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result= new ArrayList<String> ();
        if(n<=0)
            return result;
        helper(n,n,"",result);
        return result;
    }
    
    private void helper(int left,int right, String tmp, List<String> result){//可以放的左右括号的个数
        if(left==0 && right==0){
            result.add(tmp);
            return;
        }
        if(left>0)
            helper(left-1,right, tmp+"(", result);
        if(right>0 && left<right)
            helper(left, right-1, tmp+")", result);
        
    }
}