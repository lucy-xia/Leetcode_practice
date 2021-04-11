public int DivideTwoIntegers(int x, int y) {
	if(x == Integer.MIN_VALUE && y == -1 ) {
		return Integer.MAX_VALUE;
	}
	boolean isNagative = (x > 0 && y <0 ) || (x < 0 && y> 0); //存負號
    long a =Math.abs((long) x);  //取絕對值
    long b =Math.abs((long) y);  //同上
    int temp = 31;
    int result = 0;
    while(a>=b){
        while(a < b <<temp){ //翻譯：a< b*2^(temp) eg:10/3 在這裡就是 10<(3*2*2)
            --temp;
        }
        a-=b << temp;  //翻譯：a=a-b*2^(temp)
        result+=1 << temp; //翻譯：result=result+1*2^(temp)
    }
    return isNagative ? - result : result; //再最後附上負號
}