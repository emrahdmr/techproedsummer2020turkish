package day13whiledowhileloops;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan bir String alýn ve bu String’in ilk harfi ile son harfinin yerlerini deðiþtirerek
		// ekrana yazdýrýn.
		// Ornegin; Kullanýcý “Java” girerse ekrana “aavJ” yazdýracaksýnýz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime yada cumle girin");
		String str = scan.next();
		
		//int str1= str.length()-1;
		char ilkharf = str.charAt(0);
		char sonharf = str.charAt(str.length()-1);
		
		System.out.println(sonharf+str.substring(1,str.length()-1)+ilkharf);
		
		
	scan.close();	

	}

}
