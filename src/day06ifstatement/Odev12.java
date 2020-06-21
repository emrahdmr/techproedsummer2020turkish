package day06ifstatement;

import java.util.Scanner;

public class Odev12 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan bir yýl alýn eðer yýl 1000’e bolunuyorsa ekrana “Milenyum” yazdýrýn.
		//Eðer yýl 100’e bolunuyorsa ekrana “Yüzyýl” yazdýrýn.
		//Eðer yýl 10’a bolunuyorsa ekrana “Onyýl” yazdýrýn.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir yil giriniz");
		int year = scan.nextInt();
		
		if (year%1000 ==0) {
			System.out.println("milenyum");
		} else if (year%100 ==0) {
			System.out.println("yuzyil");
		}else if (year%10 ==0) {
			System.out.println("onyil");
		}
		
		scan.close();	
		
	}

}
