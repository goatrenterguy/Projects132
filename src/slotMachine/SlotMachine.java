/*Ben Guericke
 * CSCI 132
 * 2-1-2019
 */
package slotMachine;

import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
	//Initialize variables
	private static int nums[] = new int[3];
	private static Scanner input = new Scanner(System.in);
	private static int bet = 1;
	private static int balance = 100;
	private static int reward;

	// Generates random number for spin
	public static void spin() {
		Random rand = new Random();
		for (int i = 0; i < 3; i++) {
			nums[i] = rand.nextInt(7) + 1;
		}
	}

	// Takes in the number of spins and runs the game that many times
	public void spin(int times) {
		//Sets bet back to default value of 1
		bet = 1;
		//Loops through the number of times that the the spin was called
		for (int x = 0; x < times; x++) {
			Random rand = new Random();
			for (int i = 0; i < 3; i++) {
				nums[i] = rand.nextInt(7) + 1;
			}
			//Calls the calcReward method to calculate the reward and value of the spin
			calcReward();
		}
		//Calls print everything at the end
		printEverything();
	}

	// Checks the roll for
	private static int checkRoll() {
		int multiplier;
		//Sets multiplier to 1 if the first two numbers match
		if (nums[0] == nums[1] && nums[0] != nums[2]) {
			multiplier = 1;
		} 
		//Sets multiplier to 5 if all numbers 
		else if (nums[0] == nums[1] && nums[0] == nums[2]) {
			multiplier = 5;
		//Sets multiplier to 0 if there are no matches
		} else {
			multiplier = 0;
		}
		return multiplier;
	}
	//Start method that prints into message and sets up the game
	public void start() {
		System.out.println("Welcome to Dragons of Thunder Slots\nYou have $100 to Start.\nEnter -1 to cashout \n");
		bet();
		spin();
		calcReward();
		printEverything();
		replay();
	}
	//Prompts user for about to be and prints the amount won/lost
	private static void bet() {
		System.out.println("Bet Amount:");
		bet = input.nextInt();
		//Checks if user wants to cashout
		if (bet == -1) {
			System.out.println("You lost/won: $" + (balance - 100));
		}
		balance -= bet;
	}
	//Calculates the amount won or lost
	private static void calcReward() {
		reward = bet * checkRoll() * nums[0];
		balance += reward;

	}
	//Prompts user if they want to play the game again
	private static void replay() {
		System.out.println("Do you want to try again? (Enter \"Y\" to contiue or \"N\" to stop)");
		String command;
		command = input.next().toLowerCase();
		if (command.contains("y")) {
			bet();
			spin();
			calcReward();
			printEverything();
			replay();
		}
	}
	//Prints the spin, amount won, and balance
	private static void printEverything() {
		System.out.println("+---+---+---+");
		System.out.println("| " + nums[0] + " | " + nums[1] + " | " + nums[2] + " | ");
		System.out.println("+---+---+---+");
		System.out.println("Won: $" + reward);
		System.out.println("Balance: $" + balance);
	}
}
