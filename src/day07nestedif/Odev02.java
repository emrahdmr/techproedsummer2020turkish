package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		/* Kullanýcýdan bir harf girmesini isteyin.
        Girdiði küçük harf ise harfin “a” olup olmadýðýný kontrol edin.
        Harf “a” ise ekrana “Ilk küçük harf” yazdýrýn.
       “a” deðil ise ekrana “Ilk küçük harf deðil” yazdýrýn.
        Girdiði büyük harf ise harfin “Z” olup olmadýðýný kontrol edin. 
        Harf “Z” ise ekrana “Son büyük harf” yazdýrýn.
       “Z” deðil ise ekrana “Son büyük harf deðil” yazdýrýn 
       */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir har giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>=97 &&  harf<=122) {
			if (harf =='a') {
				System.out.println("ilk kucuk harf");
			}else {
				System.out.println("ilk harf kucuk degil");
			}
		}else if (harf >=65 && harf<=90) {
		    if (harf =='Z') {
		    	System.out.println("son buyuk harf");
		    }else {
		    	System.out.println("son harf buyuk degil");
		    }
		
			
		}
		
	scan.close();	
		
	}

}
