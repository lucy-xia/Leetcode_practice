/*
steps for recursion method:
1.base case
2.what we want
3.continue recursion  


class Solution {
    main(){
        TreeNode node7(7, NULL, NULL);
    }
    
    public List<List<Integer>> pathSumII(TreeNode root, int targetSum) {
        List<List<Integer>> result= new ArrayList<>();
        List<Integer> load=new ArrayList<>();
        else 
            return help(root,targetSum,result,load);  //error: incompatible types: List<Integer> cannot be converted to ArrayList
    }
    private List<List<Integer>> help(TreeNode node, int targetSum, List<List<Integer>> result,  List<Integer> load){
        if(node== null) 
            return result;
        if(node.val== targetSum && node.left== null && node.right== null){
            load.add(node.val);
            result.add(load); //如果是跑完的情況下，要記得return 最終的結果        
            return result;   
        }
        if(node.val!= targetSum && node.left== null && node.right== null){  //寫了多餘，但寫無妨
            return result;   
        }
        else{
            load.add(node.val);
            if(node.left!=null)
                return help(node.left, targetSum-node.val, result, load);
            if(node.right!= null)
                return help(node.right, targetSum-node.val, result, load);
            return result;
        } 
    }
}
*/

class Solution {
    public List<List<Integer>> pathSumII(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> road = new ArrayList<>(); 
        helper(root, targetSum, road ,result);  //在呼叫helper method的時候有改變result的值，但是沒有return，這樣值的改變是否會隨著呼叫的結束而消失
        return result;
    }

    public void helper(TreeNode root, int targetSum, List<Integer> current, List<List<Integer>> result){
        if(root == null) 
            return ;  //base case

        current.add(root.val); 
        if(root.val == targetSum && root.right==null && root.left == null){  //want we want
            result.add(current);
            return ;
        }

        helper(root.left, targetSum-root.val, new ArrayList<Integer>(current), result);  //else 
        helper(root.right, targetSum-root.val, new ArrayList<Integer>(current), result);
    }
}











