//atoi=ASCII to Integer 字符轉數字

class Solution {
    public int myAtoi(String s) {
        int i=0;

        //1.略過空值
        while(i<s.length() && s.charAt(i)== ' ') //從前找到後若是空格就跳過
        	i++;
        if(i==s.length()) //找到最後發現到底的話，就回傳0
        	return 0;

        //2.判斷正負
        int isNegative =1;
        if(s.charAt(i)== '+' || s.charAt(i)=='-'){
        	if(s.charAt(i)=='-')
        		isNegative=-1;
        	i++;
        }
        if(i==s.length()) //找到最後發現到底的話，就回傳0
        	return 0;

        //3.check是否是數字
        int result=0;
        while(i<s.length()){
        	char c=s.charAt(i);
        	if(c<'0'||c>'9') //stops if that's not integer
        		return result*isNegative;

        //4.以上check都沒有問題的話，就開始建造result		
        	int num=c-'0';
        	int tmp= result*10+num;

        //5.check the bound of Integer
        	if(tmp/10!= result)
        		return (isNegative==-1)?Integer.MIN_VALUE: Integer.MAX_VALUE;
        	result=tmp;
        	i++;

        }
        return result*isNegative;
    }
}
