import java.util.Arrays;

public class NorkAssignment4App {

	public static void main(String[] args) {
		
		InventoryItem Item1 = new InventoryItem(40, "Cape");
		InventoryItem Item2 = new InventoryItem(21, "Spiderman Suit");
		InventoryItem Item3 = new InventoryItem(59, "Power Ring");
		InventoryItem Item4 = new InventoryItem(30, "Bulletproof Bracelets");
		InventoryItem Item5 = new InventoryItem(39, "X-Ray Goggles");
		
		InventoryItem[] items = {Item1, Item2, Item3, Item4, Item5};
		
		
		System.out.println("Here is the inventory prior to sorting:");
		for (InventoryItem inventoryItem : items) {
			System.out.println(inventoryItem);
		}
		
		System.out.println();
		
		
		Arrays.sort(items);
		
		
		System.out.println("Here is the inventory after sorting:");
		for (InventoryItem inventoryItem : items) {
			System.out.println(inventoryItem);
		}
		
		System.out.println();

	}

}
