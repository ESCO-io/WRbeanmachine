import java.util.Scanner;
public class WyattBeanMachine {
	public static void main(String[] args) {
		System.out.println("Welcome to the Bean Machine!");
		
		/* This code simulates a bean machine game.
		 * It asks the user of how many beans they
		 * would like to drop. It also asks how
		 * many boxes the beans are allowed
		 * to drop into and then displays them.
		 */ 

		// Ask the user how many beans they want to drop.
			Scanner input = new Scanner(System.in);
		System.out.print("How many beans do you want to drop?");
		int Beans = input.nextInt();

		// Ask the user how many boxes they want to allow
		// the beans to fall into.
		System.out.println("How many containers?");
		int Containers = input.nextInt();

		//Prompts the user to use a number higher than 1
		while(Containers < 1 ){
			System.out.println("Please choose to use more than 1 bean.");
			Containers = input.nextInt();}
		
		// Creates an integer for the Containers
		int [] Array_of_Container = new int[Containers];
		// Calls the Method back to use.
		Array_of_Container = Fill_Container_Array(Containers, Beans, Array_of_Container);

		// Displays the the amount of beans found in each container. 
		for(int i = 0; i < Containers; i++){
			System.out.println("There are " + Array_of_Container[i] + " beans in Container Number " + (i+1));
		}}

	//Custom Method and Array combo that computes the where the beans randomly fall.
	public static int[] Fill_Container_Array(int Container_Count, int Bean_Count, int[]Array_of_Container){
		for(int Bean_Number = 1; Bean_Number <= Bean_Count; Bean_Number = Bean_Number +1){
			int Lefts = 0;
			int TheContainer = 0;
			for(int layerCount = 1; layerCount < Container_Count; layerCount = layerCount + 1){
				double LR = Math.random();
				if(LR < 0.5){
					Lefts = Lefts + 1;}}
			TheContainer = Container_Count - Lefts - 1 ;
			Array_of_Container[TheContainer] = Array_of_Container[TheContainer] +1;}
		return Array_of_Container;}}
