package day08ternaryoperator;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir tamsay� girmesini isteyin, 
		// o tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
		// 3 basamakl� degilse �ift olup olmadigini kontrol edin.
		// �ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
		// �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�

	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		String result = num>99 && num<1000 ? "uc basama4kli" : num%2==0 ?
				"3 basamakli olmayan cift sayi" : "uc basamakli olmayan tek sayi";
		System.out.println(result);
			
		
		scan.close();
		
	}

}
