package tutorial;
import javax.swing.JOptionPane;
public class Pg90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String wageString;
		String dependentString;
		String hoursWorkedString; 
		int dependents;
		double wage, weeklyPay;
		double HOURS_IN_WEEK = 37.5;
		hoursWorkedString = JOptionPane.showInputDialog(null, "How many hourse did you work this week? ", "Hourly Wage Dialog", JOptionPane.INFORMATION_MESSAGE);
		wageString = JOptionPane.showInputDialog(null, "Enter employee's hourly wage", "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
		weeklyPay = Double.parseDouble(wageString) * HOURS_IN_WEEK;
		dependentString = JOptionPane.showInputDialog(null, "How many dependents?", "Salary dialog 2", JOptionPane.QUESTION_MESSAGE);
		dependents = Integer.parseInt(dependentString);
		JOptionPane.showMessageDialog(null,  "Weekly salary is $ " + weeklyPay + " /nDeductions will be made for " + dependents + " dependents");
	}

}
