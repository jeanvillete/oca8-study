public class Main {
	public static void main(String... args) {










		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
	}

}

/**
* 1 - abe (False)
* 2 - abce (False)
* 3 - abde (False)
* 4 - abcde (True)
* 	The catch block for "RuntimeException" is executed once IllegalArgumentException is a child class of RuntimeException, that's why this exception is caught on this point
* 5 - The code does not compile (False)
* 6 - An uncaught exception is thrown (False)
*/
