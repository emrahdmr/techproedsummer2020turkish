package day12scopewhileloop;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		
		//Kullan�c�dan ba�lang�� ve biti� de�erlerini al�n ve ba�lang�� de�erinden veya sonras�ndan
		// ba�lay�p biti� de�erinde veya �ncesinde biten t�m �ift tamsay�lar� while loop kullanarak
		// ekrana yazd�r�n�z.
         
		
         Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen baslangic degeri giriniz");
		int st = scan.nextInt();
		
		System.out.println("lutfen bitis degeri giriniz");
		int fn = scan.nextInt();
		
		int num =st;
		while (num<=fn) {
			if(num%2==0) {
				System.out.print(num + " ");	
			}
			num++;
		}
	scan.close();	
	}
}