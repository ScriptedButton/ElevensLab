/**
 * This is a class that tests the Deck class.
 */
package Activity2;

public class DeckTester {
	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */

	public static void main(String[] args) {
		String[] ranks1 = {"jack", "queen", "king"};
		String[] suits1 = {"blue", "red"};
		int[] pointValues1 = {11, 12, 13};

		String[] ranks2 = {"ace", "king", "queen"};
		String[] suits2 = {"orange", "violet"};
		int[] pointValues2 = {1, 2, 3};

		String[] ranks3 = {"1", "2", "3"};
		String[] suits3 = {"purple", "green"};
		int[] pointValues3 = {4, 5, 6};

		Deck one = new Deck(ranks1, suits1, pointValues1);
		Deck two = new Deck(ranks2, suits2, pointValues2);
		Deck three = new Deck(ranks3, suits3, pointValues3);


		System.out.println(one.size());
		System.out.println(two.size());
		System.out.println(three.size());

		System.out.println(one.deal().toString());
		System.out.println(two.deal().toString());
		System.out.println(three.deal().toString());

		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());

		System.out.println(one.isEmpty());
		System.out.println(two.isEmpty());
		System.out.println(three.isEmpty());
	}
}