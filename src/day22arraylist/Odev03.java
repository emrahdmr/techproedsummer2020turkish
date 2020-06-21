package day22arraylist;

public class Odev03 {

	public static void main(String[] args) {
		
	// Ýki String array oluþturunuz ve bu array’lerdeki ortak elemanlarý
	//	For-each loop kullanarak bulunuz. Sonucu ekrana yazdýrýnýz.
	//	Ortak eleman yoksa ekrana “Ortak eleman yok” yazdýrýnýz
		
	String arr1[] = {"Ali","Veli","Ebru"};
	String arr2[] = {"Ali","Fuat","Gunes"};
	
	int count = 0;
	for (String w : arr1) {
		for (String z : arr2) {
			if (w.equals(z)) {
				System.out.println("ortak eleman: " + w);
				count++;
			}
		}
	}
	if(count == 0) {
		System.out.println("Ortak eleman yok");
	}
	}
}
