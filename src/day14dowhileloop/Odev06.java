package day14dowhileloop;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		//Kullan�c�dan bir String al�n ve
		// bu String�in icinde �a� harfi varsa ekrana �a harfi var� yazd�r�n.
		// �a� harfi yoksa tekrar bir String girmesini isteyin.
		
		Scanner scan = new Scanner(System.in);
		String isim = "";
		do {
			System.out.println("Lutfen bir kelime veya cumle giriniz.");
			isim = scan.nextLine();
			
			if(isim.contains("a")) {
				System.out.println("a harfi var.");
			}else {
			 System.out.println("Tekrar giris yapin");
			}
					
		}while(!isim.contains("a"));

		
		scan.close();

	}

}
