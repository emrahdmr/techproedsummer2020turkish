package day09switchoperator;

public class Switch01 {

	public static void main(String[] args) {
		
		/*A harfini bulunca "ilk harf",
		B harfini bulunca "ikinci harf"
		C harfini bulunca "ucuncu harf"
		D harfini bulunca "dorduncu harf "
		yazdiran programi if else if ve switch kullanarak yaziniz  */
       // digerleri icin "bilmiyorum"
		
		char harf = 'B';
				
				//1.yol if else if
		
		if (harf=='A') {
			System.out.println("ilk harf");
		}else if (harf=='B') {
			System.out.println("ikinci harf");
		}else if (harf=='C') {
			System.out.println("ucuncu harf");
		}else if (harf =='D') {
			System.out.println("dorduncu harf");
			
		}else {
			System.out.println("bilmiyorum");
		}   
		 
		
		//2.yol ===>switch
		
		switch (harf) {
		case 'A':
			System.out.println("ilk harf");
			break;
		case 'B':
			System.out.println("ikinci harf");
			break;
		case 'C' :
		    System.out.println("ucuncu harf");
		case 'D':
			System.out.println("dorduncu harf");
			break;
		default:    //else
			System.out.println("bilmiyorum");
		
		
		}
			
		
		
		
	}

}
