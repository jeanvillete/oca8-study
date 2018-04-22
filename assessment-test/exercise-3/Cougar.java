interface HasTail { int getTailLength(); }
abstract class Puma implements HasTail {
	protected int getTailLength() {return 4;}
}
public class Cougar extends Puma {
	public static void main(String[] args) {
		Puma puma = new Puma();
		System.out.println(puma.getTailLength());
	}

	public int getTailLength(int length) {return 2;}
	public int getTailLength() {return 4;}
}

/**
* 1 - 2. (False, the code doesn't compile)
* 2 - 4. (False, the code doesn't compile)
* 3 - The code will not compile because of line 3. (True)
* 	On the class definition Puma, it implements the "getTailLength" method which would override from the interface HasTail, but when implementing an interface, all the methods must have the access modifier "public", so in this case it wouldn't compile.
* 4 - The code will not compile because of line 5. (True)
*	Cougar implements an overloaded version of getTailLength method, but since the declaration in the parent class wasn't valid, the concrete (Cougar) class should implement the public version of the method.
* 5 - The code will not compile because of line 7. (True)
* 	On the line 7, a compiler error would be printed to inform that it's not possible instantiate an object from an "abstract" class.
* 6 - The code will not compile because of line 11. (False)
* 7 - The output cannot be determied from the code provided. (False)
* 
*/
