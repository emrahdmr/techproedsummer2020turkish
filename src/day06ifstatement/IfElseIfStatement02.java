package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		
		
		// kullanicidan sinav notunu  tam sayi girmesi isteyin
		// negatif girerse "yanlis deger girdiniz" yazsin
		//0 dan buyuk 50 den kucuk girerse ekrana kaldiniz yazdirin
		// 50 den buyuk ve esit 80 den kucuk ise ekrana " gectiniz yazdirin
		//80 den buyuk ve esit 100 den kucuk ise ekran "tebrikler" yazdirin
       
		
	   Scanner scan = new Scanner(System.in);
	   System.out.println("lutfen sinav notunuzu giriniz");
	   int not = scan.nextInt();
	   
	   if (not < 0 ) {
	   System.out.println("yanlis deger girdiniz");
	   
	   } else if (not<50) {
		   System.out.println("kaldiniz");
		
	   } else if (not < 80) {
		System.out.println("gectiniz");
	   } else if (not <=100 ) {
	   System.out.println("Tebrikler ");
	   } else {
		   System.out.println("yuzden buyuk deger giremezsiniz");
	   }
	   scan.close();
	}
	

}
