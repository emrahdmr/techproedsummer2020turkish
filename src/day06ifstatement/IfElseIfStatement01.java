package day06ifstatement;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		
		// kullanicidan yasini alin
		//yas 13 den az ise ekrana "ekrana calisamaz" yazdirin
		// yas 13 den 65 e kadar ise ekrana "calisabilir yazdirin
		//yas 65 den buyuk ise ekrana " emekli "yazdirin
		//yas negatif ise " yasa negatif olamz" cikitis
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen yasinizi giriniz");
		
		int yas = scan.nextInt();
		
		if(yas<0) {
		System.out.println("yas negatif olamaz");
		}
		else if (yas < 13) {
			System.out.println("calisamaz");
		}else if(yas<=65) {
		System.out.println("calisabilir");
		} else {
	   System.out.println("emekli");
		}
		scan.close();
	}

}
