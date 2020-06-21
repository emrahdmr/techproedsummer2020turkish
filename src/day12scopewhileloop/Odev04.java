package day12scopewhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		//biten tüm tamsayýlarýn toplamýný ekrana yazdýrýn.
		
		  Scanner scan = new Scanner(System.in);
			
			System.out.println("lutfen baslangic degeri giriniz");
			int st = scan.nextInt();
			
			System.out.println("lutfen bitis degeri giriniz");
			int fn = scan.nextInt();
			
			if(st<=fn) {
				int sum = 0; 
				while(st<=fn) {
					sum = sum+st;
					st++;}
		System.out.println(sum);
				
			}else{
				int sum = 0; 
				while(st>=fn) {
					sum = sum+st;
					st--;}
		System.out.println(sum);
			
			}	
			scan.close();
	}

}
