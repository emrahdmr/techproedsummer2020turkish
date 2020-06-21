package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		//kulllanicidan bir tam sayi isteyin, o tam sayinin mutlak degerini ekrana yazdirin
		//  mutlak deger sayinin kendi isareti ile carpilmasi
		// -3 un mutlak degeri -1*-3 = 3 +arti ise + , - ise -
		//  5 in mutlak degeri 1*5= 5
		
	  Scanner scan = new Scanner(System.in); 
	 
	  System.out.println(" luten bir tam sayi giriniz");
	  int num = scan.nextInt();
	  
	  if (num>0) {
		 System.out.println(num*(+1));
		 
	  }else {
		  System.out.println(num*(-1));
	  }
		  
		  
	  scan.close();  
		  
	} }	  
		  
		  
		  
	  
		  
	