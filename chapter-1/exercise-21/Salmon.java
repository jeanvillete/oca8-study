public class Salmon {
	int count;
	public void Salmon() {
		count = 4;
	}
	public static void main(String[] args) {
		Salmon s = new Salmon();
		System.out.println(s.count);
} }

/*
* 1/A - 0 (True)
* 2/B - 4 (False)
* 3/C - Compilation fails on line 3 (False)
* 4/D - Compilation fails on line 4 (False)
* 5/E - Compilation fails on line 7 (False)
* 6/F - Compilation fails on line 8 (False)
*/
