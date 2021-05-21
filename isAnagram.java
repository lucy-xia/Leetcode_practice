//Anagram同分异构体
class Solution {
    public boolean isAnagram(String s, String t) { 
        if(s==null && t== null)
            return true;
        else if(s==null || t== null)
            return false;
        else if(s.length()!=t.length())
            return false;
        // else{
        //     Map<Character,Integer> map= new HashMap<>();
        //     for(int i=0; i<s.length();i++){
        //         map.put(s.charAt(i),i);
        //     }
        //     for(int i=0; i<t.length();i++){
        //         if(map.containsKey(t.charAt(i))){
        //             map.remove(i);
        //         }
        //         else
        //             return false;
        //     }
        //     if(map==null)
        //         return true;
        //     else
        //         return false;
        int[] dictory= new int[26];
        for(int i=0; i<s.length();i++){
            dictory[s.charAt(i)-'a']++; //先看s厘米有什么数字先加上
            dictory[t.charAt(i)-'a']--; //再看t里面有什么数字再剪掉
        }
        for(int num:dictory){
            if(num!=0) //只要当中有一个不是0
                return false;
        }
        return true;
    }
}