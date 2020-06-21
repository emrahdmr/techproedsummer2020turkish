package Java_Review_Turkish;

import java.util.Scanner;

public class day2_1 {

	public static void main(String[] args) {
		/* 
        scanner kullanarak aþaðýdaki sorulara cevaplar isteyiniz
        1.Adým: 3 adet String tanýmlayýnýz. ad, soyad, rapor
        2.Adým: 2 adet integer tanýmlayýnýz  doðum yýlý, þimdiki yýl
        3.Adým: Kullanýcýdan; "Lütfen adýnýzý ve soy adýnýzý giriniz:" isteyin harun ekinci               
        4.Adým: Kullanýcýdan;"Lütfen doðum yýlýnýzý ve þimdiki yýlý giriniz:" isteyin 1983 2020                  
        5.Adým Raporu aþaðýdaki gibi yazdýrýnýz      
                "Adýnýz: Harun, Soy adýnýz: Ekinci, Yaþýnýz: 37"
        6. Adým: Yaþýnýz,Adýnýzýn ilk harfi, soyadýnýzýn ilk ve son harfi, isim ve soyisim karakter uzunluklarýný içeren bir þifre oluþturunuz
           //Þifre= 37HEi56     */   

		 Scanner sc= new Scanner(System.in);
	        String ad,soyAd,rapor;
	        int d_yýl,b_yýl;
	        
	        System.out.println("Lütfen Adýnýzý Giriniz:");
	        ad= sc.nextLine();
	        System.out.println("Lütfen Soyadýnýzý Giriniz");
	        soyAd= sc.nextLine();
	        System.out.println("Lütfen Doðum yýlýnýzý giriniz");
	        d_yýl= sc.nextInt();
	        System.out.println("Lütfen þimdiki yýlý giriniz");
	        b_yýl= sc.nextInt();
	        int yas=(b_yýl-d_yýl);
	        rapor="Adýnýz: "+ad+ " Soyadýnýz: "+soyAd+" Yaþýnýz: "+yas;
	        
	        System.out.println(rapor);

	        String sifre=yas+ad.substring(0,1)+soyAd.charAt(0)
	        +soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
	        
	        System.out.println("Þifreniz: "+sifre);
	  
	        sc.close();
	}

}
