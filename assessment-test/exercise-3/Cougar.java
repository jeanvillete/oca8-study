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
}

/**
* 1 - On the class definition Puma, it implements the "getTailLength" method which would override from the interface HasTail, but when implementing an interface, all the methods must have the access modifier "public", so in this case it wouldn't compile.
* 2 - On the line 7, a compiler error would be printed to inform that it's not possible instantiate an object from an "abstract" class.
*/
