/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */

        String[] cardRanks = {"King", "Queen", "7", "Ace"};
        String[] cardSuit = {"blue", "red", "red", "blue"};
        int[] cardPointValue = {13, 12, 7, 1};


        Deck deck1 = new Deck(cardRanks, cardSuit, cardPointValue);

        System.out.println("Is deck1 empty? " + deck1.isEmpty());
        System.out.println(deck1.deal());
        System.out.println(deck1.size());

    }
}

