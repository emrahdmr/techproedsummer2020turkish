package day09switchoperator;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
	
		/*
		  Kullan�c�dan A, B, C, D harflerinden birini al�n e�er harf C ise ekrana �Do�ru cevap� yazd�r�n.
         A, B, D den biri ise ekrana �Yanl�� cevap� yazd�r�n.
         Bu harflerin d���ndaki harfler i�in �Ge�ersiz cevap ��kk�� yazd�r�n
		 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen dogru sikki giriniz");
		char cevap = scan.next().charAt(0);
		 
		switch (cevap) {
		case 'A' :
			System.out.println("yanlis cevap");
			break;
		case 'B' :
			System.out.println("yanlis cevap");
			break;
		case 'C' :
			System.out.println("Dogru cevap");
			break;
		case 'D' :
			System.out.println("yanlis cevap");
			break;
		default :
			System.out.println("gecersiz cevap sikki");
		
		
		}
		
		scan.close();
	}

}
