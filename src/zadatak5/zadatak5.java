package zadatak5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zadatak5 {
public static void ispisiSadrzaj(File fajl) throws FileNotFoundException
{
	  Scanner unos;
			unos=new Scanner(fajl);
		
			int brojac = 0;
			do
			{
				String temp=unos.nextLine();
				int duzina=temp.length();
				char[] c=new char[duzina];
				c=temp.toCharArray();
				if(c.length>40)
				{
				for(int i=0;i<40;i++)
				{
					System.out.print(c[i]);
				}
				System.out.print("...<ReadMore>");
				System.out.println();
				}
				else
				{
					for(int i=0;i<c.length;i++)
					{
						System.out.print(c[i]);
					}
					System.out.println("");
				}
				
				
			}while(unos.hasNextLine());
			
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		ispisiSadrzaj(fajl);
	}

}
