package day08ternaryoperator;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		
		/* Kullan�c�dan bir tamsay� girmesini isteyin,
		tamsay� �ift ise ekrana ��ift� tek ise ekrana �Tek�
		yazd�r�n.  */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir sayi giriniz");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "cift" : "tek";
		System.out.println(result);
		
		
		
		scan.close();

	}

}
