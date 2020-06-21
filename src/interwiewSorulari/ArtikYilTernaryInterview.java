package interwiewSorulari;

import java.util.Scanner;
public class ArtikYilTernaryInterview {
    public static void main(String[] args) {
        // Kullanýcýdan bir yýl girmesini isteyin, yýl artýk yýl ise ekrana “Artýk yýl” degilse 
        // ekrana “Artýk yýl degil” yazdýrýn.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Yil giriniz");
        int year = scan.nextInt();
        
        String result = (year%100==0) ? (year%400==0 ? "Artik yil" : "Artik yil degil") : (year%4==0 ? "Artik yil" : "Artik yil degil");
        System.out.println(result);
        
        
        scan.close();
    }
}