class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        int count = 0;
        ListNode left1 = null;
        ListNode left2 = null;
        ListNode pre = dummy;
        while (head != null) {
            count++;
            //到达 m，保存 l1 和 l2
            if (count == m) {
                left1 = pre;
                left2 = head;
            }
            // m 和 n 之间，倒转链表
            if (count > m && count < n) {
                ListNode temp = head.next;
                head.next = pre;
                pre = head; //指針向後移動
                head = temp; //指針向後移動
                continue;
            }
            //到达 n
            if (count == n) {
                left2.next = head.next;  //整列左邊接住反轉整列的尾
                head.next = pre; //當前循環的head和pre的前後連結還沒有完成
                left1.next = head; //反轉整列的頭接住陣列右邊
                break;
            }
            //两个指针后移
            head = head.next;
            pre = pre.next;
        }
        return dummy.next;
    }
}

//Another common way
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head== null) return head;
        ListNode dummy=new ListNode(-1,head);
        ListNode pre= dummy;
        for(int i=0; i<m; i++){
            pre= pre.next; //pre停在要轉換的list的最前面守護
            
        }
        ListNode curr= pre.next;
        
        for(int i=m; i<n; i++){
            ListNode next= cur.next; //next是要轉換list面後的第一個node
            pre.next=next; //pre的後面接要轉換的list的最後一個node
            next.next= pre.next;  //最後一個node接到第一個node的後面
            cur.next=next.next; //倒數第二個連到最外面第一個node的右邊
        }
        
        return dummy.next;
        
    }
}

//my solution
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head==null || m==n) return head;
        
        ListNode dummy= new ListNode(-1,head);
        ListNode cur=head;
        ListNode pre= dummy;
        
        int count=1;
        while(head.next!=null){
            
            
            if(count<m){
                cur= cur.next;
                pre=pre.next;
                count++;
            }
            
            if(count>=m && count<n){
                ListNode next= cur.next;
                cur.next=next.next;
                next.next = pre.next;
                pre.next=next;
                count++;
            }
            if(count>=n){
                count++;
                break;
            }
            
            
        }
        return dummy.next;
    }
}


