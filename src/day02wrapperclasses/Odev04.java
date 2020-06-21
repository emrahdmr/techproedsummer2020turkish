package day02wrapperclasses;

import java.util.Scanner;

public class Odev04 {

	   public static void main(String [ ] args) {
		   
		 //soru 3
		   
		   
		 Scanner scan = new Scanner(System.in);
				 
		 System.out.println("Lutfen prizmani hacmini yaziniz");
		 
		 int en = scan.nextInt();
		 int boy = scan.nextInt();
		 int yukseklik = scan.nextInt();
		 
		 System.out.println(en * boy * yukseklik);
		  
		   
		 scan.close();  
	   }
}
