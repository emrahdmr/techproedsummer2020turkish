package day02wrapperclasses;

import java.util.Scanner;

public class Odev05 {
	
	
	
	public static void main(String[] args) {
		
		//soru5
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen dairenin alan ve cevresini yaziniz");
	
	float radius = scan.nextFloat();
	
	System.out.println(3.14159 * radius * radius);
	
		
		
	scan.close();	
	}

}
