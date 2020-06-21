package day10stringmethods;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		// Kullanýcýdan yaþadýðý ülkenin ismini alýn 
		// bu ülkenin bastan ikinci harfi ile sondan ikinci harfini
		// büyük harf olarak ekrana yazdýrýn. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yasadiginiz ulkenin adini giriniz");
	    String country = scan.next();
	    
	    
	    // int length  = country.length();
	   
		System.out.println(country.substring(1,2).toUpperCase()+ country.toUpperCase().charAt(country.length()-2));
       
		

	   
		
		scan.close();
	}
	

}
