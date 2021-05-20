//数字怎么取：数字不一定是一位数
//顺序怎么算：先乘除后加减
//用什么数据结构：要保留之前的书和之前的数字
//eg：22+3*6

class Solution {
    public int calculateII(String s) {
        int len=s.length(); //這裡用到了（）
        
        if(s==null || len==0) 
            return 0;
        
        Stack<Integer> stack= new Stack<>();
        int result=0;
        int num=0;
        char sign='+';
        
        for(int i=0; i<len; i++){
            //若當前的是數字
            if(Character.isDigit(s.charAt(i))){ 
                num=s.charAt(i)-'0';
                while(i+1<len && Character.isDigit(s.charAt(i+1))){ //一直往後看，直到不是數字
                    num=num*10+s.charAt(i+1)-'0';
                    i++;
                }
                
            }
            //进入计算区块：判斷當前的不是数字也不是空格/是最后一个数字
            if(!Character.isDigit(s.charAt(i)) && s.charAt(i)!=' ' || i==len-1){
                //如果是+-就先存起来
                if(sign=='+') //一开始默认的设置是‘+’，就是要让第一个数字一定会存进去
                    stack.push(num);
                if(sign=='-')
                    stack.push(-num);
                if(sign=='*')
                    stack.push(stack.pop()*num);
                if(sign=='/')
                    stack.push(stack.pop()/num);
                num=0;
                sign=s.charAt(i);
            }
        }    
        for(int i:stack)
            result+=i;   
        return result;
    }
}