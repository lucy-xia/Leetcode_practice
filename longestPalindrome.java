// class Solution {
//     public int longestPalindrome(String s) {
//         List<Character> array= new ArrayList<>();
//         for(int i=0; i<s.length(); i++){
//             if(array.contains(s.charAt(i))){
//                 s++;
//                 array.remove(s.charAt(i));
//             }
//             array.add(s.chatAt(i));    
//         }
//         return !array.isEmpty()?s++:s;
            
//     }
// }

class Solution {
     public int longestPalindrome(String s) {
         int[] count= new int[128]; //ASCII共有128个字符
         
         char[] ch=s.toCharArray(); //把字母对照ASCII码储存成数字
         for(int i=0;i<s.length();i++){  
            count[ch[i]]++;  
         }
     //另一种写法：
     // for(char c:s.toCharArray()){
     //     count[c]++;
     // }
         
         int result=0;
         for(int cur: count){
             result+=(cur/2*2);
             //另一种写法：
             //result+=(cur%2==0? cur: cur-1);
             if(result%2==0 && cur%2==1) //一旦让一个单独的cur成为result的一员， result就不是偶数了，下一个单独的cur就不能继续加进去result里面
                 result+=1;
         }
         return result;
         
           
             
     }       
}

//dp解法
public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int strLen = s.length();
        int maxStart = 0;  //最长回文串的起点
        int maxEnd = 0;    //最长回文串的终点
        int maxLen = 1;  //最长回文串的长度

        boolean[][] dp = new boolean[strLen][strLen];

        for (int r = 1; r < strLen; r++) {
            for (int l = 0; l < r; l++) {
                if (s.charAt(l) == s.charAt(r) && (r - l < 3 || dp[l + 1][r - 1])) {
                    dp[l][r] = true;
                    if (r - l + 1 > maxLen) {
                        maxLen = r - l + 1;
                        maxStart = l;
                        maxEnd = r;

                    }
                }

            }

        }
        return s.substring(maxStart, maxEnd + 1);

    }

//中心扩散法
class Solution {
    
    String result="";

    public String longestPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {          
            helper(i, i, s);
            helper(i, i + 1, s);
        }
        return result;
    }
    public void helper(int m, int n, String s) {
        while (m >= 0 && n < s.length() && s.charAt(m) == s.charAt(n)) {
            m--;
            n++;
        }
        if (n - m - 1 > result.length()) 
            result = s.substring(m + 1, n);
    }
}






















