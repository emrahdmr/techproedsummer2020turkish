package day02wrapperclasses;

import java.util.Scanner;

public class Odev08 {
	
	public static void main(String [] args) {
		
		//soru08
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir saat yaziniz");
		
		long saat = scan.nextLong();
		
		System.out.println(saat * 60 * 60);
		
		
		
		scan.close();
	}

}
