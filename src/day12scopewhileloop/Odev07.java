package day12scopewhileloop;



public class Odev07 {

	public static void main(String[] args) {
		
		/* Kullanıcıdan bir rakam alın ve bu rakam icin çarpım tablosunu ekrana yazdırın.
		Kullanıcının hata yapmadığını farz edin.
		Ornegin kullanıcı 3 girerse;
		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30 */
		
		// 3 un carpim tablosunu ekrana yazdiran programi yaziniz
				// 3x1=3, 3x2=6, ..., 3x10=30
				
		//kullanicisiz
				System.out.println("For Loop ile cozum");
				for(int i=1; i<11; i++) {
					System.out.println("3x" + i + "=" + (3*i));
				}
				
				System.out.println("While Loop ile cozum");
				int num=1;
				while(num<11) {
					System.out.println("3x" + num + "=" + (3*num));
					num++;
				}
				//scan.close();
				}
		}