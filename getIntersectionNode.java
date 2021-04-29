public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null|| headB==null) return null;
        
        ListNode a =headA; // 要重新開啟一個單列因為原本的headA/B需要被重新用到，不能把他洗壞了
        ListNode b= headB;
        
        while(a!=b){
            a=a==null?headB:a.next;
            b=b==null?headA:b.next;
        }
        return a;

    }
}