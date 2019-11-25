package nasir.unit2;
/**
 * 
 * @author 344979026
 *
 */

public class DiceRolls {

	public static void main(String[] args) {
		System.out.format("%-10s %8s %8s", "Dice 1", "Dice 2", "Total");
		for (int rolls = 0; rolls <= 5; rolls++) {
			if (rolls == 5) {
				break;
			}
			int roll1 = (int) (Math.random() * 6 + 1);
			int roll2 = (int) (Math.random() * 6 + 1);
			int total = roll1 + roll2;
			System.out.format("\n%-10s %8s %8s", roll1, roll2, total);
		}

	}

}
