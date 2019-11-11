package myProject;

public class Card 
{
	
	public static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs"};
    public static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    public int suit;
    public int rank;

    public Card(int suit, int rank) {
    	this.suit=suit;
    	this.rank=rank;
    }
    public @Override String toString()
    {
        return ranks[rank] + " of " + suits[suit];              
    }

    public int getRank() {
         return rank;
    }

    public int getSuit() {
        return suit;
    }
}
