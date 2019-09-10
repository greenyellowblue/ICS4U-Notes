
public class BTNode {
	private int value;
	private BTNode left;
	private BTNode right;
	//Constructor
	public BTNode(int v){
		value = v;
		left = right = null;
	}
	//Instance Methods
	public int getValue(){
		return value;
	}
	public BTNode getLeft(){
		return left;
	}
	public BTNode getRight(){
		return right;
	}
	
	public void setLeft(BTNode n){
		left = n;
	}
	public void setRight(BTNode n){
		right = n;
	}
	
}
