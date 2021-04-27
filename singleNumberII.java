class Solution {
    public int singleNumberII(int[] nums) {
        if(nums.length==1) 
            return nums[0];
        Map<Integer, Integer> countfrequency= new HashMap();        
        for(int i=0; i<nums.length; i++){            
            if(!countfrequency.containsKey(nums[i]))
                countfrequency.put(nums[i],1); //沒出現過的給他一個新位子，計數1
            else
                countfrequency.put(nums[i], countfrequency.get(nums[i])+1); //如果有的話，就在原本的基礎上+1
        }      
        for(int key:countfrequency.keySet()){
            if(countfrequency.get(key)==1)
                return key;
        }        
        return -1;
    }
}