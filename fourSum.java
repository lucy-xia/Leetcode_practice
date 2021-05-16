class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new LinkedList<>();
        int sum=0;
        Arrays.sort(nums); //1.先把原來的陣列進行整理

        if(nums.length<4) //2.corner case
            return result;

        for(int i=0; i< nums.length-3; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue; //while(i>0 && nums[i]==nums[i-1]){ i++;}
            for(int j=i+1; j< nums.length-2; j++){
                if(j>0 && nums[j]==nums[j-1])
                   continue;
                int k=j+1;  //3.設定另外兩個數
                int l=nums.length-1;
                while(k<l){
                    if((nums[i]+nums[j]+nums[k]+nums[l])<target){ //j往右移
                        k++;
                        while(k<l && nums[k]==nums[k-1]){ //j<k &&  avoid duplicate 
                            k++;
                        }
                    }
                    else if((nums[i]+nums[j]+nums[k]+nums[l])>target){ //k往左移
                        l--;
                        while(k<l && nums[l]==nums[l+1]){ //avoid duplicate
                            l--;
                        }
                    }
                    else{
                        List<Integer> level= new LinkedList();
                        level.add(nums[i]);
                        level.add(nums[j]);
                        level.add(nums[k]);
                        level.add(nums[l]);
                        result.add(level);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){ //avoid duplicate //跟原本的數比較 eg：
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){ //avoid duplicate
                            l--;
                        }
                    }
               }
               
            }
        }
        return result;
    }
}