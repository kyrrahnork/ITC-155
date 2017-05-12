
public class PriorityApp {

	public static void main(String[] args) {
		
		//instantiate the queue
		PriorityQueue<String> pairs = new PriorityQueue<String>();
		
		//populate the list with pairs
		pairs.add("Dog", 5);
		pairs.add("Rat", 3);
		pairs.add("Pig", 7);
		pairs.add("Cat", 9);
		pairs.add("Cow", 2);
		
		System.out.println();
		
		
		//print out array list and priorities before sorting
		//use the queue so that we can output both the item and priority
		PriorityQueue.PriorityPair<String> s;
		do
		{
			s = pairs.remove();
			if (s != null)
			{
				System.out.println("Removed: " + s.getItem() + " With a priority of: " + s.getPriority());
			}
		} while (s != null);
		

	}

}
