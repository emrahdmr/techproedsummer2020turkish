package day12scopewhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� harflerini al�n ve ba�lang�� harfinden ba�lay�p biti� harfinde
		//biten t�m harfleri b�y�k harf olarak ekrana yazd�r�n. Kullan�c�n�n hata yapmad���n� farz edin

		
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


