import java.util.*;
public class Deck {
	public ArrayList<Card> d = new ArrayList<Card>();
	public Deck(){
		for (int j = 1; j <= 13; j++)
		{
			for (int i = 1; i<=4; i++)
			{
				d.add(new Card(j,i));
			}
		}
	}
	public void shuffle(){
		Random rand = new Random();
		Card temp = new Card(0,0);
		for(int i = (d.size()-1); i >0; i--){
			int j = rand.nextInt(i)+1;
			temp = d.get(i);
			d.set(i, d.get(j));
			d.set(j, temp);
		}
	}
	public Card draw(){
		Card temp = new Card(0, 0);
		temp = d.get(d.size()-1);
		d.remove(d.size()-1);
		return temp;
	}
}