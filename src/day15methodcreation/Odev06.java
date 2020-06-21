package day15methodcreation;

import java.util.Scanner;

public class Odev06 {
		
		public static void main(String[] args) {
			//BILMECE OYUNU
			Scanner sc=new Scanner (System.in);
			
			String isim,tahmin,tahmin1, durum="";
			String cevap="kitap".toLowerCase();
			String cevap1="Nar".toLowerCase();
			
			System.out.println("Ilk adinizi giriniz");
			 isim=sc.next();
			System.out.println("BIL BAKALIM "+isim.toUpperCase());
			do {
				System.out.println("      Bilgi Verir Herkese En Guzel Dosttur Bize");
				tahmin=sc.next();
				
				if(tahmin.equals(cevap)) {
					System.out.println("       "+cevap.toUpperCase()+"  "+"Tebrikler "+isim.toUpperCase());durum="bildin";
					System.out.println();
					System.out.println("IKINCI BILMECE HAZIR MISIN? " +isim.toUpperCase());
					System.out.println();
					System.out.println("         Carsidan aldim 1tane eve geldim 1000tane");
					tahmin1=sc.next();
					if(tahmin1.equals(cevap1)) {
						System.out.println("    "+cevap1.toUpperCase()+"  "+"Tebrikler "+isim.toUpperCase());durum="bildin";
						
						
					}else {
						System.out.println("Uzgunum Tekrar Denemen Gerek");
					}
					}else {
						System.out.println("Uzgunum Tekrar Denemen Gerek");
						
					}
				}while(durum=="");
	sc.close();		

}}