package day14dowhileloop;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		
		// Kullanýcýya sayý girmesini söyleyin. 
		//Kullanýcý sýfýr girdiðinde, ekrana o ana kadar girmiþ olduðu
		//tüm sayýlarýn toplamýný yazdýrýnýz.
		//Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdýrýn
       

		Scanner scan = new Scanner(System.in);
			
		int num=0;
		int sum=0;
		
		do {
			System.out.println("lutfensayi  degeri girin");
			num = scan.nextInt();
			sum =sum+num;
			
		}while(num!=0);
		System.out.println("toplam ="+ sum);
		
		scan.close();
	}

}
