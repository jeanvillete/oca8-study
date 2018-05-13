public class Bear {
	protected void finalize() {
		System.out.println("Roar!");
	}
	public static void main(String[] args) throws Exception {
		Bear bear = new Bear();
		bear = null;
		System.gc();
} }

/*
* finalize() method might be called by the JVM (it is not guaranteed to be called) and it can be invoked zero or once (not more than once).
* Garbage collection can is managed by the JVM and it can be executed in case the JVM thinks it's time to reclaim resource.
*
* 1/A - finalize() is guaranteed to be called (False)
* 2/B - finalize() might or might not be called (True)
* 3/C - finalize() is guaranteed not to be called (False)
* 4/D - Garbage collection is guaranteed to run (False)
* 5/E - Garbage collection might or might not run (True)
* 6/F - Garbage collection is guaranteed not to run (False)
* 7/G - The code does not compile (False)
*/
