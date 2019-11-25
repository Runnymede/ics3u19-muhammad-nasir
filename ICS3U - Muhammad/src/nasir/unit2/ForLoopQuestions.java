package nasir.unit2;
/**
 * The following program performs three functions. 1) It prints out "hello" 10 times. 2) 
 *  
 * @author Muhammad Nasir
 *November 11,2019
 */
	
public class ForLoopQuestions {

	public static void main(String[] args) throws InterruptedException {

		// Entry point of the program
		// First Question:
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello!");
		}

		// Second Question:

		for (int i = 1; i <= 100; i++) {
			int modulas = i % 2;

			if (modulas == 0) {
				System.out.println(i);
			}
		}
		// Third Question:
		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "!");
			Thread.sleep(1000);
		}

		System.out.println("Blast OFF!!!");

	}
}
//End Of Code