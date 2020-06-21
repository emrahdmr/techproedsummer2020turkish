package day04operators;

import java.util.Scanner;

public class Odev01 {

	public static void main(String[] args) {
		
		//odev 4 basamakli bir sayinin rakamlari toplami
		Scanner scan = new Scanner(System.in);
		System.out.println("4 basamakli bir sayi girin");
		
		int say = scan.nextInt();
				
		int birler = say % 10;
		
		int onlar1  = say / 10;
		int onlar  = onlar1 % 10;
		
		int yuzler1 = say / 100;
		int yuzler = yuzler1 % 10;
		
		int binler = say / 1000;
		
		System.out.println(birler + onlar + yuzler + binler);
	
		
		scan.close();	

	}

}
