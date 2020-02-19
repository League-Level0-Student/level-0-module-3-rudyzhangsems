//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String walter=JOptionPane.showInputDialog("Do you like banananananananananas?");
		if(walter.equals("yes"))	{
			String alfred=JOptionPane.showInputDialog("What is your favorite hobby?");
			JOptionPane.showMessageDialog(null, alfred + " is a lot worse than banananananananananas.");
		}
		else	{
			JOptionPane.showMessageDialog(null, "You suck");
			System.exit(0);
		}
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}

}
