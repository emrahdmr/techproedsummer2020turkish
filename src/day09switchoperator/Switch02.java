package day09switchoperator;

import java.util.Scanner;

public class Switch02 {

	public static void main(String[] args) {
	
		
		// kullanici haftanin gun numarasini girsin
		//programiniz gunun ismini yazsin
		//yanlis gun girerse "gecerli gun sayisi giriniz
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("gun numarasi giriniz");
		
		int gunNum = scan.nextInt();
		
		switch  (gunNum) {
		case 1 :
			System.out.println("pazartesi");
		break;
		case 2 :
			System.out.println("sali");
		break;
		case 3 :
			System.out.println("carsamba");
		break;
		case 4 :
			System.out.println("persembe");
		break;
		case 5 :
			System.out.println("cuma");
		break;
		case 6 :
			System.out.println("cumartesi");
		break;
		case 7 :
			System.out.println("pazar");
		default:
		   System.out.println("gecerli gun sayisi giriniz");
		
		
		}
		
		
	scan.close();	

	}

}
