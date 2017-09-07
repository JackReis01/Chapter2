package youDoIt;
import java.util.Scanner;
public class Pg84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt;
		byte aByte;
		short aShort;
		long aLong;
		String name;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name>>");
		name = input.nextLine();
		System.out.print("Please enter an integer>>");
		anInt = input.nextInt();
		System.out.print("Please enter a byte>>");
		aByte = input.nextByte();
		System.out.print("Please enter a short>>");
		aShort = input.nextShort();
		System.out.print("Please enter a long integer>>");
		aLong = input.nextLong();
		
		
		System.out.println("The int is " + anInt);
		System.out.println("The int is " + aByte);
		System.out.println("The int is " + aShort);
		System.out.println("The long is " + aLong);
		System.out.println("Thank you " + name);
	}

}
