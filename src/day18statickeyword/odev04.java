package day18statickeyword;

public class odev04 {

	static int i = 1;
    public static void main(String[] args) {
           
           int i=1;
           for(odev04.i=1 ;odev04.i<10 ; odev04.i++) {  
               i=i+2;
               System.out.print(i + "Instance olan ");
			   System.out.println();
			   System.out.print(odev04.i + "Static olan ");

           }
    }      
}
