class Solution {
    public Node connect(Node root) {
        Node cur= root; //cur是上面一層的點
        Node pre= null; //pre是下面一層正在進行連接操作的點
        Node head= null;  //head是下一層的第一個點，用來保存（頭）

        While(cur!=null){
        	while(cur!=null){
        		if(cur.left!=null){
        			if(head==null){
        				head=cur.left;
        				pre=cur.left;
        			}
        			else{
        				pre.next=cur.left;
        				pre=pre.next;
        			}
        		}
        		if(cur.right!=null){ 
        			if(head==null){
        				head=cur.left;
        				pre=cur.left;
        			}
        			else{
        				pre.next=cur.left;
        				pre=pre.next;
        			}
        		}
        		cur=cur.next;
        	}
        	cur=head;
        	Node head= null;
        	Node pre= null;
        }
        return root;
    }
}