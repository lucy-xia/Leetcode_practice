//method1:每次递归都调用isPali(s, start, i)判断,进行重复的判断,需要进行改进
class Solution {
    public List<List<String>> PalindromePartition(String s) {
        List<List<String>> result= new ArrayList<>();
        if(s.length()==0 || s==null)
            return result;
        helper(result, s, new ArrayList<>(), 0);
        return result;
    }
    private void helper(List<List<String>> result, String s, List<String> tmp, int index){
        if(index==s.length()){
            result.add(new ArrayList(tmp)); //
            return ;
        }
        for(int i=index; i<s.length(); i++){
            if(isValid(index, i, s.substring(index,i))){
                tmp.add(s.substring(index,i+1));
                helper(result, s, tmp, index+1);
                tmp.remove(tmp.size()-1); //是size（）不是length()
            }
        }
    }
    private boolean isValid(int l, int r, String s){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;     
        }
        return true;
    }
}
//(Not sure)method2:改进method1-->用一个memo二维数组，将计算过的子问题结果存下来，下次再遇到就直接拿出来用
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        //corner case
        if(s.length()==0 || s==null)
            return result;    

        boolean[][] memo= new boolean[s.length()][s.length()];
      
        helper(result, s, new ArrayList<>(), 0, memo);
        return result;
    }
    private void helper(List<List<String>> result, String s, List<String> tmp, int index, boolean[][]memo){
        if(index==s.length()){
            result.add(new ArrayList(tmp)); 
            return ;
        }
        for(int i=index; i<s.length(); i++){
            if(memo[index][i]==false)
                continue;
            if(memo[index][i] || isValid(s,index,i,memo)){
                tmp.add(s.substring(index,i+1));
                helper(result, s, tmp, index+1, memo);
                tmp.remove(tmp.size()-1); //是size（）不是length()
            }
        }
    }
    private boolean isValid(String s,int l, int r,boolean[][] memo){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                memo[l][r]=false;
                return false;                
            }
            l++;
            r--;     
        }
        memo[l][r]=true;
        return true;
    }
}

//method3:先把所有子串是否回文，提前求出来，用二维数组存起来
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result= new ArrayList<>();
        n=s.length();
        boolean[][] dp=new boolean[n+1][n+1];
        for (int i = n ; i >= 1; --i) {
            dp[i][i-1]=true;
            dp[i][i]= true;
            for (int j = i + 1; j <= n; ++j) {
                if(A[i-1]==A[j-1])
                    dp[i][j] =dp[i + 1][j - 1];
                else
                    dp[i][j]=false;
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = j; i >= 0; i--) {
                // 当 [i, j] 只有一个字符时，必然是回文串
                if (i == j) 
                    dp[i][j] = true;
                else {
                    // 当 [i, j] 长度为 2 时，满足 cs[i] == cs[j] 即回文串
                    if (j - i + 1 == 2) 
                        dp[i][j] = s.charAt(i) == s.charAt(j);
                    // 当 [i, j] 长度大于 2 时，满足 (cs[i] == cs[j] && f[i + 1][j - 1]) 即回文串
                    else 
                        dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
                }
            }
        }
        /*
        for(int j=0; j<s.length();j++){
            for(int i=0; i<=j; i++){
                if(i==j)
                    dp[i][j]=true;
                else if(j==(i+1) && s.charAt(i)==s.charAt(j))
                    dp[i][j]=true;
                else if(j-i>1 && s.charAt(i)==s.charAt(j) && dp[i + 1][j - 1])
                    dp[i][j]=true;
                else
                    dp[i][j]=false;
            }
        }
        */
        helper(result, s, new ArrayList<String>(), dp, 0);
        return result;
    }
    private void helper(List<List<String>> result, String s, List<String> tmp, boolean[][] dp, int index){
        if(index==s.length()){
            result.add(new ArrayList(tmp)); 
            return ;
        }
        for(int i=index; i<s.length(); i++){
            if(dp[index][i]){
                tmp.add(s.substring(index,i+1));
                helper(result, s, tmp, dp, i+1);
                tmp.remove(tmp.size()-1); //是size（）不是length()
            }
        }
    }
}