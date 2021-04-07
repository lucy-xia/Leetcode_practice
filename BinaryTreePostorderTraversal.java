//recursive method
public List<Integer> postorderTraversal(TreeNode root){
    return dfs(root, new ArrayList());
}
private List<Integer> dfs (TreeNode root, List<Integer> list){
    if(root == null){
        return list;
    }
    list= dfs(root.left, list); // Traverse the left subtree
    list= dfs(root.right,list); // Traverse the right subtree
    list.add(root.val); // Record the current node
    return list;
}


//iterative method
public List<Integer> postorderTraversal(TreeNode root){
    Stack<TreeNode> stack= new Stack<>(); // create an empty stack
    List<Integer> list= new ArrayList<>();
    while(!stack.isEmpty() || root!=null){
        while(root!=null){
            stack.push(root.right);
            stack.push(root); // if the current node exists, push it into the stack (defer it)
            root= root.left; // move to its left child
        }
        root= stack.pop(); //if the current node is null, pop an element from the stack, print it
        if(root.right!=null){ // && root.right=stack.pop() 我覺得&&後面的就可以不用加了，因為在else條件句中已經把.right設為null
            stack.push(root);
            root=root.right;
        }
        else{
           list.add(root.val);
           root.val=null; 
        }        
    }
    return list;
}