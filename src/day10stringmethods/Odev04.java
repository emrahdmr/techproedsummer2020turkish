package day10stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n
		// bu �lkenin ismi Amerika ise ekrana USA, 
		// Ingiltere ise ekrana UK, 
		// Almanya ise ekrana DE yazd�r�n. 
		// Di�er �lkeler i�in ise NA yazd�r�n. 

		Scanner scan = new  Scanner(System.in);
		
		System.out.println("lutfen yasadiginiz ulkenin ismini giriniz");
		String country = scan.next();
		country = country.toLowerCase();
	     
		
		switch (country) {
		case "amerika" :
			System.out.println("USA");
			break;
		case "ingiltere" :
			System.out.println("UK");
			break;
		case "almanya" :
			System.out.println("DE");
			break;
		default:
		System.out.println("NA");
		
		
		}
		
		scan.close();	
		
		
	}

}
