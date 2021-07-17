/*1.将listnode值相加
2.更新carry
3.更新当前值
4.将当前值链接到之前的node后面
5.p1往后移
6.p2往后移
7.p往后移
*/
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(-1);
        ListNode p=dummy;
        ListNode p1= l1;
        ListNode p2= l2;
        int carry=0; 
        int newVal=0;
        while(p1!=null ||p2!=null || carry!= 0){
            newVal= (p1==null?0:p1.val)+(p2==null?0:p2.val)+carry; //当对null索引.val的时候 会抛出nullpointerexception
            carry=newVal/10;
            newVal%=10;
            p.next=new ListNode(newVal);  //p.next.val=newVal; 加上一个新的listnode的时候一定要通过new，不能直接.val来添加，否则会抛出nullpointerexception
            p=p.next;
            p1=p1==null?null:p1.next;
            p2=p2==null?null:p2.next;
            
        }
        return dummy.next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummyNode = new ListNode();
        ListNode curr = dummyNode;
        
        int carry = 0;              
        while(l1 != null || l2 != null){
            int sum = carry;
            
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }                      
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            int curentDigit = sum % 10;
            carry = sum / 10;
            
            curr.next = new ListNode(curentDigit);
            curr = curr.next;
        }
        
        if(carry == 1)
            curr.next = new ListNode(1);
        
        return dummyNode.next;
    }
}
