
public class BTTester {
	public static void main(String[]args){
		BT bintree = new BT();
		bintree.add(5);
		bintree.add(4);
		bintree.add(10);
		bintree.add(8);
		bintree.add(3);
		bintree.add(1);
		bintree.add(12);
		
		System.out.println(bintree.totalNodesRecursion(bintree.root));
		System.out.println(bintree.averageRecursion(bintree.root));
		System.out.println(bintree.average());
		System.out.println(0/0);
		
	}
}
