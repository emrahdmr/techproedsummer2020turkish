package day02wrapperclasses;

import java.util.Scanner;

public class odev02 {
	
	public static void main(String [] args) {
		
		//soru 1
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin alan ve cevesini  yaziniz");
		
		int en = scan.nextInt();
		int boy = scan.nextInt();
		
		System.out.println(boy * en);
		System.out.println(2* (boy + en));
		
		scan.close();
			
	}

}
