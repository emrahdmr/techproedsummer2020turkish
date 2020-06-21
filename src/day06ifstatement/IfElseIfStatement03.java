package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		
		// kullanicidan 6 basamakli bir sayi isteyin 0 ilede baslayabilir
		//kazanma ihtimali %20, amorti ihtimail %30 , kaybetmet ihtimali %50 olan 
		// bir jackpot oyunu icin program yaziniz
		//000000 -000001 -999998-999999===1000000

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen 6 basamakli bir sayi giriniz. sifir basta kullanilabilir");
		
		int num = scan.nextInt();
		
		if (num <200000) {
			System.out.println("kazandiniz");
		} else if (num <500000) {
			System.out.println("tekrar deneyiniz");
		} else {
			System.out.println("kaybettiniz");
		}
			
		
		scan.close();	
	}

}
