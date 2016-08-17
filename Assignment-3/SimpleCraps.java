package theIronYard;

public class SimpleCraps {

    public static void main(String[] args) {

	SimpleCraps simpleCraps = new SimpleCraps();

	System.out.println("|| Simaple Craps Game  || \n************************* \n");
	
	

	simpleCraps.rulesOfTheGame();

    }

    public void rulesOfTheGame() {

	int combinedDiceRoll = rollTwoDice();

	if (combinedDiceRoll == 7) {
	    System.out.printf("Roll is %d ! Winner !", combinedDiceRoll);

	}

	if (combinedDiceRoll == 2 || combinedDiceRoll == 3 || combinedDiceRoll == 12) {

	    System.out.printf("Roll is %d ....sorry, it was a loser ! Game ends now...", combinedDiceRoll);

	}

	while (combinedDiceRoll != 7 && combinedDiceRoll != 2 && combinedDiceRoll != 3 && combinedDiceRoll != 12) {

	    int pointSet = combinedDiceRoll;
	    int subsequentCombinedDiceRoll = rollTwoDice();

	    System.out.printf("Point is set @  %d and subsequent roll is %d", pointSet, subsequentCombinedDiceRoll);
	    System.out.println(" ");

	    if (pointSet == subsequentCombinedDiceRoll)

	    {
		System.out.printf("Winner !! ", subsequentCombinedDiceRoll);
		break;
	    }

	    if (subsequentCombinedDiceRoll == 7) {
		System.out.printf("Loser !! ", subsequentCombinedDiceRoll);
		break;

	    }

	}

	

    }

    // Method to determine the value for the first and second roll and adding
    // the value returning the sum
    public int rollTwoDice() {
	int firsrtDiceRoll = rollDice();
	int secondDiceRoll = rollDice();

	int combinedDiceRoll = firsrtDiceRoll + secondDiceRoll;

	return combinedDiceRoll;

    }

    // method to generate random number between 1 and 6
    public int rollDice() {
	int RollValue = 1 + (int) (Math.random() * 6); // generates random value
						       // between 1 -6
	return RollValue;

    }
}
