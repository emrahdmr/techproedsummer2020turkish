package day06ifstatement;

import java.util.Scanner;

public class Odev08 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın.
		//Diğer durumlarda ekrana “Harf değil” yazdırın.

						
				Scanner scan=new Scanner(System.in);
				System.out.println("Bir karakter giriniz");
				
				char harf = scan.next().charAt(0);
				       //if(Character.isAlphabetic(harf)) {
					   //System.out.println("Harf");
				       //  }else {
					   // System.out.println("HarfDegil");
		if((harf<=122 && harf>=97) || (harf<=90 && harf>=65)) {
			System.out.println("bu bir hartir");
		}else {
			System.out.println("bu bir harf degildir");
		}
		scan.close();	
				}
	
	}	
				
