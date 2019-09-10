
public class Queue {
	//Fields
	private Node head = null;
	private Node tail = null;
	private int counter = 0;
	
	//Constructor
	public Queue() {}
	
	public Queue(int i ){
		Node n = new Node(i, null);
		head = n;
		tail = n;
		counter ++;
	}
	
	//Methods queue, dequeue, toString
	public void queue(int val){
		tail = new Node(val, tail);
		if(counter == 0){head = tail;}
		counter++;
	}
	
	public void dequeue(){
		Node temp = tail;
		if(counter == 0 || counter == 1){
			head = null;
			tail = null;
			counter = 0;
			return;
		}
		while(temp.getNext()!=head){
			temp = temp.getNext();
		}
		temp.setNext(null);
		head = temp;
		counter --;
	}
	
	public String toString(){
		String s = "Queue: ";
		Node temp = tail;
		while (temp != null){
			s += temp.getValue() + " ";
			temp = temp.getNext();
		}
		return s;
	}
	
}
