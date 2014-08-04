import javax.swing.JOptionPane;


public class HouseList {
	public Neighbor firstNeighbor;
	public Neighbor lastNeighbor;
	
	HouseList(){
		firstNeighbor = lastNeighbor = null;
	}
	public boolean isEmpty(){
		return firstNeighbor == null;
	}
	
	public void insertAtFront(String name, int number){
		Neighbor myNewNeighbor = new Neighbor(name,number);
		if(isEmpty()){
			firstNeighbor = myNewNeighbor;
			lastNeighbor = myNewNeighbor;
		}else{
			myNewNeighbor.next = firstNeighbor;
			firstNeighbor = myNewNeighbor;
		}
	}
	public void insertAtBack(String name, int number){
		Neighbor myNewNeighbor = new Neighbor(name,number);
		if(isEmpty()){
			firstNeighbor = lastNeighbor = myNewNeighbor;
		}else{
			lastNeighbor = lastNeighbor.next = myNewNeighbor;
		}
	}
	
	public Neighbor removeFromFirst(){
		Neighbor removeNeighbor = firstNeighbor;
		if(isEmpty()){
			JOptionPane.showMessageDialog(null, "List is empty !!");
		}else{
			firstNeighbor = firstNeighbor.next;
		}
		return removeNeighbor;
	}
	public Neighbor removeFromBack(){
		Neighbor removeNeighbor = lastNeighbor;
		if(firstNeighbor == lastNeighbor){
			firstNeighbor = lastNeighbor = null;
		}
		else{
			Neighbor current = firstNeighbor;
			while(current.next != lastNeighbor){
				current = current.next;
			}
			lastNeighbor = current;
			current.next = null;
		}
		return removeNeighbor;
	}
	public void display(){
		Neighbor list = firstNeighbor;
		while(list != null){
			list.display();
			System.out.println("next Link: "+ list.next);
			list = list.next;
			System.out.println();
		}
	}
	public Neighbor Find(int number){
		Neighbor find = firstNeighbor;
		if(!isEmpty()){
			while(find.houseNumber != number){
				if(find.next == null)
					return null;
				else
					find = find.next;
			}
		}else{
			System.out.println("Empty Linked List.");
		}
		return find;
		
	}
}
