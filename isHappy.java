//method1
class Solution {
    public boolean isHappy(int n) {
    	HashSet<Integer> set= new HashSet<>();

    	while(n!=1){ //一旦是1，就可以跳出循环
    		int tmp=0;
    		while(n!=0){
    			int digit=n%10;
    			tmp+=digit*digit;
    			n/=10;
    		}
    		if(!set.add(temp))//如果只有已经有数字在里面了，也就是落入了4-16...4的这个循环
    			return false;
    	}
    	return true;
    }
}

//method2
class Solution {
    public boolean isHappy(int n) {
    	HashSet<Integer> set= new HashSet<>();

    	while(!set.contains(n)){ //一旦是1，就可以跳出循环
    		set.add(n);
            int sum=0;  
    		while(n>0){
    			int digit=n%10;
    			sum+=digit*digit;
    			n/=10;
    		}
    		if(sum==1)//如果只有已经有数字在里面了，也就是落入了4-16...4的这个循环
    			return true;
            n=sum;
    	}
    	return false;
    }
}