package day11stringmethods;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		//ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� ekrana yazd�r�n.

		
		Scanner scan = new Scanner(System.in);
		   System.out.println("balangic degerini giriniz"); 
		   int bs = scan.nextInt();
		   
		   System.out.println("bitis degerini giriniz");
		   int bt =scan.nextInt();
		   
		
			   
		   for (int i=bs; i<bt ; i++) {
		   if (i%2==0) {
		   System.out.print(i + " ");
			
		   }
		   }
		   scan.close();
	}

}
