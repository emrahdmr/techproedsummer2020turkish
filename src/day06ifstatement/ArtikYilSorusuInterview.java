package day06ifstatement;

import java.util.Scanner;

public class ArtikYilSorusuInterview {

	public static void main(String[] args) {
		
		
		// Kullanicidan yil girmesini isteyin
		// Girilen yil artik yil ise ekrana “Artik Yil” yazdirin
		// Girilen yil artik yil degil ise ekrana “Artik Yil Degil” yazdirin
        //*not bilgi artik yil: yil 100 e bolunurse 400 e de bolunebilmeli 
		// ornek 1300 artik yil degil cunku 100e bolunur 400 e bolunmez
		// 1200 artik yildir hem 400 e hem 100e bolunur
		//* yil 100 e bolunmezse 4 e bolunmeli
		//
		
		
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("yil giriniz");
	  int yil = scan.nextInt();
	  
	  if (yil%100 ==0  && yil%400 ==0) {
		  System.out.println(yil +" artik yildir");
	  } else if (yil%100 !=0 && yil%4 ==0 ) {
	      System.out.println("artik yil degildir");
		  
	      scan.close();	  
	  }
		  
	  
		
	}
	

}
