package zadatak3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
	public static void dodajString(String fajl, String temp) throws FileNotFoundException {
		Scanner unos;
		unos = new Scanner(new FileReader(fajl));
		ArrayList lista=new ArrayList();
		do {
			lista.add(unos.nextLine());
		} while (unos.hasNextLine());
		lista.add(temp);
		PrintWriter pisac = new PrintWriter(fajl);
		for(int i=0;i<lista.size();i++)
		{
			pisac.write(String.valueOf(lista.get(i)));
			pisac.println();
		}
		pisac.close();
		unos.close();
	}

	public static void ispisiNaopako(String fajl) throws FileNotFoundException {
		Scanner unos;
		unos = new Scanner(new FileReader(fajl));
		do {
			String temp = unos.nextLine();
			int duzina = temp.length();
			char[] c = new char[duzina];
			c = temp.toCharArray();
			for (int i = c.length - 1; i >= 0; i--) {
				System.out.print(c[i]);
			}
			System.out.println();
		} while (unos.hasNextLine());
		unos.close();
	}

	public static void main(String[] args) throws IOException {
		
		Scanner unos = new Scanner(System.in);
		String fajl="primjer.txt";
		System.out.println("Unesite neki string:");
		String temp = unos.nextLine();
		dodajString(fajl, temp);
		ispisiNaopako(fajl);
	}

}
