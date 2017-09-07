package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color;
		String wordEst;
		String bodyPartPlural;
		String AnAnimal, aNoun, pluralNoun;
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a color >>");
		color = input.nextLine();
		System.out.print("Enter a word ending in est >>");
		wordEst = input.nextLine();
		System.out.print("Enter a body part plural >>");
		bodyPartPlural = input.nextLine();
		System.out.print("Enter an animal >>");
		AnAnimal = input.nextLine();
		System.out.print("Enter a noun >>");
		aNoun = input.nextLine();
		System.out.print("Enter a plural noun >>");
		pluralNoun = input.nextLine();
		System.out.print("Enter an integer >>");
		a = input.nextInt();
		System.out.print("Enter another integer >>");
		b = input.nextInt();
		c = a - b;
		
		System.out.println("The "+ color + " Dragon is the "+ wordEst + " Dragon of all. It has " + bodyPartPlural + ", and a " + AnAnimal + " shaped like a "+ aNoun + " It loves to eat "+ pluralNoun + " although it will feast on nearly anything.");
		
	}

}
