package day06ifstatement;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// ) Kullanýcýdan iki sayý alýn eðer sayýlarýn iþaretleri ayný ise ekrana “Ayný iþaretli” yazdýrýn.
		// Sayýlarýn iþaretleri farklý ise ekrana “Farklý iþaretli” yazdýrýn.

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
