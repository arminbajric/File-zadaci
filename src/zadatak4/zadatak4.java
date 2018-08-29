package zadatak4;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class zadatak4 {
public static void ispisiReceniceNaopako(File fajl) throws FileNotFoundException
{
Scanner unos=new Scanner(fajl);

do
{
	String temp=unos.nextLine();
	String[] s=temp.split(" ");
		for(int i=s.length-1;i>=0;i--)
	{
		System.out.print(s[i]+" ");
	}
		System.out.println("");
}while(unos.hasNextLine());
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		ispisiReceniceNaopako(fajl);
	}

}
