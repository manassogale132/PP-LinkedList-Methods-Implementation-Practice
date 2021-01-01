
public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.insert(30);
		list.insert(12);
		list.insert(86);
		
		list.insertAtStart(2);
		list.insertAtStart(1);
		
	    list.insertAtIndex(5, 50);
	    list.insertAtIndex(3, 100);
		
		list.show();
		

	}

}
