package project;

import java.util.Scanner;

public class Electronics {

	Scanner sc = new Scanner(System.in);

	public void mobiles() {
		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Vivo V50 5G..... 34,999/-");
			System.out.println("\tBrand... \tVivo");
			System.out.println("\tOperating System... \tFuntouch OS 15");
			System.out.println("\tMemory Storage Capacity... \t128 GB");
			System.out.println("\tScreen Size... \t6.77 Inches");
			System.out.println("\tModel Name... \tV50");

			System.out.println("2. Samsung Galaxy M35 5G..... 14,999/-");
			System.out.println("\tBrand...	Samsung");
			System.out.println("\tOperating System...	Android 14");
			System.out.println("\tRAM Memory Installed Size...	6 GB");
			System.out.println("\tCPU Speed...	2.4 GHz");
			System.out.println("\tMemory Storage Capacity...	128 GB");

			System.out.println("3. Apple iPhone 15... 60,999/-");
			System.out.println("\tBrand...	Apple");
			System.out.println("\tOperating System...	iOS");
			System.out.println("\tMemory Storage Capacity...	128 GB");
			System.out.println("\tScreen Size...	6.1 Inches");
			System.out.println("\tModel Name... 	iPhone 15");

			System.out.println("4. Redmi A4 5G... 8,500/-");
			System.out.println("\tBrand...	Redmi");
			System.out.println("\tOperating System...	Android 14");
			System.out.println("\tRAM Memory Installed Size...	4 GB");
			System.out.println("\tMemory Storage Capacity...	64 GB");
			System.out.println("\tScreen Size...	6.88 Inches");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Vivo V50 5G", 34999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Samsung Galaxy M35 5G", 14999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Apple iPhone 15", 60999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Redmi A4 5G", 8500);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Mobile Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;
	}

	public void TV() {
		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Sony BRAVIA 3 Series..... 1,31,990/-");
			System.out.println("\tScreen Size...	75 Inches");
			System.out.println("\tBrand...		Sony");
			System.out.println("\tDisplay Technology...  LED");
			System.out.println("\tResolution...		4K");
			System.out.println("\tRefresh..Rate..60Hz");

			System.out.println("2. Redmi Xiaomi..... 10,999/-");
			System.out.println("\tScreen Size...	32 Inches");
			System.out.println("\tBrand...		Redmi");
			System.out.println("\tDisplay Technology...	 LED");
			System.out.println("\tResolution...		720p");
			System.out.println("\tRefresh..Rate..60Hz");

			System.out.println("3. TCL 139 cm..... 37,990/-");
			System.out.println("\tScreen Size...	55 Inches");
			System.out.println("\tBrand..QLED");
			System.out.println("\tDisplay Technology... QLED");
			System.out.println("\tResolution...		4K");
			System.out.println("\tRefresh..Rate..60Hz");

			System.out.println("4. acer 139 cm..... 35,990/-");
			System.out.println("\tScreen Size...	55 Inches");
			System.out.println("\tBrand..acer");
			System.out.println("\tDisplay Technology... LED");
			System.out.println("\tResolution...		4K");
			System.out.println("\tRefresh..Rate..60Hz");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Sony BRAVIA 3 Series", 131990);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Redmi Xiaomi", 10999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("TCL 139 cm", 37990);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("acer 139 cm", 35990);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in TV Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;
	}

	public void camera() {
		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Canon EOS 5D..... 35,690/-");
			System.out.println("\tCompatible Mountings...	Canon EF");
			System.out.println("\tBrand...		Canon");
			System.out.println("\tAspect Ratio...	1.50:1");
			System.out.println("\tSupported File Format...	MP4");
			System.out.println("\tMaximum Focal Length...	105 Millimeters");

			System.out.println("2. Nikon D7500..... 65,561/-");
			System.out.println("\tCompatible Mountings...	Nikon D");
			System.out.println("\tBrand...		Nikon");
			System.out.println("\tAspect Ratio...	16:9, 3:2");
			System.out.println("\tSupported File Format...	RAW");
			System.out.println("\tMaximum Aperture...	3.5 Millimeters");

			System.out.println("3. Fujifilm Instax Mini Picture Format Film..... 1,299/-");
			System.out.println("\tBrand...	instax\r\n");
			System.out.println("\tModel Name... 	FBA_INSTAX MINI Twin Pack");
			System.out.println("\tFilm Colour...	Color");
			System.out.println("\tFilm Format Type...	Instax Mini");
			System.out.println("\tExposures per Roll...	800");

			System.out.println("4. SEZNIK Mini Printer..... 2,199/-");
			System.out.println("\tConnectivity Technology...	Bluetooth");
			System.out.println("\tBrand...		SEZNIK");
			System.out.println("\tPrinter Output... 	Monochrome");
			System.out.println("\tModel Name... 	SZ-Mini-Printer");
			System.out.println("\tMax Print speed Monochrome... 	1 Pages per second");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Canon EOS 5D", 35690);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Nikon D7500", 65561);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Fujifilm Instax Mini Picture Format Film", 1299);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("SEZNIK Mini Printer", 2199);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Camera Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;
	}

	public void earPhones() {
		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. boAt Rockerz ..... 999/-");
			System.out.println("\tColour... 	Classic Black w/50HRS");
			System.out.println("\tBrand...		boAt");
			System.out.println("\tForm Factor...	In Ear");
			System.out.println("\tNoise Control...	Active Noise Cancellation");
			System.out.println("\tModel Name... 	Rockerz 255 Z Plus");
			
			System.out.println("2. Noise Buds N1 ..... 1,499/-");
			System.out.println("\tColour... 	Chrome Black");
			System.out.println("\tBrand...		Noise");
			System.out.println("\tEar Placement	In Ear");
			System.out.println("\tNoise Control...	Active Noise Cancellation");
			System.out.println("\tForm Factor	True Wireless");			
			
			System.out.println("3. JBL C100SI Wired In Ear Headphones ..... 599/-");
			System.out.println("\tColour... 	Black");
			System.out.println("\tBrand...		JBL");
			System.out.println("\tForm Factor...	In Ear");
			System.out.println("\tEar Placement	In Ear");
			System.out.println("\tImpedance	16 Ohm");			
			
			System.out.println("4. OnePlus Nord Buds ..... 2299/-");
			System.out.println("\tColour... 	Chromatic Blue");
			System.out.println("\tBrand...		OnePlus");
			System.out.println("\tForm Factor...	In Ear");
			System.out.println("\tEar Placement	In Ear");
			System.out.println("\tImpedance	8 Ohm");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("boAt Rockerz ", 999);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Noise Buds N1 ", 1499);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("JBL C100SI Wired In Ear Headphones", 599);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("OnePlus Nord Buds ", 2299);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in EarPhones Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;
	}

}
