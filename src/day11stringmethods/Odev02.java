package day11stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden veya sonrasýndan
		//baþlayýp bitiþ deðerinde veya öncesinde biten tüm çift tamsayýlarý ekrana yazdýrýn.

		
		Scanner scan = new Scanner(System.in);
		   System.out.println("balangic degerini giriniz"); 
		   int bs = scan.nextInt();
		   
		   System.out.println("bitis degerini giriniz");
		   int bt =scan.nextInt();
		   
		
			   
		   for (int i=bs; i<bt ; i++) {
		   if (i%2==0) {
		   System.out.print(i + " ");
			
		   }
		   }
		   scan.close();
	}

}
