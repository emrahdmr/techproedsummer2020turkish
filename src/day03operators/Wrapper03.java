package day03operators;
import java.util.Scanner;
public class Wrapper03 {
	
	
	public static void main(String[] args) {
	// kullanicidan ad ve soyadini alalim ekrana yazdiralim
	// kullanicidan adresini alalim ekrana yazdiralim (2. cadde bakirkoy istanbul)
	// kullanicidan yasini alalim ekrana yazdiralim
	// kullaniciya turkiyede yasiyorum olsun . true false diyelim ad ve soyadini alalim ekrana yazdiralim
	
	Scanner scan = new Scanner (System.in); 
	
	System.out.println("Lutfen adinizi ve soyadinizi giriniz : ");
	String adSoyad = scan.nextLine();
	System.out.println(adSoyad);
	
	System.out.println("Lutfen adresinizi giriniz : ");
	String adres = scan.nextLine();
	System.out.println(adres);
	
	System.out.println("Lutfen yasinizi giriniz : ");
	int yas = scan.nextInt();
	System.out.println(yas);
	
	System.out.println("turkiyede yasiyorum. true/false : ");
	boolean bltr = scan.nextBoolean();
	System.out.println(bltr);
	
	
	scan.close();
}
}	
	