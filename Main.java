public class Main {
	public static void main(String[]args){
		// Nodes 5,1,4,3,2
		Node n1 = new Node (2,null);
		Node n2 = new Node (3, n1);
		Node n3 = new Node (4, n2);
		Node n4 = new Node (1, n3);
		Node n5 = new Node (5, n4);
		
		System.out.println(n5.getNext().getValue());
		System.out.println(n5.getValue());
	}
}
