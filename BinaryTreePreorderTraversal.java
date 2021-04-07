//recursive method
public List<Integer> preorderTraversal(TreeNode root){
    return dfs(root, new ArrayList());
}
private List<Integer> dfs (TreeNode root, List<Integer> list){
    if(root == null){
        return list;
    }
    list.add(root.val); // Record the current node
    list= dfs(root.left, list); // Traverse the left subtree
    return dfs(root.right,list); // Traverse the right subtree
}

//iterative method
public List<Integer> preorderTraversal(TreeNode root){
    Stack<TreeNode> stack= new Stack<>(); // create an empty stack
    List<Integer> list= new ArrayList<>();
    while(!stack.isEmpty() || root!=null){
        while(root!=null){
            list.add(root.val); //print the value of itseld
            stack.push(root); /// push the current node into the stack (defer it)
            root= root.left; // move to its left child
        }
        root= stack.pop(); //if the current node is null, pop an element from the stack, print it
        root=root.right; //set the current node to its right child
    }
    return list;
}