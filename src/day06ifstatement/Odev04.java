package day06ifstatement;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// ) Kullan�c�dan iki say� al�n e�er say�lar�n i�aretleri ayn� ise ekrana �Ayn� i�aretli� yazd�r�n.
		// Say�lar�n i�aretleri farkl� ise ekrana �Farkl� i�aretli� yazd�r�n.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ilk sayiyi giriniz");
		int num1 = scan.nextInt();
		
		System.out.println("lutfen ikinci sayiyi giriniz");
		int num2 = scan.nextInt();
		
		if (num1<0 && num2<0 || num1>0 && num2>0 ) {
			System.out.println("ayni isaretli");
		
		} if (num1>0 && num2<0 || num1<0 && num2>0) {
			System.out.println("farkli isaretli");
		}
		
		
		scan.close();	
		
	}

}
