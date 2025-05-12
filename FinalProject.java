package project;

import java.util.Scanner;

public class FinalProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello! Welcome to Amazon Console Shopping.");
		System.out.println("Please Sign in ");
		System.out.println("Enter your name : ");
		String name = sc.next();
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("Please select category...");
			System.out.println("\ta. Electronics");
			System.out.println("\tb. Fashion");
			System.out.println("\tc. Books");
			System.out.println("\td. Toys and Games");
			System.out.println("Enter your Interest : ");
			char ch = sc.next().charAt(0);
			Character.toLowerCase(ch);
			while (ch < 'a' || ch > 'd') {
				System.out.println("Invalid Choice. Choose again...");
				ch = sc.next().charAt(0);
			}
			if (ch == 'a') {
				a.electronics();
			} else if (ch == 'b') {
				a.fashion();
			} else if (ch == 'c') {
				a.books();
			} else if (ch == 'd') {
				a.toysGames();
			}
			System.out.println("Wanna shop more...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		a.removeFromCart();		
		if(a.getItems()!=0) {
			a.bill();
		}
		System.out.println(name + "...Thank you for Shopping in Amazon.");
		sc.close();
	}

}
