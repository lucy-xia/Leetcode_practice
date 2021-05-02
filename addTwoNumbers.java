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

