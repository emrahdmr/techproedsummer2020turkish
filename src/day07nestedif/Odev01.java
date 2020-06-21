package day07nestedif;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		/*Kullanýcýdan cinsiyetini girmesini isteyin.  
		 * Erkek ise yaþýný kontrol edin. Yaþý 18 den küçük ise ekrana “Erkek çocuk” yazdýrýn. 
		 * Yaþý 18 den büyük eþit ise ekrana “Adam” yazdýrýn.
		 *  Kadin ise yasini kontrol edin. Yaþý 18 den küçük ise ekrana “Kýz çocuk” yazdýrýn. 
		 *  Yaþý 18 den büyük eþit ise ekrana “Kadýn” yazdýrýn. 
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
