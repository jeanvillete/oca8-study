package employee;
INSERT IMPORT HERE
public class WaterFilter {
	Water water;
}

/*
* It is not possible have the same class name on import statement section, also, the class name conflict resolution on "import statement section" has to be done by the programmer.
* If wildcard is used for importing packages, and different packages have the same class name (class name used on the current class/file), a full class name (full package along side the class name) has to be provided for name conflict resolution.
*
* 1/A - import aquarium.*; (True)
*	In this case, the available class would be "aquarium.Water"
* 2/B - import aquarium.Water; import aquarium.jellies.*; (True)
*	In this case, the available class on the instance WaterFilter.water property would be "aquarium.Water"
* 3/C - import aquarium.*; import aquarium.jellies.Water; (True)
*	In this case, the available class on the instance WaterFilter.water property would be "aquarium.aquarium.Water"
* 4/D - import aquarium.*; import aquarium.jellies.*; (False)
*	It fails, because a conflict of a refered class name Water would occur.
* 5/E - import aquarium.Water; import aquarium.jellies.Water; (False)
*	It fails, because it is not possible have a conflict on class name on import statement section.
* 6/F - None of these imports can make the code compile. (False)
*/