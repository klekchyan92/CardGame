package myProject;

public class PlayerHand 
{
	public Card[] playerCards;
	public Card[] changedCards;
	public PlayerHand(Deck deck,int ccount)
	{
		playerCards=new Card[ccount];
		for(int j=0;j<ccount;j++)
		{
			playerCards[j]= deck.drawCards();
		}
	}
	
	public void ChangeCard(Deck deck,int index) throws Exception
	{
		if(index<0 || index>5)
		{
			throw new Exception("Please insert correct index");
		}
		playerCards[index] = deck.drawCards();
	}
}
