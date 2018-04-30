public class BearOrShark {
	public static void main(String[] args) {
		int luck = 10;
		if ( (luck > 10 ? luck++ : --luck ) <10 ) {
			System.out.print("Bear");
		} if ( luck < 10 ) System.out.print("Shark");
} }

/**
* 1 - Bear (False)
* 2 - Shark (False)
* 3 - BearShark (True)
* 4 - The code will not compile because of line 4 (False)
* 5 - The code will not compile because of line 6 (False)
* 6 - The code compiles without issue but does not produce any output (False)
*/
