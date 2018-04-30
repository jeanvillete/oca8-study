class Chicken {}
interface HenHouse { public java.util.List<Chicken> getChickens(); }
public class ChickenSong {
	public static void main(String[] args) {
		HenHouse house = null; // Assuming we have a valid non-null HenHouse
		Chicken chicken = house.getChickens().get(0);
		for(int i=0; i<house.getChickens().size();
			chicken = house.getChickens().get(i++)) {
			System.out.println("Cluck");
} } }

/**
* 1 - The code will not compile because of line 6 (False)
* 2 - The code will not compile because of lines 7-8 (False)
* 3 - The application will compile but not produce any output (False)
*	It impossible to happen, if the list house.getChicken() is empty, a RuntimeException is raisen, and if there's one or more elements, it will always produce output
* 4 - The application will ouput Cluck exactly once (True)
* 	It can be true, in case the house.getChickes() list has only one element
* 5 - The application will output Cluck more than once (True)
* 	It can be true, in case there's more than one element in the list house.getChickens()
* 6 - The application will compile but produce an exception at runtime (True)
* 	It can be true, in case the list house.getChickens() is an empty list; if no element exists on the list, on the line 6, an ArrayIndexOutOfBoundsException is gonna be thrown.
*/
