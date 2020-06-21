package day10stringmethods;

import java.util.Scanner;

public class odev03 {

	public static void main(String[] args) {
		
		
		//  Kullanýcýdan ilk ve soy ismini alýn
		//ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdýrýn.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen adinizi giriniz ");
		String name = scan.next();
		name = name.toUpperCase();
		
		System.out.println("lutfen soyadinizi giriniz ");
		String surName = scan.next();
		surName = surName.toUpperCase();
		
		
		System.out.println(name.charAt(0));
		System.out.println(surName.charAt(0));
		
		
		
		scan.close();
		
		

	}

}
