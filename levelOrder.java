class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); //第二個<>可以不用加
        if(root==null) return result; //注意如果原本是空值，返回的是[]而不是null
        Queue<TreeNode> q = new LinkedList(); //先設定變量取出的方式
        q.offer(root);

        while(!q.isEmpty()){
        	int size = q.size(); //這個方法我很好奇
        	List<Integer> level = new ArrayList(); //每一層取出來的數
        	for(int i = 0; i< size; i++){
        		TreeNode cur = q.poll(); //從queue裡面取出來，放進去到下面的level Arraylist
        		level.add(cur.val);
        		if(cur.left!= null) q.add(cur.left);
        		if(cur.right!= null) q.add(cur.right);
        	}
        	result.add(level);

        }
        return result;

    }
}