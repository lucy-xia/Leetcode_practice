/* iterative method1: */
class Solution {
    public ListNode reverseLinkedList(ListNode head) {
        if (head== null || head.next == null) return head;
		ListNode cur= head;
		ListNode pre= null;
		while(head!= null){
			ListNode next= cur.next; 
			cur.next= pre;
			pre=cur;
			cur= next;
		}
		return pre;
	}
}

/* iterative method2:
/* 可以運行，但是會使用稍微多一點的空間


class Solution {
    public ListNode reverseList(ListNode head) {
        if (head== null || head.next == null) return head;
		//ListNode cur= head;  我們其實可以不需要重新定義current node， 直接把head拿來用就好(method1中所有的cur都替換成head)
		ListNode pre= null;
		while(head!= null){
			ListNode next= head.next; 
			head.next= pre;
			pre=head;
			head= next;
		}  
        return pre;
    }
}

***/

/*
/*recursive method 遇到空节点，返回链表的最后一个节点，从链表末尾向头部逐个分离节点，并将节点添加到新链表的末尾。
/*https://zhuanlan.zhihu.com/p/74628195		
/*時間和空間使用都不優秀，不推薦
***/

        
