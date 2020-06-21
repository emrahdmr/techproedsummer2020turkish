package day10stringmethods;

import java.util.Scanner;

public class Odev02 {
	
	public static void main(String [] args) {
		
		// Kullanýcýdan ilk ve soy ismini alýn 
		//ilk ve soy isminin kaç harften oluþtuðunu ekrana yazdýrýn.
		
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
