package day08ternaryoperator;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		//Kullanýcýdan iki tamsayý girmesini isteyin, 
		//ekrana her zaman büyük olanýný yazdýrýn
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen 2 adet tam sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = num1>=num2 ?  num1 :num2;
		System.out.println(result);
 
		
		
		scan.close();
	}

}
