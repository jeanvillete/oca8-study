package visitor;
INSERT IMPORTS HERE
public class AquariumVisitor {
	public void admire(Jelly jelly) {} }
	
/*
* Wildcards can only be used at the end of package declarations, and it only brings classes within that package, not from packages under packages.
*
* 1/A - import aquarium.*; (False)
*	As wildcards doesn't turn visible classes underneath packages, in this case, Jelly is not accessible.
* 2/B - import aquarium.*.Jelly; (False)
*	It is not possible supply wildcards between package name and class name.
* 3/C - import aquarium.jellies.Jelly; (True)
*	This is a full class name import, works properly
* 4/D - import aquarium.jellies.*; (True)
*	The wildcard is properly provided at the end of the package declaration, and under it contains the class Jelly, so it works fine.
* 5/E - import aquarium.jellies.Jelly.*; (False)
* 6/F - None of these can make the code compile.
*/