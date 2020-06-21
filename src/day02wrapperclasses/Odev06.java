package day02wrapperclasses;

import java.util.Scanner;

public class Odev06 {
	
	public static void main(String [] args) {
		
		//soru6
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ucgenin cevresini hesaplayiniz");
		
		
		byte a = scan.nextByte();
		byte b = scan.nextByte();
		byte c = scan.nextByte();
		
		System.out.println(a+b+c);
		
		scan.close();

	}
}
