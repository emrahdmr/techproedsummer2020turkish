package day10stringmethods;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Yasadiginiz ulkenin isimini giriniz");
		String ulke = scan.nextLine();
		
		//Almanya ==> length 7, y nin indexi 5 
		System.out.println(ulke.toUpperCase().charAt(1));//2. harfin indexi 1 dir
		System.out.println(ulke.toUpperCase().charAt(ulke.length()-2));
		

scan.close();
	}

}
