
public class InventoryItem implements Comparable<InventoryItem>{
	private String name;
	private int uniqueItemID;
	

	public InventoryItem(int uniqueItemID, String name) {
		this.uniqueItemID = uniqueItemID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUniqueItemID() {
		return uniqueItemID;
	}

	public void setUniqueItemID(int uniqueItemID) {
		this.uniqueItemID = uniqueItemID;
	}

	@Override
	public int compareTo(InventoryItem o) {
		return uniqueItemID - o.uniqueItemID;
	}

	@Override
	public String toString(){
		 return "ID:" + uniqueItemID + " Name: " + name;
	}

}
