import java.util.List;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
	}
}

/*
* 1 - [8] (False)
* 2 - [9] (True)
* 3 - Something like [Ljava.lang.String; @160bc7c0 (False)
* 4 - An exception is thrown (False)
* 5 - The code does not compile (False)
*/
