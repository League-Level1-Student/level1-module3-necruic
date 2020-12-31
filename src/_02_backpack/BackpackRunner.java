package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack backpack = new Backpack();
		backpack.putInBackpack(new Pencil());
		backpack.putInBackpack(new Ruler());
		backpack.putInBackpack(new Textbook());
		backpack.packAndCheck();
	}
}
