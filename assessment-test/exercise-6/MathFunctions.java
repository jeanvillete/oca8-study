public class MathFunctions {
	public static void addToInt(int x, int amountToAdd) {
		x = x + amountToAdd;
	}
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		MathFunctions.addToInt(a,b);
		System.out.println(a);  } }

/**
* 1 - 10 (False)
* 2 - 15 (True)
* 	This is the right printed value, once the variables in question are primitive ones, they're passed as values and not as references, so on the "addToInt" static value, on the line 3, the assigned to the x variable doesn't update any value of outside variables where have invoked the method.
* 3 - 25
* 4 - Compiler error on line 3
* 5 - Compiler error on line 8
* 6 - None of the above.
*/
