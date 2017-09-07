package exercises;

import javax.swing.JOptionPane;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String first;
		String second;
		String third;
		first = JOptionPane.showInputDialog(null, "What is your first initial? ", "Initials", JOptionPane.INFORMATION_MESSAGE);
		second = JOptionPane.showInputDialog(null, "What is your second initial? ", "Initials", JOptionPane.INFORMATION_MESSAGE);
		third = JOptionPane.showInputDialog(null, "What is your third initial? ", "Initials", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your initials are " + first + "." + second + "." );
	}

}
