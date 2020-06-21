package Java_Review_Turkish;

import java.util.Scanner;

public class day1_2 {

	public static void main(String[] args) {
		
		
		System.out.println("Hello World");
/* ***********************************************************************************		
	//Soru1:	Aþaðýdaki pascal üçgenini ekrana yazdýran bir program yazýnýz
        1
      1   1
    1   2   1
  1   3   3   1
1   4   6   4   1 */


		System.out.println("        1");
		System.out.println("       1  1");
		System.out.println("      1  2  1");
		System.out.println("     1  3  3 1");
		System.out.println("    1  4  6  4 1");
		
		
//****************************************************************************		
/* Soru 2: Aþaðýdaki þekli ekrana yazdýran bir program yazýnýz
	     A
	    B B
	   C   C
	  D     D
	 E       E
	F         F
	 E       E
	  D     D
	   C   C
	    B B
	     A     */
	

		System.out.println("      A");
		System.out.println("     B  B");
		System.out.println("    C    C");
		System.out.println("   D      D");
		System.out.println("  E        E");
		System.out.println(" F          F");
		System.out.println("  E        E");
		System.out.println("   D      D");
		System.out.println("    C    C");
		System.out.println("     B  B");
		System.out.println("      A");
	//*************************************************************************	
	/* Soru 3:	 Saðlýðýn için "Evde Kal". cümlesini ekranda yazdýrýnýz
		
		System.out.println("Saðlýðýn için \"Evde Kal\".");
	//**************************************************************************	
	 Soru 4:
        Would you like 'coffee' or 'tea' ? cümlesini ekrana yazdýrýnýz */
		
		System.out.println("Would you like \'coffee\' or \'tea\' ?");
	//***********************************************************************	
	//Soru 5:	double 10.231 i int’e çevirip ekrana yazdiriniz.
		
	    double db= 10.231;
		int i= (int) db;
		System.out.println(i);
		
	//*******************************************************************
		//Soru 6: Asagýdaki iþlemleri cevaplayýnýz
		int a=11;
		int b=5;
		double pi=3.14;

	  /*  a*b=?
		a*pi=?
		b/a=?
		a*b/pi=?
		a+b+pi=?
		a+b=?
		a-b=?
		-pi/a=?
		(a+b)/pi=?
		(b/pi)*a=? */

		
		System.out.println("a*b= "+a*b);
		System.out.println("a*pi= "+a*pi);
		System.out.println("b/a= "+b/a);
		System.out.println("a*b/pi= "+ a*b/pi);
		System.out.println("a+b+pi= "+(a+b+pi));
		System.out.println("a+b= "+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("-pi/a= "+(-pi/a));
		System.out.println("(a+b)/pi= "+(a+b)/pi);
		System.out.println("(b/pi)*a= "+(b/pi)*a);
		
	//*************************************************************	
	/*Soru 7: Aþaðýda yazýlanlarý ekranda gösteriniz
	
		hi 21 
		hi Harun
		5TechProEd203
		TechProEd305
		7TechProEd305    */
		
		
	    System.out.println("hi "+21);
		System.out.println("hi "+"Harun");
		System.out.println(2+0+3+"TechProEd"+2+0+3);
		System.out.println("TechProEd"+3+0+5);
		System.out.println(2+0+5+"TechProEd"+"305");
		
	//*************************************************
	/*	Soru 8: Aþaðýdaki sorularý cevaplayýnýz
		a. -5 + 8 * 6
		  b. (55+9) % 9
		  c. 20 + -3*5 / 8
		  d. 5 + 15 / 3 * 2 - 8 % 3
		  
		  Beklenen cevaplar:
		  43
		  1
		  19
		  13
		*/
		
	System.out.println(-5 + 8 * 6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		
		int num=10;
		num+=100;
		System.out.println(num);
		
	System.out.println(Math.pow(2,3));
	System.out.println(Math.sqrt(144));
	System.out.println(Math.round(2.7));
//**********************************************************************	
	//Soru 9: Dikdörtgenin alanýný ve çevresini bulunuz
	//çevre = 2*(boy + en)
	//alan = en * boy
	
	double en = 5.6;
    double boy = 8.5;

	double cevre=2*(boy+en);
	double alan = en*boy;
	
	System.out.println("Çevre= "+cevre);
	System.out.println("Alan= "+alan);
//****************************************************************************
	/*Soru 10: Kullanýcýdan Dikdörtgenin kenar uzunluklarýný alýn ve sonra bu dikdörtgenin alan ve
	çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
	integer kullanýnýz
	Not: Alan: Boy x En
	Not: Çevre: 2x (Boy + En)   */
	
	
	    Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Dikdörtgenin Boy uzunluðunu giriniz: ");
		double boy1=scan.nextDouble();
		System.out.println("Lütfen Dikdörtgenin En uzunluðununu giriniz: ");
		int en1= scan.nextInt();
		double alann=boy1*en1;
		double cevree=2*(boy+en);
		System.out.println("Alan= "+alan);
		System.out.println("Çevre= "+cevre);
		
//*******************************************************************************************		
		//Soru 11: Scanner ile kullanýcýdan 3 sayý girmesini isteyin ve bu sayýlarýn toplamýný yazdýrýnýz.
	//	integer kullanýnýz
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Lütfen 3 adet tam sayý giriniz");
		
		int num1,num2,num3,toplam;
		System.out.println("Lütfen birinci sayýyý giriniz");
		num1=scan.nextInt();
		System.out.println("Lütfen ikinci sayýyý giriniz");
		num2=scan.nextInt();
		System.out.println("Lütfen üçüncü sayýyý giriniz");
		num3=scan.nextInt();
		toplam=num1+num2+num3;
		System.out.println("Üç Sayýnýn Toplamý= "+toplam);

		scan.close();
	}

}
