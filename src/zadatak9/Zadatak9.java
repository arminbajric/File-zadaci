package zadatak9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak9 {
public static void promjeniPocetnoSlovo(File fajl) throws FileNotFoundException
{
	Scanner unos = new Scanner(fajl);
	System.out.println("Svaka rijec sa velikim pocetnim slovom:");
	do {
		String temp = unos.nextLine();
		String[] s = temp.split(" ");
		for (int i = 0; i < s.length; i++) {
	         temp=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
			s[i]=temp;
			System.out.print(s[i]+" ");
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
		promjeniPocetnoSlovo( fajl);
	}

}
