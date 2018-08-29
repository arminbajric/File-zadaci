package zadatak6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak6 {
public static void pronadjiNajduzeRijeci(File fajl) throws FileNotFoundException
{
	Scanner unos=new Scanner(fajl);
int max=0,indeks = 0;
System.out.println("Najduze rijeci po linijama su:");
	do
	{
		String temp=unos.nextLine();
		String[] s=temp.split(" ");
			for(int i=s.length-1;i>=0;i--)
		{
			if(s[i].length()>max)
			{
				max=s[i].length();
				indeks=i;
			}
		}
			
			System.out.println(s[indeks]);
			max=0;indeks=0;
	}while(unos.hasNextLine());
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		pronadjiNajduzeRijeci(fajl);
	}

}
