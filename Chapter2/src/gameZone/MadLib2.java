package gameZone;
import javax.swing.JOptionPane;
public class MadLib2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first;
		String second;
		String third;
		String fourth;
		String fifth;
		
		first = JOptionPane.showInputDialog(null, "Enter a thing.", "Mad lib", JOptionPane.INFORMATION_MESSAGE);
		second = JOptionPane.showInputDialog(null, "Enter a thing. ", "Mad Lib", JOptionPane.INFORMATION_MESSAGE);
		third = JOptionPane.showInputDialog(null, "Enter a Describing word", "Mad Lib", JOptionPane.INFORMATION_MESSAGE);
		fourth = JOptionPane.showInputDialog(null, "Enter an action.", "Mad Lib", JOptionPane.INFORMATION_MESSAGE);
		fifth = JOptionPane.showInputDialog(null, "Enter first word again", "Mad Lib", JOptionPane.INFORMATION_MESSAGE);
		
		
		
		JOptionPane.showMessageDialog(null, "Mary had a little " + first + " It's " + second + " was " + third + " as snow And every where that Mary " + fourth + " The " + fifth + " was sure to go.");
	}

}
