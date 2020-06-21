package day06ifstatement;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
	
		
		// Kullanýcýdan bir tamsayý alýn eðer tamsayý 3 ile bölünebiliyorsa ekrana “3’ün katý” yazdýrýn.
	    // 3 ile bölünemiyorsa ekrana “3’ün katý deðildir” yazdýrýn.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		if(num%3 ==0) {
			System.out.println(num *3);
		}if (num%3 !=0) {
			System.out.println("3 un kati degildir");
		}
			
		scan.close();
	}
	
}
