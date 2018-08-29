package zadatak1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.IOException;

public class Zadatak1 {
	public static void brojKaraktera(File fajl) throws FileNotFoundException
	{     Scanner unos;
		unos=new Scanner(fajl);
		ArrayList lista=new ArrayList();
		do
		{
			String temp=unos.nextLine();
			int duzina=temp.length();
			char[] c=new char[duzina];
			c=temp.toCharArray();
			for(int i=0;i<c.length;i++)
			{
				if(Character.isLetter(c[i]))
				{
			lista.add(c[i]);
				}
			}
		}while(unos.hasNextLine());
		System.out.println("U fajlu se nalazi "+lista.size()+" karaktera.");
	}
	public static void brojRijeci(File fajl) throws FileNotFoundException
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
				if(Character.isWhitespace(c[i]))
				{
			brojac++;
				}
			}
			brojac++;
		}while(unos.hasNextLine());
		System.out.println("U fajlu se nalazi "+brojac+" rijeci.");
	}
	public static void brojLinija(File fajl) throws FileNotFoundException
	{     Scanner unos;
		unos=new Scanner(fajl);
		
		int brojac = 0;
		do
		{
			brojac++;
			unos.nextLine();
		}while(unos.hasNextLine());
		System.out.println("U fajlu se nalazi "+brojac+" linija.");
	}
	public static void main(String[] args) throws IOException {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
	brojKaraktera(fajl);
	brojRijeci(fajl);
	brojLinija(fajl);
		
	}
}
