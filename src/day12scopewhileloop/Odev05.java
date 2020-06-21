package day12scopewhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		//biten tüm tamsayýlarýn çarpýmýný ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degeri giriniz");
		int st = scan.nextInt();
		
		System.out.println("lutfen bitis degeri giriniz");
		int fn = scan.nextInt();
		
		if(st<=fn) {
			int carpma = 1; 
			while(st<=fn) {
				carpma = carpma*st;
				st++;}
	System.out.println(carpma);
			
		}else{
			int carpma = 1; 
			while(st>=fn) {
				carpma = carpma*st;
				st--;}
	System.out.println(carpma);
		
		}
		scan.close();
}
	

}
