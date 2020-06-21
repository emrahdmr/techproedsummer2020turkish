package day12scopewhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ harflerini alýn ve baþlangýç harfinden baþlayýp bitiþ harfinde
		//biten tüm harfleri büyük harf olarak ekrana yazdýrýn. Kullanýcýnýn hata yapmadýðýný farz edin

		
		  Scanner scan = new Scanner(System.in);
			
			System.out.println("lutfen baslangic harfi giriniz");
			char st = scan.next().toUpperCase().charAt(0);
			
			System.out.println("lutfen bitis harfi giriniz");
			char fn = scan.next().toUpperCase().charAt(0);
			
			char ch =st;
			while (ch<=fn) {
				 {
					System.out.print(ch + " ");	
				
				ch++;
			}
				 scan.close();
				 }
			}
	
	}


