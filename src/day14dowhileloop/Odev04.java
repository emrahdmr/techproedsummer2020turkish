package day14dowhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// Kullan�c�ya iki say� girmesini s�yleyin. 
		//Bu say�lar e�it ise ekrana �Kare olu�turdunuz� yazd�r�n.
		//E�it de�ilse tekrar iki say� girmesini s�yleyin
		
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
