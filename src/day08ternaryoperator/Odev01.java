package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		
		/* Kullanýcýdan bir tamsayý girmesini isteyin,
		tamsayý çift ise ekrana “Çift” tek ise ekrana “Tek”
		yazdýrýn.  */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "cift" : "tek";
		System.out.println(result);
		
		
		
		scan.close();

	}

}
