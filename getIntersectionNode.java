/*
利用x+Z+Y=Y+Z+X的思路：
分別講AB各自走一邊
跳出while迴圈的時候是都各自走到list相交的部分
如果沒有共同的list部分則在最後都到達第二個list的最後
注：這裡需要重新開啟一個單列因為原本的headA/B需要被重新用到，不能把他洗壞了
*/

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