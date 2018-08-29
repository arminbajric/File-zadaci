package zadatak2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
	public static void brojVelikihSlova(File fajl) throws FileNotFoundException
	{     Scanner unos;
		unos=new Scanner(fajl);
		ArrayList lista=new ArrayList();
		int brojac = 0;
		do
		{
			String temp=unos.nextLine();
			int duzina=temp.length();
			char[] c=new char[duzina];
			c=temp.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(Character.isUpperCase(c[i]))
				{
			brojac++;
				}
			}
			
		}while(unos.hasNextLine());
		System.out.println("U fajlu se nalazi "+brojac+" velikih slova.");
	}
	public static void brojMalihSlova(File fajl) throws FileNotFoundException
	{     Scanner unos;
		unos=new Scanner(fajl);
	
		int brojac = 0;
		do
		{
			String temp=unos.nextLine();
			int duzina=temp.length();
			char[] c=new char[duzina];
			c=temp.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(Character.isLowerCase(c[i]))
				{
			brojac++;
				}
			}
			
		}while(unos.hasNextLine());
		System.out.println("U fajlu se nalazi "+brojac+" malih slova.");
	}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		brojVelikihSlova(fajl);
		brojMalihSlova(fajl);
	}

}
