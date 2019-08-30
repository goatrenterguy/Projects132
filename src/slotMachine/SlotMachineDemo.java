/*Ben Guericke
 * CSCI 132
 * 2-1-2019
 */
package slotMachine;

public class SlotMachineDemo {

	public static void main(String[] args) {
		//Creates a new instance of SlotMachine
		SlotMachine s = new SlotMachine();
		//Starts the game with full user input
		s.start();
		//Runs the game a millions times with default bet of 1 and prints last game and the total end balance balance
		s.spin(1000000);
	}

}
