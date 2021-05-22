//method1
class Solution {
    public boolean wordPattern(String pattern, String s) {
        char[] p=pattern.toCharArray(); //分割字母
        String[] str=s.split(" "); //分割单词
        
        if(p.length!=str.length || s.isEmpty())
            return false;
        
        HashMap<Character, String> hm=new HashMap<Character, String>();
        
        for(int i=0;i<str.length;i++){
            if(!hm.containsKey(p[i]) && !hm.containsValue(str[i])) //如果两者都不存在
                hm.put(p[i],str[i]);
            if((!hm.containsKey(p[i]) && hm.containsValue(str[i]))
              || (!hm.get(p[i]).equals(str[i]))) //如果不包含对应的彼此 ||如果key对应的不是value
                return false;
        }
        return true;
    }
}


//method2
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str=s.split(" "); //分割单词      
        if(pattern.length()!=str.length || s.isEmpty() ||pattern.length()==0)
            return false;        
        HashMap<Character, String> hm=new HashMap<Character, String>();    
        for(int i=0;i<pattern.length();i++){
            char char_value=pattern.charAt(i);
            if(hm.containsKey(char_value)){ //如果有key
                if(!hm.get(char_value).equals(str[i]))  //有key但是和value不一样
                    return false;
            }
            else { //如果没有key 
                if(hm.containsValue(str[i]))  //没key居然有value
                    return false;
                else //啥都没有就存起来
                    hm.put(char_value,str[i]);
            }            
        }
        return true;
    }
}