package day09switchoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		/*Kullan�c�dan ay ismi al�n e�er ay ismi 31 �eken aylardan biri ise ekrana �Bu ay 31 g�nd�r� yazd�r�n.
         E�er ay ismi 30 �eken aylardan biri ise ekrana �Bu ay 30 g�nd�r� yazd�r�n.
         E�er ay ismi 28 veya 29 �eken aylardan biri ise ekrana �Bu ay �ubat ay�d�r� yazd�r�n.
         Bu isimlerin d���ndaki isimler i�in �Ge�ersiz ay ismi� yazd�r�n.
        */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ay ismi giriniz");
		String ay = scan.next();
		ay = ay.toLowerCase(); 
		
		switch (ay) {
		case "ocak" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "mart" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "mayis" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "temmuz" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "agustos" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "ekim" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "aralik" :
			System.out.println("bu ay 31 gundur");
		    break;
		case "nisan" :
			System.out.println("bu ay 30 gundur");
		    break;
		case "haziran" :
			System.out.println("bu ay 30 gundur");
		    break;
		case "eylul" :
			System.out.println("bu ay 30 gundur");
		    break;
		case "kasim" :
			System.out.println("bu ay 30 gundur");
		    break;
		case "subat" :
			System.out.println("bu ay subat ayidir");
		    break;
		default :
			System.out.println( "gecersiz ay ismi");
		    
		
		}
		scan.close();
		
		
	}

}
