package day06ifstatement;

import java.util.Scanner;

public class Odev12 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir y�l al�n e�er y�l 1000�e bolunuyorsa ekrana �Milenyum� yazd�r�n.
		//E�er y�l 100�e bolunuyorsa ekrana �Y�zy�l� yazd�r�n.
		//E�er y�l 10�a bolunuyorsa ekrana �Ony�l� yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir yil giriniz");
		int year = scan.nextInt();
		
		if (year%1000 ==0) {
			System.out.println("milenyum");
		} else if (year%100 ==0) {
			System.out.println("yuzyil");
		}else if (year%10 ==0) {
			System.out.println("onyil");
		}
		
		scan.close();	
		
	}

}
