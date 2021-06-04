class Solution {
    public String[] letter=new String[]{"",
                                     "",
                                     "abc",
                                     "def",
                                     "ghi",
                                     "jkl",
                                     "mno",
                                     "pqrs",
                                     "tuv",
                                     "wxyz"};
    
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        //corner case
        if(digits==null || digits.length()==0) //length function needs()
            return result;
        
        StringBuilder sb= new StringBuilder();
        dfs(digits, 0, sb, result);
        return result;
    }
    
    private void dfs(String digits, int index, StringBuilder sb, 
                     List<String> result){
        if(index== digits.length()){
            result.add(sb.toString());
            return;
        }
        String letters= letter[digits.charAt(index)-'0'];
        for(int i=0; i<letters.length(); i++){
            char c =letters.charAt(i);
            sb.append(c);
            dfs(digits,index+1, sb, result);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}