package day06ifstatement;

import java.util.Scanner;

public class Odev07 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan alaca�� �r�n miktar�n� ve �r�n�n birim fiyat�n� al�n. E�er urun miktar� 1000 den fazla ise
		//Kullan�c�ya %10 indirim yap�n ve �demesi gereken toplam paray� ekrana yazd�r�n. Di�er durumlarda
		//�demesi gereken toplam paray� herhangi bir indirim yapmadan ekrana yazd�r�n

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen urun miktarini giriniz");
		int miktar = scan.nextInt();
		
		System.out.println("lutfen birim fiyati giriniz");
		int fiyat = scan.nextInt();
		
		if (miktar>1000) {
			System.out.println(miktar* (fiyat*90)/100);
			
		} else  { 
			System.out.println(miktar*fiyat);
			
		}
			
		
		
		scan.close();
		}

}
