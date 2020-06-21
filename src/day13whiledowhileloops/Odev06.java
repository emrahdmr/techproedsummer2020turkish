package day13whiledowhileloops;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir String alýn ve 
		// bu String’in icinde “a” harfi varsa “a” harfinin ilk görünümünün
		// indexini ekrana yazdýrýn. “a” harfi yoksa ekrana “a harfi yok” yazdýrýn
 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime girin");
		String str = scan.next();
		

		if ( str.contains("a")) {
			System.out.println(str.indexOf("a"));
		}
		else {
			System.out.println("a harfi yok");
		}
		scan.close();
	}

}
