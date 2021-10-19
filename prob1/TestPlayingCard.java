package labproject4.prob1;
/**
 * Your name: Daniel Lawrie
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCard
{
    public static void main(String[] args)
    {
        // 1 - Construct an array of 52 PlayingCard objects called deck.
    	String[][] deck = new String[14][5];
    	


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
    			deck[num][suits] = one.toString();
    			System.out.print(deck[num][suits] +"   ");
    		}
    		System.out.println();
    		
    	}


        // 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loop.
        

        

    }
}

