package day06ifstatement;

import java.util.Scanner;

public class Odev06 {

	public static void main(String[] args) {
	
		// Kullan�c�dan bir ��genin �� kenar uzunlu�unu al�n e�er �� kenar uzunlu�u birbirine e�it ise ekrana
		// �E�kenar ��gen� yazd�r�n. Di�er durumlarda ekrana �E�kenar de�il� yazd�r�n

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen ucgenin 3 kenar uzunlugunu giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 =scan.nextInt();
		
	    
	    
	    if (num1 == num2  && num2 == num3) {
	    	System.out.println("eskenar ucgen");
	    }else {
	    	System.out.println("eskenar ucgen degil");
	    }
	    
	    scan.close();   
	}

}
