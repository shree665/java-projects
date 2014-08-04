


public class RunHouseList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseList allHouse = new HouseList();
		allHouse.insertAtFront("Vivek Subedi", 1);
		allHouse.insertAtFront("Raymond", 5);
		allHouse.insertAtBack("Brandon", 15);
		allHouse.insertAtFront("Alok", 30);
		allHouse.insertAtFront("Chiraj", 60);
		allHouse.insertAtFront("Alvaro", 120);
		allHouse.insertAtBack("Sarmila", 240);
		allHouse.insertAtFront("Dig Bijaya", 480);
		allHouse.insertAtFront("Davi Prasad", 960);
		
		allHouse.display();
		System.out.println("Value of first in LinkedList "+ allHouse.firstNeighbor +"\n");
		allHouse.removeFromFirst();
		allHouse.display();
		System.out.println("Value of first in LinkedList "+ allHouse.firstNeighbor +"\n");
		allHouse.removeFromBack();
		allHouse.display();
		System.out.println("Value of last in LinkedList "+ allHouse.lastNeighbor +"\n");
	}

}
