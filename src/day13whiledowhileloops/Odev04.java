package day13whiledowhileloops;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		//Kullanýcýdan uzunluðu çift sayý olan bir String alýn
		//ve bu String’in ilk yarýsýný ekrana yazdýrýn.
		//Ornegin; Kullanýcý “Hollanda” girerse ekrana “Holl” yazdýracaksýnýz.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen cift sayi girin");
		String str = scan.next();
		
        System.out.println(str.substring(0,str.length()/2));
		
		scan.close();
		
		
	}

}
