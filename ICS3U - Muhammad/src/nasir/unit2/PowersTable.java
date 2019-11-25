package nasir.unit2;

public class PowersTable {

	public static void main(String[] args) {

		for (double b = 1; b <= 6; b++) {
			for (double e = 1; e <= 5; e++) {
				int calc= (int)Math.pow(b, e);
				System.out.format("%10s",calc);

			}
		
				System.out.println(" ");
		}
	}
}
