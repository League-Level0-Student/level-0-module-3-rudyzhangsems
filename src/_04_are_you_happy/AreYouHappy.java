package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String x=JOptionPane.showInputDialog("Are you happy?");
	if (x.equals("yes"))	{
		JOptionPane.showMessageDialog(null, "Keep doing what you are doing");
	}
	if (x.equals("no"))	{
		String y=JOptionPane.showInputDialog("Do you want to be happy?");
			if (y.equals("yes")) {
				JOptionPane.showMessageDialog(null, "change sonething");
			}
			if (y.equals("no"))	{
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
			}
	}
}
}
