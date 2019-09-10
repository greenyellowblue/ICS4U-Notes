
public class Node {
	// Fields
	private int value;
	private Node nextNode;
	
	//Setter/Getter Methods
	public int getValue() {
        return value;
    }

    public void setValue(int a) {
        value = a;
    }

    public Node getNext() {
        return nextNode;
    }

    public void setNext(Node a) {
        nextNode = a;
    }
    
	// Constructor method
    public Node(int a, Node b) {
        value = a;
        nextNode = b;
    }
}
