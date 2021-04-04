public int DeleteDuplicatesFromSortedList(ListNode head){
	//重複的點只保留一個值
	if(head==null || head.next==null)
		return head;

	ListNode current_node = head;

	while(current_node!=null && current_node.next !=null){
		if(current_node.val=current_node.next.val){
			current_node.next=current_node.next.next;
		}
		else
			current_node= current_node.next;
	}
	return head;
}

public int DeleteDuplicatesFromSortedListII(ListNode head){
	//重複的點一個都不保留
	ListNode dummy_head = new ListNode(0,head);
	ListNode prev = dummy_head; 
	while(head != null){
		if(dummy_head != null && dummy_head.val = dummy_head.next.val){
			while(dummy_head != null && dummy_head.val = dummy_head.next.val){
				head = head.next; //持續遍歷值相同的點
			}
			prev.next = head.next; //skip over那些相同的點
		}
		else{ //將那些值不同的點收入囊中
			prev = prev.next;
		}
		head = head.next; //保持向前移動
	}
	return dummy_head.next;
}