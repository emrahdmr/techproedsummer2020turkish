package day13whiledowhileloops;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		//ilk 5 sayma sayisini carpimini ekrana yazdirin
		
		
		int product =1;
		int num=1;
		while(num<6) {
			product =product*num;
			num++;
		}
        System.out.println(product);
	}

}
