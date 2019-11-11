package myProject;
import java.util.ArrayList;
import java.util.Random;

public class Deck
{
	Random rnd=new Random();
	ArrayList<Card> cards=new ArrayList<Card>();
	{	
	for (int suit=0; suit<4; suit++)
    {
         for (int rank=0; rank<13; rank++)
         {
              cards.add(new Card(suit,rank));
         }
    }
	}
	
	public Card drawCards()
	{
		return cards.remove(rnd.nextInt(53));
	}
}
