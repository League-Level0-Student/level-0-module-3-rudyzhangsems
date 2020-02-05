//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;
import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot eee= new Robot();
		eee.penDown();
		eee.moveTo(900, 600);
		//3. Ask the user what color they would like the robot to draw
		for (int i = 0; i < 23; i++) {
			String z=JOptionPane.showInputDialog("What color do you want. Red, Orange, yellow, green, blue, pink, gray, cyan, or magenta?");
			//5. Use an if/else statement to set the pen color that the user requested
			if(z.equals("red"))	{
				eee.setPenColor(Color.red);
			}
			else if(z.equals("orange"))	{
				eee.setPenColor(Color.orange);
			}
			else if(z.equals("yellow"))	{
				eee.setPenColor(Color.yellow);
			}
			else if(z.equals("green"))	{
				eee.setPenColor(Color.green);
			}
			else if(z.equals("blue"))	{
				eee.setPenColor(Color.blue);
			}
			else if(z.equals("pink"))	{
				eee.setPenColor(Color.pink);
			}
			else if(z.equals("gray"))	{
				eee.setPenColor(Color.gray);
			}
			else if(z.equals("cyan"))	{
				eee.setPenColor(Color.cyan);
			}
			else if(z.equals("magenta"))	{
				eee.setPenColor(Color.magenta);
			}
	        //6. If the user doesn’t enter anything, choose a random color
			else	{
				eee.setRandomPenColor();
			}
	        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//4. Set the pen width to 10
			eee.setPenWidth(10);
		    //2. Make the robot draw a shape (this will take more than one line of code)
			for (int uop = 0; uop < 4; uop++) {
				eee.setSpeed(100);
				eee.move(100);
				eee.turn(90);
			}
			for (int j = 0; j < 4; j++) {
				eee.setSpeed(100);
				eee.move(100);
				eee.turn(-90);
			}
			for (int lol = 0; lol < 4; lol++) {
				eee.setSpeed(100);
				eee.turn(90);
				eee.move(100);
			}
			for (int oo = 0; oo < 4; oo++) {
				eee.setSpeed(100);
				eee.turn(-90);
				eee.move(100);
				for (int uoop = 0; uoop < 4; uoop++) {
					eee.setSpeed(100);
					eee.move(200);
					eee.turn(90);
				}
				for (int jj = 0; jj < 4; jj++) {
					eee.setSpeed(100);
					eee.move(200);
					eee.turn(-90);
				}
				for (int lool = 0; lool < 4; lool++) {
					eee.setSpeed(100);
					eee.turn(90);
					eee.move(200);
				}
				for (int ooo = 0; ooo < 4; ooo++) {
					eee.setSpeed(100);
					eee.turn(-90);
					eee.move(200);

					}
				}
			}
		}
		
	
}
