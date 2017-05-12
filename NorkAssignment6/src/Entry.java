// Implement comparable so the LinkedList3 class can compare two
// Entry objects.

public class Entry implements Comparable {
    private String item;
    private int count;

    public Entry(String item, int count) {
        this.item = item;
        this.count = count;
    }

    @Override
    public String toString() {
        return (item + " " + count);
    }

    /**
     * This method must be implemented since Entry implements
     * Comparable.  It simply compares the two strings stored in
     * "item".
     *
     * @param otherObject
     *            item to compare to this object.
     */
    @Override
    public int compareTo(Object otherObject) throws ClassCastException {
        if (otherObject == null) {
            throw new ClassCastException("An Entry object expected.");
        } else if (getClass() != otherObject.getClass()) {
            throw new ClassCastException("An Entry object expected.");
        } else {
            Entry otherEntry = (Entry) otherObject;
            return (item.compareTo(otherEntry.item));
        }
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject == null) {
            return false;
        } else if (getClass() != otherObject.getClass()) {
            return false;
        } else {
            Entry otherEntry = (Entry) otherObject;
            return (item.equals(otherEntry.item) && (count == otherEntry.count));
        }
    }
}
         
            