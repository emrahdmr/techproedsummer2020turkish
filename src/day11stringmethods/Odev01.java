package day11stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		// biten t�m tamsay�lar� ekrana yazd�r�n.
		
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
