package day10stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
	   
		// Kullanýcýdan kredi kartý numarasýný alýn 
		// ve bu numaranýn üçüncü, dördüncü ve 
		// sonuncu rakamlarýný ekrana yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen kredi karti numaranizi giriniz");
		String card = scan.next();
		int    length = card.length();
		
	System.out.println(card.charAt(2));
	System.out.println(card.charAt(3));
	System.out.println(card.charAt(length-1));
		
		
	scan.close();
	}

}
