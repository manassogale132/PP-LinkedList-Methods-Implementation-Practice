
public class LinkedList {
	
	Node head;                           //Refers to first node
	
	public void insert(int data) {           //Insert Method	
		
		Node node = new Node();              //Node object creation
		node.data=data;                      
		node.next=null;
		
		if(head == null) {                   //Condition to check that inserting node is first in the list.
			head=node;
		}
		else {                               //Condition to check that the list already have some nodes in it.
			Node n = head;                  //Traversing 
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}	
	}

	
}
