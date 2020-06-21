package day09switchoperator;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		/* Kullanýcýdan bir tamsayý alýn eðer tamsayý 9 ise ekrana “Bir basamaklý en büyük sayý” yazdýrýn.
        99 ise ekrana “Ýki basamaklý en büyük sayý” yazdýrýn.
        999 ise ekrana “Üç basamaklý en büyük sayý” yazdýrýn.
        Bu sayýlarýn dýþýndaki sayýlar için “Yorum yok” yazdýrýn  
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir tam sayi giriniz");
		int num = scan.nextInt();
		
		switch (num){
		case 9:
			System.out.println("bir basamakli en buyuk sayi");
			break;
		case 99:
			System.out.println("iki basamakli en buyuk sayi");
			break;
		case 999:
			System.out.println("uc basamakli en buyuk sayi");
			break;
		default:
			System.out.println("yorum yok");
		}
		scan.close();	
	}

}
