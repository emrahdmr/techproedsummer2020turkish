package day12scopewhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
	// biten t�m tamsay�lar� while loop kullanarak ekrana yazd�r�n�z.
	
	   
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degeri giriniz");
		int st = scan.nextInt();
		
		System.out.println("lutfen bitis degeri giriniz");
		int fn = scan.nextInt();
		
		int num =st;
		while (num<fn) {
			System.out.print(num + " ");
			num++;
		}
	scan.close();	
	}
}
