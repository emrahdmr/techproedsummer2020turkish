package day13whiledowhileloops;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan bir String al�n ve bu String�in ilk harfi ile son harfinin yerlerini de�i�tirerek
		// ekrana yazd�r�n.
		// Ornegin; Kullan�c� �Java� girerse ekrana �aavJ� yazd�racaks�n�z
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir kelime yada cumle girin");
		String str = scan.next();
		
		//int str1= str.length()-1;
		char ilkharf = str.charAt(0);
		char sonharf = str.charAt(str.length()-1);
		
		System.out.println(sonharf+str.substring(1,str.length()-1)+ilkharf);
		
		
	scan.close();	

	}

}
