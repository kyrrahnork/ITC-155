
public class NorkAssignment6Demo {

	public static void main(String[] args) {
		LinkedList3<Entry> list = new LinkedList3<Entry>();

		Entry entry1 = new Entry("Bananas", 2);
		list.addSorted(entry1);

		Entry entry2 = new Entry("Apples", 1);
		list.addSorted(entry2);

		Entry entry3 = new Entry("Cantaloupe", 3);
		list.addSorted(entry3);

		System.out.println("List has " + list.size() + " nodes.");
		list.outputList();
		System.out.println("End of list.");

	}

}
