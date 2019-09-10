
public class LinkedList {
	//Fields
	private Node head;
	private Node tail;
	//Constructor
	public LinkedList(int value){
		head = new Node (value, null);
		tail = head;
	}
	
	//Method
	public void add(int value){
		Node n = new Node(value, null);
		tail.setNext(n);
		tail = n;
	}
	//Inserting
	public void add(int val, int pos){
		
		if(head == null){
			head = new Node (val, null);
			tail = head;
			return;
		}
		
		if(pos == 0){
			Node tempNode = new Node(val, head);
			head = tempNode;
			return;
		}
		
		int count = 0;
		Node tempNode = head;
		while (tempNode != null){
			count ++;
			if (count == pos){
				//If null, exceeded number of nodes in linked list
				if(tempNode.getNext() == null) {
					tail = new Node (val, null);
					tempNode.setNext(tail);
				}
				
				//Else its neither the head nor the tail
				else {
					Node a = new Node(val, tempNode.getNext());
					tempNode.setNext(a);
				}
				return;
			}
			tempNode = tempNode.getNext();
		}
	}
	
	public void remove(int pos){
		//If list is empty
		if(head == null){
			return;
		}
		//If we want to remove the first element
		if(pos == 0){
			head = head.getNext();
			return;
		}
		/* If  the  linked  list  is  not  empty  and  if  
		 * we  are  removing  any  other  element  besides  the 
		 * first  one
		 */
		int count = 0;
		Node tempNode = head;
		while (tempNode != null){
			count ++;
			if (count == pos){
				//If null, exceeded number of nodes in linked list or is added after tail
				if(tempNode.getNext() == null) {
					tail = tempNode;
					tempNode.setNext(null);
				}
				
				else {
					tempNode.setNext(tempNode.getNext());
				}
				return;
			}
			tempNode = tempNode.getNext();
		}
	}
	public void clear(){
		head = null;
	}
	public String toString(){
		String s = "";
		Node tempNode = head;
		while(tempNode != null){
			s += tempNode.getValue() + " ";
			tempNode = tempNode.getNext();
		}
		return s;
	}
	
}
