package day07nestedif;

import java.util.Scanner;

public class Odev02 {

	public static void main(String[] args) {
		
		/* Kullan�c�dan bir harf girmesini isteyin.
        Girdi�i k���k harf ise harfin �a� olup olmad���n� kontrol edin.
        Harf �a� ise ekrana �Ilk k���k harf� yazd�r�n.
       �a� de�il ise ekrana �Ilk k���k harf de�il� yazd�r�n.
        Girdi�i b�y�k harf ise harfin �Z� olup olmad���n� kontrol edin. 
        Harf �Z� ise ekrana �Son b�y�k harf� yazd�r�n.
       �Z� de�il ise ekrana �Son b�y�k harf de�il� yazd�r�n 
       */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen bir har giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf>=97 &&  harf<=122) {
			if (harf =='a') {
				System.out.println("ilk kucuk harf");
			}else {
				System.out.println("ilk harf kucuk degil");
			}
		}else if (harf >=65 && harf<=90) {
		    if (harf =='Z') {
		    	System.out.println("son buyuk harf");
		    }else {
		    	System.out.println("son harf buyuk degil");
		    }
		
			
		}
		
	scan.close();	
		
	}

}
