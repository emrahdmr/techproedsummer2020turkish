package day06ifstatement;

import java.util.Scanner;

public class Odev09 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan bir tamsay� al�n e�er tamsay� 0 dan kucuk ise ekrana �Negatif� yazd�r�n.
		//0 ise ekrana �N�tr� yazd�r�n. 0 dan b�y�k ise ekrana �Pozitif� yazd�r�n 
    
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("negatif");
		} if (num == 0) {
			System.out.println("notr");
		}if (num>0) {
			System.out.println("pozitif");
			
			scan.close();
		}
		
		
	}

}
