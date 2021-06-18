class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc]==newColor)
           return image;
        helper(image, sr, sc,image[sr][sc], newColor);
        return image;                       
               
    }
    private void helper(int[][] image, int sr, int sc, int color, int newColor){
        if( sr<0 || sc<0 || sr>=image.length || sc>=image[0].length ||image[sr][sc]!=color ) //要先判断值是不是在范围内，再判断值是不是等于预设的值
            return ; //要改变的位置是赋值和最一开始的重点的数值一样的位置
        image[sr][sc]=newColor;
        helper(image, sr+1, sc, color, newColor);
        helper(image, sr-1, sc, color, newColor);
        helper(image, sr, sc+1, color, newColor);
        helper(image, sr, sc-1, color, newColor);
    }
}