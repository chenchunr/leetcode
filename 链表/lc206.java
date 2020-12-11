  public ListNode reverseList(ListNode head) {
         ListNode newHead=new ListNode(0);
		 newHead.next=null;
		
		 while(head!=null){
			ListNode temp=head;
			head=head.next;
			temp.next=newHead.next;
			newHead.next=temp;
			 
			 
		 }
		 return newHead.next;
        
    }