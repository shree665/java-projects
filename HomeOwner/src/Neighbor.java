
public class Neighbor {
	public int houseNumber;
	public String houseOwnerName;
	
	public Neighbor next;
	
	Neighbor(String name, int number){
		houseNumber = number;
		houseOwnerName = name;
	}
	public void display(){
		System.out.println("Owner Name: "+houseOwnerName + "\nHouse Number: "+houseNumber);
	}
	
	public String toString(){
		return houseOwnerName;
	}

}
