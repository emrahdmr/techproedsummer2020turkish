package day02wrapperclasses;

import java.util.Locale;
import java.util.Scanner;

public class Odev07 {
	
	
	
	public static void main(String [] args) {
		
		
		
		//odev07
		
		Scanner scan = new Scanner(System.in);
		
		scan.useLocale(Locale.US);
		
		
		System.out.println("Lutefen mili ceviriniz");
		
		double mile = scan.nextDouble();
		
		System.out.println(mile * 1.6);
		
		scan.close();	
	}

}
