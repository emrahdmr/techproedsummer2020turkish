package day14dowhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// Kullanýcýya iki sayý girmesini söyleyin. 
		//Bu sayýlar eþit ise ekrana “Kare oluþturdunuz” yazdýrýn.
		//Eþit deðilse tekrar iki sayý girmesini söyleyin
		
		Scanner scan = new Scanner(System.in);
		int num1;
		int num2;
		
		do {
			System.out.println("Lutfen 1.sayiyi girin");
			num1=scan.nextInt();
			System.out.println("Lutfen 2.sayiyi girin");
			num2=scan.nextInt();
			
			if(num1==num2) {
				System.out.println("Kare olusturdunuz.");
			}else {
				System.out.println("Tekrar iki sayi giriniz.");
			}
		}while(!(num1==num2));
		scan.close();
		

	}

}
