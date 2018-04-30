import java.util.function.Predicate;
public class Main {
	public static void main(String[] args) {
		// INSERT CODE HERE
	}
	private static boolean test(Predicate<Integer> p) {
		return p.test(5);
	}
}

/**
* 1 - System.out.println( test( i -> i == 5 ) ); (True)
* 2 - System.out.println( test( i -> {i == 5;} ) ); (False)
*	When the body of the lambda is held by braces, it must be declared the return type, when one is expected
* 3 - System.out.println( test( (i) -> i == 5 ) ); (True)
* 4 - System.out.println( test( (int i) -> i == 5 ) ); (False)
* 	Autoboxing works for Collections, but not for infering Predicates, if the parameter type was changed to Integer, so it would work properly
* 5 - System.out.println( test( (int i) -> { return i == 5;} ) ); (False)
* 	Autoboxing works for Collections, but not for infering Predicates, if the parameter type was changed to Integer, so it would work properly
* 6 - System.out.println( test( (i) -> {return i == 5;} ) ); (True)
* 
* THE ONLY ONE FUNCTIONAL PROGRAMMING INTERFACE IT'S NEEDED TO BE MEMORIZED FOR THE OCA EXAM, IS THE java.util.functional.Predicate
*/
