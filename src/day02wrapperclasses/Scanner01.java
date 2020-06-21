package day02wrapperclasses;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		
		
		//kullanici ik tam sayi versin
		// program bu iki tam sayinin toplamini ve carpimini ekrana versin
		
		Scanner scan = new Scanner(System.in); //scannner class ini import ettik.
 		
		System.out.println("Lutfen Iki Tam Sayi Giriniz");
		
		int say1 = scan.nextInt();
		int say2 = scan.nextInt();
		
		System.out.println(say1 + say2);
		System.out.println(say1 * say2);
	
		scan.close();	
	}

}
