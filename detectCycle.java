public class Solution {    
    public ListNode detectCycle(ListNode head) {
        if(head== null || head.next==null) return null;

        ListNode slow= head;
        ListNode fast= head;

        while(fast.next!=null && fast.next.next!=null){ //跑操场总有相遇的时候，除非他们飞出去了
            slow=slow.next;
            fast=fast.next.next;

            if(slow== fast){ //相遇的地方不一定是循环开始的地方
                             //参考图：https://ithelp.ithome.com.tw/articles/10223721
                ListNode meet=head;  //meet相当于是从头开始出发
                while(true){              //这一定是一个循环了
                    if(slow== meet)
                        return meet;
                    slow=slow.next;
                    meet=meet.next;
                }
            }                   		  	
        }
        return null;
    }
}