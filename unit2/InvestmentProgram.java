package nasir.unit2;

/**
 * The following program calculates the amount of years it will take for a $2500
 * investment to be worth at least $5000.
 * 
 * @author Muhammad Nasir October 30,2019
 */
public class InvestmentProgram {

	public static void main(String[] args) {

		double investment = 2500;
		int time = 0;

		while (investment <= 5000) {

			double add = 0.075 * investment;

			investment += add;

			time++;
		}

		System.out.println("It will take " + time + " years for the investment to be worth atleast $5000");

	}

}
