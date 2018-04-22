public class Main {
	public static void main(String... args) {
		String s1 = "Java";
		String s2 = "Java";
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(sb1.toString() == s1);
		System.out.println(sb1.toString().equals(s1));
	}
}

/**
* true is printed out exactly three times.
*
* 1 - The class StringBuilder is upon "java.lang" package, so it is part of the java language (as the String class and plenty of others) so there's no need to declare it as import statements.
* 2 - The literal String value "Java" is interpreted by the JVM and an object is instanciated only once, so there's only one reference even we have declared two variables with the literal "Java" more than once.
* 3 - The line 10, on the operation "sb1.toString()" generates a String object that in turns has its own object reference, and even the resulting String is equals the String variable reference s1, the operator == compares references, which in this case are different.
*/
