package day08ternaryoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		//En ve boy eþit ise ekrana “Kare”
		//farklý ise ekrana “Dikdörtgen” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen dikdorrgenin EN ve BOY unu giriniz");
        int en = scan.nextInt();
        int boy = scan.nextInt();
        
      String sonuc = en==boy ? "kare" : "dikdortgen";
      System.out.println(sonuc);
      
      
      scan.close();
	}

}
