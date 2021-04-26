class test {                             //length=4
    public static void main(String[] args){ //index 0 1 2 3
        int[] inputt = {3,2,6,5,0,3};              // 2,4,1,2
        System.out.println(maxProfit(inputt)); 
    }
/*  public static int maxProfit(int[] prices) {
        if(prices.length==1) return 0;
        int low=prices[0];
        int high=prices[1];
        Boolean check=false;
        for(int i=1; i<prices.length-1;i++){
            if(prices[i]<low){
                low= prices[i];
                high= prices[i+1];
                System.out.println("low"+i+":"+low);
            }
            if((i+1) <=(prices.length-1) && prices[i+1]>high){
                high= prices[i+1];
                check=true;
                System.out.println("high"+(i+1)+":"+high);
            }        
        }
        if(check== true || high>low)
            return(high-low);
        else 
            return 0;
    }

    public static int maxProfit(int[] prices) { // 3,2,6,5,0,3
        int result=0;
        int low=prices[0];
        int high=prices[prices.length-1];

        if(prices[prices.length-1]-prices[0]>0) //最外面兩個比較
            result=prices[prices.length-1]-prices[0];

        for(int i=1; i<=prices.length-2; i++){
            if(i<=prices.length/2 && prices[prices.length-i-1]-prices[i-1]>result)    //右邊第二個和最左邊
                    {
                        result=prices[prices.length-i-1]-prices[i-1];
                        System.out.println("i:"+i+prices[prices.length-i-1]+"-"+prices[i-1]+":"+result);
                    }
            if(i<=prices.length/2 && prices[prices.length-i]-prices[i]>result)    //左邊第二個和最右邊
                    {
                        result=prices[prices.length-i]-prices[i];
                        System.out.println("i:"+i+prices[prices.length-i]+"-"+prices[i]+":"+result);
                    }
            if(i<=prices.length/2 && prices[prices.length-i-1]-prices[i]>result) //最裡面兩個
                    {
                        result=prices[prices.length-i-1]-prices[i];
                        System.out.println("i:"+i+prices[prices.length-i-1]+"-"+prices[i]+":"+result);
                    }
         }
         return result;
    }
*/
    public static int maxProfit(int[] prices) {
        int low= Integer.MAX_VALUE;
        int result=0;

        for(int i=0; i<prices.length; i++){
            if(prices[i]<low)
                low= prices[i];
            else if((prices[i]-low)>result)
                result=prices[i]-low;
        }
        return result;

    }

}