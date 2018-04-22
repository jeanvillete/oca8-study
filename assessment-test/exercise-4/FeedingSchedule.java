public class FeedingSchedule {
	public static void main(String[] args) {
		boolean keepGoing = true;
		int count = 0;
		int x = 3;
		while (count++ < 3) {
			int y = (1 + 2 * count) % 3;
			switch(y) {
				default:
				case 0: x -= 1; break;
				case 1: x += 5;
			}
		}
		System.out.println(x);
} }

/**
* 1 - 4. (False)
* 2 - 5. (False)
* 3 - 6. (True)
* 4 - 7. (False)
* 5 - 13. (False)
* 6 - The code will not compile because of line 7. (False)
*/
