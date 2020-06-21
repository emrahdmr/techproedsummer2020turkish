package day02wrapperclasses;

import java.util.Scanner;

public class Odev03 {

	
	   public static void main(String [] args) {
		   
		   //soru 2
		   
		   
		   Scanner scan = new Scanner(System.in);
		   
		   System.out.println("Lutfen sayinin kupunu yaziniz");
		   
		   int sayi1 = scan.nextInt();
		   
		   System.out.println(sayi1*sayi1*sayi1);
		   
		   scan.close();
   
		   
	   }
}
