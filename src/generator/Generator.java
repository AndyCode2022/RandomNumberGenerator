package generator;

public class Generator {
	public static void main(String[] arg) {
		// Declares a variable with random numbers up to 6
		int random_dice = (int) (Math.random() * 7);
		System.out.println(random_dice);

		// If loop which specifies which number you land on
		if (random_dice == 1) {
			System.out.println("You landed 1!");
		} else if (random_dice == 2) {
			System.out.println("You landed a 2!");
		} else if (random_dice == 3) {
			System.out.println("You landed a 3!");
		} else if (random_dice == 4) {
			System.out.println("You landed a 4!");
		} else if (random_dice == 5) {
			System.out.println("You landed a 5!");
		} else if (random_dice == 0) {
			System.out.println("null");
		} else {
			System.out.println("You are now a master of coding");
		}
	}
}
