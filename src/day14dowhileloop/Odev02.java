package day14dowhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n 
		//ve ba�lang�� de�erinden ba�lay�p biti� de�erinde
		//biten 4 ve 6 ile b�l�nebilen t�m tamsay�lar� ekrana yazd�r�n�z.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen baslangic ve bitis degeri girin");
		int bas = scan.nextInt();
		int bit = scan.nextInt();
		
		do {
			if(bas%4==0 && bas%6==0) {
				System.out.println(bas);
			}else if(bit%4==0 && bit%6==0) {
				System.out.println(bit);
			 }bas++;
				
			
		}while(bas<bit);

		scan.close();
	}

}
