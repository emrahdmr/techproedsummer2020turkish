package day13whiledowhileloops;

public class Odev01 {

	public static void main(String[] args) {
		
		
		//  8 den 180 e kadar 5 in kati olan tum tamsayýlarý ekrana yazdýrýnýz.
		
		//int product =1;
		int num=8;
		while(num<180) {
			if(num%5==0) {
				//product =product*num;
		        System.out.println(num);	
			}	
			num++;

		}
	}
}
