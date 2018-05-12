package aquarium;
import java.lang.*;
import java.lang.System;
import aquarium.Water;
import aquarium.*;
public class Tank {
	public void print(Water water) {
		System.out.println(water); } }
		
/*
* All of the declared imports can be removed.
* The fist and second can be removed because the "java.lang" package makes part of the Java API Core, so then, it is implicitly available throughout any Java class/interface.
* The third and forth import statements, can be removed because it is trying import classes on the same package, and classes with either default, protected or public access modifier, are all implicitly accessible throughout the same package, with no need for "import".
*
* 1/A - 0 (False)
* 2/B - 1 (False)
* 3/C - 2 (False)
* 4/D - 3 (False)
* 5/E - 4 (True)
* 6/F - Does not compile
*/