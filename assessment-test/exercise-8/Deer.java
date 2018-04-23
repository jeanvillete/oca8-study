public class Deer {
	public Deer() { System.out.print("Deer"); }
	public Deer(int age) { System.out.print("DeerAge"); }
	private boolean hasHorns() { return false; }
	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println( "," + deer.hasHorns() );
	}
}
class Reindeer extends Deer {
	public Reindeer(int age) { System.out.print("Reindeer"); }
	public boolean hasHorns() { return true; }
}

/*
* 1 - DeerReindeer,false (True)
* 	On the line 11, before the "System..print" command, there's an implicit "super()" command, which in turns invokes the Deer constructor on like 2.
* 	Next, the method hasHorns() looks like an overridden method, but it is actually a hidden method since it is declared private in the parent class. Because the hidden method is referenced in the parent class, the parent version is used, so the code outputs "false".
* 2 - DeerReindeer,true (False)
* 3 - ReindeerDeer,false (False)
* 4 - ReindeerDeer,true (False)
* 5 - DeerAgeReindeer,false (False)
* 6 - DeerAgeReindeer,true (False)
* 7 - The code will not compile because of line 7 (False)
* 8 - The code will not compile because of line 12 (False)
*/
