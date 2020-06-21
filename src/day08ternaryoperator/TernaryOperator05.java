package day08ternaryoperator;

import java.util.Scanner;

public class TernaryOperator05 {

	public static void main(String[] args) {
	
		
		
		// kullanicidan bir karekter girmesini isteyiniz
		// karekter harf ise kucuk harf olup olmadini kontrol ediniz
		// kucuk harf ise ekrana "kucuk harf" yazdiriniz
		//buyuk harf ise ekrana "buyuk harf" yazdiriniz
		//harf degil se ekrana" harf degil yazdiriniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		String result = ((harf<=122 && harf>=97) || (harf<=90 && harf>=65))  ?
				(harf<=122 && harf>=97)? "kucuk harf"  : "buyuk harf" : "harf degil";
		System.out.println(result);

		//122 yerine z 97 yerine a da yazililabilir
		scan.close();
		
	}

}
