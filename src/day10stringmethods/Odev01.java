package day10stringmethods;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
	   
		// Kullan�c�dan kredi kart� numaras�n� al�n 
		// ve bu numaran�n ���nc�, d�rd�nc� ve 
		// sonuncu rakamlar�n� ekrana yazd�r�n.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen kredi karti numaranizi giriniz");
		String card = scan.next();
		int    length = card.length();
		
	System.out.println(card.charAt(2));
	System.out.println(card.charAt(3));
	System.out.println(card.charAt(length-1));
		
		
	scan.close();
	}

}
