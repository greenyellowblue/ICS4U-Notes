import java.util.*;
public class Hand {
	public ArrayList<Card> x = new ArrayList<Card>();
	public int totalValue;
	public boolean isDealer;
	public boolean over21;
	public static void main (String[]args){
		
	}
	public Hand(boolean a){
		if (a){
			isDealer = true;
		} else{
			isDealer = false;
		}
	}
	public void addCard(Card a){
		x.add(a);
		totalValue += a.getValue();
		if(a.cardRank == 1){
			if(totalValue > 21){
				totalValue -= a.getValue();
				totalValue += 1;
			}
		}
		if (totalValue>21){
			over21 = true;
		}	else{
			over21 = false;
		}
	}
	public int totalValue(){
		return totalValue;
	}
	public String toString(){
		String a = "";
		if (isDealer) {
			a+= "Dealer's Hand: \n \t";
			a+= "????? \n \t";
			for (int i = 1; i < x.size(); i++){
				a+= x.get(i)+ "\n \t";
			}
			
		}
		else {
			a+= "Player's Hand: \n \t";
			for (int i = 0; i < x.size(); i++){
				a+= x.get(i)+ "\n \t";
			}
			a += "Current Total: " + totalValue;
		}
		return a;
		
	}
}
