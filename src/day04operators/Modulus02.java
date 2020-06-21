package day04operators;

import java.util.Scanner;

public class Modulus02 {

	public static void main(String[] args) {
		
		//Kullanicinin girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini veren program yaziniz.

         Scanner scan = new Scanner(System.in);
         System.out.println("dort basamakli bir tam sayi giriniz");
         
         int say = scan.nextInt();  // bir tamsayinin 1ler basamagini bulmak icin 10 a boluruz sonRakam = say %10;
         
         int sonRakam = say % 10;
         int ilkRakam = say /1000;   
         
         System.out.println(sonRakam + ilkRakam );
         

         scan.close();
	}

}
