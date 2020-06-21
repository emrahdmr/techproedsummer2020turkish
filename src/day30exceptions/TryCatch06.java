package day30exceptions;

public class TryCatch06 {
	
			public static void main(String[] args) {
				
				try {
					hop();
					
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println(e.getMessage());
					//printStackTrace() methodu Exceotions'larin nerede olustugunun
					// detayli bilgisini verir
					//Exceotions satirlarinin olusum sirasina gore console'de gosterir
				}		
			}
			
			private static void hop() {
				throw new RuntimeException("cannot hop");
			}
		}