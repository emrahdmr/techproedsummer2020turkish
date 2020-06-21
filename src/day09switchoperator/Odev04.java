package day09switchoperator;

import java.util.Scanner;

public class Odev04 {

	public static void main(String[] args) {
		
		/*Kullanýcýdan ay ismi alýn eðer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdýrýn.
         Eðer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdýrýn.
         Eðer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Þubat ayýdýr” yazdýrýn.
         Bu isimlerin dýþýndaki isimler için “Geçersiz ay ismi” yazdýrýn.
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
