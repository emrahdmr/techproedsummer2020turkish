package day19arrays;

public class Odev02 {

	public static void main(String[] args) {
		// Bir array�de herhangi iki eleman�n ayn� olup olmad���n� kontrol
		// eden bir program yaz�n�z.Ayn� eleman varsa
		// �Ayn� eleman var� yoksa  �Ayn� eleman yok� yazd�r�n�z.
		
		int arr[] = {1,2,3,4,5,3};
		
		int count = 0;
		
		for(int i = 0; i<5; i++) {
		
			for(int i2 = i+1; i2<5; i2++) {
				if(arr[i]==arr[i2]) {
					count++;
					break;
				}								
			}			
		}
		if(count>0) {
			System.out.println(count + " ayn� eleman var.");
			System.out.println( " ayn� eleman var.");

		}else {
			System.out.println("Ayn� eleman yok.");
		}

	}

}
