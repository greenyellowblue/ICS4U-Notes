
public class QueueTester {
	public static void main(String[]args){
		Queue q = new Queue();
		System.out.println(q);
		q.queue(5);
		System.out.println(q);
		q.queue(1);
		System.out.println(q);
		q.queue(6);
		System.out.println(q);
		q.queue(3);
		System.out.println(q);
		q.dequeue();
		System.out.println(q);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		System.out.println(q);
	}
}
