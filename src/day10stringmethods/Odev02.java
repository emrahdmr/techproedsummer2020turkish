package day10stringmethods;

import java.util.Scanner;

public class Odev02 {
	
	public static void main(String [] args) {
		
		// Kullan�c�dan ilk ve soy ismini al�n 
		//ilk ve soy isminin ka� harften olu�tu�unu ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lufen adinizi giriniz");
		String ad = scan.nextLine();
		
		System.out.println(" lutfen soyadinizi giriniz");
		String soy = scan.next();
		
		  String sonuc = (ad + soy);
		System.out.println(sonuc.length());

		
		
    scan.close();	
		
	}

}
