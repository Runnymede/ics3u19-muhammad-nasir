import java.util.Scanner;
/**
 * The following is a temperature converter program. The user is given a choice to either convert from fahrenheit to celsius or from celsius to fahrenheit. The program then does the conversion for the user.
 * 
 * @author 344979026
 *
 */
public class TemperatureConverter {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(
				"To convert from celsius to fahrenheit, please enter f. However, to convert celsius into fahrenheit, please enter c");
		String choice = sc.nextLine();

		if (choice == "f") {
			System.out.println("Please enter the temperature in fahrenheit: ");
			double tempf = sc.nextDouble();

			System.out.println("When converted to celsius, the temperature is: " + fahrenheittocelsius(tempf)
					+ " degrees celsius");

		} else

			System.out.println("Please enter a temperature in celsius: ");
		double tempc = sc.nextDouble();

		System.out.println("When converted to fahreheit, the temperature is: " + celsiustofahrenheit(tempc)
				+ " degrees fahrenheit");

	}

	public static double fahrenheittocelsius(double temp) {

		double celsiusresult = Math.round((temp - 32) * 5 / 9);
		return celsiusresult;
	}

	public static double celsiustofahrenheit(double temp2) {

		double fahrenheitresult = Math.round((temp2 * 9) / 5 + 32);
		return fahrenheitresult;
	}
}
