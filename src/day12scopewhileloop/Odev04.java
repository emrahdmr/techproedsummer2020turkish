package day12scopewhileloop;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten t�m tamsay�lar�n toplam�n� ekrana yazd�r�n.
		
		  Scanner scan = new Scanner(System.in);
			
			System.out.println("lutfen baslangic degeri giriniz");
			int st = scan.nextInt();
			
			System.out.println("lutfen bitis degeri giriniz");
			int fn = scan.nextInt();
			
			if(st<=fn) {
				int sum = 0; 
				while(st<=fn) {
					sum = sum+st;
					st++;}
		System.out.println(sum);
				
			}else{
				int sum = 0; 
				while(st>=fn) {
					sum = sum+st;
					st--;}
		System.out.println(sum);
			
			}	
			scan.close();
	}

}
