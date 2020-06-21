package day11stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tüm tamsayýlarý ekrana yazdýrýn.
		
       Scanner scan = new Scanner(System.in);
	   System.out.println("balangic degerini giriniz"); 
	   int bs = scan.nextInt();
	   
	   System.out.println("bitis degerini giriniz");
	   int bt =scan.nextInt();
	   
	  
		   
	   for (int i=bs; i<bt ; i++) {
		  
	   
	   System.out.print(i + " ");
		
	   }
		
	scan.close();	
}

}
