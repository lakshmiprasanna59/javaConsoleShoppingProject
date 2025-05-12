package project;

import java.util.Scanner;

public class Books {

	Scanner sc = new Scanner(System.in);

	public void thriller() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. THE SILENT PATIENT..... 258/-");
			System.out.println("\tAuthor...	  Alex Michaelides");
			System.out.println(
					"\tWITH OVER THREE MILLION COPIES SOLD, read the Sunday Times and No.1 New York Times bestselling, record-breaking thriller that everyone is talking about - soon to be a major film.");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 340 pages");

			System.out.println("2. Never Lie ..... 327/-");
			System.out.println("\tAuthor...	  The Housemaid Freida McFadden");
			System.out.println(
					"\tFrom New York Times bestselling author Freida McFadden comes an addictive, unpredictable thriller that will keep you asking the question: What is the truth?");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 336 pages");

			System.out.println("3. Girl on the Train..... 333/-");
			System.out.println("\tAuthor...	   Paula Hawkins");
			System.out.println(
					"\tTHE RUNAWAY SUNDAY TIMES NO.1 BESTSELLER AND THRILLER OF THE YEAR. Really great suspense novel. Kept me up most of the night. The alcoholic narrator is dead perfect.");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 416 pages");

			System.out.println("4. VERITY ..... 257/-");
			System.out.println("\tAuthor...	  Colleen Hoover");
			System.out.println(
					"\tAre you ready to stay up all night? Rebecca meets Gone Girl in this shocking, unpredictable thriller with a twist that will leave you reeling . . . The TikTok sensation from the author of It Ends With Us.");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 336 pages");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("THE SILENT PATIENT", 258);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Never Lie", 327);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Girl on the Train", 333);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("VERITY", 257);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Thriller Books Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void comicsAndManga() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. GBDOOKS Spy X Family Volumes 1 - 10 Books Set..... 1,199/-");
			System.out.println("\tAuthor...	  SPY FAMILY");
			System.out.println(
					"\tGBDOOKS Spy X Family Volumes 1 - 10 Books Set Collection Set By Tatsuya Endo Manga Spy x Family, Vol. 1 to 10 (Spy x Family Volume 1-10 BOX SET)");

			System.out.println("2. The Subtle Knife: The Graphic Novel..... 814/-");
			System.out.println("\tAuthor...	  Philip Pullman");
			System.out.println(
					"\tEnter the remarkable world of His Dark Materials like never before with this stunning, full-colour graphic novel.");

			System.out.println("3. Solo Leveling, Vol. 1 (Manga)..... 1760/-");
			System.out.println("\t DUBU(REDICE STUDIO)... 	 (Artist)");
			System.out.println("\tChugong ... 	(Original Author)");
			System.out.println(
					"\tBASED ON THE HIT FANTASY NOVEL, EXPERIENCE THE WEBCOMIC THAT’S CAPTURED THE ATTENTION OF MILLIONS IN ALL OF ITS FULL-COLOR GLORY! ");

			System.out.println("4. DEATH NOTE BOX SET VOLS 1-13..... 6319/-");
			System.out.println("\tAuthor...	   Tsugumi Ohba ");
			System.out.println(
					"\tIs Kira's story truly over, or does his influence linger? Death Note's story continues in this collection of short stories penned by the series' creators.");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 2496 pages");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("GBDOOKS Spy X Family Volumes 1 - 10 Books Set", 1199);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("The Subtle Knife: The Graphic Novel", 814);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("Solo Leveling, Vol. 1 (Manga)", 1760);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("DEATH NOTE BOX SET VOLS 1-13", 6319);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Comics And Mangwa Books Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void kids() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Monkey Puzzle..... 289/-");
			System.out.println("\tAuthor...	  Julia Donaldson");
			System.out.println("\tIllustrator...	 Axel Scheffler");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 24 pages");

			System.out.println("2. Matilda..... 263/-");
			System.out.println("\tAuthor...	  Roald Dahl");
			System.out.println(
					"\tThe much-loved Roald Dahl story, updated for a whole new generation of readers with an exciting new interior design and cover look.");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tPaperback ...	 ‎ 200 pages");

			System.out.println("3. The Very Hungry Caterpillar..... 233/-");
			System.out.println("\tAuthor...		Eric Carle");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 26 pages");

			System.out.println("4. The Rabbit Listened..... 475/-");
			System.out.println("\tAuthor...	   Cori Doerrfeld ");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("Hardcover... ‎ 40 pages");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Monkey Puzzle", 289);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("Matilda", 263);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("The Very Hungry Caterpillar", 233);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("The Rabbit Listened", 475);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Childern's Books Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

	public void love() {

		System.out.println("Choose Which item do you need : ");
		String op;
		Amazon a = new Amazon();
		do {
			System.out.println("1. Divine Rivals..... 450/-");
			System.out.println("\tAuthor...	  Rebecca Ross");
			System.out.println(
					"\t﻿The epic enemies-to-lovers fantasy novel filled with hope and heartbreak from number one SUNDAY TIMES bestseller Rebecca Ross");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 368 pages");

			System.out.println("2. ME BEFORE YOU..... 359/-");
			System.out.println("\tAuthor...	  Jojo Moyes");
			System.out.println(
					"\tDiscover the love story that captured 21 million hearts . . . from the author of The Last Letter from Your Lover, now a major motion picture");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tPaperback ...	 ‎ 480 pages");

			System.out.println("3. The Serpent and the Wings of Night ..... 490/-");
			System.out.println("\tAuthor...		 Carissa Broadbent ");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("\tBoard book...	 ‎ 480 pages");
			System.out.println(
					"\tIt's in a series of 6 books but 3 duologies following each house. And this one is the first book.");

			System.out.println("4. Too Late..... 308/-");
			System.out.println("\tAuthor...	   Colleen Hoover");
			System.out.println("\tLanguage...	 ‎ English");
			System.out.println("Hardcover... ‎ 400 pages");

			int ch = sc.nextInt();
			if (ch < 1 || ch > 4) {
				System.out.println("Invalid choice...Choose again");
				ch = sc.nextInt();
			}
			if (ch == 1) {
				a.addToCart("Divine Rivals", 450);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 2) {
				a.addToCart("ME BEFORE YOU", 359);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 3) {
				a.addToCart("The Serpent and the Wings of Night ", 490);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			} else if (ch == 4) {
				a.addToCart("Too Late", 308);
				System.out.println("Do you want to add it to cart and continue Shopping(Yes/No): ");
				String yn = sc.next();
				if (!yn.equalsIgnoreCase("yes")) {
					a.removeFromCart();
					a.bill();
					System.exit(0);
				}
			}

			System.out.println("Do you wanna Choose again in Romantic Books Section...(Yes/No) : ");
			op = sc.next();
		} while (op.equalsIgnoreCase("Yes"));

		return;

	}

}
