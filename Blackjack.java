import java.util.*;
public class Blackjack {
	private int amount;
	private int bet;
	private Deck deck;
	private Hand playerHand;
	private Hand dealerHand;
	private String winner;
	private String cont;
	private Scanner sc;

	/**
	 * Constructor
	 */
	public Blackjack() {
		amount = 100;
		deck = new Deck();
		playerHand = new Hand(false);
		dealerHand = new Hand(true);
		cont = "yes";
		sc = new Scanner(System.in);
	}

	public static void main(String[]args){
		Blackjack a = new Blackjack();

		
		try {
			while (a.amount > 0 && a.cont.equals("yes")) {
				a.winner = "none";
				System.out.println("Welcome to BlackJack!");
				a.getBet();
				a.deck = new Deck();
				a.deck.shuffle();
				a.playerHand = new Hand(false);
				a.dealerHand = new Hand(true);
				for (int i = 0; i < 2; i++) {
					a.playerHand.addCard(a.deck.draw());
					a.dealerHand.addCard(a.deck.draw());
				}
				System.out.println(a.playerHand.toString());
				System.out.println(a.dealerHand.toString());
				while (a.winner.equals("none")) {
					a.playerTurn();
					if (a.winner.equals("dealer")) {
						a.amount -= a.bet;
						System.out.println("You have lost " + a.bet + ", your new balance is " + a.amount + " chips.");
						break;
					} else {
						a.dealerTurn();
					}
					if(a.winner.equals("player")){
						a.amount += a.bet;
						System.out.println("You have won " + a.bet + ", your new balance is " + a.amount+ " chips.");
						break;
					} else if (a.winner.equals("dealer")) {
						a.amount -= a.bet;
						System.out.println("You have lost " + a.bet + ", your new balance is " + a.amount+ " chips.");
						break;
					} else if (a.winner.equals("tie")){
						System.out.println("It's a tie!");
					} 
				}
				if(a.amount == 0){
					System.out.println("You have no more chips! Don't gamble kids...");
					break;
				}
				System.out.println("Play again?");

				a.cont = a.sc.nextLine();
				
			}
		} finally {
			if (a.sc != null)
				a.sc.close();
		}

	}

	public void getBet(){
			boolean isValid = false;
			while(!isValid){
				System.out.println("You have " + amount + " chips.");
				System.out.println("How many chips would you like to bet?");
				bet = Integer.parseInt(sc.nextLine());
				if (bet > amount){
					System.out.println("You do not have that much to bet!");
				} else if (bet <= 0){
					System.out.println("You can't bet nothing or less than zero!");
				} else {
					isValid = true;
				}
			}

	}
	public void playerTurn(){
		String choice;
		System.out.println("Would you like to hit or stand?");
		choice = sc.nextLine();
		while (choice.equals("hit")) {
			System.out.println("You drew a card!");
			playerHand.addCard(deck.draw());
			System.out.println(playerHand.toString());
			if (playerHand.over21 == true) {
				System.out.println("Your hand is busted!");
				winner = "dealer";
				return;
			}
			System.out.println("Would you like to hit or stand?");
			choice = sc.nextLine();
		} 
		if (choice.equals("stand")){
			System.out.println("You have chosen to stand.");
			return;
		}
		else {
			System.out.println("Invalid input!");
			playerTurn();
		}
	}
	public  void dealerTurn(){
		while(dealerHand.totalValue < playerHand.totalValue){
			dealerHand.addCard(deck.draw());
			System.out.println("The dealer chooses to hit.");
			if(dealerHand.over21 == true){
				System.out.println("Dealer's hand is busted.");
				System.out.println("You win!");
				winner = "player";
				return;
			}
			System.out.println(dealerHand.toString());
		} 
		if (dealerHand.totalValue>playerHand.totalValue){
		    System.out.println("The dealer has chosen to stand.");
		    System.out.println(dealerHand.toString());
		    System.out.println("Dealer has won.");
			winner = "dealer";
		} 
	}
}
