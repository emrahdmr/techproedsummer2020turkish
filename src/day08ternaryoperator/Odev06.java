package day08ternaryoperator;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		
		// Kullanýcýdan bir yýl girmesini isteyin, 
		// yýl artýk yýl ise ekrana “Artýk yýl” degilse ekrana
		//“Artýk yýl degil”yazdýrýn
  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir yil giriniz");
		int num = scan.nextInt();
		
		String result = num%400==0 && num%100==0 || num%100!=0 &&num%4==0 ? "artik yil" : "artik yil degil";
		System.out.println(result);
		
		
		scan.close();
		
	}

}
