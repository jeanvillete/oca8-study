class Main {
	public static void main(String[] args) {
	
		short numPets = 5;
		int numGrains = 5.6;
		String name = "Scruffy";
		numPets.length();
		numGrains.length();
		name.length();
} }

/*
* 1/A - Line 4 generates a compiler error (False)
* 2/B - Line 5 generates a compiler error (True)
* 	A compiler error is raised, and claims about a possible lossy conversion from double to int
*	It would be possible cast this value with the statement "int numGrains = (cast) 5.6;", in this case only the integer value (5) would be assigned the variable numGrains.
* 3/C - Line 6 generates a compiler error (False)
* 4/D - Line 7 generates a compiler error (True)
*	Primitive variables doen't have methods neither nested properties; short cannot be dereferenced
* 5/E - Line 8 generates a compiler error (True)
*	Primitive variables doen't have methods neither nested properties; int cannot be dereferenced
* 6/F - Line 9 generates a compiler error (False)
* 7/G - The code compiles as is (False)
*/