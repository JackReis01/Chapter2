package exercises;

import javax.swing.JOptionPane;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dozen; 
		int loose;
		String order;
		double sum; 
		
		order = JOptionPane.showInputDialog(null, "How many quarts of paint needed? ", "Quarts needed", JOptionPane.INFORMATION_MESSAGE);
		dozen = Integer.parseInt(order)/12;
		loose = Integer.parseInt(order)%12;
		sum = (dozen * 3.25) + (loose * .45);
		JOptionPane.showMessageDialog(null, "You ordered " + order + " eggs. That's "+ dozen + " dozen at 3.25 per dozen and " + loose + " at 45 cents each for a total of " + sum + " dollars.");
	}

}
