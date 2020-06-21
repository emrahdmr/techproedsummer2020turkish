package day15methodcreation;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		// Kullanýcýya sayý girmesini söyleyin.
		// Kullanýcýnýn girdiði sayýnýn rakamlarý toplamýný ekrana
		// yazdýran bir program yazýn.
	    
	    Scanner scan = new Scanner (System.in);
		System.out.println("lutfen birsayi giriniz");
		int num = scan.nextInt();
		
		rakamToplami(num)	;
		
		scan.close();
	}	
			
	public static void rakamToplami(int num) {
		int sum = 0;
		
		while(num!=0) {
			sum=sum+ num%10;
			num =num/10;
		}
	System.out.println("rakamlar toplami: "+ sum);
	}
		
}