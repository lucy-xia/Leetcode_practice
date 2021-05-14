//Initially, all next pointers are set to NULL.

class Solution {
    public Node connect(Node root) {
    	if(root== null) 
    		return root;
    	Node cur= root;

    	while(cur!=null){
    		Node head= cur;
    		while(cur!=null){
    			if(cur.left!=null){
    				cur.left.next=cur.right;
    			}
    			if(cur.right!=null && cur.next!=null){
    				cur.right.next= cur.next.left;
    			}
    			cur=cur.left;
    		}
    		cur=head.left;
    	}
    	return root;
    	
    }
}