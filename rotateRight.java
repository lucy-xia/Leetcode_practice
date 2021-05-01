/*
1.得到長度
2.數學推導出其實把左邊n - k % n個置換到右邊
3.陣列的串接
*/
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
    	if(k==0 || head == null || head.next== null) 
            return head;

        int length=1;
        ListNode tail=head;
        while(tail.next!=null){
            length++;
            tail= tail.next;
        }

        if(k%length==0) return head;
        
        ListNode next=head;
        for(int i=1; i<length-k%length; i++)
            head=head.next;
        
        ListNode pre= head.next;
        head.next=null; 
        tail.next=next;
        
    	return pre;

    }
}