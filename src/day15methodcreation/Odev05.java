package day15methodcreation;

import java.util.Scanner;

public class Odev05 {

	public static void main(String[] args) {
		
		/*Kullanýcýya bir String girmesini söyleyin ve bu String’i yukarýdan aþaðýya doðru yazdýran
                  Program yazýnýz. Ornegin; CAN ==> C
                                                    A
                                                    N    */
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir kelime giriniz");
		String str=scan.next().toUpperCase();
		int lenght=str.length();
		int i=0;
		yatay(str,lenght,i);
	
		scan.close();
	}
	
	public static void yatay(String str,int lenght,int i) {
		while(i<lenght) {
		System.out.println(str.charAt(i));
		i++;
	}
	}
		
	}


