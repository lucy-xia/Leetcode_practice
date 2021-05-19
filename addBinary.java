//不是讲二进制换算成10进制而是直接用1和0去判断是否需要进位和计数
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb= new StringBuilder(); 
        int p1= a.length() -1 ; //因為要包含0，所以
        int p2= b.length() -1 ;

        int carry=0; //要進位的小數
        while(p1>=0 || p2>=0){
        	int num1=(p1>=0)?(a.charAt(p1)-'0'):0; //要從最高一位遍歷到charAt[0]這個位置，所以迴圈要取到0
        	int num2=(p2>=0)?(b.charAt(p2)-'0'):0; //將char轉變為int      //Q:why does using (int) does not work?
        	int sum=num1+num2+carry;                                   //A:因為數字字元的ascii碼是從48開始，char強制轉型為int會產生錯誤。
        	sb.insert(0,sum%2);
        	carry =sum/2;
        	p1--;
        	p2--;

        }
        if(carry!=0)
        	sb.insert(0,1);
        return sb.toString();
    } 
}