public void NextPermutation(int[] nums) {
    if (nums == null || nums.length ==0) return;
    int firstSmall =-1;
    for(int i=nums.length -2;i>=0;i--){ //从后往前，找到第一个不符合升序的值
        if(nums[i]<nums[i+1]){
            firstSmall=i;
            break;
        }
    }

    if (firstSmall == -1){ //如果找不到，说明整个阵列都是从后往前升序排序，则把整个阵列前后颠倒
        reverse(nums,0,nums.length-1);
        return;
    }

    int firstLarge=-1;
    for(int i=nums.length-1; i>firstSmall;i--){ //从后往前找一个比这个数大的数字
        if(nums[i]>nums[firstSmall]){
            firstLarge =i; //并和他交换位置
            break;
        }
    }
    swap(nums,firstSmall,firstLarge);
    reverse(nums,firstSmall+1,nums.length-1); //因为这个范围内的数都是从后往前升序，所以将他们前后反转就是从前往后降序
    return;
    
}

/* 以下为辅助用函数 */
public void swap(int[]nums, int i,int j){ //把i，j两个位置上的数字对调
    int temp=nums[i];
    nums[i]=nums[j];
    nums[j]=temp;
}

public void reverse(int[] nums,int i,int j){ //对前后对称的两个数字一组进行调取swap方法
    while(i<j){
        swap(nums,i++,j--);
    }
}