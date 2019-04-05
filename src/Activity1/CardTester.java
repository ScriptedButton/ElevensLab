/**
 * This is a class that tests the Card class.
 */
package Activity1;

public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card myCard = new Card("Ace", "Spades", 1);
        System.out.println(myCard.rank());
        System.out.println(myCard.suit());
        System.out.println(myCard.pointValue());
		System.out.println(myCard.toString());
	}
}
