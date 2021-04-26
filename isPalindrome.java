class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;  // 1.drop off negative ones & last digit is 0
        return (reverseInteger(x) == x);   //3.check if same
    }
    
    private int reverseInteger(int x) {   //2.Reverse
        int result = 0;
        while (x != 0) { 		 
            result = result * 10 + x % 10;   
            x /= 10;
        }
        return result;
    }
}