/*class Solution {
    public int reverse(int x) {        
        int reversed=0;
        while(x!=0){
            int newReversed=reversed*10+x%10;
            if((newReversed-x%10)/10!=reversed)
                return 0;
            x/=10; 
            reversed=newReversed;
        }               
        return reversed;
    }
}
*/

class Solution {
    public int reverse(int x) {  
        long sum=0;
        
        while(x!=0){
            sum=x%10+sum*10;
            x/=10;
            
            if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE)
                return 0;
        }
        return (int)sum;
    }
}