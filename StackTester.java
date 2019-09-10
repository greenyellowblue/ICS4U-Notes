
public class StackTester {
	public static void main(String []args){
		Stack a = new Stack(10);
		System.out.println(a);
		a.push(20);
		a.push(-4);
		a.push(100);
		System.out.println(a.peek());
		System.out.println(a);
		System.out.println(a.average());
		a.pop();
		a.pop();
		System.out.println(a);
		
	}
}
