/**Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/
class LongestCommonPrefix {
     public static String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String prefix =strs[0];
        for (int i = 1; i< strs.length;i++){
            while (strs[i].indexOf(prefix)!=0){ //直到strs[i]里出现prefix的位置如果是0，即包含profix
                prefix =prefix.substring(0,prefix.length()-1);//prefix不断的从最后减少字母
            }
        }
        return prefix;
    }   

     public static void main(String[] args){
        	String str[]={"apple","ape","apply"};
    		System.out.println(longestCommonPrefix(str));
    }
}