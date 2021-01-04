
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
	
	
	public void insertAtStart(int data) {       //To insert at start of the list
		
		Node node = new Node();                  //Node object creation
		node.data=data;
		node.next=null;
		
		node.next=head;                         //Setting the node to head
		head=node;	
	}
	
	
	public void insertAtIndex(int index,int data) {   //Insert at specified index
		
		Node node = new Node();                  //Node object creation
		node.data=data;
		node.next=null;
		
		if(index==0) {
			insertAtStart(data);
		}
		else {
		Node n = head;                             //Traversing index
		for(int i = 0 ;i<index-1;i++) {           //for loop for an index
			n=n.next;		
		}
		node.next=n.next;
		n.next=node;	
		}
	}

	
}
