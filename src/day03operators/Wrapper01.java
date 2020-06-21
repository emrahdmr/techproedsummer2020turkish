package day03operators;

import java.util.Scanner;

public class Wrapper01 {

	public static void main(String[] args) {
		
		//kullanicidan adini soyadini alip ekrana yazdiran bir program yaziniz
		// (string kullaniniz)
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen adinizi ve soyadinizi giriniz");
		
		String isim = scan.nextLine();  //string alma icin next(tek kelimelik icin ) yada nextLine (tum string icin) kullanilir
		
		System.out.println(isim);	
		
		scan.close();
	}
}
