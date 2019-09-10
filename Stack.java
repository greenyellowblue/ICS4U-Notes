
public class Stack {
	private Node top = null;
	private int counter = 0;
	//Constructors
	public Stack(){}
	public Stack (int i){
		top = new Node(i, null);
		counter ++;
	}
	
	//Methods
	public void push(int i){
		Node tempNode = new Node(i, top);
		top = tempNode;
		counter ++;
	}
	public void pop(){
		if (counter == 0){
			top = null;
			counter --;
		}
		else {
			top = top.getNext();
			counter--;
		}
	}
	public String toString(){
		String s = "Stack: ";
		Node tempNode = new Node(0, top);
		tempNode = tempNode.getNext();
		for(int i = 0; i < counter-1; i ++){
			s += tempNode.getValue() + " ";
			tempNode = tempNode.getNext();
		}
		s+= tempNode.getValue();
		return s;
	}
	public void clear(){
		top = null;
	}
	public double average(){
		double sum = 0;
		if(counter == 0){
			return 0;
		}
		if(counter == 1){
			return top.getValue();
		}
		Node tempNode = new Node(0, top);
		for(int i = 0; i < counter; i++){
			sum += tempNode.getNext().getValue();
			tempNode = tempNode.getNext();
		}
		return sum/counter;
	}
	public int peek(){
		if(counter == 0){
			return 0;
		}
		return top.getValue();
	}
}
