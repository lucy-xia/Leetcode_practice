//recursive method
public List<Integer> inorderTraversal(TreeNode root){
    return dfs(root, new ArrayList());
}
private List<Integer> dfs (TreeNode root, List<Integer> list){
    if(root == null){
        return list;
    }
    list= dfs(root.left, list); // Traverse the left subtree
    list.add(root.val); // Record the current node
    return dfs(root.right,list); // Traverse the right subtree
}


//iterative method
public List<Integer> inorderTraversal(TreeNode root){
    Stack<TreeNode> stack= new Stack<>(); // create an empty stack
    List<Integer> list= new ArrayList<>();
    while(!stack.isEmpty() || root!=null){
        while(root!=null){
            stack.push(root); // if the current node exists, push it into the stack (defer it)
            root= root.left; // move to its left child
        }
        root= stack.pop(); //if the current node is null, pop an element from the stack, print it
        list.add(root.val);
        root=root.right; //set the current node to its right child
    }
    return list;
}