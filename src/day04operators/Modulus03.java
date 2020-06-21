package day04operators;

import java.util.Scanner;

public class Modulus03 {

	public static void main(String[] args) {
		
		
		// kullanicidan 3 sbasamakli bir tam sayi alin. ve bu sayilarin rakamlarini toplanini bukunuz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli bir tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		int sonRakam = sayi %10;
		
		int v = sayi /10;
		int ortaRakam = v %10;
		
		int ilkRakam = sayi /100; //3 basamakli sayinin ilk rakamini bulmak icin sayi 100 bolunur
		                          // 4 basamakli sayi ise 4 e bolunur
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		scan.close();
	}

}
