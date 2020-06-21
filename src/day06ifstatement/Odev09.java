package day06ifstatement;

import java.util.Scanner;

public class Odev09 {

	public static void main(String[] args) {
		
		
		//Kullanýcýdan bir tamsayý alýn eðer tamsayý 0 dan kucuk ise ekrana “Negatif” yazdýrýn.
		//0 ise ekrana “Nötr” yazdýrýn. 0 dan büyük ise ekrana “Pozitif” yazdýrýn 
    
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir sayi giriniz");
		int num = scan.nextInt();
		
		if (num<0) {
			System.out.println("negatif");
		} if (num == 0) {
			System.out.println("notr");
		}if (num>0) {
			System.out.println("pozitif");
			
			scan.close();
		}
		
		
	}

}
