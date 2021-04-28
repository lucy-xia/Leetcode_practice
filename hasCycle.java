/*数学归纳法证明快慢指针一定能够相遇：
  1：快指针与慢指针之间差一步。此时继续往后走，慢指针前进一步，快指针前进两步，两者相遇。
  2：快指针与慢指针之间差两步。此时继续往后走，慢指针前进一步，快指针前进两步，两者之间相差一步，转化为第一种情况。
  3：他们的相对速度只差一个格子，快的只能一个一个格子的去追慢的，必然在一个格子相遇！
*/

//快慢指针法
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head== null || head.next==null) return false;

        ListNode slow= head;
        ListNode fast= head;

        while(slow.next!=null && fast.next.next!=null){ //跑操场总有相遇的时候，除非他们飞出去了
        	slow=slow.next;
            fast=fast.next.next;

            if(slow== fast)
        		return true;   	
        }
        return false;
    }
}
//hashmap出现过的做标记
public class Solution {
    public boolean hasCycle(ListNode head) {
        Map<ListNode,Integer> save= new HashMap<>();
        while(head!= null){
            if(save.containsKey(head))
                return true;
            else    
                save.put(head,1);
            head=head.next;
        }
        return false;
    }
}