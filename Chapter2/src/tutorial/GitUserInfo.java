package tutorial;
import java.util.Scanner;
public class GitUserInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int age;
		
		Scanner inputDevice = new Scanner(System.in);
		System.out.println("please enter your name >>>>");
		name = inputDevice.nextLine();
		System.out.println("please enter your age >>>>");
		age = inputDevice.nextInt();
		
		System.out.println("Your name is " + name + " and you are " + age + " years old");
	}

}
