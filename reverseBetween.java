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