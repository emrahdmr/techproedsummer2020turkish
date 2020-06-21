package day02wrapperclasses;
import java.util.Locale;
import java.util.Scanner;
public class Scanner05 {
    public static void main(String[] args) {
    	
    	
    	
        /*
         Yar��ap� kullan�c�dan al�nan bir dairenin �evresini ve alan�n� hesaplayan 
         bir program yaz�n�z. (float kullan�n�z)
         Not 1: pi say�s�: 3.14159
         Not 2: Alan: 3.14159 x yaricap x yaricap
         Not 3: Cevre: 2 x 3.14159 x radius 
        */
        
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        
        System.out.println("Lutfen yaricapi giriniz");
        
        double yaricap = scan.nextDouble();//Data tipi int ise nextInt() kullanilir
                                           //Data tipi double ise nextDouble() kullanilir vs...
        
        System.out.println(3.14159 * yaricap * yaricap);
        
        scan.close();
    }
}
