package pratikyapma;



public class Student {

	public static void main(String args[] ) {
// 1.soru:
		int arr[] = {10,20,30,40,50};
		for(int i=0; i<arr.length; i++) 
		{
			System.out.println(" " + arr[i]);
// Bu soruda Output ==>> 10,20,30,40,50 diye alt alta yazar.			
		}
		
// 2.soru:		
	//	int arr1[2];
	//	System.out.println(arr1[0]);
	//	System.out.println(arr1[1]);
// Bu soruda Array tanimlanmadan index istendiginden dolayi Compile Time Error verir		
	
// 3.soru:
		int arr2[] = new int[2];
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		
// alt alta 10, 20 yazdirir..
		
		
// 4.soru:
		int arr4[]= {1,2,3};
		int arr5[]= {1,2,3};
		if(arr4==arr5) {
			System.out.println("Same");
	}else {
		System.out.println("Not same");
// Cevap olarak  if ve else'de yazilmayan "{,}" isaretleri koyarsak ==>> Not same   yazdirir		
	
	
// 5.soru:
		String[] cities = {"London", "Paris", "Rome", "New York"};
		System.out.println(cities[cities.length-2]);
		
// cevap olarak Rome yazdirir
		

	}
}}