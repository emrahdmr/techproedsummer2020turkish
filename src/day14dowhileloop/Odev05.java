package day14dowhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		// Kullanýcýya bir String girmesini söyleyin 
		// ve bu String’in ilk harfi ile son harfi ayný ise
		// ekrana “Simetrik” yazdýrýn. Ayný deðilse tekrar bir String girmesini isteyin
		
		Scanner scan = new Scanner(System.in);
		String simetrik ="";
		
		do {
			System.out.println("Lutfen bir kelime veya cumle giriniz");
			simetrik=scan.nextLine();
			if(simetrik.charAt(0)==simetrik.charAt(simetrik.length()-1)) {
				System.out.println("Simetrik");
			}else {
				System.out.println("Tekrar giris yapin ");
			}
		}while(!(simetrik.charAt(0)==simetrik.charAt(simetrik.length()-1)));
		
		scan.close();

		
	}

}
