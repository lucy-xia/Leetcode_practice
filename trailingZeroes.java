/*class Solution {
    public int trailingZeroes(int n) {
        int sum=1;
        while(n>1){
            sum*=n;
            n--;
        }
        int count=0;
        while(sum/10!=0){
            int tmp=sum%10;
            if(tmp==0)
                count++;
        }    
        return count;
    }
}
*/
class Solution {
    public int trailingZeroes(int n) {
        int result=0;
        while(n!=0){
           result+=n/5;
            n/=5;
           
        }
        return result; 
    }
}


