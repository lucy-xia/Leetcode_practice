public int RemoveDuplicates(int[] nums){

	int i=0; //in是可以被改變位置的候選人
	for(int j=0;j< nums.length;j++){
		if(nums[i]!= nums[j]){
			num[++i]=num[j];
		}
	}
	return i+1;
}

public int RemoveDuplicatesII(int[] nums){
	if(nums.length<3) return nums.length;

	int i=2; //in是可以被改變位置的候選人
	for(int j=2; j<nums.length;j++){
		if(nums[i-2]!=nums[j]){
			nums[i++]=nums[j];
		}
	}
	return in;
}

