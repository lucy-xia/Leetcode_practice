class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] result= new int[n+1]; //以下情况是为了99/999等开头没有数字的情况做善后
        result[0]=1;
        for(int i=1;i<result.length;i++)
            result[i]=0;
        return result;
    }
}

