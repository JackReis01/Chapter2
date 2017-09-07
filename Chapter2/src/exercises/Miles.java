package exercises;

import javax.swing.JOptionPane;

public class Miles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilometers; 
		double miles;
		String nautical; 
		nautical = JOptionPane.showInputDialog(null, "How many nautical miles? ", "Nautical miles", JOptionPane.INFORMATION_MESSAGE);
		miles = Double.parseDouble(nautical)*1.150779;
		kilometers = Double.parseDouble(nautical)* 1.852;
		JOptionPane.showMessageDialog(null, "It is " + miles + " miles or " + kilometers + " kilometers.");
	}

}
