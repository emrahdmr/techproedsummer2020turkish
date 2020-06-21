package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		/*Kullan�c�dan cinsiyetini girmesini isteyin.  
		 * Erkek ise ya��n� kontrol edin. Ya�� 18 den k���k ise ekrana �Erkek �ocuk� yazd�r�n. 
		 * Ya�� 18 den b�y�k e�it ise ekrana �Adam� yazd�r�n.
		 *  Kadin ise yasini kontrol edin. Ya�� 18 den k���k ise ekrana �K�z �ocuk� yazd�r�n. 
		 *  Ya�� 18 den b�y�k e�it ise ekrana �Kad�n� yazd�r�n. 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen cinsiyeyinizi belirtin");
		String cinsiyet = scan.next();
		
		System.out.println("lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		
		if (cinsiyet.equalsIgnoreCase("erkek")) {
			if(yas<18) {
				System.out.println("Erkek Cocuk");
			}else {
				System.out.println("ADAM");
			}
		} else if (cinsiyet.equalsIgnoreCase("kadin")) {
			if (yas<18) {
				System.out.println("Kiz Cocuk");
			}else {
				System.out.println("KADIN");
			}
		}
		scan.close();
	}

}
