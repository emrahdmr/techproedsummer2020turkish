package day10stringmethods;

import java.util.Scanner;

public class odev03 {

	public static void main(String[] args) {
		
		
		//  Kullan�c�dan ilk ve soy ismini al�n
		//ilk ve soy isminin ilk harflerini b�y�k harf olarak ekrana yazd�r�n.

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
