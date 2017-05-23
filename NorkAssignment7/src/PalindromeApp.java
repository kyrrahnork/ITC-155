
public class PalindromeApp {

	public static void main(String[] args) {
		
		
		DoublyLinkedList dll = new DoublyLinkedList();
        dll.addToStart("r");
        dll.addToStart("a");
        dll.addToStart("d");
        dll.addToStart("a");
        dll.addToStart("r");

        System.out.println(dll.size());
        dll.outputList();
        dll.isPalindrome();
        if(dll.isPalindrome() == true){
        	System.out.println("This is a palindrome!");
        }else{
        	System.out.println("This is NOT a palindrome!");
        }
	}
	
	
}

