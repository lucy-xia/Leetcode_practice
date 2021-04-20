class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList();
        if(root == null) return result; //依照題目設定的變量型態返回變量
        
        Queue<TreeNode> q = new LinkedList();
        q.offer(root); //讓原本的root轉變為可以存取的queue模式
        
        Double level= 0.0;
        while(!q.isEmpty()){
            int size= q.size();
            level= 0.0;
            //List<Integer> level= new ArrayList();
            
            for(int i = 0; i < size; i++){
                TreeNode cur = q.poll();
                level+=cur.val;
                
                if(cur.left!= null)  q.add(cur.left);
                if(cur.right!= null)  q.add(cur.right);
                
            }
            level/=size;
            result.add(level);       
        }
        return result;
    }
}