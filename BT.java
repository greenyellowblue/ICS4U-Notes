
public class BT {
	//Fields
	public BTNode root;
	
	//Constructor
	public BT() {
		root = null;
	}
	public BT(int i){
		root = new BTNode(i);
	}
	
	
	
	public void add(int v){
		//If root is empty
		if(root == null){
			root = new BTNode(v);
		}	else {
			addRecursion(root, v);
		}
	}
	public void addRecursion(BTNode node, int v){
		if(v < node.getValue()){
			if(node.getLeft() == null){
				node.setLeft(new BTNode(v));
			} else {
				addRecursion(node.getLeft(), v);
			}
		}	else if(v > node.getValue()){
			if(node.getRight() == null){
				node.setRight(new BTNode(v));
			} else {
				addRecursion(node.getRight(), v);
			}
		}
		
	}
	public String toString(){
		return  toStringRecursion(root);
	}
	public String toStringRecursion(BTNode node){
		String s = "";
		if(node == null){
			return "";
		}
		s += toStringRecursion(node.getLeft());
		s += node.getValue()+" ";
		s += toStringRecursion(node.getRight());
		
		return s;
	}
	public void clear(){
		root = null;
	}
	public double average(){
		return (double)(averageRecursion(root))/(double)(totalNodesRecursion(root));
	}
	public int averageRecursion(BTNode node){
		int total = 0;
		
		if(node == null){
			return 0;
		}
		
		total += averageRecursion(node.getLeft());
		total += node.getValue();
		total += averageRecursion(node.getRight());
		
		return total;
	}
	public int totalNodesRecursion(BTNode node){
		int counter = 0;
		if(node == null){
			return 0;
		} else {
			counter ++;
		}
		counter += totalNodesRecursion(node.getLeft());
		counter += totalNodesRecursion(node.getRight());
		return counter;
	}
	
	
}
