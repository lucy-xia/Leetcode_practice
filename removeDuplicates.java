/*class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<3) return nums.length; //當陣列的長度是1或者2的時候，無論這兩個                                                 數字是不是相等，直接回傳
        int in=2; //in的設定是需要進行改變的位置
        for (int i =2 ; i<nums.length;i++){
            if(nums[i]!=nums[in-2]){ 
                nums[in++]=nums[i];          
            }
        }
        return in;
    }
}

*/

class Solution {
    public int removeDuplicates(int[] nums) {   
        int num=0;
        int j=0;
        for(int i=1; i<nums.length;i++){
            if(nums[j]==nums[i]){
                num++; //只要是相同了，计数就要++
                if(num<2){
                    nums[++j]=nums[i];                   
                }
                    
            }
            else{
                nums[++j]=nums[i];
                num=0;
            }
        }
        return j+1;
    }
}