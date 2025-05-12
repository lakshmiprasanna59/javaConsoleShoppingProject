package project;

import java.util.Scanner;

public class ToysAndGames {

	Scanner sc = new Scanner(System.in);

	public void electronicToys() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. SUPER TOY 8.5 Inch LCD Writing Pad..... 249/-");
			System.out.println("\tBrand...		SUPER TOY");
			System.out.println("\tSpecial Feature...	Extra Slim, Lightweight, Erase Button");
			System.out.println("\tModel Name... 	T11");
			System.out.println("\tScreen Size...	8.5 Inches");
			System.out.println("\tSpecific Uses For Product...  	Drawing, Writing");

			System.out.println("2. VGRASSP Walkie Talkie Toys..... 385/-");
			System.out.println("\tBrand...		VGRASSP");
			System.out.println("\tColour... 	Yellow");
			System.out.println("\tNumber of Channels... 	1");
			System.out.println("\tSpecial Feature...	Lightweight");
			System.out.println("\tFrequency Range...	27 Mhz");

			System.out.println("3. Galaxy Hi-Tech® Deformation Combat Electronic Robot Car Tank..... 588/-");
			System.out.println("\tPerfect electric models gift for kids");
			System.out.println("\tLight and sound");
			System.out.println("\tThe toy emits amazing bright lights with music.");
			System.out.println("\tColorful design, flashing lights, and realistic engine and acceleration sounds");
			System.out.println("\tItem Type Name...		 Car Toy");

			System.out.println("4. Wembley Kids Digital Camera  ..... 1979/-");
			System.out.println("\tBrand...		Wembley");
			System.out.println("\tMaximum Webcam Image Resolution...	1080 MP");
			System.out.println("\tModel Name... 	FS11");
			System.out.println("\tAspect Ratio...		1.27:1");
			System.out.println("\tCompatible Mountings...		Canon EF");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("SUPER TOY 8.5 Inch LCD Writing Pad", 249);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("VGRASSP Walkie Talkie Toys", 385);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Galaxy Hi-Tech® Deformation Combat Electronic Robot Car Tank", 588);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Wembley Kids Digital Camera  ", 1979);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Electronic Toys Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void puzzles() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Imagimake Kid's Mapology..... 899/-");
			System.out.println("\tBrand...		Imagimake");
			System.out.println("\tPuzzle type... 	Knob and Pegged");
			System.out.println("\tMinimum Manufacturer Age Recommended... 		60.00");
			System.out.println("\tNumber of Pieces... 		2");
			System.out.println("\tProduct Dimensions... 	46L x 33W Centimeters");

			System.out.println("2. PERPLEXUS Spin Master Games..... 1,099/-");
			System.out.println("\tBrand...		PERPLEXUS");
			System.out.println("\tMinimum Manufacturer Age Recommended...	48.0");
			System.out.println("\tNumber of Pieces... 		1");
			System.out.println("\tProduct Dimensions... 	17.8L x 17.8W Centimeters");
			System.out.println("\tTheme...  	Season");

			System.out.println("3. Storio Cubes 3X3 High Speed.... 98/-");
			System.out.println("\tBrand...		Storio");
			System.out.println("\tPuzzle type... 	Sequential Movement");
			System.out.println("\tMinimum Manufacturer Age Recommended... 		3.0");
			System.out.println("\tNumber of Pieces... 		1");
			System.out.println("\tProduct Dimensions... 	5.6L x 5.6W Centimeters");

			System.out.println("4. Butterfly EduFields Magnetic Shapes Puzzles ..... 499/-");
			System.out.println("\tBrand...		Butterfly EduFields");
			System.out.println("\tPuzzle type... 	Puzzle Box");
			System.out.println("\tMinimum Manufacturer Age Recommended... 		24.00");
			System.out.println("\tNumber of Pieces... 		27");
			System.out.println("\tProduct Dimensions... 	10L x 8W Centimeters");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Imagimake Kid's Mapology", 899);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("PERPLEXUS Spin Master Games", 1099);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Storio Cubes 3X3 High Speed", 98);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Butterfly EduFields Magnetic Shapes Puzzles ", 499);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Puzzles Toys Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void toyVehicles() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Hot Wheels 5-Car Pack..... 880/-");
			System.out.println("\tBrand...		Hot Wheels");
			System.out.println("\tColour & design of the car may vary");
			System.out.println("\tIncludes five Hot Wheels vehicles with genuine die-cast parts.");
			System.out.println("\t1:64-scale with authentic styling and eye-catching decos");
			System.out.println("\tKids can collect their favorites and trade with friends");

			System.out.println("2. BOOGYWOOGY Vande Bharat Express Toy Train Set..... 2,490/-");
			System.out.println("\tBrand...		PERPLEXUS");
			System.out.println("\tNumber of Puzzle Pieces... 	‎91");
			System.out.println("\tBatteries Required... 	‎Yes");
			System.out.println("\tMaterial Type(s)... 		‎Polypropylene");
			System.out.println("\tRemote Control Included?...	‎No");

			System.out.println("3. Cable World Plastic Battery Operated Converting Car to Robot.... 399/-");
			System.out.println("\tModel Number...		‎Cable World®");
			System.out.println("\tAssembly Required... 		‎No");
			System.out.println("\tBatteries Required... 	‎Yes");
			System.out.println("\tNumber of Pieces... 		1");
			System.out.println("\tMaterial Type(s)...		‎Acrylonitrile Butadiene Styrene, Rubber");

			System.out.println("4. Graphene Airplane Launcher Gun..... 299/-");
			System.out.println("\tElevated Outdoor Play");
			System.out.println("\tSafe and Fun Shooting");
			System.out.println("\tPaper Foam Gliders");
			System.out.println("\tDurable Construction");
			System.out.println("\tAir Warrior Adventures");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Hot Wheels 5-Car Pack", 880);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("BOOGYWOOGY Vande Bharat Express Toy Train Set", 2490);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Cable World Plastic Battery Operated Converting Car to Robot", 399);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Graphene Airplane Launcher Gun", 299);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in toy Vehicles Toys Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void dolls() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Toyshine Big Size Wooden DIY Doll House ..... 1281/-");
			System.out.println(
					"\tDIY: Kids can create the doll house in different ways. Decoration can be changed, furniture can be moved.");
			System.out.println("\tStrong Material");
			System.out.println("\tSize... 	63cm x36 cm");
			System.out.println("\tColor... 	 Multicolor");
			System.out.println("\tMaterial... 	 Wood");

			System.out.println("2. EL FIGO Cute Little Boy..... 339/-");
			System.out.println("\tBrand...		EL FIGO");
			System.out.println("\tNumber of Pieces... 	‎1");
			System.out.println("\tBatteries Required... 	‎No");
			System.out.println(
					"\tMaterial Type(s)... 		‎Wash boy doll dress normally by hand., Body of Toy Can Be Wiped With Clean Dry / Wet Cloth as required, Dress is easily removable.");
			System.out.println("\tProduct Dimensions... 	‎15 x 16 x 31 cm; 325 g");

			System.out.println("3. Barbie Blonde Pop en Reisset met Accessoires.... 1958/-");
			System.out.println("\tToys and Games");
			System.out.println(
					"\tBarbie doll has luggage (a roller suitcase, backpack and pet bag), travel items (like a sleep mask and neck pillow), necessities (like snacks, toothpaste and a cell phone) and more");
			System.out.println(
					"\tBarbie doll and her puppy are ready for an adventure around the world with this travel set that includes more than 10 accessories");
			System.out.println("\tNumber of Pieces... 		14");

			System.out.println("4. Ratna's Storewell Toy..... 249/-");
			System.out.println("\tManufacturer... 		‎Ratna's");
			System.out.println("\tScale... 		‎1:12 Scale");
			System.out.println("\tBatteries Required... 	‎No");
			System.out.println("\tProduct Dimensions... 	‎10 x 5 x 15 cm; 160 g");
			System.out.println("\tCountry of Origin... 		‎India");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Toyshine Big Size Wooden DIY Doll House ", 1281);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("EL FIGO Cute Little Boy", 339);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Barbie Blonde Pop en Reisset met Accessoires", 1958);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Ratna's Storewell Toy", 249);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in toy Doll Toys Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

}
