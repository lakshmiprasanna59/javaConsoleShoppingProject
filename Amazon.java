package project;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {

	int bill=0;
	int total_bill=0;
	
	static ArrayList<String> al = new ArrayList<String>();
	static ArrayList<Integer> c = new ArrayList<Integer>();
	
	Scanner sc = new Scanner(System.in);

	public void electronics() {
		System.out.println("Electronics");
		Electronics e = new Electronics();
		String op;
		do {
			System.out.println("Enter in which section you want to Shop...");
			System.out.println("\t1. Mobiles");
			System.out.println("\t2. TV");
			System.out.println("\t3. Cameras");
			System.out.println("\t4. EarPhones");
			System.out.println("Choose your section : ");
			int ch = sc.nextInt();
			while (ch < 1 || ch > 4) {
				System.out.println("Invalid Choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				e.mobiles();
			} else if (ch == 2) {
				e.TV();
			} else if (ch == 3) {
				e.camera();
			} else if (ch == 4) {
				e.earPhones();
			}
			System.out.println("Want to shop again in Electronics section...(Yes/No) ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));
		return;
	}

	public void fashion() {
		System.out.println("Fashion");
		Fashion e = new Fashion();
		String op;
		do {
			System.out.println("Enter in which section you want to Shop...");
			System.out.println("\t1. Clothing");
			System.out.println("\t2. Jewellery");
			System.out.println("\t3. Watches");
			System.out.println("\t4. Beauty");
			System.out.println("Choose your section : ");
			int ch = sc.nextInt();
			while (ch < 1 || ch > 4) {
				System.out.println("Invalid Choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				e.clothing();
			} else if (ch == 2) {
				e.jewellery();
			} else if (ch == 3) {
				e.watches();
			} else if (ch == 4) {
				e.beauty();
			}
			System.out.println("Want to shop again in Fashion section...(Yes/No) ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));
		return;
	}

	public void books() {
		System.out.println("Books");
		Books e = new Books();
		String op;
		do {
			System.out.println("Enter in which Genre you want to Shop...");
			System.out.println("\t1. Thrillers");
			System.out.println("\t2. Comics and Mangwa");
			System.out.println("\t3. Kid's");
			System.out.println("\t4. Romantic");
			System.out.println("Choose your section : ");
			int ch = sc.nextInt();
			while (ch < 1 || ch > 4) {
				System.out.println("Invalid Choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				e.thriller();
			} else if (ch == 2) {
				e.comicsAndManga();
			} else if (ch == 3) {
				e.kids();
			} else if (ch == 4) {
				e.love();
			}
			System.out.println("Want to shop again in Books section...(Yes/No) ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));
		return;
	
	}

	public void toysGames() {
		System.out.println("Toys And Games");
		ToysAndGames e = new ToysAndGames();
		String op;
		do {
			System.out.println("Enter in which Genre you want to Shop...");
			System.out.println("\t1. Electronic Toys");
			System.out.println("\t2. Puzzles");
			System.out.println("\t3. Toy Vehicles");
			System.out.println("\t4. Dolls");
			System.out.println("Choose your section : ");
			int ch = sc.nextInt();
			while (ch < 1 || ch > 4) {
				System.out.println("Invalid Choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				e.electronicToys();
			} else if (ch == 2) {
				e.puzzles();
			} else if (ch == 3) {
				e.toyVehicles();
			} else if (ch == 4) {
				e.dolls();
			}
			System.out.println("Want to shop again in Toys And Games section...(Yes/No) ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));
		return;
	
	}
	
	public void bill() {
		bill++;
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Bill No. "+bill);
		System.out.println("No of Items : "+getItems());
		System.out.println("------------------------------------------------------------------------------");
		for(int i=0;i<al.size();i++) {
			System.out.println((i+1)+" " +al.get(i)+" => "+c.get(i));
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Total price : "+getBill());
	}

	public int getItems() {
		return al.size();
	}

	public int getBill() {
		total_bill=0;
		for(int i=0;i<al.size();i++) {
			total_bill = total_bill + c.get(i);
		}
		return total_bill;
	}

	public void addToCart(String string, int cost) {
		al.add(string);
		c.add(cost);
	}

	public void removeFromCart() {
		System.out.println("Do you want to remove any item from cart...(Yes/No)");
		String p = sc.next();
		while(p.equalsIgnoreCase("yes")) {
			for(int i=0;i<al.size();i++) {
				System.out.println((i+1)+" " +al.get(i)+" => "+c.get(i));	
			}
			System.out.println("Which serial number product do you wanna delete...");
			int s = sc.nextInt();
			if(s>0 && s<=al.size()) {
				al.remove(s-1);
				c.remove(s-1);
			} else {
				System.out.println("Invalid number");
			}
			System.out.println("Do you want to remove another product...(Yes/No)");
			p = sc.next();
		}
	}
	
	
	
	
}
