<<<<<<< HEAD
import java.util.Scanner;
public class BeanMachine {
	public static void main(String[] args) {
			System.out.println("Welcome to the Bean Machine!");

			
			
			
			
			
			
}}
=======
// import scanner
import java.util.Scanner;
public class BeanMachine {
	public static void main(String[] args) {
		System.out.println("Welcome to THE Bean Machine!");

		// GREET USER
		/* Hello user, this is a game called the bean machine.
		 * The way you play is you drop however many balls you choose 
		 * in through the top of the machine and it trickles down 
		 * through the pegs finally falling into one random bin out
		 * of however many bins you choose.
		 */

		// GET USER INPUT
		Scanner input = new Scanner(System.in);
		// ask user for how many balls and bins to play with
		System.out.print("\nChoose the # of beans you would like to drop: ");
		int numOFbeans = input.nextInt();

		System.out.println("Choose the # of bins the beans can fall into (min = 1 bin):  ");
		int numOFbowls = input.nextInt();

		while(numOFbowls <2){
			System.out.println("A number above 1, cmon!");
			numOFbowls = input.nextInt(); 
		}
		// MORE EXECUTION
		// We must fill up all of the bowls by calling the FillBowlArray
		int [] bowlArray = new int[numOFbowls];
		bowlArray = FillBowlArray(numOFbowls, numOFbeans, bowlArray);

		for(int i = 0; i <numOFbowls; i++){
			// RESULTS
			// print the results
			System.out.println("There are " + bowlArray[i] + " beans in the " + (i+1) + "(st/th) bowl.");
		}
		System.out.println("Thanks for playing!");
	}
	// EXECUTE
	// The custom method that figures out what balls go into what corresponding bowl.
	public static int[] FillBowlArray(int numOFbowls, int numOFbeans, int[]bowlArray){
		for(int beanNumber = 1; beanNumber <= numOFbeans; beanNumber = beanNumber +1){
			int leftCount = 0;
			int correspondingBowl = 0;
			for(int layerCount = 1; layerCount < numOFbowls; layerCount = layerCount + 1){
				double LorRrandNumber = Math.random();
				if(LorRrandNumber<0.5){
					leftCount = leftCount + 1;
				}
			}
			correspondingBowl = numOFbowls - leftCount - 1 ;
			bowlArray[correspondingBowl] = bowlArray[correspondingBowl] +1;

		}
		return bowlArray;
	}
}
>>>>>>> rogerBEANmachine
