class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode dummy= new ListNode(-1,head);
        ListNode pre= dummy;
        ListNode cur=head;
        
        
        while(pre.next!= null && pre.next.next!=null){
            ListNode next=cur.next;

            cur.next= next.next;
            next.next= cur;
            pre.next=next;
            
            pre=pre.next.next;
            cur=cur.next;

        }       
        return dummy.next;
    }
}