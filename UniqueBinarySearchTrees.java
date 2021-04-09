public class UniqueBinarySearchTrees{

	public static void main(String args[]){
		System.out.println(numTrees(7));
	}

	public static int numTrees(int n){
		if(n<=1) return 1;
		int[] c= new int[n+1];
		c[0]=c[1]=1; 	//c[0]=c[1] 都已经事先设定好了，接下来只要从c[2]开始就可以了
		for(int i=2; i<=n; i++){  //i表示从最前面开始知道n的所有数值的遍历
			for(int j=1;j<=i;j++)  //目前在遍历中的i每个拆解出来的值
				c[i]+=c[j-1]*c[i-j];
		}
		return c[n];
	}
}
