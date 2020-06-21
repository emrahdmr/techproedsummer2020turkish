package day14dowhileloop;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		//Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn 
		//ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		//biten 4 ve 6 ile bölünebilen tüm tamsayýlarý ekrana yazdýrýnýz.
		
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
