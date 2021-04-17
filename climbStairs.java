class Solution {
    public int climbStairs(int n) {
    /*
    //brute force]
    if(n==0) 
        return 0;
    if(n==1) 
        return 1;
      if(n==2) 
        return 2;
    else 
        return climbStairs(n-1)+climbStairs(n-2);

    //this requires extra places
    int[] res=new int[n+1];
    res[0]=1;
    res[1]=1;
    if(n>=2){
        for(int i=2;i<n+1;i++){
            res[i]=res[i-1]+res[i-2];
        }
    }
    return res[n];
     */
    
    //this can save extra places
    if(n==1) return n;
    int onestep = 1;
    int twostep = 2;
    for(int i=3; i<=n; i++){
        int tmp = twostep;
        twostep= twostep+ onestep;
        onestep= tmp;
    }
    return twostep;
    }
}