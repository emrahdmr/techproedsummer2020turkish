package day07nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		
		// kullanicidan bir sayi alin
		// bu sayi pozitif  veya sifir ise 9 dan buyuk mu diye kontrol edin, 9 dan buyukse ekrana "sayi " yazdirin
		// 9 dan kucuk ve 0 dan kucuk esit ise ekrana rakam yazdirin
        // bu sayi negatif ise ekrana sayi yazdirsin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen tam bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num>=0) {
		 if(num>9) {
			 System.out.println("sayi");
		 }else if (num<=9 && num>=0){
			 System.out.println("rakam");
		 }
		 
		}else if (num<0) {
			 System.out.println("sayi");
		 }
		scan.close(); // scanneri kapatmak  main medhod altinda
		
	}
	
	}