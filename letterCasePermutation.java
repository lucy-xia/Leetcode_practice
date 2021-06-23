class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result= new ArrayList<>();
        helper(s.toCharArray(), result, 0);
        return result;
    }
    private void helper(char[] candidate, List<String> result, int index){
        if(index==candidate.length){
            result.add(new String(candidate));
            return;
        }
        if (Character.isDigit(candidate[index])) 
            helper(candidate, result, index + 1);
        else{
            candidate[index] = Character.toLowerCase(candidate[index]);
            helper(candidate, result, index + 1);
            
            candidate[index] = Character.toUpperCase(candidate[index]);
            helper(candidate, result, index + 1);
        
        }
        
    }
}