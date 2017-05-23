


public class DoublyLinkedList {
	 private class TwoWayNode
	    {
	        private String item;
	        private TwoWayNode previous;
	        private TwoWayNode next;

	        public TwoWayNode()
	        {
	             item = null;
	             next = null;
	             previous = null;
	        }

	        public TwoWayNode(String newItem, TwoWayNode previousNode, TwoWayNode nextNode)
	        {
	            item = newItem;
	            next = nextNode;
	            previous = previousNode;
	        }
	     }//End of TwoWayNode inner class

		public class DoublyLinkedIterator
		{
			
			private TwoWayNode position = null;

			public DoublyLinkedIterator()
			{
				position = head;
			}
			
			public void restart()
			{
				position = head;
			}
			
			
			
			

			
		}	// DoublyLinkedIterator

	    private TwoWayNode head;

		public DoublyLinkedIterator iterator()
		{
			return new DoublyLinkedIterator();
		}

	    public DoublyLinkedList()
	    {
	        head = null;
	    }

	    /**
	     Adds a node at the start of the list with the specified data.
	     The added node will be the first node in the list.
	    */
	    public void addToStart(String letter)
	    {
	        TwoWayNode newHead = new TwoWayNode(letter, null, head);
	        if (head != null)
	        {
		        head.previous = newHead;
			}
	        head = newHead;
	    }

	    /**
	     Returns the number of nodes in the list.
	    */
	    public int size()
	    {
	        int count = 0;
	        TwoWayNode position = head;
	        while (position != null)
	        {
	            count++;
	            position = position.next;
	        }
	        return count;
	    }
	    



	    public void outputList()
	    {
	        TwoWayNode position = head;
	        while (position != null)
	        {
	            System.out.println(position.item );
	            position = position.next;
	        }
	    }

	    


	public boolean isPalindrome() {
			
		
			if(head == null)
				return false;

			if(head.next == null)
				return true;

			TwoWayNode frontEnd = head; // from front toward end
			TwoWayNode runner = frontEnd.next;
			TwoWayNode backEnd = runner; //from end toward middle.
			while(runner.next != null ) {
				runner = runner.next;
				backEnd = backEnd.next;
				if(runner.next != null) {
					runner = runner.next;
					frontEnd = frontEnd.next;
				}
			}
			
			boolean isPalindrome = true;
			
			while(backEnd != null) {
				if(frontEnd.item != backEnd.item) {
					isPalindrome = false;
					break;
				} else {
					backEnd = backEnd.previous; 
					frontEnd = frontEnd.next;
				}
					
			}
			
			return isPalindrome;

		}
}
