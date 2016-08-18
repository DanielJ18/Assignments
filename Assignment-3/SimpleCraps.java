package theIronYard;

import java.util.Scanner;

public class SimpleCraps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

	System.out.println("|| Simaple Craps Game  || \n************************* \n");

	boolean playAgain = true;

	while (playAgain == true) {
	    SimpleCraps simpleCraps = new SimpleCraps();
	    simpleCraps.winOrLose();

	    System.out.println("\n\n Enter y to play again :");
	    String input = sc.next();

	    if (input.equals("y") || input.equals("Y")) {
		playAgain = true;
	    }

	    else {
		playAgain = false;
		System.out.println("Game exiting ....");
		break;
	    }

	}

    }

    public void winOrLose() {

	int numberOfRolls = 1;
	int combinedDiceRoll = rollTwoDice();
	System.out.println("  First Roll = " + combinedDiceRoll);

	if (combinedDiceRoll == 7) {
	    System.out.printf("Roll value =  %d .... Congrats ! You hit it right the first time ! ", combinedDiceRoll);
	    System.out.println(" ");

	}

	else if (combinedDiceRoll == 2 || combinedDiceRoll == 3 || combinedDiceRoll == 12) {

	    System.out.printf("Roll value = %d ....sorry, it was a loser ! Game ends now...", combinedDiceRoll);
	    System.out.println(" ");

	}

	while (combinedDiceRoll != 7 && combinedDiceRoll != 2 && combinedDiceRoll != 3 && combinedDiceRoll != 12) {

	    int pointSet = combinedDiceRoll;
	    int subsequentCombinedDiceRoll = rollTwoDice();

	    numberOfRolls++;
	    System.out.print("Roll: " + numberOfRolls + "  ");

	    if (pointSet == subsequentCombinedDiceRoll)

	    {

		System.out.printf("Roll value = %d \n", subsequentCombinedDiceRoll);
		System.out.println("Congrats, you won !");
		System.out.println("~~~~~~~~end~~~~~~~~");
		break;
	    }

	    else if (subsequentCombinedDiceRoll == 7) {

		System.out.printf("Roll value = %d \n", subsequentCombinedDiceRoll);
		System.out.println(" Sorry, you lost !");
		System.out.println("~~~~~~~~end~~~~~~~~");
		break;

	    }

	    else {
		System.out.println("Roll Value = " + subsequentCombinedDiceRoll);

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
						       // between 1-6
	return RollValue;

    }
}
