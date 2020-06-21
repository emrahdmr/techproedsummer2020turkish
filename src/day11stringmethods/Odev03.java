package day11stringmethods;

import java.util.Scanner;

public class Odev03 {

	public static void main(String[] args) {
		
		
		// Kullanıcıdan başlangıç ve bitiş değerlerini alın ve başlangıç değerinden veya sonrasından
		//başlayıp bitiş değerinde veya öncesinde biten tüm 3 ile bölünebilen tamsayıları ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		   System.out.println("balangic degerini giriniz"); 
		   int bs = scan.nextInt();
		   
		   System.out.println("bitis degerini giriniz");
		   int bt =scan.nextInt();
		   
		 
		  if (bs>=bt) {
			  System.out.println("baslangic degeri bitis degerinden kucuk olmalisir");
		  }else {
		   for (int i=bs; i<bt ; i++)  {
			   if (i%3==0) {
			   
			  
		   System.out.print(i + " ");
		
			   }
		   }
	}
	scan.close();
	
	}
	
}
