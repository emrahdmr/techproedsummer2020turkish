package pratikyapma;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik06 {

	public static void main(String[] args) {
		
		 // Scanner input = new Scanner(System.in);
		   // String sentence = input.nextLine();
		
		String sentence ="java guzeldir ama biraz zahmetli";
		
		
		 String reversed[] = sentence.split(" ");
		 String reversed = "";
		 sentence.reverse();
			
			System.out.println(Arrays.toString(reversed));
		//     sentence.reverse();
		       for(int i=sentence.length()-1;i>=0;i--) {
					            System.out.print(sentence.charAt(i));;
					    }
		   
		    //Kodlarýnýzý burada sonlandýrýnýz ve verilen yardýmcý kodlarý deðiþtirmeyiniz.
		    System.out.println(reversed);
		  }
		
	}
/*
String reversed = "";
sentence.reverse();
 for(int i=sentence.length()-1;i>=0;i--) {
		            //System.out.print(sentence.charAt(i));;
		    }

//Kodlarýnýzý burada sonlandýrýnýz ve verilen yardýmcý kodlarý deðiþtirmeyiniz.
System.out.println(reversed);
} */
