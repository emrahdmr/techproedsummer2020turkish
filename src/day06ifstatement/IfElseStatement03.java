package day06ifstatement;

import java.util.Scanner;

public class IfElseStatement03 {

	public static void main(String[] args) {
		
		//kullanicidan alacagi urun miktarini ve fiyatini alalim
		//eger kullanici 1000den fazla urun alirsa %20 indirim yapalim
		// 1000 veya 1000 den az urun alirsa indirim alirsa indirim yapmayin 
		//ve kullanicinin odeyecegi toplam fiyati ekrana yazdirin
		//NOT1: para konularinda double kullan
		//ornek 60tl ye %20 indirim ==> 60*80/100
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("alacaginiz urun miktarini giriniz");
		
		double miktar = scan.nextDouble();
		
		System.out.println("alacaginiz urunun birim fiyatini girniz");
		double birimFiyat = scan.nextDouble();
		
		if (miktar > 1000) {
	   System.out.println( miktar*(birimFiyat*80)/100);
	  
		}else {
			System.out.println(miktar*birimFiyat);
		}
			
		scan.close();	
		
		
	}

}
