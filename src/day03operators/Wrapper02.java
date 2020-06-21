package day03operators;

import java.util.Scanner;

public class Wrapper02 {

	public static void main(String[] args) {
		
		//kullanicidan ilk ismini alin ekrana yazdirin 
		//kullanicidan soy ismini alin ekrana ilk ismin altina yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen adiniz yaziniz");
		String isimIlk = scan.nextLine();
		
		
		System.out.println("Lutfen soy adinizi yaziniz");
		String soyad = scan.nextLine();
		
		
		System.out.println(isimIlk);
		System.out.println(soyad);
		
		
		scan.close();
	}
}
