package day13whiledowhileloops;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		
		// Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n 
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten 3 ve 5 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degiri giriniz");
		int num1 = scan.nextInt();
		System.out.println("lutfen bitis  degeri giriniz");
		int num2 = scan.nextInt();
		
		int num = num1;
		while (num<num2) {
			if (num%3==0 && num%5==0) {
			}
			num++;
			System.out.println(num);


		}
		
		scan.close();
	}

}
