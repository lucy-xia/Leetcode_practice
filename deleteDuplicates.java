//Q：需要用pre来代替head移动吗 A：需要，在最后回传的时候需要有一个物件
//Q：移动完要用什么值来返回呢 A：用最完整的head

class Solution{
    public ListNode deleteDuplicates(ListNode head) {
    	if(head== null) return head;

    	ListNdoe pre= head; //迷思：后面操作改变的都是pre的这个ListNode，返回的head还是原来的head？ A：把pre当作标签来看待，list还是在那里没有改变

    	while(pre.next!= null){
    		if(pre.val=pre.next.val)
    			pre.next= pre.next.next;
    		else
    			pre= pre.next;
    	}
    	return head;

    }
}


