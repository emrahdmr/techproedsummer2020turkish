package day22arraylist;

public class Odev01 {

	public static void main(String[] args) {
		
		
	// Bir integer array olu�turunuz ve bu array�deki tum say�lar�n �arp�m�n�
	// For-each loop kullanarak bulunuz. Sonucu ekrana yazd�r�n�z

		int arr [] = {2,3,4};
		
		int product =1;
		for(int w : arr) {
			product = product*w;	
		}
		System.out.println(product);
	}

}
