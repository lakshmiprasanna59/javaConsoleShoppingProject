package project;

import java.util.Scanner;

public class Fashion {

	Scanner sc = new Scanner(System.in);

	public void clothing() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Leriya Fashion T-Shirt For Men..... 399/-");
			System.out.println("\tMaterial...	 compositionPolycotton");
			System.out.println("\tPattern...	Solid");
			System.out.println("\tFit type... 	Oversized Fit");
			System.out.println("\tCollar style... 	Polo Collar");
			System.out.println("\tCountry of Origin... 	India");

			System.out.println("2. Urbano Fashion Men's Slim Fit Washed Jeans..... 629/-");
			System.out.println("\tMaterial type... 	Cotton Blend");
			System.out.println("\tStyle... 		Jeans");
			System.out.println("\tClosure type...	 Button and zip");
			System.out.println("\tCare instructions... 	Machine Wash");
			System.out.println("\tCountry of Origin... 	India");

			System.out.println("3. GoSriKi Women's Cotton Blend Embroidered Straight Kurta... 669/-");
			System.out.println("\tMaterial composition... 	90% Rayon, 10% Cotton");
			System.out.println("\tSleeve type... 	3/4 Sleeve");
			System.out.println("\tNeck style...		Round Neck");
			System.out.println("\tPattern... 	Floral");
			System.out.println("\tCountry of Origin... 	India");

			System.out.println("4. GRECIILOOKS Polycotton Co-Ord Set For Women... 599/-");
			System.out.println("\tMaterial type... 	Polycotton");
			System.out.println("\tStyle... 	Ethnic Co-Ord Set");
			System.out.println("\tClosure type... 	NO CLOSURE");
			System.out.println("\tAge range description... 	Adult");
			System.out.println("\tCountry of Origin... 		India");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Leriya Fashion T-Shirt For Men", 399);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Urbano Fashion Men's Slim Fit Washed Jeans", 629);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("GoSriKi Women's Cotton Blend Embroidered Straight Kurta", 669);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("GRECIILOOKS Polycotton Co-Ord Set For Women", 599);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Clothing Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void jewellery() {
		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Gold Plated Handcrafted Kundan & Pearl Earrings for Women..... 425/-");
			System.out.println("\tMetal type... 	Alloy");
			System.out.println("\tGem type... 	 No Gemstone");
			System.out.println("\tOccasion type... 	Festive, Wedding");
			System.out.println("\tItem type name... 	Earrings");
			System.out.println("\tCountry of Origin... 		India");

			System.out.println("2. Wedding Collection Traditional Ethnic Gold Plated Pearl & Kundan Stone..... 2.999/-");
			System.out.println("\tClasp type... 	Lobster Clasp");
			System.out.println("\tMaterial type... 	Metal");
			System.out.println("\tMetal type... 	Alloy");
			System.out.println("\tGem type... 	No Gemstone");
			System.out.println("\tOccasion type... 	Festive, Wedding");
			System.out.println("\tCountry of Origin... 		India");

			System.out.println("3. Silver Plated Traditional Kundan Stone Choker Necklace Jewellery Set ..... 759/-");
			System.out.println("\tClasp type... 	Lobster Clasp");
			System.out.println("\tMaterial type... 	Metal");
			System.out.println("\tMetal type... 	Alloy");
			System.out.println("\tGem type... 	No Gemstone");
			System.out.println("\tOccasion type... 	Festive, Wedding");
			System.out.println("\tCountry of Origin... 		India");

			System.out.println("4. Gold Plated Traditional Ethnic Adjustable Bracelet ..... 399/-");
			System.out.println("\tMaterial type...		Crystal");
			System.out.println("\tMetal type... 	Alloy");
			System.out.println("\tSize... 	Adjustable");
			System.out.println("\tOccasion type... 	Engagement, Wedding, Anniversary");
			System.out.println("\tItem type name... 	Bracelets");
			System.out.println("\tCountry of Origin... 		India");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Gold Plated Handcrafted Kundan & Pearl Earrings for Women", 425);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Wedding Collection Traditional Ethnic Gold Plated Pearl & Kundan Stone", 2999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Silver Plated Traditional Kundan Stone Choker Necklace Jewellery Set ", 759);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Gold Plated Traditional Ethnic Adjustable Bracelet ", 399);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Jewellery Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void watches() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Analog Black Dial Watch ..... 8,697/-");
			System.out.println("\tBrand... 		‎Fossil");
			System.out.println("\tManufacturer...	‎Fossil India Pvt Ltd");
			System.out.println("\tModel...		‎FS4832");
			System.out.println("\tModel Year...		‎2013");
			System.out.println("\tProduct Dimensions...		‎13.49 x 13 x 13.49 cm; 167.83 g");
			
			System.out.println("2. French Connection POP FIT Full Touch Smartwatch..... 2,044/-");
			System.out.println("\tOperating System...	android,ios");
			System.out.println("\tSpecial Feature...		Bluetooth Calling, Social Media/Text/Call Notifications, Voice Assistant, Heart Rate Monitor, Sleep MonitorBluetooth Calling, Social Media/Text/Call Notifications, Voice Assistant, Heart Rate Monitor, Sleep Monitor");
			System.out.println("\tBattery Capacity...	260");
			System.out.println("\tConnectivity Technology...		Bluetooth");
			System.out.println("\tWireless Communication Standard...		Bluetooth");

			System.out.println("3. Fastrack Analog Unisex-Adult Watch..... 895/-");
			System.out.println("\tCase diameter... 		57 Millimetres");
			System.out.println("\tBand colour... 		Black");
			System.out.println("\tBand material type... 	Silicone");
			System.out.println("\tWarranty type...		Manufacturer");
			System.out.println("\tWatch movement type...	Quartz");
			System.out.println("\tItem weight... 	150 Grams");
			
			System.out.println("4. ACM Watch Strap..... 649/-");
			System.out.println("\tPremium Watch Strap");
			System.out.println("\tQuick Release - Can be Easily Assembled & Removed");
			System.out.println("\tSuitable for all types of usage like Sports,Workout,Business,Leisure");
			System.out.println("\tUltra Durable & Long lasting");
			System.out.println("\tMade from Premium Stainless Steel Material");
			
			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Analog Black Dial Watch ", 8697);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("French Connection POP FIT Full Touch Smartwatch", 2044);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Fastrack Analog Unisex-Adult Watch", 895);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("ACM Watch Strap", 649);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Watches Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void beauty() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. NIVEA Nourishing Body Milk 600ml Body Lotion..... 383/-");
			System.out.println("\tBrand... 		‎NIVEA");
			System.out.println("\tItem Volume... 		600 Millilitres");
			System.out.println("\tItem dimensions...	 L x W x H	44 x 29 x 148 Millimeters");
			System.out.println("\tSpecial Feature	Not Tested On Animals");
			System.out.println("\tActive Ingredients... 	Vitamin E");
			System.out.println("\tSkin Type...    Dry");			
			
			System.out.println("2. Bella Vita Luxury CEO Man Eau De Parfum Perfume..... 499/-");
			System.out.println("\tBrand...		Bella Vita Luxury");
			System.out.println("\tItem Form...		Liquid");
			System.out.println("\tItem Volume...	100 Millilitres");
			System.out.println("\tScent...		Wood");
			System.out.println("\tSpecial Feature	not tested on animals");

			System.out.println("3. L'Oréal Professionnel Xtenso Care Shampoo..... 610/-");
			System.out.println("\tBrand... 		L'OREAL PROFESSIONNEL PARIS");
			System.out.println("\tItem Form...		Liquid");
			System.out.println("\tHair Type...		Fine");
			System.out.println("\tScent...		Unscented");
			System.out.println("\tAge Range (Description)...		Adult");
			System.out.println("\tSpecial Feature..		Dryness Resistant");
			
			System.out.println("4. Laneige Lip Sleeping Mask..... 539/-");
			System.out.println("\tFlavour Name: Berry");
			
			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("NIVEA Nourishing Body Milk 600ml Body Lotion", 383);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Bella Vita Luxury CEO Man Eau De Parfum Perfume", 499);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("L'Oréal Professionnel Xtenso Care Shampoo", 610);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Laneige Lip Sleeping Mask", 539);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Beauty Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

}
