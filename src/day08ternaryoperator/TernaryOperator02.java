package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator02 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 sayi alin 
		//bu sayilar birbirine esit ese toplamlarini ekrana yazdirin
		// sayilar birbirinden farkli ise carpimlarini ekrana yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen ikinci sayiyi giriniz");
		int num1 = scan.nextInt();
		System.out.println("lutfen birinci sayiyi giriniz");

		int num2 = scan.nextInt();
		
		int sonuc = num1 == num2 ?   num1+num2   : num1*num2;
		System.out.println(sonuc);
	
		scan.close();
	}

}
