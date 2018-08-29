package Zadatak7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadatak7 {
public static void ispisiPredzadnjuRijec(File fajl) throws FileNotFoundException
{
	Scanner unos=new Scanner(fajl);
	
	System.out.println("Predposljedne rijeci po linijama su:");
		do
		{
			String temp=unos.nextLine();
			String[] s=temp.split(" ");
				
			if(s.length>2)
			{
				System.out.println(s[s.length-2]);
			}
				
				
		}while(unos.hasNextLine());
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		ispisiPredzadnjuRijec(fajl);
	}

}
