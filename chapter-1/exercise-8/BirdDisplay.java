public class BirdDisplay {
	public static void main(String[] name) {
		System.out.println(name[1]);
} }

/*
* Which of the following calls print out Blue Jay?
*
* Note: In order to invoke the java execution;
*   the java command has to be provided, followed by
*   the class name which has the gateway method, known as executable class; public static void main(String[] args), followed by parameters
*   parameters are indexed from 0, and parameters are splitted by spaces, or if desired, one parameter with spaces can be provided within double/single quotes. (the behaviour of the parameters is much more related to the command line interpreter)
*   
*
* 1/A - java BirdDisplay Sparrow Blue Jay (False)
*   It would print out Blue
* 2/B - java BirdDisplay Sparrow "Blue Jay" (True)
* 3/C - java BirdDisplay Blue Jay Sparrow (False)
*   It would print out Jay
* 4/D - java BirdDisplay "Blue jay" Sparrow (False)
*   It would print out Sparrow
* 5/E - java BirdDisplay.class Sparrow "Blue Jay" (False)
*   The *.class extension shouldn't be provided
* 6/F - java BirdDisplay.class "Blue Jay" Sparrow (False)
*   The *.class extension shouldn't be provided
* 7/G - Does not compile. (False)
*/
