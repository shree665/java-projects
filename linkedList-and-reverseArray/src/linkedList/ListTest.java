package linkedList;

public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList theLinkedList = new LinkList();
		theLinkedList.insertAtFront("Don Quixote", 500);
		theLinkedList.insertAtFront("The Tale of Two Cities", 250);
		theLinkedList.insertAtFront("The Lord of The Rings", 450);
		theLinkedList.insertAtFront("Harry Porter", 1006);
		theLinkedList.insertAtFront("Life of Vivek Subedi", 120);
		theLinkedList.insertAtBack("Math", 50);
		
		theLinkedList.display();
		
		System.out.println("Value of first in LinkedList "+ theLinkedList.firstNode +"\n");
		theLinkedList.removeFromFirst();
		theLinkedList.display();
		 System.out.println(theLinkedList.Find("The Lord of The Rings").bookName + " Was Found");
		 theLinkedList.removeLink("A Tale of Two Cities");
		 theLinkedList.display();

	}

}
