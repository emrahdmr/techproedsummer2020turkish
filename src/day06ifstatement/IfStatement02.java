package day06ifstatement;

public class IfStatement02 {

	public static void main(String[] args) {
		
		//bir int varibale olusturun deger atayin
		// deger cift sayi ise ekrana "cift" yazdirin
		//deger tek sayi ise ekrana "tek" yazdirin
		
		int num = 12;
				
		if (num%2==0 ) {
		     System.out.println("cift");
		}
        
		if (num%2 !=0) {
			System.out.println("tek");
		}
	}

}
