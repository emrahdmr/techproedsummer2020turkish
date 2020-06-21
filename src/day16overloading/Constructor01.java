package day16overloading;

public class Constructor01 {
	
	int price =20000;
	int year = 2020;
	String make = "Honda";
	String type ="Civic";
                                //(string vs vs )vs vs default Constructor da olmaz
	public static void main(String[] args) {
		  
		//her bir class ayrica non data type dir. 
		//asagida Constructor01 non data type tir. biz uretttik
		// new kelimesi obje uretmek icin kullanilir.
		//eger bir satirda new varsa orda obje uretiliyordur
		//class olusturdugumuzda java clasla beraber bir Constructor olusturur
		// biz onu herhangi code yazmadan dorek kullanabiliriz
		//biz bunlara default Constructor denir. 
		//default Constructor da parametre olmaz
	    // default Constructor class olustruldugu anda java taranfindan  olusturulur. 
		//default Constructor biz kendimiz olusturdugumuzda java kendinin default Constructor imha eder
		
		//datatype   //isim
		Constructor01 hondaAraba = new Constructor01(); //bir tane object uretildi //araba
		
		 System.out.println("price = " + hondaAraba.price); //20000
		 System.out.println("year = "+ hondaAraba.year);   //2020
		 System.out.println("make = " + hondaAraba.make); //honda
		 System.out.println("type = " + hondaAraba.type); //civic
		
		

	}

}
