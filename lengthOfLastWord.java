//method1:
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==0 || s==null) //corner case
            return 0;
        int i= s.length()-1;
        while(i>=0 && s.charAt(i)==' '){ //把单词后面所有的空格去掉
            i--;
        }
        int count=0;
        while(i>=0 && s.charAt(i)!=' '){//从这个string的最后往前数有几个字元
            i--;
            count++;   
        }
        return count;
    }
}

//method2:
class Solution {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length()==0)
            return 0;
        
        int count=0;
        int cur=0;

        for(int i=0; i<s.length();i++){ 
            if(s.charAt(i)==' ') //遇到空格的时候，把计数值重置
                cur=0;
            else{
                cur++;
                count=cur;
            }
        }
        return count;
    }
}