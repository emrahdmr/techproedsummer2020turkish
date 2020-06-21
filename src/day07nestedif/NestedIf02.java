package day07nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {  
		
		
		// kullanicidan password girmesini isteyin
	    // password 4 basamakli bir sayi ise cift olup olmadini kontrol edin, 
		// cift sayi ise "password tamam" yazdirin, tek sayi ise "tekar deneyin" yazdirin
		// password 4 basmakakli degil ise "tekrar deneyin yazdirin
		// 4 basamakli demek 999 dan buyuk 10000 den kucuk
		// not 0123 java 123 kabul eder
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lufen tam sayi olan4  basamakli bir passwrod giriniz");
		
		int password = scan.nextInt();
		
		
		if (password>999 && password<10000) {
			if (password%2 ==0) { 
				System.out.println("password tamam");
			}else if (password%2 !=0) {
				System.out.println("tekrar deneyin");
			}
		}else {
			System.out.println("tekrar deneyiniz");
		}
			
				
scan.close();
	}

}
