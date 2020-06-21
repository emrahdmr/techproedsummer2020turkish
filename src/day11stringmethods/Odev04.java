package day11stringmethods;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		
		// // Kullanýcýdan baþlangýç ve bitiþ deðerlerini alýn ve baþlangýç deðerinden baþlayýp bitiþ deðerinde
		// biten tum tamsayilarin toplamini ekrana yazdirin
		
		
		Scanner scan = new Scanner(System.in);
		   System.out.println("balangic degerini giriniz"); 
		   int num1 = scan.nextInt();
		   
		   System.out.println("bitis degerini giriniz");
		   int num2 =scan.nextInt();
            
            //int sum=scan.nextInt();
            
            int sum =0;
            for(int i=num1; i<num2; i++) {
                sum = sum + i;
            }
            System.out.println("Toplam: " + sum);

            scan.close();
	}

}
