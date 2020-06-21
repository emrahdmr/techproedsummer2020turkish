package day06ifstatement;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		
		//kullanicidan bir dikdortgenin en veboyunu alin
		// en ve boy esit ise ekrana "bu bir karedir"
		// en boy farkli ise bu bir karedir yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("dikdortgenin enini giriniz");
		double en = scan.nextDouble();
		
		
	    System.out.println("dikdortgenin boyunu giriniz");
		double boy = scan.nextDouble();
				
		if (en==boy) {
		System.out.println("bu bir karedir");
		}
		
		if (en != boy) {
		System.out.println("bu bir dikdortgendir");
		}
		
		
		//else = baska diger ihtimallerin tamami
		// en ile boy esittir yada degildir
		
		//if (en==boy) {
		//System.out.println("bu bir karedir");
		//}
		//else {
			//System.out.println("bu bir dikdortgendir");
		//}
			
		
		
		scan.close();
		
	}

}
