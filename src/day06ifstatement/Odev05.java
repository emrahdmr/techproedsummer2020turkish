package day06ifstatement;

import java.util.Scanner;

public class Odev05 {
	
	public static void main(String [] args) {
		
		//Kullanýcýdan bir tamsayý alýn eðer tamsayý 10 dan kucuk ve 0’dan büyük eþit ise ekrana
		//“Rakam” yazdýrýn. Diðer durumlarda ekrana “Sayý” yazdýrýn.
        
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		
		int num = scan.nextInt();
		
		if (num<10 && num >=0) {
			System.out.println("rakam");
			
		}else {
			System.out.println("sayi");
		}
		
		
		
		scan.close();	
	}

}
