package day02wrapperclasses;

import java.util.Scanner;

public class Scanner04 {

	public static void main(String[] args) {
		
		/*
	     Kullan�c�dan dikd�rtgenin boyutlar�n� alan ve sonra dikt�rtgenin alan ve 
	     cevresini hesaplay�p ekrana yazd�ran bir program yaz�n�z. 
	     Not: Alan: Boy x En
	     Not: �evre: 2x (Boy + En)
       */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen dikdorgenin boyu ve enini giriniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(en * boy);
		System.out.println(2* (en + boy));		
		
		scan.close();				
	}
}
