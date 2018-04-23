import java.util.*;
public class Grasshopper {
public Grasshopper(String n) {
	name = n;
}
public static void main(String[] args) {
	Grasshopper one = new Grasshopper("g1");
	Grasshopper two = new Grasshopper("g2");
	one = two;
	two = null;
	one = null;
}
	private String name; }

/*
* 1 - Immediately after line 9, no grasshopper objects are eligible for garbage collection. (False)
*	The previous (before assigment on line 9) one object is now eligible for gc.
* 2 - Immediately after line 10, no grasshopper object are eligible for garbage collection. (False)
* 	There's still one object, the same eligible from line 9 onwards.
* 3 - Immediately after line 9, only one grasshopper object is eligible for garbage collection. (True)
* 4 - Immediately after line 10, only one grasshopper object is eligible for garbage collection. (True)
* 5 - Immediately after line 11, only one grasshopper object is eligible for garbage collection. (False)
* 	There're two objects eligible for gc.
* 6 - The code compiles. (True)
* 7 - The code does not compile. (False).
*/
