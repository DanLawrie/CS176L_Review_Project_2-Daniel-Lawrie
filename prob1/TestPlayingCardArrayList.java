package labproject4.prob1;
import java.util.ArrayList;
import java.util.Random;

public class TestPlayingCardArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	ArrayList<String> deck = new ArrayList<>();
    	


    	PlayingCard one = new PlayingCard();

        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).

        
    	for (int num = 1; num<14; num++)
    	{
    		for(int suits = 1; suits<5; suits++)
    		{
    			one.setSuit(suits);
    			one.setValue(num);
    			deck.add(one.toString());
    			System.out.print(one.toString() +"   ");
    		}
    		System.out.println();
    		
    	}
    	//Shuffle
    	String shuffle;
    	int newplace;
    	System.out.println("Shuffle");
    	System.out.println();
    	for(int g = 0; g< 10;g++)
    	{
    	for (int i = 1;i<52; i++ )
    	{
    		
    		newplace =	(int)(Math.random()*51);
    		shuffle =  deck.get(newplace);
    		deck.set(newplace, deck.get(i));
    		deck.set(i, shuffle);
    		
    	}
    	}
    	for (int i = 0;i<52; i++ )
    	{
    		if(i%4 == 0 && i!=0)
    		{
    			System.out.println();
    		}
    		System.out.print(deck.get(i) + "  ");

    	}
    	
	}

}
