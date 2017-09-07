package exercises;
import javax.swing.JOptionPane;
public class Quarts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quarts; 
		int gallons;
		String job; 
		job = JOptionPane.showInputDialog(null, "How many quarts of paint needed? ", "Quarts needed", JOptionPane.INFORMATION_MESSAGE);
		gallons = Integer.parseInt(job)/4;
		quarts = Integer.parseInt(job)%4;
		JOptionPane.showMessageDialog(null, "The job will take " + gallons + " gallons and " + quarts + " quarts of paint");
	}

}
