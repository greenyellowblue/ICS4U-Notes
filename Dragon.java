import java.util.Scanner;
public class Dragon {
	private String name;
	private double price;
	private int health;
	private boolean herbivores;
	public Dragon(String a, double b, int c, boolean d){
		name = a;
		price = b;
		health = c;
		herbivores = d;
	}
	public String getname(){
		return name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getHealth() {
		return health;
	}
	
	public boolean getHerbivores() {
		return herbivores;
	}
	
	public void setPrice(double x){
		price = x;
	}
	
	public void setHealth(int y) {
		health = y;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
        String n;
        double p;
        int hea;
        boolean her;
        System.out.println("What is the name of Dragon 1?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 1 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 1 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 1 a herbivore?");
        her = sc.nextBoolean();
        Dragon d1 = new Dragon(n,p,hea,her);
        System.out.println("What is the name of Dragon 2?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 2 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 2 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 2 a herbivore?");
        her = sc.nextBoolean();
        Dragon d2 = new Dragon(n,p,hea,her);
        System.out.println("What is the name of Dragon 3?");
        n = sc.nextLine();
        System.out.println("How much does Dragon 3 cost?");
        p = sc.nextDouble();
        System.out.println("How much health does Dragon 3 have?");
        hea = sc.nextInt();
        System.out.println("Is dragon 3 a herbivore?");
        her = sc.nextBoolean();
        Dragon d3 = new Dragon(n,p,hea,her);
	}
}
