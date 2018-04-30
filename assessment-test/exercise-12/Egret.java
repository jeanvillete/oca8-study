public class Egret {
	private String color;
	public Egret() {
		this("white");
	}
	public Egret(String color) {
		color = color; //the operator this was missed here, so the this.color property has not been initialized.
	}
	public static void main(String[] args) {
		Egret e = new Egret();
		System.out.println("Color:" + e.color);
	}
}

/**
* 1 - Color:  (False)
* 2 - Color:null (True)
* 3 - Color:White (False)
* 4 - Compiler error on line 4 (False)
* 5 - Compiler error on line 10 (False)
* 6 - Compiler error on line 11 (False)
*/
