package day13whiledowhileloops;



public class WhileLoop01 {

	public static void main(String[] args) {
		
		
		//while loop kullanarak ilk 5 sayma sayisini ekrana yazidien prog yazin
		
		//Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int num=1;
		while(num<6) {
			sum= sum+num;
			num++;
		}
		System.out.println(sum);

	
	}
}
