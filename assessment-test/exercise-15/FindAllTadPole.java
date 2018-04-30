public interface CanSwim {}
public class Amphibian implements CanSwim {}
class Tadpole extends Amphibian {}
public class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for( Amphibian amphibian : tadpoles ) {
			__________ tadpole = amphibian;
} } }

/**
* 1 - CanSwim (True)
* 2 - Long (False)
* 3 - Amphibian (True)
* 4 - Tadpole (False)
* 	It's not possible assign a Generic type to a more Specific one, once there's no guarantee that the Generic instance is the type related to the more Specific one
* 5 - Object (True)
* 	Any instance can be assigned to a Object type variable, once actually, any class/instance on Java extends from Object.
*/
