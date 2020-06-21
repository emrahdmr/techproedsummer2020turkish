package day12scopewhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		// Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
	// biten tüm tamsayýlarý while loop kullanarak ekrana yazdýrýnýz.
	
	   
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degeri giriniz");
		int st = scan.nextInt();
		
		System.out.println("lutfen bitis degeri giriniz");
		int fn = scan.nextInt();
		
		int num =st;
		while (num<fn) {
			System.out.print(num + " ");
			num++;
		}
	scan.close();	
	}
}
