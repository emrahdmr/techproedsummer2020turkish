package day06ifstatement;

import java.util.Scanner;

public class Odev10 {

	public static void main(String[] args) {
		
		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		//“Eþkenar üçgen” yazdýrýn. Sadece iki kenar uzunluðu birbirine eþit ise ekrana “Ikizkenar üçgen”
		//yazdýrýn. Tüm kenar uzunluklarý birbirinden farklý ise “Çeþitkenar üçgen yazdýrýn”

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 3 kenar uzunlugu giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("eskenar ucgen");
		} else if (num1 == num2 && num3 != num1   || num2 == num3 && num1 != num2  || num1 == num3 && num2 !=num1) {
			System.out.println("ikiz kenar ucgen");
		}else if (num1 !=num2 && num2 != num3 || num3 != num1 && num1 !=num2) {
			System.out.println("cesit kenar ucgen");
		
			scan.close();
			}
		
	}

}
