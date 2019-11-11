package myProject;
public class myClass {

	public static void main(String[] args) throws Exception 
	{
		Deck deck=new Deck();
		PlayerHand play=new PlayerHand(deck,6);
		System.out.println(play.playerCards);
		play.ChangeCard(deck,2);
		play.ChangeCard(deck, 5);
		System.out.println(play.playerCards);
	}
}
