package day15methodcreation;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		//Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, 
		// birinci sayı büyük ise ekran “Birinci sayı büyük”, 
		// ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki sayi giriniz");
		int num1 =scan.nextInt();
		int num2 = scan.nextInt();
		
		
		sayi (num1, num2);
		scan.close();		
		
	}

	private static void sayi(int num1, int num2) {
		if (num1==num2) {
			System.out.println("Esit");
		}else if (num1>num2) {
			System.out.println("birinci buyuk sayi");
		}else 
			System.out.println("ikinci buyuk sayi");
		
		
	}

}
