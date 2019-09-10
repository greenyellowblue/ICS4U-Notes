import java.util.Scanner;
public class Sandwich {
	private boolean bacon, lettuce, tomatoes;
	
	public Sandwich(boolean x, boolean y, boolean z) {
		bacon = x;
		lettuce = y;
		tomatoes = z;
	}
	
	public boolean getBacon(){
		return bacon;
	}
	
	public boolean getLettuce() {
		return lettuce;
	}
	
	public boolean getTomatoes() {
		return tomatoes;
	}
	
	public void setBacon(boolean x){
		bacon = x;
	}
	
	public void getLettuce(boolean y) {
		lettuce = y;
	}
	
	public void setTomatoes(boolean z) {
		tomatoes = z;
	}
	
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
        boolean b, l, t;
        System.out.println("Would you like bacon for Sandwich 1?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 1?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 1?");
        t = sc.nextBoolean();
        Sandwich s1 = new Sandwich(b, l, t);
        System.out.println("Would you like bacon for Sandwich 2?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 2?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 2?");
        t = sc.nextBoolean();
        Sandwich s2 = new Sandwich(b, l, t);
        System.out.println("Would you like bacon for Sandwich 3?");
        b = sc.nextBoolean();
        System.out.println("Would you like lettuce for Sandwich 3?");
        l = sc.nextBoolean();
        System.out.println("Would you like tomatoes? for Sandwich 3?");
        t = sc.nextBoolean();
        Sandwich s3 = new Sandwich(b, l, t);
	}
	
}
