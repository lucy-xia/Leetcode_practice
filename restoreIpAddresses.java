class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result= new ArrayList<>();
        
        //corner case
        if(s.length()<4 || s.length()>12)
            return result;
        
        helper(result, 4,s, 0,"");
        return result;
    }
    
    private void helper(List<String> result, int remain, String s, int index,String cur){
        if(remain==0){ //四段
            if(index==s.length()){  //指针把s都遍历了一遍
                result.add(cur);
                
            }
            return;
        }
        if((s.length()-index)<(remain))//后面的数字太少了
            return;
        if((s.length()-index)>3*remain) //后面的数字太多了
            return; 
        for(int i=1; i<=3; i++){
            if(i!=1 && s.charAt(index)=='0') 
                break; //最多出现一个0，不能出现“00”这样的
            if(index+i>s.length()) 
                break;
            
            String tmp=s.substring(index, index+i);
            int val=Integer.parseInt(tmp); //method2:int val=Integer.valueOf(tmp);
            
            if(val<=255)
                helper(result,remain-1 , s, index+i, cur+tmp+(remain==1? "": ".")); //注意最后一个参数remain 还没有-1
        }
    }
}