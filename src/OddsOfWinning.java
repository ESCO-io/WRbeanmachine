public class OddsOfWinning {
	public static void main(String[] args) {
		System.out.println("Luck of the draw");

		/* Use For loops and/or While loops to make 
		 * a Monte Carlo simulation to make a selection
		 * between two options of an idealized model.
		 */

		/* I want to know if I'm going to get more
		 * bang for my buck playing on scratchers vs
		 * playing the mega millions.
		 * 
		 * I will buy 1 ticket everyday for 10 years
		 * and I make a bet with my friend that everytime
		 * I lose I will give him $7 because thats my lucky
		 * number and I feel lucky.
		 * 
		 * Scratcher 
		 * odds of winning: 1/2,000(~0.0005)
		 * price: $5
		 * 
		 * Mega Millions ticket 
		 * odds of winning: 1/176,000,000 (~0.000000006)
		 * price: $1
		 */

		// Scratcher
		int ScratcherCost = 5;
		double ScratcherOddsOfWinning = 0.0005;
		double ScratcherlossLimit = 1.0 - ScratcherOddsOfWinning;

		// Mega Millions
		int MegaMillionsCost = 1;
		double MegaMillionsOddsOfWinning = 0.000000006;
		double MMLossLimit = 1.0 - MegaMillionsOddsOfWinning;

		// Total number of tickets
		int numberOftickets = 3650;

		// Cost per loss
		int costPerloss = 7;

		// Scratcher loss
		int ScratcherLoss = 0;

		// Day counter
		for( int dayCounterone = 0; 
				dayCounterone < ((10*365) + 1); 
				dayCounterone = dayCounterone +1){

			// Generate random number
			double scratcherPossibleloss = Math.random();

			// Did the scratcher lose
			if(scratcherPossibleloss < ScratcherlossLimit){
				ScratcherLoss = ScratcherLoss + 1;
			}
		}
		System.out.println("Scratcher related LOSSES in 10 years: "
				+ ScratcherLoss);

		int ScratchertotalCost = ScratcherLoss*costPerloss + 
				ScratcherCost*numberOftickets;
		System.out.println("Scratcher TOTAL cost over 10 years: " + 
				ScratchertotalCost);

		// MegaMillions loss
		int MMLoss = 0;

		// Day counter
		for( int dayCountertwo = 0; 
				dayCountertwo < ((10*365) + 1); 
				dayCountertwo = dayCountertwo +1){

			// Generate random number
			double MMPossibleloss = Math.random();

			// Did the MM ticket lose
			if(MMPossibleloss < MMLossLimit){
				MMLoss = MMLoss + 1;
			}
		}
		System.out.println("Mega Millions related LOSSES in "
				+ "10 years: " + MMLoss);

		int MMtotalCost = MMLoss*costPerloss + 
				MegaMillionsCost*numberOftickets;
		System.out.println("Mega Millions TOTAL cost over 10 "
				+ "years: " + MMtotalCost);
	}
}