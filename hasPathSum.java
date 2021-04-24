public class hasPathSum {
   public static void main(String[] args) {
      TreeNode<ArrayList> lee= new TreeNode<>();
      lee.add(1);
      lee.add(2);
      int target=3;
      System.out.print(hasPathSum(lee,target));
      
   }
   public int count=0;
   public String hasPathSum(ArrayList root, int targetSum) {
      if(root.left==null && root.right == null) {
         count+=root.val;
         if(count==targetSum){
            return "true";
         }                
         else 
            count-=root.val;
      }
      if(root.left!= null){
         count+=root.val;
         hasPathSum(root.left,targetSum);
         count-=root.val;
      }
      if(root.right!= null){
         count+=root.val;
         hasPathSum(root.right, targetSum);
         count-=root.val;
      }   
      return "false";
   }
}
   