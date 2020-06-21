package day06ifstatement;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
	
		// Kullanýcýdan bir üçgenin üç kenar uzunluðunu alýn eðer üç kenar uzunluðu birbirine eþit ise ekrana
		// “Eþkenar üçgen” yazdýrýn. Diðer durumlarda ekrana “Eþkenar deðil” yazdýrýn

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ucgenin 3 kenar uzunlugunu giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 =scan.nextInt();
		
	    
	    
	    if (num1 == num2  && num2 == num3) {
	    	System.out.println("eskenar ucgen");
	    }else {
	    	System.out.println("eskenar ucgen degil");
	    }
	    
	    scan.close();   
	}

}
