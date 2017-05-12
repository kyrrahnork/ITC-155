import java.util.ArrayList;

class PriorityQueue<T>{
	//make this static so the methods are available
	public static class PriorityPair<T>{
		private T item;
		private int priority;
		
		public PriorityPair(T item, int priority){
			this.priority = priority;
			this.item = item;
		}
	
		public T getItem() {
			return item;
		}
		
		public int getPriority() {
			return priority;
		}
	
		public void setItem(T newItem) {
			item = newItem;
		}
	
		public void setPriority(int newPriority) {
			priority = newPriority;
		}
			
	}
	
	private ArrayList<PriorityPair> queue;
	
	public PriorityQueue(){
		queue = new ArrayList<PriorityPair>();	
	}
	
	public void add(T item, int priority)
	{
		// Create a new PriorityPair object
		PriorityPair<T> pairs = new PriorityPair<T>(item, priority);
		
		// Add the object to the queue
		queue.add(pairs);
		//this is not the best way to print the queue before removing but that's what i did
		System.out.println("Add item: " + item + " with priority: " + priority);
		
	}
	
	// I wanted to print out both item and priority when they were removed
	//so I used the priority pair type
	public PriorityPair<T> remove()
	{
		
			if (queue.size()==0) return null;

		// Search through the queue for the item of highest priority
		PriorityPair<T> currentHighestPriority = queue.get(0);
		for (int i=1; i<queue.size(); i++)
		{
			if (queue.get(i).getPriority() > currentHighestPriority.getPriority())
			{
				// remember the new highest priority
				currentHighestPriority = queue.get(i);
			}
		}
		// Remove item we found with the highest priority
		queue.remove(currentHighestPriority);
		// Return it
		return currentHighestPriority;
	}

}