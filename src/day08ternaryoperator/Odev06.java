package day08ternaryoperator;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir y�l girmesini isteyin, 
		// y�l art�k y�l ise ekrana �Art�k y�l� degilse ekrana
		//�Art�k y�l degil�yazd�r�n
  
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir yil giriniz");
		int num = scan.nextInt();
		
		String result = num%400==0 && num%100==0 || num%100!=0 &&num%4==0 ? "artik yil" : "artik yil degil";
		System.out.println(result);
		
		
		scan.close();
		
	}

}
