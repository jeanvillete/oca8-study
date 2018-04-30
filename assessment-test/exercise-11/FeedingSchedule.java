public class FeedingSchedule {
	public static void main(String[] args) {
		int x = 5, j = 0;
		OUTER: for(int i=0; i<3; )
			INNER: do {
				i++; x++;
				if ( x > 10 ) break INNER;
				x += 4;
				j++;
			} while ( j <= 2 );
		System.out.println( x );
} }

/**
* 1 - 10 (False)
* 2 - 12 (True)
* 3 - 13 (False)
* 4 - 17 (False)
* 5 - The code will not compile because of line 4 (False)
* 6 - The code will not compile because of line 6 (False)
*/
