package day02wrapperclasses;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		// kullanici bir karenin kenar uzunlugunu girsin
		//karenin cevresini ve alanini ekrana yazdiralim
		//kareniin cevresi a+a+a+a alani a*a
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen karenin bir kenar uzunlugunu giriniz.");

		int kenarUzunlugu =scan.nextInt();  //kullanici comsole 10 yazarsa
		
		System.out.println(kenarUzunlugu +kenarUzunlugu +kenarUzunlugu +kenarUzunlugu); //40
		System.out.println(kenarUzunlugu * kenarUzunlugu);  //100
	
		
		scan.close();
	}

}
