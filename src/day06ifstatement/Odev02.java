package day06ifstatement;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
	/*	// Kullanýcýdan bir harf alýn eðer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdýrýn.
		// “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdýrýn
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		
		String harf= scan.next();
		
		if (harf.equals("a") || harf.equals("e") || harf.equals("i") || harf.equals("o") || harf.equals("u") ) {
			System.out.println("sesli harf");
		} else if (harf.equals("b") || harf.equals("c") || harf.equals("d") || harf.equals("f") ) {
			System.out.println("sessiz harf");
		} else {
			System.out.println("lutfen belirtilen harfleri giriniz");
		}
		*/	
		
		
		        Scanner scan = new Scanner(System.in);
		        
		        System.out.println("a, e, i, o, u, b, c, d, f harflerinden birini giriniz");
		        char harf = scan.next().charAt(0);
		        
		        if(harf=='a' || harf=='e' || harf=='i' || harf=='o' || harf=='u' ) {
		            System.out.println(harf + " sesli harftir.");
		        }else if(harf=='b' || harf=='c' || harf=='d' || harf=='f') {
		            System.out.println(harf + " sessiz harftir.");
		        }else {
		            System.out.println("Yanlis harf girdiniz.");
		        }
		    
		        scan.close();
		        }

}
