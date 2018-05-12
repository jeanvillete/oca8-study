public class WaterBottle {
	private String brand; // null
	private boolean empty; // false
	
	public static void main(String[] args) {
		WaterBottle wb = new WaterBottle();
		System.out.print("Empty = " + wb.empty);
		System.out.print(", Brand = " + wb.brand);
} }

/*
* Output; Empty = false, Brand = null
* 1/A - Line 6 generates a compiler error (False)
* 2/B - Line 7 generates a compiler error (False)
* 3/C - There is no output (False)
* 4/D - Empty = false, Brand = null (True)
* 5/E - Empty = false, Brand = (False)
* 6/F - Empty = null, Brand = null
*/