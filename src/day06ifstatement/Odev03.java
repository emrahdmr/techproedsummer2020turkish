package day06ifstatement;
import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		  
		
		// Kullanýcýdan bir gun alýn eðer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdýrýn.
		// “Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdýrýn. “Pazar” ise ekrana
		// “Hýristiyanlar icin kutsal gün” yazdýrýn
		// diger gunler icin kutsal gun degil
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir gun giriniz");
		
		String day = scan.next();
		
		if (day.equalsIgnoreCase("Cuma")) {
			System.out.println( "muslumanlar icin kutsal gun");
		}else if (day.equalsIgnoreCase ("cumartesi")) {
			System.out.println( "yahudiler icin kutsal gun");
			
		}else if (day.equalsIgnoreCase("pazar")) {
			System.out.println("hiristiyanlar icin kutsal gun");
		} else {
			System.out.println("kutsal gun degil");
		}
		
		
		
		scan.close();	
	}

}
