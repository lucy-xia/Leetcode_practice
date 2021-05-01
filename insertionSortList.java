/*
1.特殊情況
2.挑出不是按順序的第一個數字
3.把這個數字的前面一個指向這個數字的後面一個
4.從頭開始找比這個數字小的數字，並把這個數字加到找到的數字後面
*/
class Solution {
    public ListNode insertionSortList(ListNode head) {
        if(head== null || head.next== null ) return head;

        ListNode dummy= new ListNode(-1, head);
        ListNode cur= head;

        while(cur.next!= null){
        	if(cur.val<= cur.next.val)
        		cur= cur.next;
        	else{
        		ListNode next= cur.next;
        		cur.next= next.next;
        		ListNode pre= dummy;
        		while(pre.next.val<=next.val)
        			pre=pre.next;
        		next.next=pre.next;
        		pre.next=next;
        	}

        }
        return dummy.next;
    }
}