
public class hailstone {
	public static void main(String[]args){
		System.out.println(method(1));

		System.out.println(method(5));

		System.out.println(method(21));
	}
	public static int method(int a){
		if(a == 1){
			return 0;
		}	else if (a%2 == 1){
			return 1+ method(a*3+1);
		}	else {
			return 1 + method(a/2);
		}
	}
}
