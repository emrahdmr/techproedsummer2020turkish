package interwiewSorulari;

import java.util.Scanner;

public class ForLoopInterview01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Kulllanicidan bir String alin ve bu String'i ekrana tersten yazidirin

		
				Scanner scan = new Scanner(System.in);
				System.out.println("lutfen bir cumle veya kelime giriniz");
				
				String str = scan.nextLine();
				
				for(int i=str.length()-1; i>=0; i--) {
					System.out.println(str.charAt(i)); //ali can = nac ila
				}
				
				scan.close();	}

		}
