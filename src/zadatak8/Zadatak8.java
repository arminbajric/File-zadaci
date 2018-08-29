package zadatak8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak8 {
	public static void ukloniRazmake(File fajl) throws FileNotFoundException {
		Scanner unos = new Scanner(fajl);
		int max = 0, indeks = 0;
		System.out.println("Linije bez razmaka su:");
		do {
			String temp = unos.nextLine();
			String[] s = temp.split(" ");
			for (int i = 0; i < s.length; i++) {
				System.out.print(s[i]);
			}

			System.out.println();

		} while (unos.hasNextLine());
	}

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file = unos.nextLine();
		File fajl = new File(file + ".txt");
		ukloniRazmake(fajl);
	}

}
