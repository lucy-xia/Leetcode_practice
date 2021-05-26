class Solution {
    public String convertToTitle(int columnNumber) {
        /*
        char result ='';
        int i=0;
        for(int i=columnNumber; i>0; ){
            char tmp=(char)columnNumber/26;
            result.add(tmp);
            i=i-tmp;
        }
        char tmp=(char)i;  
        result.add(tmp);
        return result;
        */
        
        StringBuilder sb= new StringBuilder();
        while(columnNumber>0){ //不可從前往後添加
            columnNumber--; //注意這裡要先--
            sb.insert(0,(char)('A'+columnNumber%26));
            columnNumber/=26;
        }
        return sb.toString();
    }
}