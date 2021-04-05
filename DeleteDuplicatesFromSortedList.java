public int DeleteDuplicatesFromSortedList(ListNode head){
	//重複的點只保留一個值
	   ListNode prev=head;
        
       // if(prev=null || prev.next=null)
       //     return head; //報錯
                         //first type:  <null>
                         //second type: ListNode
                         
        while(prev!= null && prev.next!=null){
            while(prev.val==prev.next.val){
                prev.next= prev.next.next;
            }
            prev= prev.next;
        }
        return head;
}

public int DeleteDuplicatesFromSortedListII(ListNode head){
	//重複的點一個都不保留
	ListNode dummy_head = new ListNode(0,head);
	ListNode prev = dummy_head; 
	while(head != null){
		if(head != null && head.val = head.next.val){
			while(head != null && head.val = head.next.val){
				head = head.next; //持續遍歷值相同的點
			}
			prev.next = head.next; //skip over那些相同的點
		}
		else{ //將那些值不同的點收入囊中
			prev = prev.next;
		}
		head = head.next; //保持向前移動,到目前為止值相同的點都遍歷完了，所以要開始吃新的點
	}
	return dummy_head.next;
}



