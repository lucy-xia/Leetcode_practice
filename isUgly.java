class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) 
            return false;
        
        int[] divisors = {2, 3, 5};
        
        for(int d=0; d< divisors.length; d++) { //不停的除以其中一个数直到余数不是0
            while (n % divisors[d] == 0) 
                n /= divisors[d];
        }
        return n == 1;
    }
}

