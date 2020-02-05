//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _03_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(1000000001);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for (int i = 0; i < 35; i++) {
			String guess=JOptionPane.showInputDialog("Guess a number between 1 and 1 billion.");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int ran=Integer.parseInt(guess);
			// 5. if the guess is correct
			if(ran == random)	{
				JOptionPane.showMessageDialog(null, "You win");
				System.exit(0);
			}
			else if(ran>random)	{
				JOptionPane.showMessageDialog(null, "too high");
			}
			else 	{
				JOptionPane.showMessageDialog(null, "too low");
			}
		}
			JOptionPane.showMessageDialog(null, "you lose");
			System.exit(0);
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}


