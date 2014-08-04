package linkedList;
import javax.swing.JOptionPane;


public class LinkList {
	public ListNode firstNode;
	public ListNode lastNode;
	
	LinkList(){
		firstNode = lastNode = null;
	}

	public boolean isEmpty(){
		return firstNode == null;
	}
	
	public void insertAtFront(String bookName, int numSold){
		ListNode newLink = new ListNode(bookName, numSold);
		if(isEmpty()){
			//newLink.next = firstNode;
			//newLink.next = lastNode;
			firstNode = newLink;
			lastNode = newLink;
		}else{
			newLink.next = firstNode;
			firstNode = newLink;
		}
		
		/*ListNode newLink = new ListNode(bookName, numSold);
		newLink.next = firstNode;
		firstNode = newLink;*/
	}
	public void insertAtBack(String bookName, int numSold){
		if(isEmpty()){
			firstNode =lastNode = new ListNode(bookName, numSold);
		}else{
			lastNode = lastNode.next = new ListNode(bookName, numSold);
		}
	}
	public ListNode removeFromFirst(){
		ListNode removeItem = firstNode;
		if(!isEmpty()){
			firstNode = firstNode.next;
		}else{
			JOptionPane.showMessageDialog(null, "List is empty !!");
		}
		return removeItem;
	}
	public ListNode removeFromBack(){
		if(isEmpty()){
			JOptionPane.showMessageDialog(null, "List is empty !!");
		}
		ListNode removeItem = lastNode;
		if(firstNode == lastNode){
			firstNode = lastNode = null;
		}else{
			ListNode current = firstNode;
			while(current.next != lastNode)
				current = current.next;
			
			lastNode = current;
			current.next = null;
		}
		return removeItem;
	}
	public void display(){
		ListNode list = firstNode;
		while(list != null){
			list.display();
			System.out.println("next Link: "+ list.next);
			list = list.next;
			System.out.println();
		}
	}
	public ListNode Find(String bookName){
		ListNode theNode = firstNode;
		if(!isEmpty()){
			while(theNode.bookName != bookName){
				if(theNode.next == null){
					return null;
				}else{
					theNode = theNode.next;
				}
			}
		}else{
			System.out.println("Empty Linked List.");
		}
		return theNode;
	}
	public ListNode removeLink(String bookName){
		ListNode currentNode = firstNode;
		while(currentNode.bookName != bookName){
			if(currentNode.next == null){
				return null;
			}
			else{
				currentNode = currentNode.next;
			}
		}
		if(currentNode == firstNode){
			firstNode = firstNode.next;
		}else{
			System.out.println("FOUND A MATCH");
			System.out.println("CurrentNode: "+ currentNode);
			System.out.println("FirstNode: "+ firstNode);
		}
		return currentNode;
	}
	
}
