package day12scopewhileloop;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten t�m tamsay�lar�n �arp�m�n� ekrana yazd�r�n.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degeri giriniz");
		int st = scan.nextInt();
		
		System.out.println("lutfen bitis degeri giriniz");
		int fn = scan.nextInt();
		
		if(st<=fn) {
			int carpma = 1; 
			while(st<=fn) {
				carpma = carpma*st;
				st++;}
	System.out.println(carpma);
			
		}else{
			int carpma = 1; 
			while(st>=fn) {
				carpma = carpma*st;
				st--;}
	System.out.println(carpma);
		
		}
		scan.close();
}
	

}
