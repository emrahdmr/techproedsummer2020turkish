package day10stringmethods;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ya�ad��� �lkenin ismini al�n 
		// bu �lkenin bastan ikinci harfi ile sondan ikinci harfini
		// b�y�k harf olarak ekrana yazd�r�n. 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yasadiginiz ulkenin adini giriniz");
	    String country = scan.next();
	    
	    
	    // int length  = country.length();
	   
		System.out.println(country.substring(1,2).toUpperCase()+ country.toUpperCase().charAt(country.length()-2));
       
		

	   
		
		scan.close();
	}
	

}
