public int RemoveDuplicates(int[] nums){
	int i=0;
	for(int j=0;j< nums.length;j++){
		if(nums[i]!= nums[j]){
			num[++i]=num[j];
		}
	return i+1;
	}
}

public int RemoveDuplicatesII(int[] nums){
	if(nums.length<3) return nums.length;
	int in=2;
	for(int i=2; i<nums.length;i++){
		if(nums[in-2]!=nums[i]){
			nums[in++]=nums[i];
		}
	}
	return in;
}

