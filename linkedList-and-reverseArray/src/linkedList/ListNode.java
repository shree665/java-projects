package linkedList;

public class ListNode {
	public String bookName;
	public int numSold;
	public ListNode next;
	
	public ListNode(String bookName, int numSold){
		this.bookName = bookName;
		this.numSold = numSold;
	}
	
	public void display(){
		System.out.println(bookName + ": "+ numSold + " sold");
	}
	public String toString(){
		return bookName;
	}
}
