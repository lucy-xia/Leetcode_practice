class RemoveNthFromEnd {

    public static class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode RemoveNthFromEnd(ListNode head, int n) {
        ListNode dummy_head = new ListNode(); //可以不赋值吗 ANS:可以
        dummy_head.next = head;
        ListNode fast = dummy_head;
        ListNode slow = dummy_head;
        
        for(int i=1; i<=n+1; i++){ //拉开fast和slow的间距
            fast = fast.next;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next= slow.next.next;
        return dummy_head.next;
    }

    public static void main(String[] args){      
        //創建一個長這樣的listNode[1，2，3，4，5]
        ListNode head = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode forthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next=forthNode;
        forthNode.next=fifthNode;

        System.out.println(RemoveNthFromEnd(head,3));
    }

}