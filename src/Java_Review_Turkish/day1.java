package Java_Review_Turkish;

import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		
		System.out.println();
		
		/*Aþaðýdaki pascal üçgenini ekrana yazdýran bir program yazýnýz
             1
           1   1
         1   2   1
       1   3   3   1
     1   4   6   4   1 */
	    
		
		
		System.out.println("        1");
		System.out.println("       1  1");
		System.out.println("      1  2  1");
		System.out.println("     1  3  3  1");
		System.out.println("    1  4  6  4  1");

		
		
		System.out.println("      A     ");
		System.out.println("     B B    ");
		System.out.println("    C   C   ");
		System.out.println("   D     D  ");
		System.out.println("  E       E ");
		System.out.println(" F         F");
		System.out.println("  E       E ");
		System.out.println("   D     D  ");
		System.out.println("    C   C   ");
		System.out.println("     B B    ");
		System.out.println("      A     ");
		
		System.out.println("Sagligin icin \"evde kal\"");
		
		System.out.println("woult like 'coffee' or 'tea'?");
		
		//double 10.231 int
		
		double num1 = 10.231;
		int num2 = (int) num1 ;
		System.out.println(num2);
	
		
		int a =11;
		int b =5;
		double pi =3.14;
		
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
		
		/*hi 21
		hi Harun
		5TechProEd203
		TechProEd305
		7TechProEd305*/
		
		System.out.println("hi "+21);
		System.out.println("hi "+"Harun");
		System.out.println(2+0+3+"TechProEd"+2+0+3);
		System.out.println("TechProEd"+3+0+5);
		System.out.println(2+0+5+"TechProEd"+"305");
		
		
		/* a. -5 + 8 * 6
		   b. (55+9) % 9
		   c. 20 + -3*5 / 8
		   d. 5 + 15 / 3 * 2 - 8 % 3 
		   beklenen cevaplar 43 1 19  13 */
		
		System.out.println(-5 + 8 *6);
		System.out.println((55+9) % 9);
		System.out.println(20 + -3*5 / 8);
		System.out.println(5 +15 / 3 * 2- 8 % 3);
		
		
		System.out.println(Math.pow(2, 3));
		System.out.println(Math.sqrt(144));
		System.out.println(Math.round(2.3));
		
		//Dikdörtgenin alanýný ve çevresini bulunuz
		//çevre = 2*(boy + en)
		//alan = en * boy
		
		double en = 5.6;
	    double boy = 8.5;
	    
	    double cevre = 2*(boy + en);
	    double alan = en * boy;
	    
	    System.out.println("cevre= "+cevre);
	    System.out.println("alan= " +alan);
		
	   /* Kullanýcýdan Dikdörtgenin kenar uzunluðunu alan ve sonra bu dikdortgenin  
		alan ve çevresini hesaplayýp ekrana yazdýran bir program yazýnýz.
		integer kullanýnýz
		Not: Alan: Boy x En
		Not: Çevre: 2x (Boy + En)
		*/ 
		

		
		Scanner scan = new Scanner(System.in);
			System.out.println("Lütfen Dikdörtgenin Boy uzunluðunu giriniz: ");
			double boy2 =scan.nextDouble();
			
			System.out.println("Lütfen Dikdörtgenin En uzunluðununu giriniz: ");
			int en2= scan.nextInt();
			double alan1 = boy2 * en2;
			double cevre1 = 2*(boy2 + en2);
			System.out.println("Alan= "+alan);
			System.out.println("Çevre= "+cevre);
	    
		
		//scanner ile kullicidan 3 sayi girmesini isteyin
	// ve bu sayilari toplamini yaziniz
			
			Scanner scann = new Scanner(System.in);
			System.out.println("Lutfen 3 adet tam sayi giriniz");
			int num5, num6, num7,toplam;
			
			System.out.println("lutfen birinci sayiyi yaziniz");
			num5 = scan.nextInt();
			
			System.out.println("Lutfen ikinci sayiyi giriniz");
		    num6 = scann.nextInt();
			
			System.out.println("Lufen ucuncu sayiyi giriniz");
			num7 = scann.nextInt();
			
			toplam = num5 + num6 + num7; 
			System.out.println("toplam sayi= " + toplam);
			
			
		  
		
			scann.close();
			scan.close();
				
	}

}
