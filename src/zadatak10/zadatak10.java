package zadatak10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class zadatak10 {
public static void ispisiNeparneBrojeve(File fajl) throws FileNotFoundException
{

	Scanner unos = new Scanner(fajl);
	System.out.println("Neparni brojevi su:");
	do {
		int temp=0;
		try
		{
			 temp=unos.nextInt();
		}
		catch(InputMismatchException e)
		{
			
		}
		if(temp%2!=0)
		{
			System.out.print(temp+" ");
		}

	} while (unos.hasNextInt());
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file = unos.nextLine();
		File fajl = new File(file + ".txt");
		ispisiNeparneBrojeve(fajl);
	}

}
