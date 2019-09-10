import java.util.ArrayList;

public class Card {
	public int cardRank;
	public int cardSuit;
	public int cardValue;

	public void setRank(int a){
		cardRank = a;
	}
	public int getRank(){
		return cardRank;
	}
	public void setSuit(int a){
		cardSuit = a;
	}
	public int getSuit(){
		return cardSuit;
	}
	public void setValue(int a){
		cardValue = a;
	}
	public int getValue(){
		return cardValue;
	}
	public int valueConvert(int a){
		if(a == 1){
			return 11;
		} else if (a >= 10){
			return 10;
		} else
			return a;
	}
	public String suitConvert(int b){
		if(b==1){
			return "Spades";
		} else if (b==2){
			return "Hearts";
		} else if (b == 3){
			return "Clubs";
		} else
			return "Diamonds";
	}
	
	public Card(int rank, int suit) {
		cardRank = rank;
		cardSuit = suit;
		cardValue = valueConvert(rank);
	}
	public String toString(){
		if(cardRank==1)
			return "Card: Ace of " + suitConvert(cardSuit);	
		else if (cardRank == 11)
			return "Card: Jack of " + suitConvert(cardSuit);	
		else if (cardRank == 12)
			return "Card: Queen of " + suitConvert(cardSuit);	
		else if (cardRank == 13)
			return "Card: King of " + suitConvert(cardSuit);	
		else
			return "Card : " + 	Integer.toString(cardRank) + " of " + suitConvert(cardSuit);
	}
}
