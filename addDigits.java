class Solution {
    public int addDigits(int num) {
        if(num<=9)
            return num;
        int result=0;
        while(num!=0){ //注意這裡不是num>9
            result+=num%10;
            num/=10;
        }
        return addDigits(result); 
    }
}