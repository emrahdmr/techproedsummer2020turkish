package day09switchoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		/* Kullan�c�dan bir tamsay� al�n e�er tamsay� 9 ise ekrana �Bir basamakl� en b�y�k say�� yazd�r�n.
        99 ise ekrana ��ki basamakl� en b�y�k say�� yazd�r�n.
        999 ise ekrana ��� basamakl� en b�y�k say�� yazd�r�n.
        Bu say�lar�n d���ndaki say�lar i�in �Yorum yok� yazd�r�n  
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
		
		switch (num){
		case 9:
			System.out.println("bir basamakli en buyuk sayi");
			break;
		case 99:
			System.out.println("iki basamakli en buyuk sayi");
			break;
		case 999:
			System.out.println("uc basamakli en buyuk sayi");
			break;
		default:
			System.out.println("yorum yok");
		}
		scan.close();	
	}

}
