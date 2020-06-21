package interwiewSorulari;

public class YerDegistirme {

	public static void main(String[] args) {
		/* interview question***
		/ Verilen iki deðeri üçüncü bir deðer kullanmadan yerlerini deðiþtiriniz */
		        
		
		
		int  x = 50; //=>10
	    int  y  = 10; //=>50
	     System.out.println("---Deðiþiklik öncesi---");
		 System.out.println("x deðeri= "+x);
         System.out.println("y deðeri= "+y);
		          
		           x=x+y;
		           y=x-y;
		           x=x-y;
		           
		    System.out.println("---Deðiþiklik sonrasý---");
		    System.out.println("x deðeri= "+x);
		    System.out.println("y deðeri= "+y);
		          
		
		
		
	}

}
