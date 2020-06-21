package Java_Review_Turkish;

import java.util.Scanner;

public class day2_2 {
	
	public static void main(String [] args) {
		
		
		// Scanner kullanarak kullanýcýdan saat, dakika ve saniye 
		//bilgilerini alarak sonucu yazdýrýnz
	    // saat,dakika, saniye -->int
	    // PM veya AM--> String
	    // Örn: 11:25:33 PM
		
		int saat, dakika, saniye;
		String amORpm ="";  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen saat degeri  giriniz");
		saat =scan.nextInt();

		System.out.println("lutfen dakika degeri  giriniz");
		dakika =scan.nextInt();
		
		System.out.println("lutfen saniye degeri  giriniz");
		saniye =scan.nextInt();
		
		System.out.println("lutfen am veya pm giriniz");
		amORpm =scan.next();
		
		System.out.println(saat+":"+dakika +":" +saniye +":"+amORpm);	
		
		scan.close();
	}

}
